package polytech.di4.tianxue;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		CalculNote cn = new CalculNote();
//		
//		ArrayList<Double> notes = new ArrayList<>();
//		
//		cn.ajouter(notes, 12.0);
//		cn.ajouter(notes, 14.0);
//		cn.ajouter(notes, 9.0);
//		
//		cn.afficher(notes);
//		System.out.println("Average :" + cn.getMoyenne(notes));
//		
//		cn.ajouter(notes, 13.0);
//		cn.afficher(notes);
//		System.out.println("Average :" + cn.getMoyenne(notes));
//		
//		cn.modifier(notes, 2, 5.0);
//		
		Scanner sc = new Scanner(System.in);
		String str;
		CalculNote calculNote = new CalculNote();
		ArrayList<Double> listNotes = new ArrayList<>();
		ArrayList<Integer> listK = new ArrayList<>();
		boolean quit = false;
		
		while(!quit) {
			System.out.println("Menu of operations :");
			System.out.println("\t1. Add a note into list");
			System.out.println("\t2. Modify a note");
			System.out.println("\t3. Display the list");
			System.out.println("\t4. Calculate the average note");
			System.out.println("\t0. Exit");
			System.out.println("Enter the number of operation :");
			
			str = sc.nextLine();
			
			switch(str) {
			case "1":
				System.out.println("Enter the note :");
				str = sc.nextLine();
				Double note = Double.parseDouble(str);
				System.out.println("Enter the coefficient :");
				str = sc.nextLine();
				Integer k = Integer.parseInt(str);
				calculNote.ajouter(listNotes, listK, note, k);
				break;
			case "2":
				System.out.println("Enter the index of note :");
				str = sc.nextLine();
				int index = Integer.parseInt(str);
				System.out.println("Enter the new note :");
				str = sc.nextLine();
				Double newNote = Double.parseDouble(str);
				
				calculNote.modifier(listNotes, index, newNote);
				break;
			case "3":
				calculNote.afficher(listNotes, listK);
				break;
			case "4":
				System.out.println("Average note :" + calculNote.getMoyenne(listNotes, listK));
				break;
			case "0":
				quit = true;
				System.out.println("Exit !");
				break;
			default:
				break;
			}
		}
		
		sc.close();
		
	}

}
