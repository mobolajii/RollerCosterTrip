import java.util.Scanner;

public class Trip {

    static String name(String firstName, String lastName){
        if(firstName.contains("1") || firstName.contains("2") || firstName.contains("3") || firstName.contains("4")
                || firstName.contains("5") || firstName.contains("6") || firstName.contains("7") || firstName.contains("8")
                || firstName.contains("9") ||  firstName.contains("0")){
            System.exit(1);
        }

        if(lastName.contains("1") || lastName.contains("2") || lastName.contains("3") || lastName.contains("4")
                || lastName.contains("5") || lastName.contains("6") || lastName.contains("7") || lastName.contains("8")
                || lastName.contains("9") ||  lastName.contains("0")){
            System.exit(1);
        }

        return firstName + " " + lastName;
    }

    static int age(int a){
        if(a<12){
            System.out.println("Your child is unfortunately too young for this trip.");
            System.exit(1);
        }else if(a>18){
            System.out.println("Your child is unfortunately too old for this trip.");
            System.exit(1);
        }

        return a;
    }

    static int height(String b){
        int input = Integer.parseInt(b);
        if(input<120){
            System.out.println("Your child is unfortunately too short for this ride.");
            System.exit(1);
        }

        return input;
    }


    static String health(String choice){
        if(!(choice.equals("yes") || choice.equals("no")) ){
            System.exit(1);
        }
        return choice;
    }

    static double cost(int discount){
        double price = 50.0;
        switch (discount) {
            case 10 -> price = price - (price * 0.1);
            case 20 -> price = price - (price * 0.2);
            case 30 -> price = price - (price * 0.3);
            case 40 -> price = price - (price * 0.4);
            default ->
                    System.out.println("Current discounts only range from 10% to 40%");
        }
        return price;
    }

  







    public static void main(String[] args) {
        System.out.println("Is my kid eligible to go on a roller coaster class trip during covid?");
        Scanner sc = new Scanner(System.in);


        System.out.println("Give in the first name of your child.");
        String firstNameOfChild = sc.nextLine();
        System.out.println("Give in the last name of your child.");
        String lastNameOfChild = sc.nextLine();
        name(firstNameOfChild, lastNameOfChild);


        System.out.println("How old is your child?");
        int years = sc.nextInt();
        age(years);

        sc.nextLine(); //consumes the empty space left by the previous int
        System.out.println("Give in the height of your child in cm.");
        String  h  =sc.nextLine();
        height(h);


        System.out.println("Has your child been vaccinated? Please reply with a yes or no");
        String decision = sc.nextLine();
        health(decision);





        System.out.println("Do you have a discount? If so give in the number e.g 10.");
        int percentage = sc.nextInt();
        cost(percentage);




        System.out.println("Name: " + name(firstNameOfChild, lastNameOfChild));
        System.out.println("Age: " + age(years));
        System.out.println("Height: " + height(h) + " cm");
        System.out.println("Vaccinated: " + health( decision) );
        System.out.println("Price: " + cost(percentage));


    }
}
