package gestion;
import zooAnimales.*;
import java.util.ArrayList;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private ArrayList<Animal> animales = new ArrayList<Animal>();

	public Zona() {
	}

	public Zona(String nombre, Zoologico zoo, ArrayList<Animal> animales) {
		this.nombre = nombre;
		this.zoo = zoo;
		this.animales = animales;
	}
	public void agregarAnimales(Animal animal) {
		
		animales.add(animal);

	}
	public int cantidadAnimales() {
		return animales.size();

	}
	public Zoologico getZoologico() {
		return zoo;

	}
	public void setZoologico(Zoologico zoo) {
		this.zoo = zoo;

	}
	public String getNombre() {
		return nombre;

	}
	public void setNombre(String nombre) {
		this.nombre = nombre;

	}

	public void setAnimal(ArrayList<Animal> animal) {
		this.animales = animal;
	}

}
