package class23;

public class MoveAbleTester {
    public static void main(String[] args) {

       // MoveAble moveAble=new Horse();  <-- cannot access horse class b/c not implemented

        WashAble washAble=new Dog();

        MoveAble[] moveAbles={new Cat(), new Dog()}; // obj of array

        for (MoveAble m: moveAbles){    // enhanced for loop to go through both classes
            m.move();
        }
    }
}
