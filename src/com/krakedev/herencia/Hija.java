package com.krakedev.herencia;

public class Hija extends Padre {
	
	public Hija () {
		super();
	}
	public void escucharBadBunny() {
		System.out.println("Escuchando esta musica horrible");
	}

	@Override
	public String toString() {
		return "Defectos: "+ getDefectos()+" Virtudes:  "+ getVirtudes();
	}
	
}
