package com.invoice.billing;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class CustomerDiscountStrategy implements UserBasedDiscountStrategy {

	public void calculate(Bill bill) {
		BigDecimal groceriesTotalBill = BigDecimal.ZERO;
		BigDecimal othersTotalBill = BigDecimal.ZERO;
		List<BillingItems> itemsList = bill.getBillingItems();
		for(BillingItems item : itemsList) {
			if(item.getType().equals(ItemType.GROCERIES))
				groceriesTotalBill=groceriesTotalBill.add(item.getPrice());
			else if(item.getType().equals(ItemType.OTHERS))
				othersTotalBill=othersTotalBill.add(item.getPrice());
		}

		if(LocalDate.now().minusYears(2).isAfter(bill.getUser().getActiveSince())) {			
			BigDecimal totalBill=groceriesTotalBill.add(othersTotalBill);
			bill.setNetPayable(totalBill.subtract(othersTotalBill.multiply(BigDecimal.valueOf(5).divide(new BigDecimal(100)))));
		}
		else {
			bill.setNetPayable(groceriesTotalBill.add(othersTotalBill));
		}

	}
}
