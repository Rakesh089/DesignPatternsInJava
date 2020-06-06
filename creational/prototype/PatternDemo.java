package creational.prototype;

import java.util.ArrayList;

public class PatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employees employees = new Employees();
		employees.loadData();
		
		Employees newEmp = (Employees) employees.clone();
		 ArrayList<String> list1 = (ArrayList<String>) newEmp.getEmpList();
		list1.add("Dan");
		
		Employees newEmp1 = (Employees) employees.clone();
		 ArrayList<String> list2 = (ArrayList<String>) newEmp1.getEmpList();
		list2.add("Fan");
		
		System.out.println("List1 : " + list1);
		System.out.println("List2 : " + list2);
	}

}
