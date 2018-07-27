package com.invoice.billing;

import java.time.LocalDate;

public class User {
	
	private String id;
	
	private String name;
	
	private UserType type;
	
	private LocalDate activeSince;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public UserType getType() {
		return type;
	}

	public void setType(UserType type) {
		this.type = type;
	}

	public LocalDate getActiveSince() {
		return activeSince;
	}

	public void setActiveSince(LocalDate activeSince) {
		this.activeSince = activeSince;
	}

}
