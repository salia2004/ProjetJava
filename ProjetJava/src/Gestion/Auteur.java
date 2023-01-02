package Gestion;


import java.util.ArrayList;
import java.util.List;
public class Auteur extends Utilisateur 
{
	private int code;
	private int nbOeuvre=0;
	private List<Livre> stock= new ArrayList<>();

	public Auteur (String nom,int code ) 
	{
		super(nom);
		this.code=code;
	}
	
	private void AjouterOeuvre(Livre titre,theme type) 
	{
		stock.add(titre);
	}
	
	private void retirerOeuvre(String titre,int cote)
	{
		if (stock.isEmpty()==true)
		{
			System.out.println("il n'y a plus d'oeuvre disponible");
		}
		else
		{
			stock.remove(cote);
		}
	}

	