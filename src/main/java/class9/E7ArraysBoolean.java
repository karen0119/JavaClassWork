package class9;

public class E7ArraysBoolean {
    public static void main(String[] args) {

        // Write a loop to count how many values in below array are false

        int counter=0;
        boolean[] flags={true, false, true, false, false, true};

        for (int i = 0; i < flags.length; i++) {
            if (flags[i]==false){ // can be simplified to (!flags[i]) <- means not true
               counter++;

            }
        }
        System.out.println(counter);

    }  // number 3 will print
}
