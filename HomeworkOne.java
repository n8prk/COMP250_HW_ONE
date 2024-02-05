package HomeworkOne;

public class HomeworkOne {
    // Part One: inputAllBaseTypes
    public void inputAllBaseTypes()
    {
        // creates variables of each base type
        byte bite = 2;
        short small = 10;
        int num = 425;
        long large = 4532;
        float hover = 4.123f;
        double twice = 2.234;
        boolean leanBoo = true;
        char izard = 'b';

        //prints the variables
        System.out.println(bite);
        System.out.println(small);
        System.out.println(num);
        System.out.println(large);
        System.out.println(hover);
        System.out.println(twice);
        System.out.println(leanBoo);
        System.out.println(izard);
    }

    // Part Two: isMultiple
    public boolean isMultiple(long n, long m)
    {

        if(n % m == 0) // checks if the values are evenly divisible
        {
            return true; // if value is even divisible
        }
        return false; // if value is not evenly divisible
    }

    // Part Three: SquareSum
    public int squareSum(int n)
    {
        if(n == 1) // base case
        {
            return 1; // returns 1 squared which is just one
        }
        else
        {
            return n*n + squareSum(n-1); // Recursive method to reach base case
        }
    }
}
