
public class Motor 
{
	private int id;
	private double forca;
	private boolean ligado;
	
	public boolean ligarMotor()
	{
		if(this.ligado)
		{
			this.ligado = false;
		}
		else
		{
			this.ligado = true;
		}
		return this.ligado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getForca() {
		return forca;
	}

	public void setForca(double forca) {
		this.forca = forca;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
}
