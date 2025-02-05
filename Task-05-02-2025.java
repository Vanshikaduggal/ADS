class Main{
	public static void main(String[] args)
	{
		try{
			String[] arr={"Vanshika","Neeraj",11};
			for(String str:arr){
				System.out.println(str);
			}
		}
		catch(Exception e)
		{
		System.out.println(e.getMessage());
		}
	}
}

//COMMAND PROMPT :
	C:\Users\vansh\OneDrive>cd Documents

C:\Users\vansh\OneDrive\Documents>javac new.java
new.java:1: error: class Main is public, should be declared in a file named Main.java
public class Main{
       ^
new.java:5: error: incompatible types: int cannot be converted to String
                        String[] arr={"Vanshika","Neeraj",11};
                                                          ^
2 errors

C:\Users\vansh\OneDrive\Documents>javac new.java
new.java:5: error: incompatible types: int cannot be converted to String
                        String[] arr={"Vanshika","Neeraj",11};
                                                          ^
1 error

C:\Users\vansh\OneDrive\Documents>
