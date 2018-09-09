
public class Principal 
{

	public static void main(String[] args) 
	{
		 Carro c1 = new Carro();
		 Motor m1 = new Motor();
		 Porta p1 = new Porta();
		 c1.setMarca("Chevrolet");
		 c1.setCor("Preto");
		 m1.setForca(1.0);
	
		 System.out.println("Cor: "+c1.getCor()+"\nMarca: "+c1.getMarca()+"\nForça: "+m1.getForca()+"\nPorta aberta: "+p1.isPortaAberta()+"\nVidro baixo: "+p1.isVidroBaixo()/*+"Porta aberta: "+c1.getPorta().isPortaAberta()+"Vidro aberto: "+c1.getPorta().isVidroBaixo()*/+"\nLigado: "+c1.isLigado()/*+c1.getMotor().isLigado()+"\nForça: "+c1.getMotor().getForca()*/);
		 c1.ligar();
		 p1.abrirPorta();
		 p1.baixarVidro();
		 //c1.ligarMotor();
		 System.out.println("\nCor: "+c1.getCor()+"\nMarca: "+c1.getMarca()+"\nForça: "+m1.getForca()+"\nPorta aberta: "+p1.isPortaAberta()+"\nVidro baixo: "+p1.isVidroBaixo()/*+"Porta aberta: "+c1.getPorta().isPortaAberta()+"Vidro aberto: "+c1.getPorta().isVidroBaixo()*/+"\nLigado: "+c1.isLigado()/*+c1.getMotor().isLigado()+"\nForça: "+c1.getMotor().getForca()*/);
		 
	}

}
