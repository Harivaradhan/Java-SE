public static void main(String[] args)
{
	//check the number is binary or not
	String str="a!B@c#1$2%3";
	System.out.println(str);
	String str2= str.replaceAll("[\\W]","");
	System.out.print(str2);
	}
	}
