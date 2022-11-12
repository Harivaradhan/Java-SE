{
	//check the number is binary or not
	String str="ad   fef   54 gr    bew";
	System.out.println(str);
	String str2= str.replaceAll("[\\s]*"," ").trim();
	//if we are using a trim method we can remove the 
	//left and right spaces remaining in the expression
	System.out.print(str2);
	}
}
