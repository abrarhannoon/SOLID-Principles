package Implement;

public class App {
    public static void main(String[] args) {
        Bird bird=new Bird();
        bird.setFlayable(new Eagle(2));
        bird.setSwimable(new Penguin(3));
        bird.flay();
        bird.swim();
    }
}
