import java.util.Scanner;

public class PairProcess {
    public static void main(String[] args) {
        int num1, num2;
        int sum;
        int production;
        double average;

        Scanner keyboard = new Scanner(System.in);

        System.out.print( "First Number? :" );
        num1 = keyboard.nextInt();

        System.out.print( "Last Number?  :" );
        num2 = keyboard.nextInt();

        sum = num1+num2;
        production=num1*num2;
        average=production/2;

        System.out.println("Your input number is "+num1+" and "+num2);
        if(sum>200)
            System.out.println("The sum is "+sum+"*");
        else
            System.out.println("The sum is "+sum);

        System.out.println("The producdion is "+production+" and the average of the two number is "+ average);


    }
}