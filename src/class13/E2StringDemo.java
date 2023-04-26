package class13;

public class E2StringDemo {
    public static void main(String[] args) {
        // String method replace All example

        String str = "njkaSCDFT419#%";

        System.out.println(str.replaceAll("[a-z]", "*"));
        // prints: ****SCDFT419#%
        System.out.println(str.replaceAll("[A-Z]", "#"));
        // prints: njka#####419#%
        System.out.println(str.replaceAll("[0-9]","%"));
        // prints: njkaSCDFT%%%#%
        System.out.println(str.replaceAll("[a-z0-9A-Z]","@"));
        // prints: @@@@@@@@@@@@#%
        System.out.println(str.replaceAll("[a-k]", "*"));
        // prints: n***SCDFT419#%
        System.out.println(str.replaceAll("[#-z]", "*"));
        // prints: **************

        char c='A';
        c++;
        System.out.println(c); // prints B
        for (int i=0; i<10; i++){
            System.out.print(c+++" "); // prints B C D E F G H I J K
        }

    }
}
