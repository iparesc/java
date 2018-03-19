package com.ipartek.formacion.capitulo3;

public class EjercMesa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Listado de Mesas");
		System.out.println("-----------------------");
		MESA m1 = new MESA();
		MESA m2 = new MESA(1);
		MESA m3 = new MESA(-3);
		m1.setNumeroPatas(-2);
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
	}

}
