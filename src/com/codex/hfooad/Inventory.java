package com.codex.hfooad;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
	List<Guitar> guitars = new ArrayList<>();
	public List<Guitar> search(GuitarSpec guitarSpec) {
		for(Guitar guitar : guitars) {
			//Search method goes here	
		}
		return guitars;
	}
}
