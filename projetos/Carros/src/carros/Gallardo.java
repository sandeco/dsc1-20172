package carros;
public class Gallardo extends Carro {
	public Gallardo(){
		setModelo("Lambouguini");
	}

	@Override
	public void ligar() {
		System.out.println("Tao silencioso que nem percebi");
	}

	@Override
	public void desligar() {
		System.out.println("Do nada parou de tremer porque o motor � um monstro");
	}

	@Override
	public void acelerar() {
		System.out.println("Acelerando com um barulho lindo do motor");
	}

	@Override
	public void freiar() {
		System.out.println("Freando maravilhosamente perfeito");
		
	}

	@Override
	public void parar() {
		System.out.println("Nao gosto de parar mas se tem que parar a gente para");
		
	}
	public void virandoTransformer(){
		System.out.println("Bumblebee fica no chinelo");
	}
}
