import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        try {
            ArrayList<String> arrList = new ArrayList<>();

            ArrayList<Dinosaur> rexList = new ArrayList<>();
            ArrayList<Dinosaur> raptorList = new ArrayList<>();
            ArrayList<Dinosaur> brontoList = new ArrayList<>();
            ArrayList<Dinosaur> trikeList = new ArrayList<>();
            ArrayList<Dinosaur> diloList = new ArrayList<>();
            ArrayList<ArrayList<Dinosaur>> allDinoList = new ArrayList<>();

            Scanner sc = new Scanner(new File("C:\\Users\\Liam\\Desktop\\Dinodata.txt"));
            sc.useDelimiter(",");
            while (sc.hasNext())
            {
                arrList.add(sc.next());
            }
            for(int i = 0; i < arrList.size() -1; i += 3){
                switch (arrList.get(i)){
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
            allDinoList.add(rexList);
            allDinoList.add(raptorList);
            allDinoList.add(brontoList);
            allDinoList.add(trikeList);
            allDinoList.add(diloList);

            ArrayList<Cage> cageList = new ArrayList<>();


            for (ArrayList<Dinosaur> dinoCageList : allDinoList) {
                cageList.add(new Cage(dinoCageList));
            }

            Zoo zoo = new Zoo();
            zoo.Start(cageList);

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }





    }
}
