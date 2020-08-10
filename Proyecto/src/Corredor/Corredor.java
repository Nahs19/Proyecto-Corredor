package Corredor;

public class Corredor {
	
	private int energia;

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}
	
	public int verificarEnergia() {
		if (energia <= 0 ) {
			energia = 0;
			System.out.println(" El corredor esta en mal estado ");
		}
		else if(energia >= 100) {
			energia = 100;
			System.out.println("El corredor esta activo");			
		}
		return energia;
	}
	
	public int recargaEnergía(int recargaEnergia) {
		if (energia <= 0 ) {
			energia = 0;
			energia = energia + recargaEnergia;
			System.out.println("Su energia se recargo a: " + energia);	
			
		}
		else if(energia >= 100) {
			energia = 100;
			energia = energia + recargaEnergia;
			System.out.println("Su energia se recargo a: " + energia);	
		}		
		return energia;
     	}
	
	public int correr() {
		energia = energia - 10;
		System.out.println("Su energia se encuentra en: " + energia);
		if (energia == 0) {
		energia = 0;
		System.out.println("Su energia se encuentra en: " + energia);
		}
		return energia;
     	}
	
	public int energiaAgotada() {
		if (energia < 10) {
			energia = 0;
			System.out.println(" El corredor ya se encuentra cansado");
		}
		return energia;
	}
	
	public int entrenar() {
		if (energia <= 0) {
			energia = 0;
			energia = energia + 15;
			System.out.println("Su energia después de entrenar es de: " + energia);
		}
		else if (energia > 0 && energia < 100) {
			energia = energia + 15;
			System.out.println("Su energia después de entrenar es de: " + energia);
			System.out.println("Su energia aún esta baja, necesita mejorar su físico ");
		}
		else if (energia >= 100) {
			energia = 100;
			System.out.println(" El corredor se encuantra en buena forma, no es necesario que entrene ");			
		}
		return energia;
	}
}
