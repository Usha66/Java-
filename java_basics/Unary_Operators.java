package java_basics;

public class Unary_Operators {
	public static void main(String[]args) {
		int x=10;
		int preIncrement=++x; 
		//increases the value first(pre increment operator)
		System.out.println("Original_variable:"+ x);
		System.out.println("PreIncrement_Variable:"+ preIncrement);
		int y=20;
		int postincrement= y++;
		System.out.println("Original_value:"+y);
		System.out.println("After_increment:"+y++);
		int l=6;
		//increase the value by 5
		l+=5;
		//l=l+5;
		System.out.println("L:"+l);
		int p=100;
		p-=60;
		//p=p-60
		System.out.println("P:"+p);

		
	}
}
