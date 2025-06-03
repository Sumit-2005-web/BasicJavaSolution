import java.util.*;

public class Solutions{
    // Function to print odd or even checker
    public static void isOddEven(){
        System.out.println("Please Enter a Number");
        Scanner sc = new Scanner(System.in);
        int userNum = sc.nextInt();

     
        if(userNum % 2 == 0){
            System.out.println("User Given Number is Even "+ userNum);
        } else {
            System.out.println("User Given Number is Odd " + userNum);
        }
    }

    // Question no.2 function to print largest of three numbers
    public static void largestNumChecker(){
           Scanner sc = new Scanner(System.in);
         System.out.println("Please Enter First Number");
        int firstNum = sc.nextInt();
         System.out.println("Please Enter Second Number");
         int secondNum = sc.nextInt();
          System.out.println("Please Enter Third Number");
          int thirdNum = sc.nextInt();

          if(firstNum >= secondNum){
            if(firstNum >= thirdNum){
                System.out.println("First number is bigger than rest 2 - " + firstNum);
            }
          } else if (secondNum >= thirdNum){
            System.out.println("Second number is bigger than rest 2 - " + secondNum);
          } else {
             System.out.println("Third number is bigger than rest 2 - " + thirdNum);

          }
    }

    //4th function to print number from 1 to n
    public static void printNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any number");
        int rangeNum = sc.nextInt();

        for(int i = 1; i <= rangeNum; i++){
            System.out.print(i + " ");
        }
    }

    // 5th function to print sum of first n natural numbers
    public static void sumOfnNumbers(){
         Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any number");
        int n = sc.nextInt();
        int sum = 0;
        int i = 0;

        while(i <= n){
          sum += i;
          i++;
        }

        System.out.println(sum);
    }

    // 6th function to print multiplication table of n number from 1 to 10
    public static void printTable(){
           Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any number");
        int tableNum = sc.nextInt();

        for(int i = 1; i<= 10; i++){
                 System.out.println(tableNum + " x " + (i) + " = " + (tableNum * (i)));
        }
    } 

    // 7th question function to find factorial of a number
    public static void findFactorial(){
        int factorialNum; // To hold number

        int fact = 1 ; // to hold factorial

           Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any positive number");
        factorialNum = sc.nextInt();

        for(int i = 1; i<=factorialNum; i++){
            fact *= i;
        }

        System.out.println("Factorial of number " + factorialNum + " = " + fact);
    }

    public static boolean isPrime(int n){
    if(n == 2){
        return true;
    }

        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            } 
        }
         return true;
    }
    
    // To check above method ans you can uncomment and run it on your laptop
    public static void main(String args[]){


        // isOddEven();
    //   largestNumChecker();
    // printNum();
    // sumOfnNumbers();
    // printTable();
    // findFactorial();
    // System.out.println(isPrime(5));
    }
}