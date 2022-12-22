package Bibliothèque;

public class Utilisateur {
	protected String nom;

	public Utilisateur(String nom) 
	{
		this.nom=nom;
	}
	
	protected void parler(String texte)
	{
		System.out.println(" : " + texte);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
/*truc des  deuc:
 * -lire TT
 * -presentation interface avec connection (avec choix auteur et lecteur )TT 
 * -ecrire un commentaire TT
 * -ajouter une oeuvre   A
 * -retirer une oeuvre  A
 * -louer un livre      L
 * -rendre un livre     L
 * -s'identifier     TT
 * -reduction      L
 * -liste de livre lu    L
 * -prendre une abonnement    L
 * -cumuler des point de fidelite  L
 * -
 * -parler
 * 
 * -faire une classe d'enum pour les differents themes de livres (action,aventure,drame,historique,humour,romance,thriller)
 * -chaque livre a un numero bien particulier (la cote )
 * -utilise un random pour attribuer les cote dans ajouter un livre 
 * -voir si on peur faire une page html
 * */