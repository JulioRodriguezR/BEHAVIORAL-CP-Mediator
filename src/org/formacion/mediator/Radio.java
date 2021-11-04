package org.formacion.mediator;

public class Radio {
	
	private Mediator mediator;
	private boolean encendida = false;
	
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	public void enciende() {
		encendida = true; 
		mediator.enciendeRadio();
	}
	
	public void apaga() {
		encendida = false;
		mediator.apagaRadio();
	}
	
	public boolean encendida() {
		return encendida;
	}
}
