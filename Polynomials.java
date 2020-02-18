/*
 * Name: Khai Ngo
 *  
 * Date: 2/15/2020
 * 
 * Course Number: CSC-112
 * 
 * Course Name:Intermediate Topics in Java Programming Syllabus

 * Problem Number:Homework 2

 * Email: kqngo0001@student.stcc.edu

 * Description: Polynomial
 */
package Polynomial;
import java.util.HashMap;

public class polynomial {
	//4x5 + 2x4 + 3x2 - 4x + 5

    // test client
	public static void main(String[] args) {
		
	HashMap<Integer, Integer> poly=new HashMap<Integer, Integer>();
	
	poly.put(5,4);
	poly.put(4,2);
	poly.put(2,3);
	poly.put(1,-4);
	poly.put(0,5);
	
	Integer Array[]=new Integer[poly.size()];
	poly.keySet().toArray(Array);
	
	for(int i=0;i<poly.size();i++) {
		System.out.println(poly.get(Array[i])+"x^"+Array[i]+" ");
		
		if(i!=poly.size()-1) {
			System.out.print("+ ");
		}
	}
}

}
