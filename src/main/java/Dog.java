public class Dog extends Animal {

    @Override
    public  void makeSound() {
        System.out.println("vow vow");
    }

    @Override
    public boolean eat(String foodtype) {
        return true;
    }
}


