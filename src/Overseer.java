public class Overseer extends Keeper implements IDoJob {

    @Override
    public String DoJob(String dinospecies) {
        return "Der Aufseher schaut langsam mit seinem Fernglas umher und überprüft, dass die Besucher nichts verbotenes machen";
    }

    public Overseer(String name, String role) {
        super(name, role);
    }
}
