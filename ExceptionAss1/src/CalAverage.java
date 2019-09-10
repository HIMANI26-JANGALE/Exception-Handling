import java.util.*;
public class CalAverage {
	public double avgFirstN(int N)throws IllegalArgumentException{

		double sum=0;
		if(N<0){
			throw new IllegalArgumentException("Not a natural no");
		}
			for(int i=1;i<=N;i++){
				sum=sum+i;	
			}
			double avg=sum/N;
			return (avg);
	}
	public static void main(String[] args) {
		CalAverage ca=new CalAverage();
		System.out.println("enter the no");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		double avg=ca.avgFirstN(no);
		System.out.println("Average is:"+avg);
	}

}
