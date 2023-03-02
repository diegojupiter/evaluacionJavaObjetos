package com.piloto.evaluacionjava;

//importe de bibliotecas
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.piloto.evaluacionjava.models.Alumno;
import com.piloto.evaluacionjava.models.Curso;
import com.piloto.evaluacionjava.models.Profesor;
 

@SpringBootApplication
public class EvaluacionjavaApplication {

	/*
	 * Primero se deben definir los objetos (colegio, cursos, profesores, materias, alumnos)
	 * Luego se debe relacionar con herencia los objetos 
	 * Luego se debe realizar una función que permita calcular el promedio de los alumnos
	 * Luego se debe realizar otra función que permita saber cuantos alumnos hay x curso 
	 * Luego se debe realizar una última función que permita, según un arreglo de notas, obtener la mj nota, la peor nota y el promedio de notas
	 * Se debe crear dentro del menú los objetos (definir sus atributos)
	 * Se debe crear un HashMap que contenga la cant de alumnos y el curso al que corresponden 
	 * Se debe crear un menu que contenga estas 3 opciones 
	 * 1) despliega el promedio de cada estudiante
	 * 2) despliega la cantidad de alumnos x curso 
	 * 3) despliega la mj nota, la peor nota y el promedio 
	 * 
	 */


	//Definir ArrayList
	ArrayList <Double> notas = new ArrayList<Double>();



	//función que permite calcular el promedio de los alumnos
	public static Double promNotas(ArrayList<Double> notas){
		Double suma = 0.0;
		for (int i = 0; i < notas.size(); i++){
			suma += notas.get(i);
		}
		return suma/notas.size();
	}

	//funcion que permite guardar un arrglo con cierta cantidad de alumnos x curso
	public Static Integer cantAlumnos()

	public static void main(String[] args) {

		//Importar el Scanner
		Scanner teclado = new Scanner(System.in);
		//Saludos al usuario
		System.out.println("********* BIENVENIDO/A *********");


		//Crear objetos 
		//Objeto Profesor
		Profesor profeDefault = new Profesor();
		Profesor profeC = new Profesor("Raul Conejan ", "Ciencias");
		Profesor profeH = new Profesor("Fernando Castillo","Historia");
		Profesor profeL = new Profesor("Cecilia Aceiton","Lenguaje");
		Profesor profeM = new Profesor("Jorge Gonzalez", "Matematica");
		Profesor profeEf = new Profesor("Ivan Pardo","Educacion Fisica");

		ArrayList <Profesor> Profesores = new ArrayList<Profesor>();

		//Objeto Curso
		Curso cursoDefault = new Curso();
		


		//Definir variables
		int cantAlumn;
		Double notasAlumn;
		
		//Ciclos
		do{
		System.out.println("Indique la cantidad de alumnos del curso: ");
		cantAlumn = teclado.nextInt();
		if(cantAlumn <= 0){
			System.out.println("La cantidad de alumnos debe ser mayor a cero, por favor intente de nuevo");
		}
		}while(cantAlumn <= 0);

		do{
			System.out.println("");
		}

	

	}

}
