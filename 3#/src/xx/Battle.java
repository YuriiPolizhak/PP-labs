package xx;

import Droids.Droid;
import java.util.ArrayList;

public class Battle {

    private ArrayList<Droid> first;
    private ArrayList<Droid> second;

    public Battle(ArrayList<Droid> first, ArrayList<Droid> second) {
        this.first = first;
        this.second = second;
    }

    public boolean firstTeamIsAlive(){
        for(int i = 0; i < this.first.size(); i++){
            if (!(this.first.get(i).droidIsAlive())){
                this.first.remove(i);
            }
        }
        if (this.first.isEmpty()){
            return false;
        }
        else {
            return true;
        }
    }

    public boolean secondTeamIsAlive(){
        for(int i = 0; i < this.second.size(); i++){
            if (!(this.second.get(i).droidIsAlive())){
                this.second.remove(i);
            }
        }
        if (this.second.isEmpty()){
            return false;
        }
        else {
            return true;
        }
    }

    public Droid chooseFirstTeamDroid(){
        int firstSize;
        int f;
        firstSize = this.first.size();
        f = (int) (Math.random() * firstSize);
        if (f >= firstSize){
            f = firstSize - 1;
        }
        return this.first.get(f);
    }

    public Droid chooseSecondTeamDroid(){
        int secondSize;
        int s;
        secondSize =this.second.size();
        s = (int) (Math.random() * secondSize);
        if (s >= secondSize){
            s = secondSize - 1;
        }
        return this.second.get(s);
    }

    public void startFight(){
        double i;
        int temp;
        Droid makeHitDroid;
        Droid defendDroid;
        i =  (Math.random());
        if (i < 0.5) {
            makeHitDroid = this.chooseSecondTeamDroid();
            makeHitDroid.getWeapon();
            defendDroid = this.chooseFirstTeamDroid();
            temp= makeHitDroid.makeHit(defendDroid);
            System.out.println("Droid " + makeHitDroid.getName() +
                    " hit droid " + defendDroid.getName()+" for "+temp+" hp");
        }
        else {

            makeHitDroid = this.chooseFirstTeamDroid();
            defendDroid = this.chooseSecondTeamDroid();
           temp= makeHitDroid.makeHit(defendDroid);
            System.out.println("Droid " + makeHitDroid.getName() +
                    " hit droid " + defendDroid.getName()+" for "+temp+" hp");
        }
    }
    public void startBattle(){

        takeBuffs();
        int round = 1;

        printBoth();
        while (this.firstTeamIsAlive() | this.secondTeamIsAlive()){

            System.out.println("\n\t\t||Round " + round+"||");
            round++;
            this.startFight();
            if (!this.firstTeamIsAlive()){
                System.out.println("Second team win battle:");
                this.printSecondTeam();
                return;
            }
            if (!this.secondTeamIsAlive()){
                System.out.println("First team win battle:");
                this.printFirstTeam();
                return;
            }
            printBoth();
        }
    }

    public void printFirstTeam(){
        for (Droid droid : this.first) {
            droid.printDroid();
        }

    }

    public void printSecondTeam() {
        for (Droid droid : this.second) {
            droid.printDroid();
        }
    }
    public void printBoth()
    {
        System.out.println("|\tName\t|\tDroid\t|\tWeapon\t|\tHealth\t|\tDamage\t|\tBlock in %\t|");
        System.out.println("First team:");
        this.printFirstTeam();
        System.out.println("Second team:");
        this.printSecondTeam();
        System.out.println("-------------------------------------------------------------------------------");}
    public void takeBuffs  ()
    {
        for(Droid droid:this.first){droid.takeCharacteristicsFromWeapon(droid);}
        for(Droid droid:this.second){droid.takeCharacteristicsFromWeapon(droid);}
    }
}



