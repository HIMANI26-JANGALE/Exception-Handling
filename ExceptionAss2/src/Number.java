import java.util.*;
public class Number {
	private int a;
	private int b;
	private int result;
	
	public Number(int x, int y) {
		this.a = x;
		this.b = y;
	}
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public static void main(String[] args) {
		try{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int ch;
		Number n=new Number(n1,n2);
		do{
		System.out.println("------------MENUS-------------");
		System.out.println("1\t Addition");
		System.out.println("2\t Substraction");
		System.out.println("3\t Division");
		System.out.println("4\t Multiplication");
		System.out.println("Enter your choice");
		ch=sc.nextInt();
		switch(ch){

		case 1:
				n.add();
				break;
		case 2:
				n.sub();
				break;
		case 3:
				n.div();
				break;
		case 4:
				n.mul();
				break;
		}
		}while(ch!=5);
		}
		catch(ArithmeticException e){
			System.out.println("Divide by zero exception");
		}
		
	}
	public void add(){
		result=a+b;
		System.out.println("Addition is:"+result);
	}
	public void sub(){
		result=a-b;
		System.out.println("Substraction is:"+result);
	}
	public void div()throws ArithmeticException{
		if(b==0){
			throw new ArithmeticException();
		}
		result=a/b;
		System.out.println("Division is:"+result);
		
	}
	public void mul(){
		result=a*b;
		System.out.println("Multiplication is:"+result);
	}
}
