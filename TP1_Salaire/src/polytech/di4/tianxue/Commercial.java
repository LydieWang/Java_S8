package polytech.di4.tianxue;

public class Commercial extends Personnel{

	double chiffreAffaire;

	private Commercial(String nom, int age, String numeroTelephone) {
		super(nom, age, numeroTelephone);
		// TODO Auto-generated constructor stub
	}

	public Commercial(String nom, int age, String numeroTelephone, double chiffreAffaire) {
		super(nom, age, numeroTelephone);
		// TODO Auto-generated constructor stub
		this.chiffreAffaire = chiffreAffaire;
	}

	public void setInfosSalaire(double chiffreAffaire) {
		this.chiffreAffaire = chiffreAffaire;
	}
	
	@Override
	public double getSalaire() {
		return chiffreAffaire * 0.09;	
	}
}
