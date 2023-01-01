package Gestion;

import Init.Presentation;

import java.util.ArrayList;
import java.util.List;
public class Utilisateur {
	protected String nom;
	protected List<Livre> Bibliotheque= new ArrayList<>();

	public Utilisateur(String nom) 
	{
		this.nom=nom;
	}
	
	protected void parler(String texte)
	{
		System.out.println(" : " + texte);
	}
	protected void LireLivre(int cote,String titre)
	{
		
	}
	protected void EcrireUnCommentaire(String commentaire)
	{
		
	}
	