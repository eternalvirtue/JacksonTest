package com.servesync.jacksontest;

import java.io.IOException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.servesync.jacksontest.bean.ParameterBean;
import com.servesync.jacksontest.util.JsonConverter;

public class JsonTest {
	private static final String SAMPLE_JSON = "{\n" + 
			"    \"id00019\": \"0123456789\",\n" + 
			"    \"id03115\": \"うんこ\",\n" + 
			"    \"id43010\": [\"10\", \"01\"],\n" + 
			"    \"id30001\": [{\n" + 
			"    	\"id30019\": \"410\",\n" + 
			"    	\"id30005\": \"1000\"\n" + 
			"    },\n" + 
			"    {\n" + 
			"    	\"id30019\": \"415\",\n" + 
			"    	\"id30005\": \"1000\"\n" + 
			"    }]\n" + 
			"}\n" + 
			"";
    public static void main(String... args){
		try {
	        // JSON文字列⇒Object
			ParameterBean jsonObject = JsonConverter.toObject(SAMPLE_JSON, ParameterBean.class);
	        // Object⇒JSON文字列
	        String jsonString = JsonConverter.toString(jsonObject);
	        // JSON文字列出力
	        System.out.println(jsonString);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
