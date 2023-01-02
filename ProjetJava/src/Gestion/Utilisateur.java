package Gestion;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Utilisateur {
	protected String nom;
	protected List<Livre> Bibliotheque= new ArrayList<>();
	protected BIbliotheque bu;

	public Utilisateur(String nom,BIbliotheque b) 
	{
		this.nom=nom;
		this.bu=b;
		this.presentation();
	}
	
	
	protected void parler(String texte)
	{
		System.out.println(texte);
	}
	protected void LireLivre(int cote,String titre)
	{
		
	}
	protected void EcrireUnCommentaire(String commentaire)
	{
		
	}
	protected int affichermenu()
	{
		System.out.println("------------MENU------------");
		System.out.println("1-Lire un livre ");
		System.out.println("2-ecrire un commentaire ");
		System.out.println("3-Ajouter un livre  ");		
		int rep;
		Scanner c=new Scanner(System.in);
		rep=c.nextInt();
		return rep;
	}
	protected boolean estdansbu(String titre)
	{
		
		return false ;
	}
	public void presentation()
	{
		int rep;
		Scanner c=new Scanner(System.in);
		System.out.println("Bienvenue dans la bibliotheque "+ this.bu);
		parler("Voulez vous afficher le menu ?");
		parler("cochez 1 pour oui et 2 pour non");
		rep=c.nextInt();
		if (rep==1)
		{
			rep=affichermenu();
			switch(rep)
			{
			case 1:
				String titre;
				parler("Veuillez renter le titre du livre");
				titre=c.nextLine();
				if (estdansbu(titre))
				{
					
				}
				else
				{
					parler("Ce livre n'est pas dans la bibliotheque");
				}
			case 2:
				parler("pas encore fait");
			case 3:
				parler("pas encore fait");
				
			default:
				System.out.println("Mauvaise rentrer,veuillez recommencer !!");
			}
		}
		else
		{
			parler("Merci d'avoir visiter notre bibliotheque");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}