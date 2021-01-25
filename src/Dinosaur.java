import java.util.Random;

public class Dinosaur {
    protected String species;
    protected int age;
    protected boolean eatsMeat;

    protected Dinosaur(String species, int age, boolean eatsMeat) {
        this.species = species;
        this.age = age;
        this.eatsMeat = eatsMeat;
    }

    public String DoStuff() {
        Random r = new Random();
        int dostuff = r.nextInt(1 + 2);

        switch (dostuff) {
            case 0:
                return "Der " + this.species + " läuft beruhigt umher und sucht nach einer Mahlzeit.";
            case 1:
                if (this.eatsMeat) {
                    return "Gerade frisst der " + this.age + " Jahre alte " + this.species + " eine Ziege, vor kurzer Zeit im Käfig freigelassen wurde.";
                } else {
                    return "Gerade frisst der " + this.age + " Jahre alte " + this.species + " von einem kleinen Busch.";
                }
            case 2:
                return "Der " + this.species + " scheint gerade zu schlafen.";
        }

        return null;
    }
}
