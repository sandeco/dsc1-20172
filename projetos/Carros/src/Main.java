import carros.Brasilia;
import carros.Carro;
import carros.Gallardo;
import carros.Golf;
import carros.Hillux;
import carros.RangeRover;
import controladores.Estrada;
import controladores.Fabrica;

public class Main {

	public static void main(String[] args) {
		
		
		Carro c = Fabrica.criarCarro();
		
		Estrada estrada = new Estrada();
		
		estrada.adicionarCarro(c);
		
		estrada.corrida();
		
		
		
		
		
		
		
		
		
	}

}
