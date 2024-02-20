import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //LIST
        List<String> questionsList = new ArrayList<>(); //No need to define the length
        questionsList.add("what's 1 + 1?");
        questionsList.add("what's 2 + 1?");
        questionsList.add("what's 3 + 1?");

        //Lists -> you can add entries dynamically

        questionsList.remove(0); //give back the string back that you just removed.
        //or
        questionsList.remove("what's 2 + 1"); //give back the boolean whether it actually have been removed.

        System.out.println(questionsList.size()); //get the length

        //since I deleted the other elements in the list, the element of index 2 became index 0

        System.out.println(questionsList.get(0));

        //List<int> numbers = new ArrayList<>();
        //the angled brackets in "List<>" are what's called generics, because they accept any data types
        //but generics don't work with primitive data types, like int. wrapper classes should be used instead, like Integer
        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(192);

        //MAPS
        //map a Key to a certain value. Called Key-Valued Pairs -> Map<"Key", "Value">
        //The pairs don't have to match
        Map<String, String> CountryToCapital = new HashMap<>();
        CountryToCapital.put("Germany", "Berlin");
        CountryToCapital.put("France", "Paris");
        CountryToCapital.put("Italy", "Rome");
        CountryToCapital.put("USA", "Washington DC");

        //To get a value of a map you have to supply it a key
        System.out.println(CountryToCapital.get("Germany"));

        System.out.println("Contains key 'Germany' " + CountryToCapital.containsKey("Germany"));
        System.out.println("Contains value 'London' " + CountryToCapital.containsValue("London"));

        System.out.println(CountryToCapital.remove("France"));

        //SETS
        // a set is a collection that cointains no duplicates
        Set<String> usernames = new HashSet<>();
        usernames.add("Kowobeli");
        usernames.add("Kowobeli");
        usernames.add("Kowobeli");

        System.out.println(usernames.add("FRV"));
        System.out.println(usernames.add("FRV"));
        //If the element is duplicated, it will return false, because the add method returns boolean.

        /* ERROR YOU MIGHT RUN INTO */
        // Uncomment to see Errors

        // IndexOutOfBoundException
        // If you try and pass in an Index that does not exist for a list
        // System.out.println(questionsList.get(2));

        // Not an Exception, BUT "null"
        // If you pass in a Key into a Map that does not exist
        // Your return value is going to be null (might lead to other errors down the line!)
        // System.out.println(CountryToCapital.get("Malta"));

    }
}