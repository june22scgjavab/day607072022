
public class Book {
private int id;
private String title;
private String authorName;

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
