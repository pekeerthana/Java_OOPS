import java.util.Scanner;
import java.io.*;
public class Exception_Handling  {
    /*
    1. Checked exceptions are which comes from outside the application like
    file not found, network/db issue, third part service failure. 
    this inherits from exception
    2. Unchecked exceptions are programmer/business error like 
    invalid input , operation is not allowed, business rules are voilated
    this inherits from runtimeexception
    */

    public static void main(String[] args) throws IOException 
    {
        try
        {
            int[] numbers = {1,2,3,4};
            //System.out.println(numbers[7]);
            System.out.println(numbers.length/0);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Index is out of bounds");
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Code executed without terminating.");
        }

        try{
        readFile();
        }
        catch(IOException e){
            System.out.println("File is not present");
        }

        
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if(input <0){
            throw new ArithmeticException("You have enetered negative number");
        }
        else{
            System.out.println("You have entered what is expected from you.");
        }


        Scanner sc2 = new Scanner(System.in);
        String name = sc2.nextLine();
        if(name.isEmpty()){
            throw new NullPointerException("You should enter your name.");
        }
        else{
            System.out.println("Your name is"+name);
        }

        
    }

    public static void readFile() throws IOException{
        FileReader fr = new FileReader("data.txt");
    }
    
}
