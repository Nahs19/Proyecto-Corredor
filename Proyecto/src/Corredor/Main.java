package Corredor;

import java.util.Scanner;

public class Main {

			    public static void main(String[] args) {
			    	
			        int correr,recarga,entrenar;
			        Scanner in = new Scanner(System.in);
			        Corredor corredor = new Corredor();
				    System.out.print("Ingrese la energ�a del corredor actual: ");
				    corredor.setEnergia(in.nextInt());		        
			        
			    
			           System.out.println(" La persona se encuentra corriendo... ");			           
			            	corredor.correr();			            
			                corredor.verificarEnergia();
		            	    corredor.energiaAgotada();
			                System.out.print(" \n La energia del corredor es: "+ corredor.getEnergia()); 
			            			            
			            if(corredor.getEnergia() == 0){
			                System.out.println("\n La energ�a se recargara...");			          
			                	corredor.recargaEnerg�a(30);
			                	corredor.entrenar();			                
			                System.out.print("\n La energia del corredor es: "+ corredor.getEnergia());
			            }
			           
			            else{			            	
			                System.out.println("\n La energ�a se recargara...");			                   
			                	corredor.recargaEnerg�a(30);
			                	corredor.entrenar();			                
			                System.out.print("\n La energia del corredor es: "+ corredor.getEnergia());
			            }
			            
			    }
			    
			}