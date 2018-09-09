
public class Porta 
{
	private int id;
	private String cor;
	private boolean portaAberta;
	private boolean vidroBaixo;
	
	public boolean abrirPorta()
	{
		if(this.portaAberta)
		{
			this.portaAberta = false;
		}
		else
		{
			this.portaAberta = true;
		}
		return this.portaAberta;
	}
	
	 public boolean baixarVidro()
	 {
		 if(vidroBaixo)
		 {
			 this.vidroBaixo = false;
		 }
		 else
		 {
			 this.vidroBaixo = true;
		 }
		 return this.vidroBaixo;
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

	public boolean isPortaAberta() {
		return portaAberta;
	}

	public void setPortaAberta(boolean portaAberta) {
		this.portaAberta = portaAberta;
	}

	public boolean isVidroBaixo() {
		return vidroBaixo;
	}

	public void setVidroBaixo(boolean vidroBaixo) {
		this.vidroBaixo = vidroBaixo;
	}
	 
}
