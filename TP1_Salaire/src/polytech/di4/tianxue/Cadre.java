package polytech.di4.tianxue;

public class Cadre extends Ouvrier{
	
	private Cadre(String nom, int age, String numeroTelephone) {
		super(nom, age, numeroTelephone);
		// TODO Auto-generated constructor stub
		pourcentage = 50;
	}

	public Cadre(String nom, int age, String numeroTelephone, int heuresTravail, double salaireHeure) {
		super(nom, age, numeroTelephone, heuresTravail, salaireHeure);
		// TODO Auto-generated constructor stub
	}
}
