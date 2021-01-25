public class DinoDoctor extends Keeper implements IDoJob{

    @Override
    public String DoJob(String dinospecies) {
        return "Der Doktor geht zum " + dinospecies + " und gibt ihm eine Spritze.";
    }

    public DinoDoctor(String name, String role){
        super(name, role);

    }
}
