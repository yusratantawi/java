package capslocl;
import java.util.*;
public class homework {
	public static void main(String[] args) {
		
		String str;
		Scanner sc= new Scanner(System.in);

		System.out.print("\nPlease Enter Uppercase String =  ");
		str = sc.nextLine();
		
		char[] upch = str.toCharArray();
		
		for(int i = 1; i < upch.length; i++)
		{
			if(upch[i] >= 'A' && upch[i] <= 'Z') {
				upch[i] = (char) ((int)upch[i] + 32);
			}
		}
		System.out.print("\nThe Lowercase String  =  ");
		for(int J = 0; J < upch.length; J++) {
			System.out.print(upch[J]);
			
				
	}
	}

	
	
	}

