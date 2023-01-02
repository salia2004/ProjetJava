package Gestion;


import java.util.ArrayList;
import java.util.List;

public class BIbliotheque 
{
	private List<Livre> Bibliotheque = new ArrayList<>();
	private String nom;
	
	public BIbliotheque(String nom)
	{
		this.nom=nom;
	}

	protected void ajouterLivre(Livre nom)
	{
		Bibliotheque.add(nom);
	}
	protected void retirerLivre(Livre nom)
	{
		
	}
	
	
}

