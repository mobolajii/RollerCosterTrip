import java.util.Scanner;

public class Trip {

    static void details() {
        System.out.println("What is your child's name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        if(name.contains("1") || name.contains("2") || name.contains("3") || name.contains("4")
        || name.contains("5") || name.contains("6") || name.contains("7") || name.contains("8") || name.contains("9") ||  name.contains("0")){
           System.exit(1);
        }

        System.out.println(name);
        System.out.println("How old is your child?");
        int age = sc.nextInt();
        if(age<12){
            System.out.println("Your child is unfortunately too young for this trip.");
            System.exit(1);
        }else if(age>18){
            System.out.println("Your child is unfortunately too old for this trip.");
            System.exit(1);
        }

        System.out.println("How tall is your child?");
        double height = sc.nextDouble();

        if(height<120){
            System.out.println("Your child is unfortunately too short for this ride.");
            System.exit(1);
        }
    }

    static void health(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Has your child been vaccinated? Please reply with a yes or no.");
        boolean vaccinated = sc.hasNext("yes");

        if(!vaccinated){
            System.out.println("Your child has to be vaccinated in order to be eligible for the trip.");
            System.exit(1);
        }else {
            System.out.println("Congratulations, Your child is eligible for the trip!");
        }
    }
    static void cost(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you have a discount? If yes give in the number i.e. 10, 20, 30 or 40");
        int discount = sc.nextInt();
        System.out.println("The price of the trip will be: ");
        double price = 50.0;


        switch (discount) {
            case 10 -> System.out.println(price - (price * 0.1));
            case 20 -> System.out.println(price - (price * 0.2));
            case 30 -> System.out.println(price - (price * 0.3));
            case 40 -> System.out.println(price - (price * 0.4));
            default ->
                    System.out.println(price);
        }
    }

    public static void main(String[] args) {
        System.out.println("Is my kid eligible to go on a roller coaster class trip during covid?");
        details();
        health();
        cost();

    }
}
