/**
 * 
 */
package com.woocation.writer;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

/**
 * The Class WoocationWriter.
 *
 * @author ankit
 */
public class WoocationWriter {

	/**
	 * Instantiates a new woocation writer.
	 */
	public WoocationWriter() {
	}
	
	
	/**
	 * Write content.
	 *
	 * @param fileName the file name
	 * @param obj the obj
	 */
	public static void writeContent(String fileName,  Object obj){
		try {
			Files.write(new File(fileName).toPath(), obj.toString().getBytes(), StandardOpenOption.CREATE);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
