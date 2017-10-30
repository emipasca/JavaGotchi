/**
 * Created by k1763674 on 30/10/17.
 */
public class Creature {

    int energy, fullness, happiness;
    private String name;

    public Creature(String name){
        energy = 15;
        fullness = 15;
        happiness = 15;

        this.name = name;

    }


    public String getName() {

        return name;

    }

    public void eat() {
       if (fullness >= 12) {
           System.out.println("Whoops, " + this.name + " is already full!");
       }else {
           fullness += 8;
           happiness -= 6;
           energy -= 4;
       }
        if (fullness > 15) { fullness = 15; }

        System.out.println("Yum " + this.getName() + " that was really good!");
    }

    public void sleep() {
        if (energy >= 12) {
            System.out.println("Hmm, " + this.name + " is not that sleepy!");
        }else {
            energy += 8;
            happiness -= 6;
            fullness -= 4;
        }
        if (energy  > 15) { energy = 15; }

        System.out.println("*yawn* That was a good nap!");

    }


    public void play() {
        if (happiness >= 12) {
            System.out.println("Hey, " + this.name + " is too happy!");
        }else {
            happiness += 8;
            energy -= 6;
            fullness -= 4;
        }
        if (happiness > 15) { happiness = 15; }

        System.out.println("That was so much fun! Lets do it again!");
        System.exit(0);
    }



    public String checkStatus() {
        String status = "";

        if ((happiness <= 0) || (energy <= 0) || (fullness <= 0 )) {
            System.out.println("Oh no! " + this.getName() + " has died!");
        }

        if (happiness <= 0) {
           status += "oh, " + this.getName() + " is feeling sad!\n";

        }

        if (energy <= 0) {
            status += "Hmm, " + this.getName() + " is really tired!\n";

        }

        if (fullness <=0) {
            status += "Whoops, " + this.getName() + " is super hungry!\n";

        }



        return status;

    }





}

