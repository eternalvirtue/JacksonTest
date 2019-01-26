package com.servesync.jacksontest.bean;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ParameterBean {
	private String resultCode;
	private List<String> rider;
	private List<ParameterCoverage> coverage;
	private List<String> errorCode = new ArrayList<String>();

	private String policyNo;
	private String inceptDate;
	private String expireDate;
	private String lastNameKJ;
	private String firstNameKJ;
	private String lastNameKN;
	private String firstNameKN;
	private String birthDay;
	private String sex;
	private String zipNo;
	private String addressPrefecture;
	private String addressCity;
	private String addressTown;
	private String addressBuild;
	private String telNo;

	public ParameterBean() {
	}

	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public List<String> getRider() {
		return rider;
	}

	public void setRider(List<String> rider) {
		this.rider = rider;
	}

	public List<ParameterCoverage> getCoverage() {
		return coverage;
	}

	public void setCoverage(List<ParameterCoverage> coverage) {
		this.coverage = coverage;
	}

	public List<String> getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(List<String> errorCode) {
		this.errorCode = errorCode;
	}

	public String getPolicyNo() {
		return policyNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public String getInceptDate() {
		return inceptDate;
	}

	public void setInceptDate(String inceptDate) {
		this.inceptDate = inceptDate;
	}

	public String getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

	public String getLastNameKJ() {
		return lastNameKJ;
	}

	public void setLastNameKJ(String lastNameKJ) {
		this.lastNameKJ = lastNameKJ;
	}

	public String getFirstNameKJ() {
		return firstNameKJ;
	}

	public void setFirstNameKJ(String firstNameKJ) {
		this.firstNameKJ = firstNameKJ;
	}

	public String getLastNameKN() {
		return lastNameKN;
	}

	public void setLastNameKN(String lastNameKN) {
		this.lastNameKN = lastNameKN;
	}

	public String getFirstNameKN() {
		return firstNameKN;
	}

	public void setFirstNameKN(String firstNameKN) {
		this.firstNameKN = firstNameKN;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDate(String birthDay) {
		this.birthDay = birthDay;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getZipNo() {
		return zipNo;
	}

	public void setZipNo(String zipNo) {
		this.zipNo = zipNo;
	}

	public String getAddressPrefecture() {
		return addressPrefecture;
	}

	public void setAddressPrefecture(String addressPrefecture) {
		this.addressPrefecture = addressPrefecture;
	}

	public String getAddressCity() {
		return addressCity;
	}

	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}

	public String getAddressTown() {
		return addressTown;
	}

	public void setAddressTown(String addressTown) {
		this.addressTown = addressTown;
	}

	public String getAddressBuild() {
		return addressBuild;
	}

	public void setAddressBuild(String addressBuild) {
		this.addressBuild = addressBuild;
	}

	public String getTelNo() {
		return telNo;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}

}
