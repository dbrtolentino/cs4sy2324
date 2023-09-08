package ph28_exercise01_tolentino;
public class Ph28_Exercise01_Tolentino {

    public static void main(String[] args) {
        String dog1Name = "Tofu";
        String dog2Name = "Desti";
        String dog3Name = "Max";
        int dog1Age = 6;
        int dog2Age = 3;
        int dog3Age = 1;
        String dog1Breed = "Pomeranian";
        String dog2Breed = "Shih Tzu";
        String dog3Breed = "American Bully";

        System.out.println("Dog 1");
        System.out.println("Name: " + dog1Name);
        System.out.println("Age: " + dog1Age);
        System.out.println("Breed: " + dog1Breed + "\n");

        System.out.println("Dog 2");
        System.out.println("Name: " + dog2Name);
        System.out.println("Age: " + dog2Age);
        System.out.println("Breed: " + dog2Breed + "\n");

        System.out.println("Dog 3");
        System.out.println("Name: " + dog3Name);
        System.out.println("Age: " + dog3Age);
        System.out.println("Breed: " + dog3Breed + "\n");
 
        int totalAge;
        totalAge = dog1Age + dog2Age + dog3Age;
        System.out.println("Total years of age: " + totalAge);

        if (dog1Age > dog2Age && dog1Age > dog3Age){
            System.out.println("Tofu is the oldest: True");
        }
        else {
            System.out.println("Tofu is the oldest: False");
        }

        if (dog1Breed == dog2Breed && dog1Breed == dog3Breed){
            System.out.println("The dogs are all the same breed: True");
        }
        else {
            System.out.println("The dogs are all the same breed: False");
        }
    }
    
}
