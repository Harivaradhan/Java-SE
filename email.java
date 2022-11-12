public static void main(String[] args)
{
int first;
String str="programmer@nooboil.com";
first =str.indexOf('@');
int y=str.length();
String sec= str.substring(first+1, y);
System.out.println(first);
System.out.println("the first part of email id is "+(str.substring(0, first)));
System.out.println(str.substring(first+1,y));
System.out.println(sec.startsWith("gmail"));
}
}
