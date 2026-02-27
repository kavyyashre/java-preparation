public class Variables {

    public static void main(String[] args) {

        int age = 22;
        int year = 2004;
        int quantity = 1;

        double price = 100;
        double cgpa = 6.0;
        double temperature = -10.5;

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;

        String name = "Kavya";
        String food = "Britain";
        String car = "Benz";
        String color = "White";

        if (isStudent) {
            System.out.println("You are a student");
        } else {
            System.out.println("You are not a student");
        }

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Birth Year: " + year);
        System.out.println("Quantity: " + quantity);
        System.out.println("Temperature: " + temperature + symbol);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Grade: " + grade);
        System.out.println("Favorite food is " + food);
        System.out.println("Car: " + color + " " + car);
        System.out.println("Is car for sale? " + forSale);
        System.out.println("Is online? " + isOnline);
        System.out.println("Price: " + currency + price);
    }
}