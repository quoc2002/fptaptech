import java.util.*;

public class LyricSet {
    private static final String[] lyric = {"you", "say", "it", "best", "when", "you", "say", "nothing", "at", "all"};

    public static void main(String[] args) {
        //Create a set from HashSet that's implemented Set
        Set words = new HashSet();
        //ADD all words to set
        for (String w : lyric)
            words.add(w);

        //Traverse the list
        //NOTICE: set doesn't allow duplicate items
        for (Object o : words)
            System.out.print(o + "");
        System.out.println("\n------------------");
    }

}
