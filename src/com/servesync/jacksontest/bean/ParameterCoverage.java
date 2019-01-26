package com.servesync.jacksontest.bean;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ParameterCoverage {
	private String code;
	private long amount;
	private long prem;

	public ParameterCoverage() {
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public long getPrem() {
		return prem;
	}

	public void setPrem(long prem) {
		this.prem = prem;
	}
}
