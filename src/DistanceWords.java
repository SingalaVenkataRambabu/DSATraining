public class DistanceWords {


   public static void main(String[] args){
    String input = "the quick the brown quick brown the frog";
    String word1 = "quick";
    String word2 = "frog";

    int distance = findDistance(input, word1, word2);
    System.out.println(distance);
}

    private static int findDistance(String input, String word1, String word2) {
        int distance = Integer.MAX_VALUE;
        String[] str = input.split("//s");

        int ind1 = -1;
        int ind2 = -1;
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals(word1)) {
                ind1 = i;
            } else if (str[i].equals(word2)) {
                ind2 = i;
            }
            if (ind1 != -1 && ind2 != -1) {
                distance = Math.min(distance, Math.abs(ind1 - ind2) - 1);
            }
        }
        if (distance == Integer.MAX_VALUE) {

          return -1;
        }
return distance;

    }
    }





