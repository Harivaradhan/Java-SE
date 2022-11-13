{
//finding the radix of a number
	//if 0 or 1 its radix is 2
	//if number contain 0-7 then its radix is 8
	Scanner scanner=new Scanner(System.in);
	System.out.print("enter a number ");
	String num=scanner.nextLine();
	if(num.matches("[01]+"))
	{
		System.out.println("it is a binary number");

	}
	else if(num.matches("[0-7]+"))
	{
		System.out.print("its radix is 8 and hence a octal number");
	}
	else if(num.matches("[0-9A-F]+"))
	{
		System.out.print("its radix is 16 and hence a hexa decimal number");
	}
	else if(num.matches("[0-9]+"))
	{
		System.out.print("its radix is 10 and hence a hexa decimal number");
	}
	else
	{
		System.out.print("its invalid number");
	}
    		}
