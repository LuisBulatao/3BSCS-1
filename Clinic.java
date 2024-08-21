// Programmed By Luis Joshua D. Bulatao 3BSCS-1
import java.util.*;

public class Clinic {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("[1] Dog");
            System.out.println("[2] Cat");
            System.out.println("[3] Exit");
            System.out.print("Choose your pet number: ");
            int choice = input.nextInt();

            PetRecord petFile = new PetRecord();
            Pet pet;

            switch(choice){
                case 1: pet = new Dog();
                    petFile.setPetId("D01");
                    petFile.setPetName("King");
                    ((Dog) pet).setBreed("American Bulldog");
                    petFile.setPet(pet);
                    System.out.println("Pet id is " + petFile.getPetId());
                    System.out.println("Pet name is " + petFile.getPetName());
                    System.out.println("Pet kind: " + petFile.getPet().getClass().getSimpleName());
                    System.out.println("Breed: " + ((Dog) pet).getBreed());
                    System.out.println("Communication sound: "+ petFile.getPet().makeSound());
                    System.out.println("Play mode: " + petFile.getPet().play());
                    break;

                case 2: pet = new Cat();
                    petFile.setPetId("C01");
                    petFile.setPetName("Kiwi");
                    ((Cat) pet).setNoLives(9);
                    petFile.setPet(pet);
                    System.out.println("Pet id is " + petFile.getPetId());
                    System.out.println("Pet name is " + petFile.getPetName());
                    System.out.println("Pet kind: " + petFile.getPet().getClass().getSimpleName());
                    System.out.println("No of Lives " + ((Cat) pet).getNoLives());
                    System.out.println("Communication sound: "+ petFile.getPet().makeSound());
                    System.out.println("Play mode: " + petFile.getPet().play());
                    break;

                case 3:
                    System.out.println("Exit");
                    input.close();
                    return;
                default:
                    System.out.println("Invalid Choice. Please choose again!");
            }

        }

        }

}
