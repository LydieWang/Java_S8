//package Interfaces;
//
//public class Main {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Emission e1 = new Ficiton("La terre", 45, 1997, "Pierrick Bobet", false);
//		
//		Emission e2 = new Divertissement("Happy hour", 30);
//		
//		Emission e3 = new Reportage("Secret de Facebook", 60, "Journal");
//	}
//
//}
//
//public abstract class Emission {
//	private String nom;
//	private int duree;
//	
//	protected Emission(String nom, int duree) {
//		super();
//		this.nom = nom;
//		this.duree = duree;
//	}
//	
//}
//
//package Interfaces;
//
//public class Ficiton extends Emission{
//	private int anneeRealisation;
//	private String nomRealisateur;
//	private boolean diffusion;
//	
//	protected Ficiton(String nom, int duree, int anneeRealisation, String nomRealisateur, boolean diffusion) {
//		super(nom, duree);
//		this.anneeRealisation = anneeRealisation;
//		this.nomRealisateur = nomRealisateur;
//		this.diffusion = diffusion;
//	}
//	
//}
//
//package Interfaces;
//
//public class Reportage extends Emission{
//	private String theme;
//
//	protected Reportage(String nom, int duree, String theme) {
//		super(nom, duree);
//		this.theme = theme;
//	}
//
//	
//}
//
//
//package Interfaces;
//
//public class Divertissement extends Emission{
//
//	protected Divertissement(String nom, int duree) {
//		super(nom, duree);
//		// TODO Auto-generated constructor stub
//	}
//
//}
//
