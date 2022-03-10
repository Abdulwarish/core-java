package com.fxmate.vo;

import java.io.Serializable;
/**
 * 
 * @author WarishA
 *
 */
public class NostroFeeDetailVo implements Serializable{
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 5472752105809619278L;
	public String currency;
    public String trans_type;
    public String slab_from;
    public String slab_to;
    public String nostro_fee;
    
	public String getCurrency() {
		return currency;
	}
	public String getTrans_type() {
		return trans_type;
	}
	public String getSlab_from() {
		return slab_from;
	}
	public String getSlab_to() {
		return slab_to;
	}
	public String getNostro_fee() {
		return nostro_fee;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public void setTrans_type(String trans_type) {
		this.trans_type = trans_type;
	}
	public void setSlab_from(String slab_from) {
		this.slab_from = slab_from;
	}
	public void setSlab_to(String slab_to) {
		this.slab_to = slab_to;
	}
	public void setNostro_fee(String nostro_fee) {
		this.nostro_fee = nostro_fee;
	}
    
    
}

