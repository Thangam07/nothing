import java.util.ArrayList;
import java.util.Iterator;
  public class ArrList1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Dhoni");
        names.add("Virat");
        names.add("Rohit");
        names.add(null);
        System.out.println(names);

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
