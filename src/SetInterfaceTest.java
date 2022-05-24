import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterfaceTest {
    public static void main(String[] args) {
        Set<Integer> hashsetInteger = new HashSet<>();
        hashsetInteger.add(2);
        hashsetInteger.add(7);
        hashsetInteger.add(5);
        
        for (int hashSetCount: hashsetInteger) {
            System.out.println(hashSetCount);
        }
        
        Set<Integer> treesetInteger= new TreeSet<>();
        treesetInteger.add(2);
        treesetInteger.add(7);
        treesetInteger.add(5);
        
        for (int treeSetCount: treesetInteger) {
            System.out.println(treeSetCount);
        }
    }
}
