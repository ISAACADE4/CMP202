import java.util.Scanner; //this is needed to accept userinput

public class userinput {
    public static void main(String[] args){
    Scanner userinput =new Scanner(System.in);//his also has to be there 
    System.out.println("What is your name?;  ");
    String name = userinput.nextLine();
    System.out.println("How old are you?");
    int age = userinput.nextInt();
    System.out.println("Hello " +name);
    System.out.println("You are  " +age+"years old");

    }    
}
