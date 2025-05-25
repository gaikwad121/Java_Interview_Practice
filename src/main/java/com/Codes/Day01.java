package com.Codes;

public class Day01 {

	public static void main(String[] args) {
     revString();
     revString2();
     revString3();
	}
// reverse a string 
	static void revString() {
	String name="Gaikwad Jyoti";
	String rev="";
	for(int i=name.length()-1;i>=0;i--) {
		rev=rev+name.charAt(i);
	}
	System.out.println(rev);
	}

static void revString2() {
	String name="Sneha";
	StringBuilder str=new StringBuilder(name);

System.out.println(str.reverse());
}
static void revString3() {
	String name="Aishwarya";
	StringBuffer str=new StringBuffer(name);
	System.out.println(str.reverse());
}

}