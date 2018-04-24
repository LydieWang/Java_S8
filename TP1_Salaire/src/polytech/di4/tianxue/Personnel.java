package polytech.di4.tianxue;

public abstract class Personnel implements Salaire{

	String nom;
	int age;
	String numeroTelephone;

	protected Personnel(String nom, int age, String numeroTelephone) {
		this.nom = nom;
		this.age = age;
		this.numeroTelephone = numeroTelephone;
	}

	protected String getNom() {
		return nom;
	}

	protected int getAge() {
		return age;
	}

	protected void setAge(int age) {
		this.age = age;
	}

	protected String getNumeroTelephone() {
		return numeroTelephone;
	}

	protected void setNumeroTelephone(String numeroTelephone) {
		this.numeroTelephone = numeroTelephone;
	}
}
