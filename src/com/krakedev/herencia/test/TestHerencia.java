package com.krakedev.herencia.test;

import com.krakedev.herencia.Hija;

public class TestHerencia {

	public static void main(String[] args) {
		Hija hija = new Hija();
		hija.setVirtudes(5);
		hija.setDefectos(2);
		System.out.println("virtudes:"+ hija.getVirtudes());
		System.out.println("defectos:"+ hija.getDefectos());
	}
}
