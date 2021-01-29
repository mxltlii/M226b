public class Feeder extends Keeper implements IDoJob {
    /**
     *
     * @param dinospecies
     * @return
     */
    @Override
    public String DoJob(String dinospecies) {
        return "Der Fütterer füttert einen " + dinospecies + ".";
    }

    /**
     *
     * @param name
     * @param role
     */
    public Feeder(String name, String role) {
        super(name, role);
    }
}
