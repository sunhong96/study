package source;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList_lotto{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 45; i++) {
            list.add(i);
        }

        Collections.shuffle(list);

        int pick[] = new int[6];
        for (int i = 0; i < 6; i++) {
            pick[i] = list.get(i);
        }
        System.out.println(Arrays.toString(pick));
    }
}
