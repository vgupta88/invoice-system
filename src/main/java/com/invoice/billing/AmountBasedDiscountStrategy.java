package com.invoice.billing;

@FunctionalInterface
public interface AmountBasedDiscountStrategy {
	
	void calculate(Bill bill);

}
