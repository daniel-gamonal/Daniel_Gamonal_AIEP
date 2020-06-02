package Clases;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
	SubFusil Subfusil = new SubFusil();
	
	Fusil fusil	= new Fusil();
	
	System.out.println("ingrese nombro de la Arma:");
	String Nombre = sc.next();
	fusil.setNombre(Nombre);
	
	System.out.println("ingrese Calibre del Arma:");
	String Calibre = sc.next();
	fusil.setCalibre(Calibre);
	
	System.out.println("ingrese Tipo de Disparo del Arma:");
	String TipoDisparo = sc.next();
	fusil.setTipoDisparo(TipoDisparo);
	
	System.out.println("ingrese Fabricante del Arma:");
	String Fabricante = sc.next();
	fusil.setFabricante(Fabricante);
	
	System.out.println(Nombre + " " +  Calibre + " " +  TipoDisparo + " " + Fabricante);	
		
		
	}
}
