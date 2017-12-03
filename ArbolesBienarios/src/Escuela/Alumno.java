package Escuela;

import java.util.Comparator;

public class Alumno implements Comparable<Alumno>, Comparator<Alumno> {
	private String nombre = null;
	private double promedio = 0.0d;

	public Alumno(String nombre, double promedio) {
		this.nombre = nombre;
		this.promedio = promedio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPromedio() {
		return promedio;
	}

	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}

	@Override
	public String toString() {

		return "Nombre: " + nombre + " Promedio: " + promedio;
	}

	@Override
	public int compare(Alumno o1, Alumno o2) {
		return o1.compareTo(o2);
	}

	@Override
	public int compareTo(Alumno o) {
		if (this.promedio == o.promedio)
			return 0;
		else if (this.promedio >= o.promedio)
			return -1;
		else
			return 1;

	}

}
