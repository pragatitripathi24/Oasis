import java.util.Random;
import java.util.Scanner;

 class guessingnumber {
    public static void main(String[] args) {
       System.out.println("Welcome to the number guessing name!");

       int minimum =1;
       int maximum = 100;
       Random ran = new Random();
       int target = ran.nextInt(100);
       int guessednumber;
       int attempts =0;
       
       do{
       System.out.print("Guess the number b/w "+minimum +" to "+ maximum +": ");
       Scanner sc = new Scanner(System.in);
       guessednumber = sc.nextInt();
       attempts++;
      
      if(guessednumber>target){
        System.out.println("The number you guessed is greater than the target number");
      }else if(guessednumber<target){
        System.out.println("The number you guessed is smaller than the target number");
      }else{
        System.out.println("CONGRATULATIONS YOU GUESS THE RIGHT NUMBER "+target+ " in "+ attempts +" attempts");
      }}
      while(guessednumber != target);
}
}