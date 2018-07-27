package com.invoice.billing;

import java.math.BigDecimal;
import java.util.List;

public class AffiliateDiscountStrategy implements UserBasedDiscountStrategy {

	public void calculate(Bill bill) {
		BigDecimal groceriesTotalBill = BigDecimal.ZERO;
		BigDecimal othersTotalBill = BigDecimal.ZERO;
		List<BillingItems> itemsList = bill.getBillingItems();

		for(BillingItems item : itemsList) {
			if(item.getType().equals(ItemType.GROCERIES))
				groceriesTotalBill=groceriesTotalBill.add(item.getPrice());
			else if(item.getType().equals(ItemType.OTHERS))
				othersTotalBill=othersTotalBill.add(item.getPrice());
		};
		BigDecimal totalBill=groceriesTotalBill.add(othersTotalBill);
		bill.setNetPayable(totalBill.subtract(othersTotalBill.multiply(BigDecimal.valueOf(10).divide(new BigDecimal(100)))));
	
	}


}
