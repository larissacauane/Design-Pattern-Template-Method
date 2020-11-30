package model;

public abstract class EstruturaBasica {
	
	public final void construcaoBasica() { //TEMPLATE METHOD
		construirParede();
		construirTelhado();
		addPorta();
		addJanela();
		addExtra();
	}
	
	public void construirParede() {
		System.out.println("Construiu paredes ");
	}
	
	public void construirTelhado() {
		System.out.println("Construiu telhado");
	}
	
	public void addPorta() {
		System.out.println("Adicionou porta");
	}
	
	public void addJanela() {
		System.out.println("Adicionou janela");
	}
	
	
	public abstract void addExtra();

}
