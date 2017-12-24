package controladores;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import carros.Carro;

public class Estrada {

	
	List<Carro> carros = new ArrayList<Carro>();
	
	
	public void adicionarCarro(Carro carro){
		carros.add(carro);
	}
	
	public void start(){
		sinalVermelho();
		sinalVerde();
		lombada();
		estradaFechada();
	}
	
	
	public void sinalVermelho(){
		for(Carro c: carros){
			c.parar();
		}
	}
	
	public void sinalVerde(){
		for(Carro c : carros){
			c.acelerar();
		}
	}
	
	public void lombada(){
		for(Carro c: carros){
			c.freiar();
		}
	}
	
	 
	public void estradaFechada(){
		for(Carro c: carros){
			c.desligar();
		}
	}
	
	
	
	public void corrida(){
		
		int x = new Random().nextInt(carros.size());
		int y = new Random().nextInt(carros.size());
		
		while(x==y){
			y = new Random().nextInt(carros.size());
		}
		
		Carro c1 = carros.get(x);
		Carro c2 = carros.get(y);

		System.out.println("SENHORAS E SENHORES, LIGUEM SEUS MOTORES");

		
		c1.ligar();
		c2.ligar();
		
		System.out.println("3, 2, 1.... VAI DANADA");
		
		c1.acelerar();
		c2.acelerar();
		
		c2.acelerar();
		c1.acelerar();
		
		c1.freiar();
		c2.freiar();
		
		c1.parar();
		c2.parar();
		
		c2.desligar();
		c1.desligar();
		
	}
	
	
	
	
}
