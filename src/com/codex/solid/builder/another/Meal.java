package com.codex.solid.builder.another;

public class Meal {
	private String name;
	private int price;

	public Meal(IMealImporter importer) {
		this.name = importer.fetchName();
		this.price = importer.fetchPrice();
	}

	public void export(IMealExporter exporter) {
		exporter.setPrice(price);
		exporter.storeName(name);
	}
}
