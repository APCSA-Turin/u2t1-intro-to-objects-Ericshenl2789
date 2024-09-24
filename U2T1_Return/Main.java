package U2T1_Return;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ChatBot chatbot = new ChatBot("VolunteerTestSubjectNumber1", 2);
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("What is your name? ");
        String userName = scan.nextLine();
        chatbot.greeting(userName);
        while(true) {
            String userInput = scan.nextLine().toLowerCase();
            
            if(userInput.contains("bye")||userInput.contains("exit")){
                break;
            } else if (userInput.contains("weather")){
                chatbot.weather();
            } else if (userInput.contains("number")){
                System.out.println("Do you want to know my favorite or least favorite?");
                String userInput2 = scan.nextLine().toLowerCase();
                if (userInput2.contains("least")){
                    System.out.print("What is your least favorite number? ");
                    int lFavNum = scan.nextInt();
                    chatbot.dislikedNumber(lFavNum);
                }else if (userInput2.contains("favorite")){
                    System.out.print("What is your favorite number? ");
                    int favNum = scan.nextInt();
                    chatbot.favoriteNumber(favNum);        
                }else{
                    System.out.println("Error");
                    userInput = "number";
                }
            } else if (userInput.contains("math")){
                System.out.println("Add, multiply or convert feet to meters?");
                String userInput3 = scan.nextLine().toLowerCase();
                if (userInput3.contains("add")){
                    System.out.print("Enter the first number: ");
                    int num1 = scan.nextInt();
                    System.out.print("Enter the second number: ");
                    int num2 = scan.nextInt();
                    System.out.print("Enter the third number: ");
                    int num3 = scan.nextInt();
                    System.out.println("The sum of the numbers is " + chatbot.addNumbers(num1, num2, num3));
                } else if (userInput3.contains("multiply")){
                    System.out.print("Enter the first number: ");
                    int multiplyNum = scan.nextInt();
                    System.out.print("Enter the second number: ");
                    int multiplyNum2 = scan.nextInt();
                    System.out.println("The result is " + chatbot.multiplyNumbers(multiplyNum, multiplyNum2));
                } else if (userInput3.contains("feet to meter")){
                    System.out.print("How much feet do you want to convert to meters? ");
                    int feet = scan.nextInt();
                    System.out.println("It is equal to " + chatbot.convertFeetToMeters(feet) + " meters. ");
                }else {
                    System.out.println("Error");
                }
            } else if (userInput.contains("how are you")){
                System.out.println(chatbot.howIsTheChatBot());
            } else {
                int randomNum = rand.nextInt(0,3);
                chatbot.idleChatter(randomNum);
            }
        }
        System.out.println(chatbot.goodbye());
        scan.close();
    }
}
