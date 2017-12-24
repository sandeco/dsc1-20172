package carros;
public class Hillux extends Carro {

	@Override
	public void ligar() {
		System.out.println("Hillux ligando");
		
	}

	@Override
	public void desligar() {
		System.out.println("Hillux desligando");
		
	}

	@Override
	public void acelerar() {
		System.out.println("Hillux acelerando");
		
	}

	@Override
	public void freiar() {
		System.out.println("Hillux freiando");
	}

	@Override
	public void parar() {
		System.out.println("Hillux parando");
		
	}

}
