package corejava;

public class Student {
	private String name;
	private int rollnumber;
	private double percentage;
	
	public void setStudentDetails(String name,int rollnumber,double percentage)

	{
		this.name=name;
		this.rollnumber=rollnumber;
		this.percentage=percentage;
		
	}
	public String getStudentDetails()
	{
		return "Student name :" + name +"\n"+"rollnumber :" +rollnumber +"\n"+"percentage :" +percentage;
	}

}
