package brief1;

import java.util.Scanner;
public class Brief {
 /* public static void main(String[] args) {
		System.out.print("Ecrire votre nom : ");
		Scanner scanner = new Scanner(System.in);
	     String nom = scanner.nextLine();
	     System.out.println("Bonjour : "  +  nom);   
	     
	     
	     /////// le mode de payment
			System.out.print("select between mensuel ou hobdomadaire : ");
			Scanner select = new Scanner(System.in);
//		     System.out.print("mode de payement est : "+ payment + " \n" );
		     
		     String payment = scanner.next();

		     
			if (payment== "hhh" ) {			
			 	System.out.print("le nombre d’heure travaillée par semaine : ");
				Scanner scaner = new Scanner(System.in);
			    int  heure = scaner.nextInt();
			}
	}
	
	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				String name; 
		        int mensuel, hobdomadaine, heure;
		        char operationType;

			    Scanner reader = new Scanner(System.in); //the  new keyword is used to create an instance of the class.
				//A message that prompts the employee to enter their name
				  System.out.println("veuillez saisir votre nom : ");
				  name = reader.next();
				  
				  System.out.println("Bonjour  "+name );
		   
		       do {
				System.out.println("veillez saisie entre le mode de payement mensuel ou hebdomadaire");
		        System.out.print("saisir le mode de payment: ");
		        operationType = reader.next().charAt(0);
		       		
		        
		        System.out.print("veillez saisir le nombre d’heure travaillée par semaine ");
		        heure = reader.nextInt();
		        
				if (heure < 25){
					 // Le nombre d’heure total ne doit pas dépasser 50 heures par semaine
			        System.out.print("Le nombre d’heure total ne doit pas dépasser 50 heures par semaine");
			        return;
			     }    
		       }while(true);*/

	public static void main(String[] args) {		 
		
		String name;
		double result, overTime, heursHob, heursMens, HobHeure, monthlyHourRate, minHoursPerWeek = 40,
				minHoursPerMonth = 180, maxheursHob = 50, maxHoursPerMonth = 200;
		char ModePayment;

		
		Scanner reader = new Scanner(System.in); // the new keyword is used to create an instance of the class.
		// A message that prompts the employee to enter their name
		System.out.println("Enter your Name: ");
		name = reader.next();
		// A welcome message on behalf of the user
		System.out.println("Bonjour : " + name);

		do {
			System.out.println("choisir le  mode de payement m for mensuel / h for hebdomadaire :");
			System.out.print("entrer le mode de payment !! ");
			ModePayment = reader.next().charAt(0);

			if (ModePayment == 'h') {
				
				System.out.print("le nombre d’heure travaillée par semaine: ");
				heursHob = reader.nextDouble();
				System.out.print("entrer le salaire en heure: ");
				HobHeure = reader.nextDouble();
				
				if (HobHeure < 25) {
					// The rate per hour must not be less than 25 DH per hour
					System.out.print("TLe tarif par heure ne doit pas être inférieur à 25 DH !\r\n");
					return;
			}
				
				
				if (heursHob > maxheursHob) {
					System.out.print(" Le nombre d’heure total ne doit pas dépasser 50 heures par semaine \r\n");
					return;
				}

				result = heursHob * HobHeure;
				if (minHoursPerWeek < heursHob && heursHob <= maxheursHob) {
					overTime = heursHob - minHoursPerWeek;
					result = (minHoursPerWeek * HobHeure) + overTime * (HobHeure + HobHeure / 2);
				}
				System.out.println("hebdomadaire saliare est : " + result + " DH");

			} 
			
			
			else if (ModePayment == 'm') {

				System.out.print("le nombre d’heure travaillée par semaine : ");
				heursMens = reader.nextDouble();
				System.out.print("Enter Rate Per Hour: ");
				monthlyHourRate = reader.nextDouble();
				if (monthlyHourRate < 20) {
					// The rate per hour must not be less than 25 DH per hour
					System.out.print("The rate per hour must not be less than 20 DH per hour!\r\n");
					return;
				}
				if (heursMens > maxHoursPerMonth) {
					System.out.print("The total number of hours must not exceed 50 hours per month!\r\n");
					return;
				}
				result = heursMens * monthlyHourRate;
				if (minHoursPerMonth < heursMens && heursMens <= maxHoursPerMonth) {
					overTime = heursMens - minHoursPerMonth;
					result = (minHoursPerMonth * monthlyHourRate) + overTime * (monthlyHourRate + monthlyHourRate / 2);
				}
				System.out.println("mensuel salaire est :  " + result + " DH");

			} else {
				System.out.println("Eroooooooooooooooooooooooooor");

			}

		} while (true);
				
			

}
}