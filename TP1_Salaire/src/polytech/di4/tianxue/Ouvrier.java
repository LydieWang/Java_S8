package polytech.di4.tianxue;

public class Ouvrier extends Personnel{

	private int heuresTravail;
	private double salaireHeure;
	protected int pourcentage;

	protected Ouvrier(String nom, int age, String numeroTelephone) {
		super(nom, age, numeroTelephone);
		// TODO Auto-generated constructor stub
		pourcentage = 30;
	}
	
	public Ouvrier(String nom, int age, String numeroTelephone, int heuresTravail, double salaireHeure) {
		super(nom, age, numeroTelephone);
		this.heuresTravail = heuresTravail;
		this.salaireHeure = salaireHeure;
	}

	public void setInfosSalaire(int heuresTravail, double salaireHeure) {
		this.heuresTravail = heuresTravail;
		this.salaireHeure = salaireHeure;
	}
	
	@Override
	public double getSalaire() {	
		if(heuresTravail <= 35) {
			return heuresTravail * salaireHeure;
		}else {
			return 35 * salaireHeure + (heuresTravail - 35) * salaireHeure * (100 + pourcentage) / 100;
		}		
	}

}
