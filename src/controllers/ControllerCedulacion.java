package controllers;

import java.util.Random;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.RegistroCivil;

public class ControllerCedulacion {

	@FXML TextField txtNombre;
	@FXML Label lblMensaje;
	
	public void generarCedula()
	{
		String nombreACedular = txtNombre.getText();
		//System.out.println("Nombre del usuario a cedular: " + nombreACedular);
		String mensaje = "Su cedula es: " + RegistroCivil.generarCedulaPorNombre(nombreACedular);
		lblMensaje.setText(mensaje);
		System.out.println(mensaje);
		
	}
	
	public void salir()
	{
		System.exit(0);
	}
}
