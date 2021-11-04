package org.formacion.mediator;

public class Mediator {
	
	private Coche coche;
	private Telefono telefono;
	private Radio radio;
	
	public Mediator(Telefono telefono, Coche coche, Radio radio) {
		this.telefono = telefono;
		this.coche = coche;
		this.radio = radio;
		this.telefono.setMediator(this);
		this.coche.setMediator(this);
		this.radio.setMediator(this);
	}
	
	public void enciendeCoche() {
		coche.enciende();
		telefono.apagaMusica();
	}
	
	public void apagaCoche() {
		coche.apaga();
	}
	
	public void recibeLlamada() {
		radio.apaga();
	}
	
	public void enciendeRadio() {
		telefono.apagaMusica();
	}
	
	public void apagaRadio() {
		
	}
	
}
