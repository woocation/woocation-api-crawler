/**
 * 
 */
package com.woocation.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.woocation.model.SIMData;
import com.woocation.model.SimPurchaseDetails;

/**
 * @author ankit
 *
 */
public class JsonDeserializer {

	/**
	 * 
	 */
	public JsonDeserializer(String simData, String documentSim) {
		try {
			String content = new String(Files.readAllBytes(Paths.get(documentSim)));
			@SuppressWarnings("unchecked")
			Map<String, String> documentMap = EntityMapper.getInstance().getObject(content, Map.class);
			List<SIMData> simList = readSimDataFromFile(simData);
			processSIMData(simList, documentMap);
			System.out.println(simList);

			byte[] btArray = EntityMapper.getInstance().writeObject(simList);
			try {
				Files.write(new File("/home/ankit/woocation/sim/sim_new.txt").toPath(), btArray, StandardOpenOption.CREATE);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void processSIMData(List<SIMData> simDataList, Map<String, String> documentSim) {
		for (SIMData simData : simDataList) {
			SimPurchaseDetails purchaseDetails = simData.getSimPurchaseDetails();
			purchaseDetails.setDocuments(purchaseDetails.getDocuments().stream()
					.map(document -> documentSim.get(document)).collect(Collectors.toList()));

			purchaseDetails.setAvailableAt(purchaseDetails.getAvailableAt().stream()
					.map(document -> documentSim.get(document)).collect(Collectors.toList()));
		}
	}

	/**
	 * Read sim data from file.
	 *
	 * @param request
	 *            the request
	 * @return the list
	 * @throws Exception
	 */
	private List<SIMData> readSimDataFromFile(final String path) throws Exception {
		List<SIMData> listofSimData = null;
		try {
			byte[] jsonData = Files.readAllBytes(Paths.get(path));
			ObjectMapper objectMapper = new ObjectMapper();
			listofSimData = objectMapper.readValue(jsonData,
					objectMapper.getTypeFactory().constructCollectionType(List.class, SIMData.class));
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		return listofSimData;
	}
}
