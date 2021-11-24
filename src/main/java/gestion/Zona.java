package gestion;

import java.util.ArrayList;
import zooAnimales.*;

public class Zona {

	private String nombre;
	private Zoologico zoo;
	private ArrayList<Animal> animales = new ArrayList();

	public Zona(){}

	public Zona(String nombre, Zoologico zoo) {
		this.nombre = nombre;
	    this.zoo = zoo;
	    this.animales = animales;}

	public Zoologico getZoo() {
	    return zoo;}

	public void setZoo(Zoologico zoo) {
	    this.zoo = zoo;}

	public String getNombre() {
		return nombre;}

	public void setNombre(String nombre) {
	    this.nombre = nombre;}

	public ArrayList<Animal> getAnimales() {
	    return animales;}

	public void setAnimales(ArrayList<Animal> animales) {
	    this.animales = animales;}

	public void agregarAnimales(Animal animal) {
	    animales.add(animal);}

	public  int cantidadAnimales() {
	    return animales.size();}

}
