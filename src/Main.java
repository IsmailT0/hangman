//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        String goal = "aba";
//        int goalLetters= goal.length();
//
//        char[] guessedLetter= new char[6];
//
//        char[] placeHolder= new char[goalLetters];
//        for (int i =0;i<goalLetters;i++)
//            placeHolder[i]='_';
//
//        Scanner sc = new Scanner(System.in);
//        int counter=0;
//        System.out.println("welcome to hangman.");
//        System.out.println(gallows[counter]);
//        while(counter<6 && goalLetters>0) {
//            System.out.print("Word: " );
//            printArr(placeHolder);
//            System.out.print("The letters you entered: ");
//            printArr(guessedLetter);
//            System.out.print("Enter a letter for guess: ");
//            char guess= sc.next().charAt(0);
//            int correctCount=replacePlaceHolder(goal,guess,placeHolder);
//            if (correctCount!=0)
//                goalLetters-=correctCount;
//            else
//                counter++;
//            System.out.println(gallows[counter]);
//        }
//        if (counter==6)
//            System.out.println("YOU LOST");
//        else
//            System.out.println("YOU WIN");
//
//    }
//    public static String[] gallows = {
//            "+---+\n" +
//                    "|   |\n" +
//                    "    |\n" +
//                    "    |\n" +   //if the user didn't miss any guesses.
//                    "    |\n" +
//                    "    |\n" +
//                    "=========\n",
//
//            "+---+\n" +
//                    "|   |\n" +
//                    "O   |\n" +   //if the user missed one guess.
//                    "    |\n" +
//                    "    |\n" +
//                    "    |\n" +
//                    "=========\n",
//
//            "+---+\n" +
//                    "|   |\n" +
//                    "O   |\n" +    //if the user missed two guesses.
//                    "|   |\n" +
//                    "    |\n" +
//                    "    |\n" +
//                    "=========\n",
//
//            " +---+\n" +
//                    " |   |\n" +
//                    " O   |\n" +   //if the user missed three guesses.
//                    "/|   |\n" +
//                    "     |\n" +
//                    "     |\n" +
//                    " =========\n",
//
//            " +---+\n" +
//                    " |   |\n" +
//                    " O   |\n" +
//                    "/|\\  |\n"+   //if the user missed four guesses.
//                    "     |\n" +
//                    "     |\n" +
//                    " =========\n",
//
//            " +---+\n" +
//                    " |   |\n" +
//                    " O   |\n" +
//                    "/|\\  |\n" +  //if the user missed five guesses.
//                    "/    |\n" +
//                    "     |\n" +
//                    " =========\n",
//
//            " +---+\n" +
//                    " |   |\n" +
//                    " O   |\n" +
//                    "/|\\  |\n" +   //if the user missed six guesses.
//                    "/ \\  |\n" +
//                    "     |\n" +
//                    " =========\n"};
//    public static String[] words = {"ant", "baboon", "badger", "bat", "bear","beaver", "camel", "cat", "clam",
//            "cobra", "cougar", "coyote", "crow", "deer", "dog", "donkey", "duck", "eagle", "ferret", "fox",
//            "frog", "goat", "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose", "mouse",
//            "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon", "python", "rabbit", "ram", "rat",
//            "raven","rhino", "salmon", "seal", "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork",
//            "swan", "tiger", "toad", "trout", "turkey","turtle", "weasel", "whale", "wolf", "wombat", "zebra"};
//    public static String randomWord(String[] words){
//        int random = (int)(Math.random()*(words.length)-1);
//        return words[random];
//    }
//
//
//    public static int replacePlaceHolder(String word,char guess,char[] placeHolder) {
//        int counter=0;
//        for (int i = 0; i < word.length(); i++)
//            if (word.charAt(i) == guess){
//
//            }
//        return counter;
//
//    }
//
//
//    public  static void printArr(char[] arr){
//        for (char c : arr)
//            if ((int) c != 0)
//                System.out.print(c);
//        System.out.println();
//    }
//
//
//}