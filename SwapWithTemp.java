package Java;

public class SwapWithTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=20;
		int n2=49;
		int temp;
		System.out.println("Before swap:"+n1+","+n2);

		temp=n1;
		n1=n2;
		n2=temp;
		System.out.println("After Swap:"  +n1+" ,  "+n2);
	}

}
