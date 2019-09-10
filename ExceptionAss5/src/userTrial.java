import java.util.*;
public class userTrial {
	private int val1;
	private int val2;
	
	public userTrial(int val1, int val2) {
		super();
		this.val1 = val1;
		this.val2 = val2;
	}
	public static void main(String[] args) {
		try{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the value 1");
			int val1=sc.nextInt();
			System.out.println("Enter the value 2");
			int val2=sc.nextInt();
			userTrial u=new userTrial(val1,val2);
			u.show();
		}
		catch(Exception e){
			System.out.println("Illgal Value exception");
		}
	}
	public void show()throws Exception
	{
		if(val1<0 || val2<0){
			throw new Exception();
		}
		else
		{
			System.out.println("Correct values are:"+val1+"\t"+val2);
		}
		
	}

}
