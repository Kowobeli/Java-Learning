public class Cat {
    // Adding some fields to the Cat Class
    public String picture;
    public String name;
    public int age;
    public int id;

    // Static variable to keep track of the last assigned ID
    public static int lastAssignedId = -1;

    // Default Constructor
    public Cat(){

    }

//    public Cat(String picture, String name, int age){ // The parameters don't have to be the same as the fields
//        this.picture = picture; // "This" refers to the object that is being created
//        this.name = name;
//        this.age = age;
//    }

    // Or

    // Right-click on an empty line (or alt + insert) -> generate -> constructor -> select all -> press ok
    // To create an object we need a Custom Constructor
    public Cat(String picture, String name, int age, int id) {
        this.picture = picture;
        this.name = name;
        this.age = age;
        this.id = ++lastAssignedId;
    }

    public void meow(){
        System.out.println(this.name + " just meowed!"); // Also works without "this.", just "name"
    }
}
