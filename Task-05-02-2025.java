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
