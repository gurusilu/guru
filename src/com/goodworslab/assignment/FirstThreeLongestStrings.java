package com.goodworslab.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class FirstThreeLongestStrings {
	public static void main(String[] args) {
		String str="How the Avocado Became the Fruit of the global Trade a";
			String[] str1=str.split(" ");
			if(str1.length<3) {
				Arrays.sort(str1);
				System.out.println(Arrays.toString(str1)+"-----");			
			}
	 TreeSet<String> treeSet=new TreeSet<>(new ComparatorTest());
	 for(int i=0;i<=str1.length-1;i++) {
		 treeSet.add(str1[i]);
	 }
	 String[] str2=new String[3];
	 List<String> listNumbers = new ArrayList<String>( treeSet );
	 str2[0]=listNumbers.get(0);
	 str2[1]=listNumbers.get(1);
	 str2[2]=listNumbers.get(2);
	 System.out.println(str2[0]);
	 System.out.println(str2[1]);
	 System.out.println(str2[2]);
	 
	}
}
