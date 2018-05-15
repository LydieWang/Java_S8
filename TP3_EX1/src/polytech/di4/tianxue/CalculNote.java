package polytech.di4.tianxue;

import java.util.ArrayList;

public class CalculNote {
	
	public void ajouter(ArrayList<Double> notes, ArrayList<Integer> Ks, Double newNote, Integer k) {
		notes.add(newNote);
		Ks.add(k);
	}
	
	public void afficher(ArrayList<Double> notes, ArrayList<Integer> Ks) {
		System.out.println("Notes\tCoefficients: ");
		for(int i = 0; i < notes.size(); i ++) {
			System.out.println(notes.get(i) + "\t" + Ks.get(i));
		}
	}
	
	public Double getMoyenne(ArrayList<Double> notes, ArrayList<Integer> Ks) {
		Double sumNotes = 0.0;
		Integer sumKs = 0;
		for(int i = 0; i < notes.size(); i ++) {
			sumNotes += notes.get(i) * Ks.get(i);
			sumKs += Ks.get(i);
		}
		return sumNotes/sumKs;
	}
	
	public boolean modifier(ArrayList<Double> notes, int index, Double newNote) {
		if(index >=0 && index < notes.size()) {
			System.out.println("Modified note " + notes.get(index) +" to " + newNote);
			notes.set(index, newNote);
			return true;
		}else {
			return false;
		}
	}
}
