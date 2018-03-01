package com.ecentric.bean;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "BiometricresponseBean")
public class BiometricresponseBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7466116792483986722L;
	private String KSA_KUA_Txn;
	private String auth_date;
	private String auth_status;
	private String auth_transaction_code;
	private String base64file;
	private String co;
	private String district;
	private String district_name;
	private String dob;
	private String gender;
	private String house;
	private String lc;
	private String mandal;
	private String mandal_name;
	private String name;
	private String pincode;
	private String po;
	private String statecode;
	private String street;
	private String subdist;
	private String uid;
	private String village;
	private String village_name;
	private String vtc;
	private String auth_err_code;

	@XmlElement
	public String getAuth_err_code() {
		return auth_err_code;
	}

	public void setAuth_err_code(String auth_err_code) {
		this.auth_err_code = auth_err_code;
	}

	@XmlElement
	public String getKSA_KUA_Txn() {
		return KSA_KUA_Txn;
	}

	public void setKSA_KUA_Txn(String kSA_KUA_Txn) {
		KSA_KUA_Txn = kSA_KUA_Txn;
	}

	@XmlElement
	public String getAuth_date() {
		return auth_date;
	}

	public void setAuth_date(String auth_date) {
		this.auth_date = auth_date;
	}

	@XmlElement
	public String getAuth_status() {
		return auth_status;
	}

	public void setAuth_status(String auth_status) {
		this.auth_status = auth_status;
	}

	@XmlElement
	public String getAuth_transaction_code() {
		return auth_transaction_code;
	}

	public void setAuth_transaction_code(String auth_transaction_code) {
		this.auth_transaction_code = auth_transaction_code;
	}

	@XmlElement
	public String getBase64file() {
		return base64file;
	}

	public void setBase64file(String base64file) {
		this.base64file = base64file;
	}

	@XmlElement
	public String getCo() {
		return co;
	}

	public void setCo(String co) {
		this.co = co;
	}

	@XmlElement
	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	@XmlElement
	public String getDistrict_name() {
		return district_name;
	}

	public void setDistrict_name(String district_name) {
		this.district_name = district_name;
	}

	@XmlElement
	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	@XmlElement
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@XmlElement
	public String getHouse() {
		return house;
	}

	public void setHouse(String house) {
		this.house = house;
	}

	@XmlElement
	public String getLc() {
		return lc;
	}

	public void setLc(String lc) {
		this.lc = lc;
	}

	@XmlElement
	public String getMandal() {
		return mandal;
	}

	public void setMandal(String mandal) {
		this.mandal = mandal;
	}

	@XmlElement
	public String getMandal_name() {
		return mandal_name;
	}

	public void setMandal_name(String mandal_name) {
		this.mandal_name = mandal_name;
	}

	@XmlElement
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElement
	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@XmlElement
	public String getPo() {
		return po;
	}

	public void setPo(String po) {
		this.po = po;
	}

	@XmlElement
	public String getStatecode() {
		return statecode;
	}

	public void setStatecode(String statecode) {
		this.statecode = statecode;
	}

	@XmlElement
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@XmlElement
	public String getSubdist() {
		return subdist;
	}

	public void setSubdist(String subdist) {
		this.subdist = subdist;
	}

	@XmlElement
	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	@XmlElement
	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	@XmlElement
	public String getVillage_name() {
		return village_name;
	}

	public void setVillage_name(String village_name) {
		this.village_name = village_name;
	}

	@XmlElement
	public String getVtc() {
		return vtc;
	}

	public void setVtc(String vtc) {
		this.vtc = vtc;
	}

}
