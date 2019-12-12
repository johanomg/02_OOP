package Sprint5.Generics.Uppg5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class uppg5a {

    ArrayList<String> ordlista = new ArrayList<>();

    public void skapaLista() throws FileNotFoundException {
        File fil = new File("words.txt");
        Scanner in = new Scanner(new File(String.valueOf(fil)));
        String input;
        while (in.hasNextLine()) {
            String temp = in.nextLine();
            ordlista.add(temp);
        }
    }

    /*
     lägg in dem i en Map där nycklarna är
     varje ords längd och värdena är en lista
     innehållandes orden med den givna längden.
     */
    public Map<Integer, List<String>> mapItUp() {
        return ordlista.stream().collect(Collectors.groupingBy(String::length));
    }


    public static void main(String[] args) throws FileNotFoundException {
        uppg5a upg = new uppg5a();
        upg.skapaLista();
        System.out.println(upg.ordlista.size());
        Map<Integer, List<String>> kannan = upg.mapItUp();
        System.out.println(kannan.size());
        System.out.println(kannan.keySet());


    }
}
