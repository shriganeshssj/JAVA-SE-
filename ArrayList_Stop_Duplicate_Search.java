package com.org.arraylistproj;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Stop_Duplicate_Search {
	public static void main(String[] args) {

		ArrayList<Employee> empal = new ArrayList<>();
		String option = null;

		Scanner snc = new Scanner(System.in);
		Employee e;

		do {
			e = new Employee();

			System.out.println("Enter employee no");
			e.setEno(snc.nextInt());
			snc.nextLine();
			System.out.println("Enter Employee Name");
			e.setEname(snc.nextLine());
			System.out.println("Enter Employee Designation");
			e.setDsg(snc.nextLine());
			System.out.println("Enter Employee Sal");
			e.setSal(snc.nextDouble());
			snc.nextLine();
			System.out.println("Enter Experiance of Employee");
			e.setExp(snc.nextInt());
			
			
			// Stop Duplicate (Eno Desig)
			if (!empal.contains(e)) {
				empal.add(e);
			} else {
				System.out.println("Duplicate Element");
			}

			System.out.println("Do YOu wan Continue.. say YES or NO");
			option = snc.next();
		} while (option.equalsIgnoreCase("yes"));
		
		
		//Search Data In employee
		System.out.println("Search Element ");
		Employee es = new Employee();
		System.out.println("Enter Employee NO");
		es.setEno(snc.nextInt()); snc.nextLine();
		
		System.out.println("Enter Employee Designation");
		es.setDsg(snc.nextLine());
		
		int index=empal.indexOf(es);
		
		if(index!=-1)
		{
			Employee ele = empal.get(index);
			
			System.out.println(ele);
			
		}
		else 
		{
			System.out.println("not found");
		}

		

	}

}
