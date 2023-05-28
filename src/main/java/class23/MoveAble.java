package class23;

// Interface class example
public interface MoveAble {  // 1st interface

    // it is like public static final int age
    int age=12;
    void move();

    }
    interface WashAble{  // 2nd interface
    void wash();
    }

    class Dog implements MoveAble,WashAble{

        public void move() {System.out.println("Dogs can ...");}
        @Override
        public void wash() {
            System.out.println("You can was me");
          }
      }


    class Cat implements MoveAble{
        @Override
        public void move() {
            System.out.println("Cats can also move");
        }
    }
class Horse{
    public void move(){
        System.out.println("Horses can also move");
    }
}
