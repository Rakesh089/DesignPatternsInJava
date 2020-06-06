package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable{

	List<String> empList; 
	
	Employees(){
		empList = new ArrayList<String>();
	}
	
	Employees(List<String> empList){
	this.empList = 	empList;
	
	}
	
	public void loadData() {
		//Load data from DB
		empList.add("Jack");
		empList.add("John");
		empList.add("Racks");
		empList.add("Joe");
	}
	
	
	
	public List<String> getEmpList() {
		return empList;
	}

	public void setEmpList(List<String> empList) {
		this.empList = empList;
	}

	@Override
	public Object clone() {
		List<String> tempList = new ArrayList<>();
		empList.forEach(emp -> {tempList.add(emp);});
		return new Employees(tempList);
	}
}
