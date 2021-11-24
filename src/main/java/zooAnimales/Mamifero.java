package zooAnimales;
import gestion.Zona;
import java.util.ArrayList;

public class Mamifero extends Animal {
	private int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	private ArrayList<Mamifero> listado; 
	public int caballos=0;
	public int leones=0;
	private boolean pelaje;
	private int patas;

	public Mamifero() {
	}

	public Mamifero(String nombre, int edad, String habitat, String genero, Zona zona, boolean pelaje, int patas){
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.zona = zona;
		this.pelaje = pelaje;
		this.patas = patas;
		totalAnimales++;
	}
	public int cantidadMamiferos() {
		return listado.size();

	}
	public void crearCaballo() {
		caballos++;
		Mamifero caballo = new Mamifero(nombre, edad, "selva", genero, zona, true, 4);

	}
	public void crearLeon() {

		leones++;
		Mamifero leon = new Mamifero(nombre, edad, "selva", genero, zona, true, 4);

	}
	public String getNombre() {
		return nombre;

	}
	public void setNombre(String nombre) {
		this.nombre=nombre;

	}
	public int getEdad() {
		return edad;

	}
	public void setEdad(int edad) {
		this.edad=edad;

	}
	public String getHabitat() {
		return habitat;

	}
	public void setHabitat(String habitat) {
		this.habitat=habitat;
	}
	public String getGenero() {
		return genero;

	}
	public void setGenero(String genero) {
		this.genero=genero;

	}
	public Zona getZona() {
		return zona;

	}
	public void setZona(Zona zona) {
		this.zona=zona;

	}
	public ArrayList<Mamifero> getMamifero() {
		return listado;

	}
	public void setMamifero(ArrayList<Mamifero> listado) {
		this.listado=listado;
	}
	public boolean getPelaje() {
		return pelaje;

	}
	public void setPelaje(boolean pelaje) {
		this.pelaje=pelaje;

	}
	public int getPatas() {
		return patas;

	}
	public void setPatas(int patas) {
		this.patas=patas;

	}

}
