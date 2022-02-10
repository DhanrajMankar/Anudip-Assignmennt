package Dhanarjanudip06;

import java.util.ArrayList;
import java.util.Collections;

public class AssinmentSrtingRiverseOrder {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("Dhanraj");
		list.add("Tushar");
		list.add("Ram");
		list.add("Yash");
		 Collections.reverse(list);
       System.out.println(list);
	}

}
//O/p
//[Yash, Ram, Tushar, Dhanraj]

