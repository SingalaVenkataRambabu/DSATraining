import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTraingleTest {

    public static void main(String[] args){

        int numRows = 6;

        preRows(numRows);

    }

    public static int[] preRows(int numRows) {
        int[] result = { 1 };

        for (int i = 1; i < numRows; i++) {
            System.out.println(Arrays.toString(result));
            result= nextRow(result);
        }
        System.out.println(Arrays.toString(result));
        return result;
    }

    public static int[] nextRow(int[] prevRow) {
        int[] result = new int[prevRow.length + 1];
        for (int i = 0; i < result.length; i++) {
            if (i == 0) {
                result[i] = prevRow[0];
            } else if (i == result.length - 1) {
                result[i] = prevRow[prevRow.length - 1];
            } else {
                result[i] = prevRow[i - 1] + prevRow[i];
            }
        }
        return result;
    }
}


