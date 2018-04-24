package polytech.di4.tianxue;


public class Calcul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Integer n = Integer.parseInt(args[0]);
			
			verifierTropGrand(n);
			verifierNegatif(n);
			
			Integer resultat = calculerFactorielle(n);
			System.out.println("Resultat = " + resultat);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("Indiquez le nombre d'entiers sur la ligne de commande !");		
		}catch(NumberFormatException e) {
			System.err.println("L'argument doit ¨ºtre entier !");
		}catch(TropGrandException e) {
			System.err.println(e.getMessage());
		}catch(NegativeException e) {
			System.err.println(e.getMessage());
		}
		
	}
	
	public static Integer calculerFactorielle(Integer n) {
		if(n == 1)
			return 1;
		else
			return n * calculerFactorielle(n-1);
	}
	
	public static void verifierTropGrand(Integer n) throws TropGrandException{
		if(n >= 12)
			throw new TropGrandException("ExceptionGrand : " + n + " est trop grand pour ce programme !");
	}
	
	public static void verifierNegatif(Integer n) throws NegativeException{
		if(n < 0)
			throw new NegativeException(n + " est n¨¦gatif : la factorielle n'est pas d¨¦finie !");
	}

}
