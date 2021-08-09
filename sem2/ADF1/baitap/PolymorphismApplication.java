
import java.util.Arrays;

public class PolymorphismApplication {
    
    void sort(int [] list){
        Arrays.parallelSort(list);
        System.out.println("Int Array after sort: "+ Arrays.toString(list));

    }
    void sort(String[] names){
        Arrays.parallelSort(names);
        System.out.println("String Array after sort: "+ Arrays.toString(names));

    }
    public static void main(String[] args) {
        PolymorphismApplication polymorphismApplication = new PolymorphismApplication();
        int list[] = {6,3,9,12,50};
        polymorphismApplication.sort(list);

        String[] names = {"Thinh","Hue","Trong"};
        polymorphismApplication.sort(names);
    }
}
