package Clases;

public class Arma {
	
	String Nombre;
	String Calibre;
	String TipoDisparo;
	String Fabricante;
	
	public Arma ()
	{
	}
	
	public Arma (String Nombre, String Calibre, String TipoDisparo, String Fabricante)
	{
		this.Nombre = Nombre;
		this.Calibre = Calibre;
		this.TipoDisparo = TipoDisparo;
		this.Fabricante= Fabricante;
	}
	
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getCalibre() {
		return Calibre;
	}

	public void setCalibre(String calibre) {
		Calibre = calibre;
	}

	public String getTipoDisparo() {
		return TipoDisparo;
	}

	public void setTipoDisparo(String tipoDisparo) {
		TipoDisparo = tipoDisparo;
	}

	public String getFabricante() {
		return Fabricante;
	}

	public void setFabricante(String fabricante) {
		Fabricante = fabricante;
	}
}
