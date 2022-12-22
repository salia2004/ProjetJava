package Init;

public class Presentation extends Fonction 
{
	private int session;

	public Presentation() 
	{
	  this.session+=1;
	  super.Parler("Bienvenue la bibliotheque numerique");
	}
	
	public void Connection()
	{
		super.Parler("est");
	}

}
