package com.dxctraining;

import java.util.*;
import java.util.Map.Entry;

public class StudentMain {
	
	
	Map<Integer,Student> map= new HashMap<Integer,Student>();

public static void main(String args[]) {
	tyr{
	Map<Integer,Student> map= new HashMap<Integer,Student>();
	Student student1= new Student("Anu",12);
	Student student2= new Student("Manu",13);
	Student student3= new Student("Tanu",14);
	Student student4= new Student("Banu",15);
	
	map.put(1,student1);
	map.put(2,student2);
	map.put(3,student3);
	map.put(4,student4);
	
	Set<Integer> keys = map.keySet();
	for (Integer k : keys) {
		Student fetched = map.get(k);
		int age1 =fetched.getAge();
		if (age1%2==0) {
			Set set1 = map.entrySet();
			System.out.println("+ve Age- " + set1.getAge()+"  Name" +  set1.getName());
		}
		
		else{
			Set set2 = map.entrySet();
			System.out.println("-ve Age- " + set2.getAge()+"  Name" +  set2.getName());
			
		}
	}
	
	catch(ClassCastException e) {
		System.out.println("CCE");
	}
		
		
		
	}

}
}