package polytech.di4.tianxue;

public class Collaborateur extends Personnel{

	int heuresTravail;
	double salaireHeure;
	double chiffreAffaire;

	private Collaborateur(String nom, int age, String numeroTelephone) {
		super(nom, age, numeroTelephone);
		// TODO Auto-generated constructor stub
	}
	
	public Collaborateur(String nom, int age, String numeroTelephone, int heuresTravail, double salaireHeure,
			double chiffreAffaire) {
		super(nom, age, numeroTelephone);
		this.heuresTravail = heuresTravail;
		this.salaireHeure = salaireHeure;
		this.chiffreAffaire = chiffreAffaire;
	}


	public void setInfosSalaire(int heuresTravail, double salaireHeure, double chiffreAffaire) {
		this.heuresTravail = heuresTravail;
		this.salaireHeure = salaireHeure;
		this.chiffreAffaire = chiffreAffaire;
	}
	
	@Override
	public double getSalaire() {
		
		if(heuresTravail <= 35) {
			return heuresTravail * salaireHeure + 0.09 * chiffreAffaire;
		}else {
			return 35 * salaireHeure + (heuresTravail - 35) * salaireHeure * 1.5 +  0.09 * chiffreAffaire;
		}		
	}
}
