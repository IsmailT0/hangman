import java.util.Arrays;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        game();
    }
/*
* will be goal
* will be false counter
*
*
* will be shown to player
* will be false guesses
* will be guessed places
*
*
* */
    public static void game(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to hangman game.");
        String goalWord=randomWord();
        char[] placeHolder = createPlaceHolder(goalWord);
        char[] wrongGuesses= new char[6];

        int counter=0;
        do {
            printTable(counter,wrongGuesses,placeHolder);
            char guess= sc.next().charAt(0);
            if (!check(goalWord,placeHolder,guess,wrongGuesses,counter))
                counter++;
        }while(counter<6 && checkPlaceHolder(placeHolder));

        if (counter==6){
            System.out.println("YOU LOST");
            printTable(counter,wrongGuesses,placeHolder);
        }
        else{
            System.out.println("YOU WIN");
        }

    }

    public static void printTable(int counter,char[] wrongGuesses,char[] placeHolder){
        System.out.println(gallows[counter]);
        System.out.print("Letters you entered: ");
        printArr(wrongGuesses);
        System.out.print("The placeHolder: ");
        printArr(placeHolder);
        System.out.print("Enter your guess: ");
    }

    public static boolean check(String goalWord,char[] placeHolder,char guess, char[] wrongGuesses,int counter){
        boolean x= false;

        for (char wrongGuess : wrongGuesses) {
            if (guess == wrongGuess) {
                System.out.printf("You already entered the %c letter\n", guess);
                return true;
            }
        }

        for (int i = 0; i < goalWord.length(); i++) {
            if ((goalWord.charAt(i)==guess) ){
                x=true;
                placeHolder[i]=guess;
            }
        }
        if (!x)
            wrongGuesses[counter]=guess;
        return x;
    }

    public static boolean checkPlaceHolder(char[] placeHolder){


        for (char c : placeHolder) {
            if (c =='_')
                return true;
        }
        return false;
    }


    public static char[] createPlaceHolder(String guessWord){
        char[] placeHolder = new char[guessWord.length()];
        Arrays.fill(placeHolder,'_');
        return placeHolder;
    }

    public static String randomWord(){
        return words[(int)(Math.random()*(words.length)-1)];
    }
    public static String[] gallows = {
            "+---+\n" +
                    "|   |\n" +
                    "    |\n" +
                    "    |\n" +   //if the user didn't miss any guesses.
                    "    |\n" +
                    "    |\n" +
                    "=========\n",

            "+---+\n" +
                    "|   |\n" +
                    "O   |\n" +   //if the user missed one guess.
                    "    |\n" +
                    "    |\n" +
                    "    |\n" +
                    "=========\n",

            "+---+\n" +
                    "|   |\n" +
                    "O   |\n" +    //if the user missed two guesses.
                    "|   |\n" +
                    "    |\n" +
                    "    |\n" +
                    "=========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +   //if the user missed three guesses.
                    "/|   |\n" +
                    "     |\n" +
                    "     |\n" +
                    " =========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|\\  |\n"+   //if the user missed four guesses.
                    "     |\n" +
                    "     |\n" +
                    " =========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|\\  |\n" +  //if the user missed five guesses.
                    "/    |\n" +
                    "     |\n" +
                    " =========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|\\  |\n" +   //if the user missed six guesses.
                    "/ \\  |\n" +
                    "     |\n" +
                    " =========\n"};

    //placeHolder box
    public static String[] words = {"ant", "baboon", "badger", "bat", "bear","beaver", "camel", "cat", "clam",
            "cobra", "cougar", "coyote", "crow", "deer", "dog", "donkey", "duck", "eagle", "ferret", "fox",
            "frog", "goat", "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose", "mouse",
            "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon", "python", "rabbit", "ram", "rat",
            "raven","rhino", "salmon", "seal", "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork",
            "swan", "tiger", "toad", "trout", "turkey","turtle", "weasel", "whale", "wolf", "wombat", "zebra"};

    private static void printArr(char [] arr){
        for (char a: arr) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
}
