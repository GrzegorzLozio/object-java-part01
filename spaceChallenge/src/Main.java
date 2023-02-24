import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Item> items = new ArrayList<Item>();

        items= Simulation.loadItem();
        System.out.println(items.get(0).name );
        //System.out.println(items.get(0).weight );
        System.out.println(items.get(1).name );
       //System.out.println(items.get(1).weight );
        System.out.println(items.get(2).name );
       // System.out.println(items.get(2).weight );

    }

}