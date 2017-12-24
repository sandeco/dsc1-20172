package controladores;
import carros.Carro;
import carros.Hillux;
import partesCarro.Motor;
import partesCarro.Pneu;
import partesCarro.Porta;
import partesCarro.Roda;
import partesCarro.Som;

public class Fabrica {
	
	
	private String name;
	
	
	public static Carro criarCarro(){
		
		Fabrica fabrica = new Fabrica();
		
		
		fabrica.name = "Toyota";
		
		Carro carro = new Hillux();
		
		carro.setFabrica(fabrica);
		
		
		Motor m = new Motor();
		carro.setMotor(m);
		Som som = new Som();
		carro.setSom(som);
		Porta p1 = new Porta();
		Porta p2 = new Porta();
		carro.adicionarPorta(p1);
		carro.adicionarPorta(p2);
		Roda r1 = new Roda();
		Pneu pn1 = new Pneu();
		r1.adicionarPneu(pn1);
		carro.adicionarRoda(r1);
		
		return carro;
		
	}
	

}
