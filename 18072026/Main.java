class Animal{
    public void makeSound(){
        System.out.println("Bark");
    }
}
class Cat extends Animal{
    @Override
    public  void makeSound(){
           System.out.println("Meow....");
           super.makeSound();
    }
}
class Main{
    void main(){
        Cat c = new Cat();
        c.makeSound();
        
    }
}