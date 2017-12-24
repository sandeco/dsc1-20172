package carros;
public class Golf extends Carro {
public Golf(){
setModelo("Golf de bandido tey tey");
}

@Override
public void ligar() {
	System.out.println("Vruuum , somzeira show tuts tuts");
}

@Override
public void desligar() {
}

@Override
public void acelerar() {

}

@Override
public void freiar() {
	System.out.println("Cavalo de pau.. IIRRRRRLLL");
}

@Override
public void parar() {
}
}
