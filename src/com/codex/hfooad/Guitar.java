package com.codex.hfooad;

public class Guitar {
	private Integer serialNo;
	private Long price;
	private GuitarSpec guitarSpec;

	public Guitar(GuitarSpec guitarSpec, Integer serialNo, Long price) {
		this.setSerialNo(serialNo);
		this.setPrice(price);
		this.guitarSpec.setBuilder(guitarSpec.getBuilder());
		this.guitarSpec.setModel(guitarSpec.getModel());
		this.guitarSpec.setType(guitarSpec.getType());
		// TODO Auto-generated constructor stub
	}

	public Integer getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(Integer serialNo) {
		this.serialNo = serialNo;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public GuitarSpec getGuitarSpec() {
		return guitarSpec;
	}

	public void setGuitarSpec(GuitarSpec guitarSpec) {
		this.guitarSpec = guitarSpec;
	}
}
