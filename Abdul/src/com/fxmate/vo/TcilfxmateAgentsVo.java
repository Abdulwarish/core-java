package com.fxmate.vo;

import java.io.Serializable;
import java.util.List;
/**
 * 
 * @author WarishA
 *
 */
public class TcilfxmateAgentsVo implements Serializable{
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -7890732498216100484L;
	public String entity_code;
    public String entity_name;
    public String address1;
    public String address2;
    public String city;
    public String state;
    public String pin_code;
    public String phone;
    public String email;
    public String website;
    public String fax;
    public String entity_parent_id;
    public String group;
    public String group_desc;
    public String acc_no;
    public String customer_id;
    public String pan_no;
    public String entity_short_name;
    public String home_branch;
    public String nsa_code;
    public List<ContactDetailVo> contact_details;
    public List<String> products;
    public List<InrFeeDetailVo> inr_fee_details;
    public List<NostroFeeDetailVo> nostro_fee_details;
    public String commission_type;
    public List<CommissionDetailVo> commission_details;
    
	public String getEntity_code() {
		return entity_code;
	}
	public String getEntity_name() {
		return entity_name;
	}
	public String getAddress1() {
		return address1;
	}
	public String getAddress2() {
		return address2;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getPin_code() {
		return pin_code;
	}
	public String getPhone() {
		return phone;
	}
	public String getEmail() {
		return email;
	}
	public String getWebsite() {
		return website;
	}
	public String getFax() {
		return fax;
	}
	public String getEntity_parent_id() {
		return entity_parent_id;
	}
	public String getGroup() {
		return group;
	}
	public String getGroup_desc() {
		return group_desc;
	}
	public String getAcc_no() {
		return acc_no;
	}
	public String getCustomer_id() {
		return customer_id;
	}
	public String getPan_no() {
		return pan_no;
	}
	public String getEntity_short_name() {
		return entity_short_name;
	}
	public String getHome_branch() {
		return home_branch;
	}
	public String getNsa_code() {
		return nsa_code;
	}
	public List<ContactDetailVo> getContact_details() {
		return contact_details;
	}
	public List<String> getProducts() {
		return products;
	}
	public List<InrFeeDetailVo> getInr_fee_details() {
		return inr_fee_details;
	}
	public List<NostroFeeDetailVo> getNostro_fee_details() {
		return nostro_fee_details;
	}
	public String getCommission_type() {
		return commission_type;
	}
	public List<CommissionDetailVo> getCommission_details() {
		return commission_details;
	}
	public void setEntity_code(String entity_code) {
		this.entity_code = entity_code;
	}
	public void setEntity_name(String entity_name) {
		this.entity_name = entity_name;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setPin_code(String pin_code) {
		this.pin_code = pin_code;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public void setEntity_parent_id(String entity_parent_id) {
		this.entity_parent_id = entity_parent_id;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public void setGroup_desc(String group_desc) {
		this.group_desc = group_desc;
	}
	public void setAcc_no(String acc_no) {
		this.acc_no = acc_no;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}
	public void setPan_no(String pan_no) {
		this.pan_no = pan_no;
	}
	public void setEntity_short_name(String entity_short_name) {
		this.entity_short_name = entity_short_name;
	}
	public void setHome_branch(String home_branch) {
		this.home_branch = home_branch;
	}
	public void setNsa_code(String nsa_code) {
		this.nsa_code = nsa_code;
	}
	public void setContact_details(List<ContactDetailVo> contact_details) {
		this.contact_details = contact_details;
	}
	public void setProducts(List<String> products) {
		this.products = products;
	}
	public void setInr_fee_details(List<InrFeeDetailVo> inr_fee_details) {
		this.inr_fee_details = inr_fee_details;
	}
	public void setNostro_fee_details(List<NostroFeeDetailVo> nostro_fee_details) {
		this.nostro_fee_details = nostro_fee_details;
	}
	public void setCommission_type(String commission_type) {
		this.commission_type = commission_type;
	}
	public void setCommission_details(List<CommissionDetailVo> commission_details) {
		this.commission_details = commission_details;
	}
	
	
}

