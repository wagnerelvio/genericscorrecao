package br.com.welc.programa;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest2 {

	public static void main(String args[]) {

		List<Carros> carro02 = new ArrayList<>();

		carro02.add(new Audi());
		carro02.add(new Honda());
		carro02.add(new Toyota());
		imprimirCarros2(carro02);
	}

	public static void imprimirCarros2(List<? extends Carros> lista) {
		for (Carros carro02 : lista) {
			System.out.println(carro02);
		}
	}

}
