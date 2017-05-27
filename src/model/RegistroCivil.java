package model;

import java.util.Random;

public class RegistroCivil {

	public static String generarCedulaRandom()
	{
		Random r = new Random();
		int cedula = r.nextInt(999999999);
		String cedulaString = "0"+cedula;
		return cedulaString;
	}
	
	public static String generarCedulaPorNombre(String nombre)
	{
		String cedulaString;
		
		int cedulaHash = Math.abs(nombre.hashCode());
		
		cedulaString = Integer.toString(cedulaHash);
		cedulaString = String.format("%010d", cedulaHash);
		return cedulaString;
	}
}
