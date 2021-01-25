import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// Im ZooManagement werden administrative Dinge getan wie z.B. die Dinos laden und in ihre Gehege einsperren.
public class ZooManagement {
    public static ArrayList<Cage> LoadDinos() {
        try {
            Scanner sc = new Scanner(new File(".\\Data\\Dinodata.txt"));
            sc.useDelimiter(",");

            ArrayList<String> arrList = new ArrayList<>();
            // Platzhalter-Arraylists werden erstellt
            ArrayList<Dinosaur> rexList = new ArrayList<>();
            ArrayList<Dinosaur> raptorList = new ArrayList<>();
            ArrayList<Dinosaur> brontoList = new ArrayList<>();
            ArrayList<Dinosaur> trikeList = new ArrayList<>();
            ArrayList<Dinosaur> diloList = new ArrayList<>();
            ArrayList<ArrayList<Dinosaur>> allDinoList = new ArrayList<>();

            // Das Text-File wird gelesen
            while (sc.hasNext()) {
                arrList.add(sc.next());
            }
            // Die Daten werden je nach Dino-Art in unterschiedliche Arrays aufgeteilt
            for (int i = 0; i < arrList.size() - 1; i += 3) {
                switch (arrList.get(i)) {
                    case "T-Rex":
                        rexList.add(new Dinosaur(arrList.get(i), Integer.parseInt(arrList.get(i + 1)), Boolean.parseBoolean(arrList.get(i + 2))));
                        break;
                    case "Velociraptor":
                        raptorList.add(new Dinosaur(arrList.get(i), Integer.parseInt(arrList.get(i + 1)), Boolean.parseBoolean(arrList.get(i + 2))));
                        break;
                    case "Brontosaurus":
                        brontoList.add(new Dinosaur(arrList.get(i), Integer.parseInt(arrList.get(i + 1)), Boolean.parseBoolean(arrList.get(i + 2))));
                        break;
                    case "Triceratops":
                        trikeList.add(new Dinosaur(arrList.get(i), Integer.parseInt(arrList.get(i + 1)), Boolean.parseBoolean(arrList.get(i + 2))));
                        break;
                    case "Dilophosaurus":
                        diloList.add(new Dinosaur(arrList.get(i), Integer.parseInt(arrList.get(i + 1)), Boolean.parseBoolean(arrList.get(i + 2))));
                        break;
                }
            }

            // Die verschiedenen Dino-Listen werden der Gesamtliste hinzugefügt
            allDinoList.add(rexList);
            allDinoList.add(raptorList);
            allDinoList.add(brontoList);
            allDinoList.add(trikeList);
            allDinoList.add(diloList);

            // Gehege und Wärter werden erstellt
            ArrayList<Cage> cageList = new ArrayList<>();
            ArrayList<Keeper> keeperList  = new ArrayList<>();
            keeperList.add(new Feeder("Peter Geizer", "Fütterer"));
            keeperList.add(new DinoDoctor("Konstantin Dzemaili", "Fütterer"));
            keeperList.add(new Overseer("Bledon Asani", "Fütterer"));


            //Zufällige Wärter werden für jedes Gehege ausgwählt
            Random r = new Random();

            for (ArrayList<Dinosaur> dinoCageList : allDinoList) {
                int random = r.nextInt(3);
                cageList.add(new Cage(dinoCageList, keeperList.get(random)));
            }

            return cageList;

        } catch (FileNotFoundException e) {
            System.out.println("File nicht gefunden");
            e.printStackTrace();
        }
        return null;
    }
}
