package br.senai.sp.jandira;

import java.util.Scanner;

public class ComparativoCombustivel {

	public static void main(String[] args) {
		
		double precoGasolina;
		double precoAlcool;

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("*************************************");
		System.out.println("         GASOLINA OU ÁLCOOL?");
		System.out.println("*************************************");
		System.out.println("");
		
		System.out.print("Preço da Gasolina: ");
		precoGasolina = teclado.nextDouble();
		
		System.out.print("Preço do Álcool: ");
		precoAlcool = teclado.nextDouble();		
		
		System.out.println("");
		System.out.println("*************************************");
		
		double vantagem = precoGasolina * PrecoAlcool;
		
		if () {
		System.out.println("No momento é mais vantajoso abastecer com GASOLINA!");
		}else {
		System.out.println("No momento é mais vantajoso abastecer com Álcool!");
		}
	

}
