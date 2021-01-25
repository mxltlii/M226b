import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {

    public void Start(ArrayList<Cage> cages){
        Scanner scanner = new Scanner(System.in);
        System.out.println("[1] Park betreten (-20$)\n[2] Verlassen");
        int choice = scanner.nextInt();
        if(choice == 2){
            System.exit(0);
        }
        while(choice != 5){
            for (int i = 0; i < cages.size(); i++){
                System.out.println("[" + (i+1) + "] " +cages.get(i).GetSpecies()+ "gehege");

            }
            choice = scanner.nextInt();
            System.out.println(cages.get(choice - 1).WatchDinos());
            System.out.println(cages.get(choice - 1).WatchKeeper());
        }
    }
}
