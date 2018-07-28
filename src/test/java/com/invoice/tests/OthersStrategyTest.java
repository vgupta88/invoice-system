package com.invoice.tests;

import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.junit.Test;

import com.invoice.billing.Bill;
import com.invoice.billing.BillingItems;
import com.invoice.billing.ItemType;
import com.invoice.billing.OthersDiscountStrategy;
import com.invoice.billing.User;
import com.invoice.billing.UserType;

public class OthersStrategyTest {

	@Test
	public void testOthersStrategy() {
		User user = new User();
		user.setId(UUID.randomUUID().toString());
		user.setName("ABC");
		user.setType(UserType.OTHERS);
		user.setActiveSince(LocalDate.of(2001, 2, 2));

		Bill bill=new Bill();
		bill.setUser(user);
		List<BillingItems> itemsList = new ArrayList<BillingItems>();
		itemsList.add(new BillingItems("Soap", ItemType.OTHERS, 2, new BigDecimal(20)));
		itemsList.add(new BillingItems("Tomatoes", ItemType.GROCERIES, 6, new BigDecimal(20)));
		bill.setBillingItems(itemsList);
		
		OthersDiscountStrategy othersDiscountStrategy=new OthersDiscountStrategy();
		othersDiscountStrategy.calculate(bill);
		assertTrue(bill.getNetPayable().compareTo(new BigDecimal(40))==0);
		
	}
	
}
