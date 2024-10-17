import java.util.Scanner;

public class Safeinput
{


    /**
     * gets a string from the user using the console and
     * it must be at least one character in length
     * @param pipe a Scanner used to get the input
     * @param prompt the prompt that tells the user what to enter
     * @return a String at least one character in length
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retVal = "";


        do
        {
            System.out.print(prompt + "; ");
            retVal = pipe.nextLine();

            if(retVal.isEmpty())
                System.out.println("You must enter at least one character!");


        }while (retVal.isEmpty());

        return retVal;
    }
    /**
     *
     *
     * @param pipe a Scanner used to get the input
     * @param prompt the prompt that tells the user what to enter
     * @return an int of any value
     */
    public static int getInt(Scanner pipe, String prompt)
    {
        int retVal = 0;
        boolean done = false;
        String trash = "";
        do
        {
            System.out.print(prompt + "; ");
            if(pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine();
                done = true
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter an integer value!");
            }

        }while (!done);

        return retVal;
    }

}
