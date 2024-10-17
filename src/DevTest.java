import java.sql.SQLOutput;
import java.util.Scanner;

public class DevTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String firstName = "";
        int age = 0;
    /*
        firstName = getNonZeroLenString(in, "Enter your first name");
        System.out.println("Fname is " + firstName);


        age = getInt(in, "Enter your age");
        System.out.println("You said your age is " + age);

     */
        salary = getDouble(in, "Enter your salary");
        System.out.println("You said your salary is " + salary);
    }


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
        double salary = 0;
        {
            System.out.print(prompt + "; ");
            if(pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter an integer value not" + trash + "!");
            }

        }while (!done);

        return retVal;
    }
    /**
     *
     *
     * @param pipe a Scanner used to get the input
     * @param prompt the prompt that tells the user what to enter
     * @return an int of any value
     */
    public static double getDouble(Scanner pipe, String prompt)
    {
        double retVal = 0;
        boolean done = false;
        String trash = "";
        double salary = 0;
        {
            System.out.print(prompt + "; ");
            if(pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine();
                done = true;
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

