package com.cursoceat.controller;

import java.io.File;
import java.util.Scanner;

import com.cursoceat.xml.schema.Banco;
import com.cursoceat.xml.schema.Banco.Cliente;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

public class Controller {

	public static void main(String[] args) throws JAXBException {
	
		
		Menu();

	}
	//creamos una coleccion que nos permita guardar los datos	
	static Banco banco= new Banco();
	
	public static void Menu() throws JAXBException{
		
		System.out.println("+Indique que accion desea llevar a cabo+");
		System.out.println("| 1.Dar alta cliente.                  |");
		System.out.println("| 2.Generar xml.                       |");
		System.out.println("| 3.Leer xml.                          |");
		System.out.println("| 4.Salir.                             |");
		System.out.println("+--------------------------------------+");
		
		Scanner sc=new Scanner(System.in);
		int opcion=sc.nextInt();
		
		switch(opcion) {
		case 1: darAlta();
		break;
		case 2: escribirXML();
		break;
		case 3: leerXML();
		break;
		case 4: System.out.println("Gracias hasta pronto :)");
		}
		sc.close();
	}

	public static void escribirXML() throws JAXBException{

		
		
		//generamos el contexto para agrupar el xml
		JAXBContext contexto=JAXBContext.newInstance(Banco.class);
		//creamos el agrupamiento
		Marshaller marshaller=contexto.createMarshaller();
		//indicamos el formato como se genera con el que se genera el agrupamiento
		//con JAXB.FORMATTED_OUTPUT nos guarda el archivo con estructura ordenada xml
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		//mostramos por pantalla
		marshaller.marshal(banco,System.out);
		//creamos un archivo a partir de los objetos creados 
		marshaller.marshal(banco,new File("C:\\Users\\PROGRAMACION\\Desktop\\JAVA\\EvBanco\\DatosBanco.xml"));
		
		
		Menu();
	}
	
	
	public static void leerXML() throws JAXBException{
		
		//indicamos donde se encuentra el archivo a leer.		
		File miArchivo=  new File("C:\\Users\\PROGRAMACION\\Desktop\\JAVA\\EvBanco\\DatosBanco.xml");		
		//generamos contexto para desagrupar xml 
		JAXBContext contexto=JAXBContext.newInstance(Banco.class);
		//leemos(o desagrupamos) el xml a partir de ese contexto
		Unmarshaller miLectura=contexto.createUnmarshaller();
		//creamos el objeto banco con los datos leidos en el xml(clientes y sus datos)
		//se le hace un cast a tipo (banco) 
		Banco clientes=(Banco)miLectura.unmarshal(miArchivo);
		
		//al ser una coleccion lo leemos con un for each
		
		for(Cliente s:clientes.getCliente()) {
			System.out.println(s.getDni());
			System.out.println(s.getNombreApellidos());
			System.out.println(s.getFechaNacimiento());
			System.out.println(s.getSaldo());
		}
		Menu();
	}
	
	public static void darAlta() throws JAXBException {
		
		System.out.println("Introduzca su dni");
		String dni= new Scanner(System.in).next();
		
		
		System.out.println("Introduzca su nombre y apellidos");
		String nombre= new Scanner(System.in).next();
		
		System.out.println("Introduzca fecha nacimineto");
		String fecha= new Scanner(System.in).next();
		
		System.out.println("Introduzca tu saldo");
		String saldo= new Scanner(System.in).next();
		
		
		//creamos el primer objeto y le pasamos sus parametros
				Cliente cliente=new Cliente();		
				cliente.setDni(dni);
				cliente.setNombreApellidos(nombre);
				cliente.setFechaNacimiento(fecha);
				cliente.setSaldo(saldo);
				//y lo añadimos a la coleccion
				banco.getCliente().add(cliente);
				
				Menu();
		}
	

}
