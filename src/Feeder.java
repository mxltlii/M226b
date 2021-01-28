public class Feeder extends Keeper implements IDoJob {

    @Override
    public String DoJob(String dinospecies) {
        return "Der Fütterer füttert einen " + dinospecies + ".";
    }

    public Feeder(String name, String role) {
        super(name, role);
    }
}
