package org.formacion.mediator;

public class Mediator {

	private Telefono telefono;
	private Coche coche;
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
		radio.enciende();
		telefono.apagaMusica();
	}

	public void apagaCoche() {
		radio.apaga();
	}

	public void enciendeRadio() {
		telefono.apagaMusica();
	}

	public void apagaRadio() {
	}

	public void recibeLlamada() {
		radio.apaga();
	}

}
