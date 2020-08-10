package Corredor;

import java.util.Scanner;

import Emisora.EmisoraFM;

public class Main {

			    public static void main(String[] args) {
			    	
			        int recarga, opcion;
			        Scanner in = new Scanner(System.in);
			        Corredor corredor = new Corredor();
				    System.out.print("Ingrese la energía del corredor actual: ");
				    corredor.setEnergia(in.nextInt());		
				    
				    do {

			            System.out.println("\n   Menu Principal   ");
			            System.out.println("*********************");
			            System.out.println("1. Recargar energía");
			            System.out.println("2. Correr");
			            System.out.println("3. Entrenar");
			            System.out.println("4. Salir");
			            System.out.println("Digite opcion (1/4): ");
			            opcion = in.nextInt();
			    			 
			            switch(opcion){
			                case 1: corredor.verificarEnergia();corredor.recargaEnergía(30);break;
			                case 2: corredor.energiaAgotada();corredor.correr();break;
			                case 3: corredor.verificarEnergia();corredor.entrenar();break;
			                case 4: break;
			                default: System.out.println("Opcion no válida");//Mensaje de dato erróneo
			            }
			        }while (opcion != 4);
			      }
}		    
