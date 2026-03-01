import java.util.Scanner;
public class BonusProgram{
    public static void main(String[] args) {
        
        double bonus;
        Scanner sc=new Scanner (System.in);

        System.out.print("enter your salary: ");
        double salary =sc.nextDouble();

        if(salary<=30000){
            bonus=0;
        }
        else if (salary >30000 && salary<50000){
            bonus=salary*0.05;
        }
        else{
            bonus=salary*0.10;
        }

        double finalsalary=bonus+salary;
        System.out.println("your bonus is: "+ bonus);
        System.out.println("your finalsalary is: "+finalsalary);
    }
}