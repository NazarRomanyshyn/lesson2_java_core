package lesson.ua;

public class Application {

	public static void main(String[] args) {
		
		byte a = 1;
		short b = 2;
		int c = 3;
		long d = 4;
		char i = 5;
		float f = 66.66f;
		double g = 77777.7777;
		boolean h = true;
		
		System.out.println("�������� 2");
		System.out.println ("̳������� �������� byte =" + Byte.MIN_VALUE);
		System.out.println ("����������� �������� byte =" + Byte.MAX_VALUE);
		System.out.println ("̳������� �������� short =" + Short.MIN_VALUE);
		System.out.println ("����������� �������� short =" + Short.MAX_VALUE);
		System.out.println ("̳������� �������� int =" + Integer.MIN_VALUE);
		System.out.println ("����������� �������� int =" + Integer.MAX_VALUE);		
		System.out.println ("̳������� �������� char = 0" + Character.MIN_VALUE);
		System.out.println ("����������� �������� char = 65535" + Character.MAX_VALUE);		
		System.out.println ("̳������� �������� long =" + Long.MIN_VALUE);
		System.out.println ("����������� �������� long =" + Long.MAX_VALUE);
		System.out.println ("̳������� �������� float =" + Float.MIN_VALUE);
		System.out.println ("����������� �������� float =" + Float.MAX_VALUE);
		System.out.println ("̳������� �������� double =" + Double.MIN_VALUE);
		System.out.println ("����������� �������� double =" + Double.MAX_VALUE);
		
		  System.out.println("");
		  System.out.println("�������� 3");
		int [] array1 = {87, 7, 231, 539, 734, 2, 11, 868, 76, 291};
	       int max = array1[0];
	       for (int p = 1; p < array1.length; p++){
	           if (max < array1[p]){
	               max = array1[p];    
	           }
	       }
	       System.out.println(max);
	       
	       int min = array1[0];
	       for (int p = 1; p < array1.length; p++){
	           if (min > array1[p]){
	               min = array1[p];    
	           }
	       }
	       System.out.println(min);
}
}
//First comit to github 
