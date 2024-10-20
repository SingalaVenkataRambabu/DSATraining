import java.util.ArrayList;
import java.util.List;

public class PrefixSearch {

    public static void main(String[] args) {

        String[] arr = {"apple", "applet", "bread", "appear" };
        String prefix = "app";

        List<String> result = findPrefixSearch(arr, prefix);
        System.out.println(result);
    }

    private static List<String>findPrefixSearch(String[] arr1, String prefix) {

        List<String> li = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            boolean contains = false;
            if (prefix.charAt(0) == arr1[i].charAt(0)) {
                contains = true;
                for (int k = 1; k < prefix.length(); k++) {
                    if (prefix.charAt(k) != (arr1[i].charAt(k))) {

                        contains = false;
                        break;
                    }
                }
            }
            if (contains) {
                li.add(arr1[i]);
            }
        }
        return li;
    }
}



