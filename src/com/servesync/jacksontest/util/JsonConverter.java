package com.servesync.jacksontest.util;

import java.io.IOException;
import java.security.InvalidParameterException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class JsonConverter {
	private static ObjectMapper mapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);

	public static String toString(final Object object)
			throws JsonGenerationException, JsonMappingException, IOException {
		return mapper.writeValueAsString(object);
	}

	public static <T> T toObject(final String json, final Class<T> clazz)
			throws JsonParseException, JsonMappingException, IOException {
		if (json == null) {
			throw new InvalidParameterException("json is null");
		}
		return mapper.readValue(json, clazz);
	}

	public static <T> T toObject(String json, TypeReference<T> typeReference)
			throws JsonParseException, JsonMappingException, IOException {
		if (json == null) {
			throw new InvalidParameterException("json is null");
		}
		return mapper.readValue(json, typeReference);
	}
}
