package week2.day1;

public class calculator {
	public int additionTwoNumber(int a,int b) {
		// TODO Auto-generated method stub
     int c=a+b;
       return c;
    		   
	}
	public void subtraction(int e,int f) {
		// TODO Auto-generated method stub
       int c=e-f;
       System.out.println(c);
	}
	public void multiplyTwoNumber(double i,double j) {
		// TODO Auto-generated method stub
		double c=i*j;
		System.out.println(c);

	}
	private void divideTwoNumber(float x,float y) {
		// TODO Auto-generated method stub
		float c=x/y;
		System.out.println(c);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculator calci=new calculator();
		int additionTwoNumber = calci.additionTwoNumber(12, 23);
		System.out.println(additionTwoNumber);
		calci.subtraction(67, 67);
		calci.multiplyTwoNumber(25, 45);
		calci.divideTwoNumber(2, 4);

	}

}
