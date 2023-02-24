import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {
    public static ArrayList<Item> loadItem() throws Exception {
        ArrayList<Item> itemArrayList = new ArrayList<Item>();
        File file = new File("Item.txt");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
                Item readItem = new Item();
                String line = scanner.nextLine();
                readItem.name = line.substring(0, line.indexOf('='));
                readItem.weight = Integer.parseInt(line.substring(line.indexOf('=') + 1));
                itemArrayList.add(readItem);
        }
        return itemArrayList;
    }
    public static void loadU1(ArrayList<Item> Items){

    }
}
