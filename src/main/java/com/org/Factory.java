package com.org;

/**
*
*
* @author Jon Doe
*/

public class Factory {
	
	public int substract(int no1, int no2) { // NOPMD by Raja on 06/06/23, 3:19 pm
		return no1-no2;
	}

/**
*
*
* @author Jon Doe
*/
	public static void main(String[] args) {
		
		Factory factory = new Factory(); // NOPMD by Raja on 06/06/23, 3:19 pm
		System.out.println(factory.substract(10, 20));
	}

}