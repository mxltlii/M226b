import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zoo {
    Visitor you = new Visitor();

    public void Start(ArrayList<Cage> cages) {
        Scanner scanner = new Scanner(System.in);
        Visitor visitor = new Visitor();
        float balance = visitor.getBalance();
        int choice = 0;
        do {
            System.out.println("[1] Park betreten (-20$)\n[2] Verlassen");
            choice = scanner.nextInt();
            if (choice > 2) {
                System.out.println("Bitte geben Sie eine verfügbare Option ein.");
            }
        } while (choice > 2);
        if (choice == 1) {
            balance = balance - 20.00f;
            System.out.println("Noch verfügbares Geld: " + balance + "$.");
            while (choice != 5) {
                for (int i = 0; i < cages.size(); i++) {
                    System.out.println("[" + (i + 1) + "] " + cages.get(i).GetSpecies() + "gehege");
                }
                choice = scanner.nextInt();
                int whatToDo = 0;
                while (whatToDo != 4) {
                    System.out.println("[1] Zuschauen\n[2] Füttern (-10$)\n[3] Auf den Wärter warten\n[4] Anderes Gehege besuchen\n[5] Park verlassen");
                    whatToDo = scanner.nextInt();

                    switch (whatToDo) {

                        case 1:
                            System.out.println(cages.get(choice - 1).WatchDinos());
                            break;
                        case 2:
                            System.out.println(cages.get(choice - 1).BeFed());
                            break;
                        case 3:
                            System.out.println(cages.get(choice - 1).WatchKeeper());
                            break;
                    }
                }
            }
        }
    }
}