package Week3.day1;

public class DeskTop extends Computer{
	public void deskSize()
	{
		System.out.println("I'm in Dervied class child");
		System.out.println("desk top Size is : 15'inch");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Single Inheritance");
		DeskTop ds=new DeskTop();
		ds.computerModel();
		ds.deskSize();

	}

}
