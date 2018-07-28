package com.invoice.billing;

import java.math.BigDecimal;
import java.util.List;

public class EmployeeDiscountStrategy implements UserBasedDiscountStrategy {

	public void calculate(Bill bill) {
		BigDecimal groceriesTotalBill = BigDecimal.ZERO;
		BigDecimal othersTotalBill = BigDecimal.ZERO;
		List<BillingItems> itemsList = bill.getBillingItems();

		for(BillingItems item : itemsList) {
			if(item.getType().compareTo(ItemType.GROCERIES)==0) 
				groceriesTotalBill=groceriesTotalBill.add(item.getPrice());
			else if(item.getType().compareTo(ItemType.OTHERS)==0)
				othersTotalBill=othersTotalBill.add(item.getPrice());
		}
		BigDecimal totalBill=groceriesTotalBill.add(othersTotalBill);
		bill.setNetPayable(totalBill.subtract(othersTotalBill.multiply(BigDecimal.valueOf(30).divide(new BigDecimal(100)))));
	
	}


}
