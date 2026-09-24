package com.krakedev.herencia;

public class Padre {
	private int defectos;
	private int virtudes;
	
//	@Override
//	public String toString() {
//		return "Padre [defectos=" + defectos + ", virtudes=" + virtudes + "]";
//	}
	
	@Override //Ayuda a revisar que el metodo esta bien al momento de sobreescribir
	public String tostring() {
		return "Hola";
	}
	
	public int getDefectos() {
		return defectos;
	}
	public void setDefectos(int defectos) {
		this.defectos = defectos;
	}
	public int getVirtudes() {
		return virtudes;
	}
	public void setVirtudes(int virtudes) {
		this.virtudes = virtudes;
	}
	public void imprimir() {
		System.out.println("virtudes:"+ virtudes);
		System.out.println("defectos:"+ defectos);
	}
	public void guardarSecreto() {
		System.out.println("Esto no se hereda");
	}
}