package Corredor;

import java.util.Scanner;

public class Main {

			    public static void main(String[] args) {
			    	
			        int recarga;
			        Scanner in = new Scanner(System.in);
			        Corredor corredor = new Corredor();
				    System.out.print("Ingrese la energía del corredor actual: ");
				    corredor.setEnergia(in.nextInt());		        
			        
			    
			           System.out.println(" La persona se encuentra corriendo... ");			           
			            	corredor.correr();			            
			                corredor.verificarEnergia();
		            	    corredor.energiaAgotada();
			                System.out.print(" \n La energia del corredor es: "+ corredor.getEnergia()); 
			            			            
			            if(corredor.getEnergia() == 0){
			                System.out.println("\n La energía se recargara...");			          
			                	corredor.recargaEnergía(30);
			                	corredor.entrenar();			                
			                System.out.print("\n La energia del corredor es: "+ corredor.getEnergia());
			            }
			           
			            else{			            	
			                System.out.println("\n La energía se recargara...");			                   
			                	corredor.recargaEnergía(30);
			                	corredor.entrenar();			                
			                System.out.print("\n La energia del corredor es: "+ corredor.getEnergia());
			            }
			            
			    }
			    
			}
