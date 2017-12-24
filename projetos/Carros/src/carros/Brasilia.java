package carros;
public class Brasilia extends Carro {
	
	public Brasilia(){
		setModelo("\nBrasilia Amarela");
	}

	@Override
	public void ligar() {
		System.out.println("\nTchetcherevruuum (Onomatopeia da Brasilia ligando");
		System.out.println(" 'Minha Brasilia Amarela, ta de portas abertaaas' e ligandoooo");
		System.out.println(" Katchow");
		
	}

	@Override
	public void desligar() {
		System.out.println("\nBrasilia Desligandooo");
		System.out.println("Brasilia desligado :(");
		
		
	}

	@Override
	public void acelerar() {
		System.out.println("\nBrasilia acelerando");
		System.out.println("Vruuuuum");
		System.out.println("Vruuuuuuuuuuuuuuuum");
		System.out.println("Vruuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuum");
	}

	@Override
	public void freiar() {
		System.out.println("\nSsssssssssss, freando!!!!");
		System.out.println("\nBrasilia freado");
		
	}

	@Override
	public void parar() {
		System.out.println("\nBrasila parado,\n'Pra mode a gente se amar \nPelados em Santos'");
		
		
	}

}
