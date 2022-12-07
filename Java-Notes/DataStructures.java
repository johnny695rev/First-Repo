import java.util.ArrayList;
import java.util.List;

public class DataStructures {
    public static void main(String[] args) {
        List<String> namesList = new ArrayList<>();
        namesList.add("Billy");
        namesList.add("Sally");
        namesList.add(0, "Adam");

        System.out.println(namesList);
    }
}
