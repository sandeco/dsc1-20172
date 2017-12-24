package controladores;
import java.util.ArrayList;
import java.util.List;

import carros.Carro;

public class Concessionaria {
	
		
	private List<Carro> carros = new ArrayList<Carro>();
	
	public void adicionarCarro(Carro c){
		carros.add(c);
	}
	
	public void removerCarro(Carro c){
		carros.remove(c);
	}

	public List getCarros() {
		return carros;
	}

	
	public void listarCarros(){
		
		for(Carro c: carros){
			//System.out.println(c.getModelo());
		}
	}
	
	
	
}
