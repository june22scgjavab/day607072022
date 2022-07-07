
public class Book2 {
private int id;
private String title;
private String authorName;

public Book2()
{

	this.id=1;
	this.title="Java";
	this.authorName="Patrick";
}

public void setData(int id,String title, String authorName)
{
	this.id=id;
	this.title=title;
	this.authorName=authorName;
}

public void dispData() {
	System.out.println(id+" "+title+" "+authorName );
}

}
