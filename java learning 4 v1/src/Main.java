//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Using the "default Constructor"
        Cat kitten = new Cat();
        System.out.println("Cat name: " + kitten.name); // the .name means it's a field (there is an f on the suggestions, f of field)

        Cat pup = new Cat("pup.png", "Pup", 2, 0);
        System.out.println("Picture: " + pup.picture);
        System.out.println("Name: " + pup.name);
        System.out.println("Age: " + pup.age);
        System.out.println("ID: " + pup.id);

        Cat swif = new Cat("swif.png", "Swif", 1, 0);
        System.out.println("Picture: " + swif.picture);
        System.out.println("Name: " + swif.name);
        System.out.println("Age: " + swif.age);
        System.out.println("ID: " + swif.id);

        pup.meow();
        swif.meow();

        // Not recommended to change, because on the business side it could mess up with like some person social security key
        // It is possible because it is a public field, that's why we should use private in some cases
        pup.age = 3;
        System.out.println("Pup's age has changed to " + pup.age + "!");
    }
}