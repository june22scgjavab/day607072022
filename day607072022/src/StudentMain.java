
public class StudentMain {

	public static void main(String[] args) {
		Student student1=new Student();
		Student student2=new Student();
		student1.setData(1, "Ravi", 100);
		student2.setData(2, "Ashok", 90);
		String studentData1=student1.getData();
		String studentData2=student2.getData();
		System.out.println(studentData1);
		System.out.println(studentData2);
	}

}
