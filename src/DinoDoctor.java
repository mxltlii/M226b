public class DinoDoctor extends Keeper implements IDoJob {
    /**
     *
     * @param dinospecies
     * @return
     */
    @Override
    public String DoJob(String dinospecies) {
        return "Der Doktor geht einem " + dinospecies + " und gibt ihm eine Spritze.";
    }

    /**
     *
     * @param name
     * @param role
     */
    public DinoDoctor(String name, String role) {
        super(name, role);

    }
}
