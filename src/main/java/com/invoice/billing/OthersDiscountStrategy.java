package com.invoice.billing;

import java.math.BigDecimal;
import java.util.List;

public class OthersDiscountStrategy implements UserBasedDiscountStrategy {

	public void calculate(Bill bill) {
		BigDecimal totalBill = BigDecimal.ZERO;
		List<BillingItems> itemsList = bill.getBillingItems();
		for(BillingItems item : itemsList) {
			totalBill=totalBill.add(item.getPrice());
		}
		bill.setNetPayable(totalBill);

	}


}
