package carros;

import java.util.ArrayList;
import java.util.List;

import controladores.Fabrica;
import partesCarro.Motor;
import partesCarro.Porta;
import partesCarro.Roda;
import partesCarro.Som;

public abstract class Carro {
	
	private String modelo;
	
	
	private Motor motor;
	private Som som;
	private List<Roda>  rodas = new ArrayList<Roda>();	
	private List<Porta> portas = new ArrayList<Porta>();
	private Fabrica fabrica;
	
	
	public void adicionarRoda(Roda roda){
		rodas.add(roda);
	}
	
	public void adicionarPorta(Porta porta){
		portas.add(porta);
	}

	
	public abstract void ligar();
	public abstract void desligar();
	public abstract void acelerar();
	public abstract void freiar();
	public abstract void parar();
	
	
	
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Som getSom() {
		return som;
	}

	public void setSom(Som som) {
		this.som = som;
	}

	public void setFabrica(Fabrica fabrica) {
		this.fabrica = fabrica;
		
	}
	
	
	
}
