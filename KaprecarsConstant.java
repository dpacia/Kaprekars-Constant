import java.util.Arrays;
import java.util.Collections;

 
public class KaprecarsConstant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 1234;
		int num2;
		int cycles = 0;
		
		while (num1 != 6174) {
			System.out.println("num1 is: " + num1);
			String num1Str = String.format("%04d", num1);
			
	        char tempArray[] = num1Str.toCharArray();
	        
	        // sort tempArray
	        Arrays.sort(tempArray);
	        String tmp=new String(tempArray);
	        num2 = Integer.parseInt(tmp);
	        char [] temp2Array = new char[4];
	        temp2Array[0] = tempArray[3];
	        temp2Array[1] = tempArray[2];
	        temp2Array[2] = tempArray[1];
	        temp2Array[3] = tempArray[0];
	        String tmp2 = new String(temp2Array);
	        num1 = Integer.parseInt(tmp2);	        
	        
	        num1 = num1 - num2;
	        cycles++; }
		

        
        
        System.out.println("the number of cycles is: "+ cycles);

	}

}
