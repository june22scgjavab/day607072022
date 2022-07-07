
public class Student {
private int roll;
private String name;
private int marks;

public void setData(int r,String n, int m)
{
	roll=r;
	name=n;
	marks=m;
}

/*
 * public void dispData() {
 * System.out.println("Roll"+roll+"Name"+name+"Marks"+marks);
 * 
 * }
 */

public String getData() {
	String data="Roll "+roll+" Name "+name+" Marks "+marks;
	return data;
}


}
