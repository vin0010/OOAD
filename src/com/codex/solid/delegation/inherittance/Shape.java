package com.codex.solid.delegation.inherittance;

public abstract class Shape {
	protected Color color;

	public void darken() {
		System.out.println("darkened");
	}
	
	public void render(Graphics g) {
		draw(g);
	}
	abstract void draw(Graphics graphics);
}