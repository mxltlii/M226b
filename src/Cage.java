import java.util.ArrayList;
import java.util.Random;

public class Cage {
    private String containedSpecies;
    private ArrayList<Dinosaur> dinoList;


    public Cage(ArrayList<Dinosaur> dinoList){
        this.dinoList = dinoList;
        this.containedSpecies = dinoList.get(0).species;
    }

    public String WatchDinos(){
        Random r = new Random();
        int dostuff = r.nextInt(0 + dinoList.size());
        System.out.println("Listsize" + dinoList.size());

        return dinoList.get(dostuff).DoStuff();
    }

    public String GetSpecies(){
        return this.containedSpecies;
    }
}
