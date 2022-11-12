public static void main(String[] args)
{
	String str="random      kids     do  random            stuff";
    System.out.println(str);
    // i need to count the number of words based on the spaces between them
    String str2= str.replaceAll("\\s+"," ").trim();
    System.out.println(str2);
    //now we need to split this string into array of words
    //for that we use split function
    String words[]	= str2.split("\\s");
     int wordcount= words.length;
     System.out.print("no of words in the string "+ wordcount);
    		}
}
