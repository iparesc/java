//1.definicion package
package com.ipartek.formacion.capitulo3;
//2.imports=>ahora mismo no tenemos ninguno

//3.definicion de la clase
public class MESA {
	// 4.atributos

	final int PRECIO_PATA = 1;
	final int PRECIO_M2 = 2;
	final int PRECIO_MATERIAL_ALUMINIO = 3;
	final int PRECIO_MATERIAL_ACERO = 6;
	final int PRECIO_MATERIAL_PLASTICO = 2;
	final int PRECIO_MATERIAL_MADERA = 4;
	final int MATERIAL_MADERA = 1;
	final int MATERIAL_ACERO = 2;
	final int MATERIAL_ALUMINIO = 3;
	final int MATERIAL_PLASTICO = 4;

	private int numeroPatas;
	private int dimension;
	private String color;
	private int material;

	public MESA() {
		super();
		this.numeroPatas = 4;/**
								 * author:Ander Uraga
								 */
	}

	public int getNumeroPatas() {
		return numeroPatas;
	}

	public void setNumeroPatas(int numeroPatas) {
		this.numeroPatas = (numeroPatas < 0) ? 0 : numeroPatas;
	}

	@Override
	public String toString() {
		return "MESA [numeroPatas=" + numeroPatas + "]";
	}

	public MESA(int numeroPatas) {
		super();
		this.numeroPatas = numeroPatas;
		setNumeroPatas(numeroPatas);
	}

	/*
	 * 5 metodos 5.1 constructores 5.2 Getters and Setters 5.3 Otros
	 */
}
