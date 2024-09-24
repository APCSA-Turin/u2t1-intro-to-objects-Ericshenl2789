package U2T1_Return;
import java.util.Random;

public class ChatBot {
    Random rand = new Random();

    // instance variables
    private String name;
    private int number;
 
    // constructor
    public ChatBot(String chatBotName, int faveNum) {
        name = chatBotName;
        number = faveNum;
    }
 
    // void method that prints a greeting
    public void greeting(String yourName) {
        System.out.println("Hello, " + yourName + " my name is " + name); // name is an instance variable
        System.out.println("and I am a chat bot! What do you want to talk about?");
    }
 
    // void method that prints the weather
    public void weather() {
        System.out.println("I actually don't know much about the weather! Ha ha!");
        System.out.println("But I know it's warm and dry inside a computer! Ha ha!");
    }
 
    // method that converts feet to meters and returns the meters
    public double convertFeetToMeters(int numFeet) {
        final double METERS_PER_FOOT = 0.3048;
        return METERS_PER_FOOT * numFeet;
    }
 
    // void method that prints information about favorite numbers
    public void favoriteNumber(int yourNumber) {
        int distance = yourNumber - number;  // number is an instance variable
        System.out.println("My favorite number is " + number);
        System.out.println("That is " + distance + " away from your number!");
    }
 
    // method that adds and returns the sum of three numbers
    public int addNumbers(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
 
    // method that returns a goodbye message -- note that this method does not print a string, but
    // rather RETURNS a string
    public String goodbye() {
        return "It was nice talking with you! Have a great day! Sincerely, " + name;
    }
    
    //Benjamin's methods
    public void dislikedNumber(int userHatedNum) {
        int randNum = rand.nextInt(1,10);
        if (userHatedNum == randNum) {
            System.out.println("I also hate the number " + userHatedNum);
        }else {
            System.out.println("I don't mind that number.");
        }
        }    

        
    //Eric's methods
    public void idleChatter(int RandomNumber){
        if (RandomNumber == 0){
            System.out.println("I don't know what to say.");
        } else if (RandomNumber == 1 ){
            System.out.println("It sure is boring around here.");
        }else{
            System.out.println("I enjoy coding new sentences for myself in my free time. ");
        }
        
    }
    public String howIsTheChatBot(){
        return "I am functioning within (hopefully) normal parameters. ";
    }
    public int multiplyNumbers(int number1, int number2){
        return number1 * number2;
    }
}
 
 
 
 