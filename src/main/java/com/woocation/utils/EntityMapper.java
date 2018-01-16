/**
 * 
 */
package com.woocation.utils;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author ankit.gupta4
 *
 */
public class EntityMapper {

	/**
	 * Get the unique instnce of entity builder.
	 */
	private static EntityMapper instance;

	/**
	 * Json mapper.
	 */
	private ObjectMapper mapper;

	/**
	 * Default constructor.
	 */
	private EntityMapper() {
		mapper = new ObjectMapper();
	}

	/**
	 * Gets the entity builder.
	 * 
	 * @return the entity builder.
	 */
	public static EntityMapper getInstance() {
		if (instance == null) {
			instance = new EntityMapper();
		}
		return instance;
	}

	/**
	 * Return an object from json value.
	 * 
	 * @param <T>
	 *            generic entity.
	 * @param json
	 *            the json value
	 * @param aClass
	 *            type of object.
	 * @return an object.
	 * @throws ElasticException
	 *             if an error occurs.
	 */
	public <T> T getObject(String json, Class<T> aClass) throws Exception {
		try {
			T obj = mapper.readValue(json, aClass);
			return obj;
		} catch (IOException e) {
			throw new Exception(e);
		}
	}

	public byte[] writeObject(Object aClass) throws Exception {
		try {
			return mapper.writeValueAsBytes(aClass);
		} catch (IOException e) {
			throw new Exception(e);
		}
	}
}
