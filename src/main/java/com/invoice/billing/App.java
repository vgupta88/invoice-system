package com.invoice.billing;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class App {

	public static void main(String[] a) {
		User user = new User();
		user.setId(UUID.randomUUID().toString());
		user.setName("ABC");
		user.setType(UserType.EMPLOYEE);
		user.setActiveSince(LocalDate.of(2001, 2, 2));

		Bill bill=new Bill();
		bill.setUser(user);
		List<BillingItems> itemsList = new ArrayList<BillingItems>();
		itemsList.add(new BillingItems("Soap", ItemType.OTHERS, 2, new BigDecimal(10)));
		itemsList.add(new BillingItems("Tomatoes", ItemType.GROCERIES, 6, new BigDecimal(8)));
		bill.setBillingItems(itemsList);
		switch(bill.getUser().getType()) {
		case EMPLOYEE:
			BillPayable payable=new BillPayable(bill, new CentBillDiscountStrategy(), new EmployeeDiscountStrategy());
			payable.calculate();
			System.out.println("Bill Payable: "+bill.getNetPayable().toString());
			break;
		default:
			System.out.println("TODO");
			break;
		}

	}
}
