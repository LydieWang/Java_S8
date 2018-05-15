package polytech.di4.tianxue;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list1 = SetOperation.create(1);
		SetOperation.add(list1, 2);
		SetOperation.add(list1, 3);
		SetOperation.add(list1, 4);
		SetOperation.add(list1, 4);
		
		ArrayList list2 = SetOperation.create(8);
		SetOperation.add(list2, 7);
		SetOperation.add(list2, 5);
		SetOperation.add(list2, 1);
		SetOperation.add(list2, 3);
		
		ArrayList listUnion = SetOperation.getUnion(list1, list2);
		SetOperation.display(listUnion);
		
		ArrayList listIntersection = SetOperation.getIntersection(list1, list2);
		SetOperation.display(listIntersection);
	}

}
