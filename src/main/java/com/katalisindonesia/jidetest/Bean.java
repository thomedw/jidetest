package com.katalisindonesia.jidetest;

public class Bean {
	/**
	 * Property name constant for {@code nested}.
	 */
	public static final String PROPERTYNAME_NESTED = "nested";
	/**
	 * Property name constant for {@code description}.
	 */
	public static final String PROPERTYNAME_DESCRIPTION = "description";
	/**
	 * Property name constant for {@code name}.
	 */
	public static final String PROPERTYNAME_NAME = "name";
	private String name;
	private String description;
	private Bean nested;

	public Bean(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public Bean() {
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Bean getNested() {
		if (nested == null) {
			nested = new Bean();
		}
		return nested;
	}

	public void setNested(Bean nested) {
		this.nested = nested;
	}
}
