package Init;
import Gestion.Utilisateur;
import Gestion.Auteur;
import Gestion.BIbliotheque;
import Gestion.Lecteur;
import Gestion.Livre;
import Gestion.Theme;



public class Main {

	public static void main(String[] args) 
	{
		BIbliotheque anger=new BIbliotheque("bamako");
		Utilisateur mamy= new Utilisateur("mamy",anger);
		

	}

}
