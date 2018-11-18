package com.codex.solid.depenencyinversion;

import java.util.Iterator;

public class Button {
	public static void main(String[] args) {
		ObjectListener someOne = new SomeObject();
		someOne.pressed();
		ObjectListener someOneAgain = new AnotherObject();
		someOneAgain.pressed();
	}
}

interface Mine extends Iterator<Button>{
	public void pay();
}