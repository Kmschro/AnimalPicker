import java.util.Scanner;
public class PickAnimal {

	public static void main(String[] args) {
import java.util.Scanner;
public class PickAnimal {

	public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter 1 to see a dog image, 2 to see a cat image:");
        int animal = inp.nextInt();

        if (animal == 1 )
        {
            System.out.println("DOG ASCII ART HERE");
        }
        else if (animal == 2)
        {
            System.out.println("CAT ASCII ART HERE");
        }
        else 
        {
            while(animal != 1 || animal != 2) {
                System.out.println("Error, invalid input, enter 1 for a dog image, or 2 for a cat image: ");
                animal = inp.nextInt();
                if (animal == 1 ) {
                    System.out.println("DOG ASCII ART HERE");
                    break;
                }
                else if (animal == 2) {
                    System.out.println("CAT ASCII ART HERE");
                    break;
                }
        }
        }
    }
}