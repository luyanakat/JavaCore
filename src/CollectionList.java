import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionList {
    public static void main(String[] args) {
        List<String> carList = new ArrayList<>(10);
        carList.add("Honda");
        carList.add("Vinfast");
        carList.add("KIA");
        carList.add(3, "Mazda");
        carList.add(4, "Mec");
        carList.add("Altis");

//        System.out.println(carList.get(0));
        carList.set(2, "KIA -> KIA Morning");

        if (carList.contains("Vinfast")) {
            carList.remove("Vinfast");
        }

        Collections.sort(carList);

        for (String carlist : carList) {
            System.out.println(carlist);
        }

    }
}
