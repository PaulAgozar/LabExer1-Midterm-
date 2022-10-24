import java.util.Scanner;

public class RunBloodData1 {
    public static void main(String[] args) {
    	String input1;
    	String input2;
    	
		Scanner SC = new Scanner(System.in);
	
		System.out.print("Enter blood type: ");
		input1 = SC.nextLine();
		
		System.out.print("Enter the Rhesus factor (+ or -): ");
		input2 = SC.nextLine();
		
		if(input1.isEmpty() && input2.isEmpty()){
			BloodData1 bd = new BloodData1();
			bd.display();
		}
		
		else if (input1.equals("A")){
			BloodData1 bd = new BloodData1(input1, input2);
			bd.display();
		}
		
		else if (input1.equals("AB")){
			BloodData1 bd = new BloodData1(input1, input2);
			bd.display();
		}
		
		else if (input1.equals("O")){
			BloodData1 bd = new BloodData1(input1, input2);
			bd.display();
		}
		
		else if (input1.equals("")){
			BloodData1 bd = new BloodData1(input1, input2);
			bd.display();
		}
		
		else if (input2.equals("+")){
			BloodData1 bd = new BloodData1(input1, input2);
			bd.display();
		}
		
		else if (input2.equals("-")){
			BloodData1 bd = new BloodData1(input1, input2);
			bd.display();
		}
		
		else{
			System.out.print("Invalid Input");
		}
		
		SC.close();
		
    }
}