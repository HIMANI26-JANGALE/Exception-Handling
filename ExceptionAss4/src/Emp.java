import java.util.*;
public class Emp {
	private int empId;
	private String empName;
	private String designation;
	private double basic;
	private double hra;
	public Emp(int empId, String empName, String designation, double basic) {
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		this.basic = basic;
	}
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public String getDesignation() {
		return designation;
	}
	public double getBasic() {
		if(basic<500){
			try{
					throw new IllegalValueException();
				}
				catch( IllegalValueException e){
					System.out.println(e);
				}
			}
			return basic;
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the empid,name,designation and basic salary");
		int empId=sc.nextInt();
		String empName=sc.next();
		String designation=sc.next();
		double basic=sc.nextDouble();
		
		Emp e=new Emp(empId,empName,designation,basic);
		e.getBasic();
		e.printDET();
		e.calculateHRA();
	}

	public void printDET(){
		System.out.println("\nempID\tempName\tdesignation\tbasic\n");
		System.out.println(+empId+"\t"+empName+"\t"+designation+"\t\t"+basic);
	
	}
	public void calculateHRA(){
		if(designation=="Manager"){
			hra=basic*0.1;
			System.out.println("hra is:"+hra);

		}
		else if(designation=="Officer"){
			hra=basic*0.12;
			System.out.println("hra is:"+hra);

		}
		else if(designation=="Clerk"){
			hra=basic*0.05;
			System.out.println("hra is:"+hra);

		}
	}
	}

