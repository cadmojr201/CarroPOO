
public class Carro 
{
	private int id;
	private String cor;
	private String placa;
	private String modelo;
	private String marca;
	private Motor motor;
	private Porta porta;
	private boolean ligado;
	
	public boolean ligar()
	{
		if(this.ligado)
		{
			this.ligado = false;
		}
		else
		{
			this.ligado = true;
			//this.motor.ligarMotor();
		}
		return this.ligado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public Porta getPorta() {
		return porta;
	}

	public void setPorta(Porta porta) {
		this.porta = porta;
	}
	
	
	
	
	
}
