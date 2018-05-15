package polytech.di4.tianxue;

import java.util.ArrayList;

public class SetOperation {
	
	public static ArrayList<Integer> create(Integer e){	
		ArrayList<Integer> list = new ArrayList<>();
		list.add(e);
		return list;
	}
	
	public static void add(ArrayList<Integer> list, Integer e) {
		if(!list.contains(e))
			list.add(e);
	}
	
	public static void display(ArrayList<Integer> list) {
		System.out.println("Set : ");
		for(Integer e : list) {
			System.out.println(e);
		}
	}
	
	public static ArrayList<Integer> getUnion(ArrayList<Integer> set1, ArrayList<Integer> set2) {
		ArrayList<Integer> union = new ArrayList<>();

		for(int i = 0; i < set1.size(); i++) {
			union.add(set1.get(i));
		}
		
		for(int j = 0; j < set2.size(); j++) {
			if(!union.contains(set2.get(j))) {
				union.add(set2.get(j));
			}
		}
		
		return union;	
	}
	
	public static ArrayList<Integer> getIntersection(ArrayList<Integer> set1, ArrayList<Integer> set2) {
		ArrayList<Integer> intersection = new ArrayList<>();
		
		for(int i = 0; i < set2.size(); i++) {
			if(set1.contains(set2.get(i))) {
				intersection.add(set2.get(i));
			}
		}
		return intersection;
		
	}
}
