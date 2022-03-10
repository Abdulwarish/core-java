package com.fxmate.vo;

import java.io.Serializable;
/**
 * 
 * @author WarishA
 *
 */
public class CommissionDetailVo implements Serializable{
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -1987571366166440368L;
	public String currency;
    public String trans_type;
    public String type;
    public String commission;
    
	public String getCurrency() {
		return currency;
	}
	public String getTrans_type() {
		return trans_type;
	}
	public String getType() {
		return type;
	}
	public String getCommission() {
		return commission;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public void setTrans_type(String trans_type) {
		this.trans_type = trans_type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setCommission(String commission) {
		this.commission = commission;
	}
    
    
}

