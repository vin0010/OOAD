package com.codex.solid.depenencyinversion;

public class Button {
	public static void main(String[] args) {
		ObjectListener someOne = new SomeObject();
		someOne.pressed();
		ObjectListener someOneAgain = new AnotherObject();
		someOneAgain.pressed();
	}
}
