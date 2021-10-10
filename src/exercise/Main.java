package exercise;
import java.util.Scanner;
import java.util.Random;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter number");
        String name=scan.nextLine();
        System.out.println("well, "+name+", I am thinking of a number between 1 and 20 ");
        int myNumber=getRandomNumber(1,21);
        for(int i=0;i<6;i++)
        {
            Scanner scan2=new Scanner(System.in);
            System.out.println("take a guess");
            int yourGuess=scan2.nextInt();
            if(yourGuess == myNumber)
            {
                System.out.println("guessed random number");
                break;
            }
            else if(yourGuess <  myNumber)
            {
                System.out.println("your guess is too low");
            }
            else if(yourGuess > myNumber)
            {
                System.out.println("your guess is too high");
            }
            if(i>=5)
            {
                System.out.println();
                System.out.println("nope. the number i was thinking of was"+myNumber+"!");

            }
        }


    }
    public static int getRandomNumber(int min,int max)
    {
        Random random=new Random();
        return random.ints(min,max).findFirst().getAsInt();

    }

}

