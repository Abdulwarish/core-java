package com.fxmate.vo;

import java.io.Serializable;
/**
 * 
 * @author WarishA
 *
 */
public class InrFeeDetailVo implements Serializable{
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -3732329434099536532L;
	public String currency;
    public String trans_type;
    public String inr_fee;
    
	public String getCurrency() {
		return currency;
	}
	public String getTrans_type() {
		return trans_type;
	}
	public String getInr_fee() {
		return inr_fee;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public void setTrans_type(String trans_type) {
		this.trans_type = trans_type;
	}
	public void setInr_fee(String inr_fee) {
		this.inr_fee = inr_fee;
	}
    
    
}

