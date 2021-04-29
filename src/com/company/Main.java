package com.company;
import java.util.Scanner;

class GameLogic{
    private int random;
    public int inputNum;

    GameLogic(){this.random = (int) (Math.random()*101);}

    public String logic(){
        if(this.inputNum < this.random){
            return "Guess a number higher!";
        } else if (this.inputNum > this.random){
            return "Guess a number lower!";
        } else {
            return "You guessed perfectly!";
        }
    }

    public int getRandom(){
        return random;
    }
}

class GuessNoGame {
    public void runGame() {
        Scanner sc = new Scanner(System.in);
        int num,randomVal,count=0;
        String op;
        GameLogic logic = new GameLogic();
        randomVal = logic.getRandom();

        System.out.println("Welcome to 'Guess the Number' game!");
        do {
            System.out.print("Enter a number : ");
            num = sc.nextInt();
            logic.inputNum = num;
            op = logic.logic();
            System.out.println(op);
            count++;
            System.out.println("Total tries : "+count);
        } while (randomVal != num);
    }
}


public class Main {

    public static void main(String[] args) {
	// write your code here
        GuessNoGame startGame = new GuessNoGame();
        startGame.runGame();
    }
}
