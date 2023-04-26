package class12;

public class E12StringDemo {
    public static void main(String[] args) {

        // SubString is used to get a part of the complete sentence

        String sentence = "Yup we have another class";
        System.out.println(sentence.substring(12)); //prints: another class
        System.out.println(sentence.substring(4,11)); //prints: we have
        System.out.println(sentence.substring(12,19)); //prints: another

        //Print the last 4 letters only
        int startIndex=sentence.length()-4;
        System.out.println(sentence.substring(startIndex)); //prints lass

    }
}