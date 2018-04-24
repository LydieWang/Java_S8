package polytech.di4.tianxue;

import java.util.ArrayList;
import java.util.List;

public class Paie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ouvrier ouvrier1 = new Ouvrier("Bobet", 22, "12345678", 39, 10);
		Ouvrier ouvrier2 = new Ouvrier("Wang", 24, "98765432", 35, 11);
		Ouvrier ouvrier3 = new Ouvrier("Yan", 24, "23432342", 20, 9);
		
		Cadre cadre1 = new Cadre("Peng", 22, "12345678", 34, 15);
		Cadre cadre2 = new Cadre("Li", 40, "12345678", 38, 15);
		Cadre cadre3 = new Cadre("Zhu", 50, "434534512", 39, 15);
		
		Commercial commercial1 = new Commercial("Zhao", 34, "12345678", 1000);
		Commercial commercial2 = new Commercial("Hou", 55, "12345678", 2000);
		
		Collaborateur collaborateur1 = new Collaborateur("Min", 40, "12345678", 10, 12, 1000);
		Collaborateur collaborateur2 = new Collaborateur("Dupont", 30, "12345678", 20, 12, 1500);
		
		List<Personnel> list = new ArrayList<Personnel>();
		list.add(ouvrier1);
		list.add(ouvrier2);
		list.add(ouvrier3);
		list.add(cadre1);
		list.add(cadre2);
		list.add(cadre3);
		list.add(commercial1);
		list.add(commercial2);
		list.add(collaborateur1);
		list.add(collaborateur2);
		
		for(Personnel p : list) {
			System.out.println(p.getNom() + " gagne " + p.getSalaire() );
		}
		
	}

}
