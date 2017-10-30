/**
 * Created by k1763674 on 30/10/17.
 */

import java.util.Scanner;



public class Game {

    Scanner scanner = new Scanner(System.in);
    Creature creature;

    boolean userQuit = false;

    public void run() {


        startTutorial();
        while (!userQuit) {

            System.out.println("Time to put " +  this.creature.getName() + " to sleep!");
            System.out.println(this.creature.checkStatus());

        }

    }

    private void startTutorial() {
        System.out.println("Hi there! Welcome to JavaGotchi!");
        System.out.println("What's the name of your Creature?");

        String name = scanner.nextLine();

        this.creature = new Creature(name);
        System.out.println("Great, you can now meet " +  this.creature.getName() + "!");
    }

    private void interact() {
        System.out.println("What would you like to do?");

        System.out.println("1. Play");
        System.out.println("2. Eat");
        System.out.println("3. Sleep");
        System.out.println("4. Quit");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                creature.play();
                break;
            case 2:
                creature.eat();
                break;
            case 3:
                creature.sleep();
                break;
            case 4:
                userQuit = true;
                break;
            default:
                System.out.println("Whoops, you must pick one!");
                break;
        }

    }
}
