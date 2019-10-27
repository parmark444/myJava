package totallyrealfortunes;
import java.util.Scanner;
public class Totallyrealfortunes {
    static String first_name;
    static String last_name;
    static int b_month;
    static int b_day;
    static int b_year;
    static int bank_num;
    static double bank_$;
    static String full_name;
    
    public static void main(String[] args) { 
        collect_inputs();
        favorite_letter();
        palindrome();
        color();
        animal();
        car();
    }
    public static void collect_inputs(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        first_name = scan.nextLine();
        System.out.print("Enter your last name: ");
        last_name = scan.nextLine();
        System.out.print("Enter your birthday month, between 1 and 12: ");
        b_month = scan.nextInt();
        System.out.print("Enter your birthday day, between 1 and 31: ");
        b_day = scan.nextInt();
        System.out.print("Enter your birthday year, between 0 and 2017: ");
        b_year = scan.nextInt();
        System.out.print("Enter your bank account number: ");
        bank_num = scan.nextInt();
        System.out.print("Enter the number of dollars in your bank account: ");
        bank_$ = scan.nextDouble();
        System.out.println("");
        System.out.println("Generating your fortune... ");
        System.out.println("");
    }
    
    public static void favorite_letter(){
        int a = 0;
        System.out.println("Your favorite letter of the alphabet is '" + last_name.charAt(a)+ "'");
    }
    
    public static void palindrome(){
        String fName = first_name.toLowerCase() + last_name.toLowerCase();
        String fNameReversed = reverse(fName);
        System.out.println("Your favorite palindrome is '" + fName + fNameReversed +"'");
    }
    public static String reverse(String your_choice){
        char[] test = your_choice.toCharArray();
        String reversedName = "";
        for (int i = test.length-1; i>=0; i--){
            reversedName = reversedName + test[i];  
        } 
        return reversedName;
    }
    
    public static void color(){
        if((b_day % b_month) == 0){
            System.out.println("Your favorite color is blue");
        }
        else if((b_day % b_month) != 0){
            System.out.println("Your favorite color is red");
        }
    }
    
    public static void animal(){
        int first_count = 0;
        int last_count = 0;
        for(int i = 0; i < first_name.length(); i++) {    
            if(first_name.charAt(i) != ' ')    
                first_count++;    
        }
        for(int i = 0; i < last_name.length(); i++) {    
            if(last_name.charAt(i) != ' ')    
                last_count++;   
        }
        if(first_count <= last_count){
            System.out.println("Your favorite animal is a dog");
        }
        else if(first_count >= last_count){
            System.out.print("Your favorite animal is a cat");
        }
    }
    
    public static void car(){
        if(bank_num > b_year){
            System.out.print("Your favorite car is a Tesla.");
        }
        else if(bank_num <= b_year){
            System.out.println("Your favorite car is a Leaf.");
        }
    }
}
