import java.util.ArrayList;

public class Main {
    public static void main(String args[]){
    Zoo zoo = new Zoo();
    ArrayList<Cage> cageList = ZooManagement.LoadDinos();
    zoo.Start(cageList);
    }
}
