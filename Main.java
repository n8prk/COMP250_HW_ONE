package HomeworkOne;

public class Main {
    public static void main(String[] args)
    {
        // Creates a class with all class methods
        HomeworkOne myMethods = new HomeworkOne();

        System.out.println("Problem one: ");
        myMethods.inputAllBaseTypes();

        System.out.println("Problem two: ");
        System.out.println(myMethods.isMultiple(8, 4));
        System.out.println(myMethods.isMultiple(8, 3));

        System.out.println("Problem three: ");
        System.out.println(myMethods.squareSum(4));

        System.out.println("Problem four: ");
        // Instatiates the Flower class
        Flower rose = new Flower("Rose", 20, 9.99f);

        // All getters from the Rose instance
        System.out.println(rose.getFlower());
        System.out.println(rose.getPetals());
        System.out.println(rose.getPrice());

        // Using the setters to manipulate the rose class
        rose.setFlower("Tulips");
        rose.setPetals(15);
        rose.setPrice(15.99f);

        // Using the getters again
        System.out.println(rose.getFlower());
        System.out.println(rose.getPetals());
        System.out.println(rose.getPrice());

        System.out.println("Problem 5: Refer to commented code on starting from line 27.");

        // Instantiate the class with as first two values

        // FibonacciProgression myProg = new FibonacciProgression(2, 2);

        // Iterate 6 times to get the 8th value

        // for(int i = 0; i < 6 i++)
        //{
        //  myProg.advance();
        //}

        System.out.println("For the rest of the Homework, refer to the read me.");

    }
}
