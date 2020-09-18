import java.util.Scanner;

public class MovieDriver {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String choice = "y";
        Movie n1 = new Movie();
        do {
            System.out.println("Enter the name of the movie");
            n1.setTitle(keyboard.nextLine());
            System.out.println("Enter the rating of the movie");
            n1.setRating(keyboard.nextLine());
            System.out.print("Enter the number tickets sold");
            n1.setSoldTickets(keyboard.nextInt());
            System.out.println(n1.toString());
            System.out.println("Do you want to enter anther (y or n)");
            choice = keyboard.nextLine();
            choice = keyboard.nextLine();
        }while(choice.equalsIgnoreCase("y"));
        System.out.println("Goodbye");
    }
}
