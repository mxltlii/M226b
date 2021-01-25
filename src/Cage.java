import java.util.ArrayList;
import java.util.Random;

public class Cage {
    private final String containedSpecies;
    private final ArrayList<Dinosaur> dinoList;
    private final Keeper keeper;


    public Cage(ArrayList<Dinosaur> dinoList, Keeper keeper) {
        this.dinoList = dinoList;
        this.containedSpecies = dinoList.get(0).species;
        this.keeper = keeper;
    }

    public String WatchDinos() {
        Random r = new Random();
        int dostuff = r.nextInt(dinoList.size());
        System.out.println("Listsize" + dinoList.size());

        return dinoList.get(dostuff).DoStuff();
    }

    public String WatchKeeper() {
        return this.keeper.DoJob(this.containedSpecies);
    }

    public String GetSpecies() {
        return this.containedSpecies;
    }
}
