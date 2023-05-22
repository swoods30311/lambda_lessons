// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Lambdas {
    public static void main(String[] args) {

        //Java 7 && <
        Cat myCat = new Cat();
        printThing(myCat);

        //Java 8 && >
        printThing(()->{System.out.println("Meow");});

// Lambda way of passing the functionality of the SAM Printable around. ~ https://youtu.be/VLTEPWkEhsg?t=395

        Printable obj = () -> System.out.println("I know this is a Cat proj, but what does the fox say?")
        ;

        printThing(obj);

    }

    public static void printThing(Printable thing){
        thing.print();
    }
}