public class Feeder extends Keeper implements IDoJob{

    @Override
    public String DoJob(String dinospecies) {
       return "Der Feeder füttert den " + dinospecies;
    }

    public Feeder(String name, String role){
        super("Peter Geizer", "Feeder");

    }
}
