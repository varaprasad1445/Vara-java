package com.varaprasad;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrLst {

	public static void main(String[] args) {
		ArrayList<String> Al = new ArrayList<>();
		Al.add("varapradad");
		Al.add("sdsd");
		Al.addAll(Al);
		//Al.remove(1);
		
		Iterator<String> iterator = Al.iterator();
		while(iterator.hasNext()){
			String a = iterator.next().toString();
			System.out.println(a);
			
		}
		for (String s1 : Al) {
		//	if(s1.valueOf(s1).contains("varaprasad")) != null){
			//	System.out.println(s1);
			//}
			System.out.println(s1);
			
		}
System.out.println(Al.indexOf("sdsd"));
System.out.println(Al.get(1));
//System.out.println(Al.add("ni"));
	}

}
