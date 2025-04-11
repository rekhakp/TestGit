package Java;

public class SwapWithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1=20;
		int n2=49;
		System.out.println("Before swap:"+n1+","+n2);
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		System.out.println("After swap:"+n1+","+n2);

	}

}
