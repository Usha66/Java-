package java_basics;

public class Arithmetic_Operator {
	public static void main(String[]args) {
	int x=10;
	int y=20;
	int sum = x+y;
	int diff=x-y;
	int prod=x*y;
	int rem=x%y;
	int quo=x/y;
	String quote=String.format("sum=%d diff=%d prod=%d rem=%d quo=%d",sum,diff,prod,rem,quo);
	System.out.println(quote);
}
}