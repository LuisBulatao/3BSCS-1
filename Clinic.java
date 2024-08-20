import java.util.*;

public class Clinic {
    public static void main (String[] args){
            Scanner input = new Scanner(System.in);

            System.out.println("[1] Dog");
            System.out.println("[2] Cat");
            System.out.print("\nChoose your pet number: ");
            int choice = input.nextInt();

            PetRecord petFile = new PetRecord();
            Pet pet;

            switch(choice){
                case 1: pet = new Dog();
                    petFile.setPetId("D01");
                    petFile.setPetName("King");
                    petFile.setPet(pet);
                    ((Dog) pet).setBreed("American Bulldog");
                    break;
                case 2: pet = new Cat();
                    petFile.setPetId("C01");
                    petFile.setPetName("Kiwi");
                    petFile.setPet(pet);
                    ((Cat) pet).setNoLives(9);
            }

            System.out.println("Pet id is " + petFile.getPetId());
            System.out.println("Pet name is " + petFile.getPetName());
            System.out.println("Pet kind: " + petFile.getPet().getClass().getSimpleName());
            System.out.println("Communication sound: "+ petFile.getPet().makeSound());
            System.out.println("Play mode: " + petFile.getPet().play());
        }
    }
