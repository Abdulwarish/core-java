package com.fxmate.vo;

import java.io.Serializable;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString), Root.class); */
/**
 * 
 * @author WarishA
 *
 */
public class ContactDetailVo implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 564709907001326125L;
	public String name;
    public String telephone_no;
    public String designation;
    public String mobile_no;
    public String rm;
    public String client_risk_category;
    public String level_code;
    
	public String getName() {
		return name;
	}
	public String getTelephone_no() {
		return telephone_no;
	}
	public String getDesignation() {
		return designation;
	}
	public String getMobile_no() {
		return mobile_no;
	}
	public String getRm() {
		return rm;
	}
	public String getClient_risk_category() {
		return client_risk_category;
	}
	public String getLevel_code() {
		return level_code;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTelephone_no(String telephone_no) {
		this.telephone_no = telephone_no;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}
	public void setRm(String rm) {
		this.rm = rm;
	}
	public void setClient_risk_category(String client_risk_category) {
		this.client_risk_category = client_risk_category;
	}
	public void setLevel_code(String level_code) {
		this.level_code = level_code;
	}
}

