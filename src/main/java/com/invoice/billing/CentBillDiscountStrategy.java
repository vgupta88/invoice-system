package com.invoice.billing;

import java.math.BigDecimal;

public class CentBillDiscountStrategy implements AmountBasedDiscountStrategy {

	public void calculate(Bill bill) {
		BigDecimal discount = bill.getNetPayable().divideToIntegralValue(new BigDecimal(100)).multiply(new BigDecimal(5));
		bill.setNetPayable(bill.getNetPayable().subtract(discount));
	}
	

}
