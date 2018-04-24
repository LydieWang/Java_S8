import java.util.Scanner;

public class Menu {
	public int saisirChoix(int n) throws IllegaleEntreeException {
		Scanner sc = new Scanner(System.in);
		int i = -1;
		try {
			if(n <= 1) {
				throw new ParametreException("Param¨¨treException : " + n + " est inf¨¦rieur ou ¨¦gal ¨¤ 1");
			}
			System.out.println("Entrez un choix : ");
			String s = sc.next();
			i = Integer.parseInt(s);
			
			if(i < 1 || i > n) {
				throw new NombreException("NombreException : le num¨¦ro de choix doit ¨ºtre entre 1 et " + n);
			}
		}catch(ParametreException e) {
			System.err.println(e.getMessage());
		}catch(NombreException e) {
			System.err.println(e.getMessage());
		}catch(NumberFormatException e) {
			throw new IllegaleEntreeException("IllegaleEntreeException : le nombre doit ¨ºtre un chiffre");
		}finally {
			sc.close();
		}
		return i;
	}
	
	public void afficher(String[] tabStr) {
		for(int i = 0; i < tabStr.length; i ++) {
			System.out.println(tabStr[i]);
		}	
	}
	
	public int choisir(String[] tabStr) {
		int choix = 0;
		try{
			afficher(tabStr);
			choix = saisirChoix(tabStr.length);
		}catch(IllegaleEntreeException e){
			System.err.println(e.getMessage());
		}
		return choix;
	}
}
