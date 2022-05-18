	 ////////////////////////////// contexte de projet ///////////////////////////////////////


				 /* 					
				 Écrivez un programme JAVA qui permet de simuler le montant obtenu chaque semaine et chaque mois :

				Scénario:

				Un message qui invite l’employé à introduire son nom

				Un message de bienvenue au nom de l’utilisateur

				L’utilisateur est invité à choisir entre mode de payement mensuel ou hebdomadaire

				Dans le premier cas :

				L’utilisateur est invité à introduire le nombre d’heure travaillée par semaine

				Le nombre d’heure total ne doit pas dépasser 50 heures par semaine

				Le tarif par heure ne doit pas être inférieur à 25 DH par heure Si le 40 < nombre d’heure <=50 le tarif par heure est augmenté par 50/% par rapport au tarif de base pour les heures extra   « les heures qui dépassent 40»

				Dans le second cas :

				L’utilisateur est invité à introduire le nombre d’heure travaillée par mois

				Le nombre d’heure total ne doit pas dépasser 200 heures par mois

				Le tarif ne doit pas être inférieur à 20 DH par heure Si le 180 < nombre d’heure <=200 le tarif par heure est augmenté par 50/% par rapport au tarif de base pour les heures extra  « les heures qui dépassent 180 »

				NB : salaire de base= taux horaire * heures prestées
				 		*/

						package brief1;

import java.util.Scanner;
public class Brief {
	public static void main(String[] args) {		 
		
				String name;
				double 
				heursHob, heuresMens,result, TarifHobHeure, TarifheuresMens,overTime, 
				minheuresHob = 40,
				minheuresMens= 180,
				maxheursHob = 50, 
				maxheuresMens = 200;
				char ModePayment;

		
		Scanner reader = new Scanner(System.in);  j
		System.out.println("Enter your Name: ");
		name = reader.next();
		System.out.println("Bonjour : " + name);

		do {
			System.out.println("choisir le  mode de payement m for mensuel / h for hebdomadaire :");
			System.out.print("entrer le mode de payment !! ");
			
			////////// check the first letter 
			ModePayment = reader.next().charAt(0);

			if (ModePayment == 'h') {
				
				System.out.print("le nombre d’heure travaillée par semaine: ");
				heursHob = reader.nextDouble();
				System.out.print("entrer le salaire en heure: ");
				TarifHobHeure = reader.nextDouble();
				
				if (TarifHobHeure < 25) {
					System.out.print("TLe tarif par heure ne doit pas être inférieur à 25 DH !\r\n");
					return;
			}
				
				
				if (heursHob > maxheursHob) {
					System.out.print(" Le nombre d’heure total ne doit pas dépasser 50 heures par semaine \r\n");
					return;
				}

				result = heursHob * TarifHobHeure;
				if (minheuresHob < heursHob && heursHob <= maxheursHob) {
					overTime = heursHob - minheuresHob;
					result = (minheuresHob * TarifHobHeure) + overTime * (TarifHobHeure + TarifHobHeure / 2);
				}
				
				
				System.out.println("hebdomadaire saliare est : " + result + " DH");

			} 
			
			
			else if (ModePayment == 'm') {

				System.out.print("le nombre d’heure travaillée par semaine : ");
				heuresMens = reader.nextDouble();
				System.out.print("entrer le salaire en heure: : ");
				TarifheuresMens = reader.nextDouble();
				if (TarifheuresMens < 20) {
					System.out.print("TLe tarif par heure ne doit pas �tre inf�rieur � 20 DH !\r\n");
					return;
				}
				if (heuresMens > maxheuresMens) {
					System.out.print(" Le nombre d'heure total ne doit pas depasser 50 heures par semaine \r\n");
					return;
				}
				result = heuresMens * TarifheuresMens;
				if (minheuresMens < heuresMens && heuresMens <= maxheuresMens) {
					overTime = heuresMens - minheuresMens;
					result = (minheuresMens * TarifheuresMens) + overTime * (TarifheuresMens + TarifheuresMens / 2);
				}
				System.out.println("mensuel salaire est :  " + result + " DH");

			} else {
				System.out.println("Eroooooooooooooooooooooooooor");

			}

		} while (true);
				
			

}
}