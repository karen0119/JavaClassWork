package class17;

public class Food {
    String name="Pasta"; //instance variable

    void printFood(){
        String name="Burgers"; //Java always prefers the local variables
        System.out.println(name); // prints: burgers
        System.out.println(this.name); // prints: pasta (calls for instance variable)
    }

    public static void main(String[] args) {
        Food food=new Food();
        food.printFood();
    }
}
