package Ex1;

public class Exception {

	public static void main(String[] args) {
		int x,y;   
		
		
		try
		{
			int ar []= {0,1,2,3}; //declaring the array
			System.out.println("Hey plz show this text");// till now exception wasn't occured thats why it will show
			 ar[3]= ar[4]; //AOBE is occuring @ this line 
			System.out.println("will u plzz show this ??"); // after occuring the execution it will not execute anything 
			System.out.println(ar[4]);
			System.out.println("Plz show this text"); // thats why also this one willn't work
		}
		
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Its an exception ");  // after happening the execption try block will throw to the catch block
		}
	
		
		
	}
	}


