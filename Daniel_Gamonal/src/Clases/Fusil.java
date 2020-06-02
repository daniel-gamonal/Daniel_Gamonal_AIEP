package Clases;

public class Fusil extends Arma{
	
	
	String Tipo;
	
	public Fusil(String Nombre, String Calibre, String TipoDisparo, String Fabricante) {
		super(Nombre, Calibre, TipoDisparo, Fabricante);
		// TODO Auto-generated constructor stub
	}

	public Fusil() 
	{
		super();
	}
	
	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}
}
