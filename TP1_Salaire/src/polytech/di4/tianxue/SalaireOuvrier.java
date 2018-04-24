package polytech.di4.tianxue;

public class SalaireOuvrier implements Salaire{
	@Override
	public double getSalaire(int heuresTravail, double salaireHeure) {	
		if(heuresTravail <= 35) {
			return heuresTravail * salaireHeure;
		}else {
			return 35 * salaireHeure + (heuresTravail - 35) * salaireHeure * (100 + pourcentage) / 100;
		}		
	}
}
