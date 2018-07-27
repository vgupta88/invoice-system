package com.invoice.billing;

public class BillPayable {
	
	public BillPayable(Bill bill, AmountBasedDiscountStrategy amountBasedDiscountStrategy, UserBasedDiscountStrategy userBasedDiscountStrategy) {
		this.amountBasedDiscountStrategy=amountBasedDiscountStrategy;	
		this.userBasedDiscountStrategy=userBasedDiscountStrategy;
		this.bill=bill;
	}
	
	private Bill bill;
	
	private AmountBasedDiscountStrategy amountBasedDiscountStrategy;
	
	private UserBasedDiscountStrategy userBasedDiscountStrategy;
	
	public void calculate() {
		userBasedDiscountStrategy.calculate(bill);
		amountBasedDiscountStrategy.calculate(bill);
	}
	

}
