import java.util.ArrayList;
import java.util.Random;

public class Cage {
    private final String containedSpecies;
    private final ArrayList<Dinosaur> dinoList;
    private final Keeper keeper;

    /**
     *
     * @param dinoList
     * @param keeper
     */
    public Cage(ArrayList<Dinosaur> dinoList, Keeper keeper) {
        this.dinoList = dinoList;
        this.containedSpecies = dinoList.get(0).species;
        this.keeper = keeper;
    }

    /**
     *
     * @return
     */
    public String WatchDinos() {
        Random r = new Random();
        int dostuff = r.nextInt(dinoList.size());
        return dinoList.get(dostuff).DoStuff();
    }

    /**
     *
     * @return
     */
    public String WatchKeeper() {
        return this.keeper.DoJob(this.containedSpecies);
    }

    /**
     *
     * @return
     */
    public String GetSpecies() {
        return this.containedSpecies;
    }

    /**
     *
     * @return
     */
    public String BeFed() {
        Random r = new Random();
        int tasty = r.nextInt(2);

        if (tasty == 1) {
            return "Der " + this.GetSpecies() + " scheint das Essen zu mögen";
        } else {
            return "Der " + this.GetSpecies() + " mag das Essen nicht und läuft davon";
        }
    }

    /**
     *
     * @return
     */
    public ArrayList<Dinosaur> GetDinoList() {
        return dinoList;
    }
}
