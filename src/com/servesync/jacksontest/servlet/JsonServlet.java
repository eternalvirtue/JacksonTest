package com.servesync.jacksontest.servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.InvalidParameterException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.servesync.jacksontest.bean.ParameterBean;
import com.servesync.jacksontest.bean.ParameterCoverage;
import com.servesync.jacksontest.util.JsonConverter;

@WebServlet("/API")
public class JsonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String CHARSET = "UTF-8";
	private static final String RESULT_SUCCEED = "001";
	private static final String RESULT_FAILED = "999";

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// リクエストJSON取得
		request.setCharacterEncoding(CHARSET);
		BufferedReader buffer = new BufferedReader(request.getReader());
		String requestJson = buffer.readLine();
		System.out.println("request json =" + requestJson);

		// JSON→Object変換
		ParameterBean jsonObject = new ParameterBean();
		jsonObject.setResultCode(RESULT_FAILED);
		String responseJson = "";
		try {
			jsonObject = JsonConverter.toObject(requestJson, ParameterBean.class);
			// レスポンスデータ加工
			List<ParameterCoverage> coverages = jsonObject.getCoverage();
			for (int i = 0; i < coverages.size(); i++) {
				coverages.get(i).setPrem(1000 + i * 100);
			}
			jsonObject.setResultCode(RESULT_SUCCEED);
		} catch (InvalidParameterException ex) {
			ex.printStackTrace();
			jsonObject.getErrorCode().add("Error001");
			jsonObject.getErrorCode().add("Error002");
		} catch (JsonParseException ex) {
			ex.printStackTrace();
			jsonObject.getErrorCode().add("Error101");
		} catch (JsonMappingException ex) {
			ex.printStackTrace();
			jsonObject.getErrorCode().add("Error201");
			jsonObject.getErrorCode().add("Error202");
		} catch (IOException ex) {
			ex.printStackTrace();
			jsonObject.getErrorCode().add("Error901");
		}
		// Object→JSON変換
		responseJson = JsonConverter.toString(jsonObject);
		System.out.println(responseJson);

		// レスポンス出力
		response.setContentType("application/json; charset=utf-8");
		response.addHeader("X-Content-Type-Options", "nosniff");
		response.setHeader("Cache-Control", "nocache");
		PrintWriter out = response.getWriter();
		out.println(responseJson);
	}
}
