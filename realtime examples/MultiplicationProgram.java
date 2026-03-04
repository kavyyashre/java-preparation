import java.util.Scanner;
public class MultiplicationProgram{
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("enter the number: ");
        int number =sc.nextInt();

        System.out.println("multiplication of a table "+number);
        for(int i=1;i<=10;i++){
            System.out.println(number +" * "+i +" =" + number*i);
        }
    }
}