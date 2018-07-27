package com.invoice.billing;

import java.math.BigDecimal;
import java.util.List;

public class Bill {

	
	private List<BillingItems> billingItems;
	
	private User user;
	
	private BigDecimal netPayable;

	public List<BillingItems> getBillingItems() {
		return billingItems;
	}

	public void setBillingItems(List<BillingItems> billingItems) {
		this.billingItems = billingItems;
	}

	public BigDecimal getNetPayable() {
		return netPayable;
	}

	public void setNetPayable(BigDecimal netPayable) {
		this.netPayable = netPayable;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
