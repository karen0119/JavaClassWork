package class16;

public class Task1 {

    int sumArray(int [] arr){
        int sum=0;
        for (int num:arr){
            sum=sum+num;
        }
        return sum;
    }

    public static void main(String[] args) {
        Task1 task1=new Task1();
        int results=task1.sumArray(new int []{10,10,10});
        System.out.println(results); // prints:30
    }
}
