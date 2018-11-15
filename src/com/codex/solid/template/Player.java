package com.codex.solid.template;

/*
 *  can be local or away
 *  can be keeper/
 */
abstract class Player {
	private String name;
	private Integer age;
	private Category category;
	private Designation designation;

	public Player(String name, Category category, Designation designation) {
		this.name = name;
		this.category = category;
		this.designation = designation;
	}

	public void pay() {
		int amount = getContractAmount();
		System.out.println("Player : " + name + "\t paid Rs." + amount);
	}

	abstract protected int getContractAmount();

	public Category getCategory() {
		return category;
	}

	public Integer getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public Designation getDesignation() {
		return designation;
	}
}
