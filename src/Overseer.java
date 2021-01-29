public class Overseer extends Keeper implements IDoJob {

    /**
     *
     * @param dinospecies
     * @return
     */
    @Override
    public String DoJob(String dinospecies) {
        return "Der Aufseher schaut langsam mit seinem Fernglas umher und überprüft, dass die Besucher nichts verbotenes machen";
    }

    /**
     *
     * @param name
     * @param role
     */
    public Overseer(String name, String role) {
        super(name, role);
    }
}
