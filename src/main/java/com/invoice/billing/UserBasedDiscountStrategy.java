package com.invoice.billing;

@FunctionalInterface
public interface UserBasedDiscountStrategy {
	
	void calculate(Bill bill);

}
