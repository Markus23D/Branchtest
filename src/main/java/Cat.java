public class Cat extends Animal {

    @Override
    public  void makeSound() {
        System.out.println("miav miav");
    }

    @Override
    public boolean eat(String foodtype) {
        return true;
    }
}
