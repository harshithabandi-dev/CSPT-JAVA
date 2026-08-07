abstract class DemoAB{
    
    abstract public void show();
    public void display(){
        System.out.println("Display Method");
    }
}
class AbsDemo extends DemoAB{
    @Override
    public void show(){
        System.out.println("I am Show from meesho");
    }
    public static void main(String args[]){
        AbsDemo dab = new AbsDemo();
        dab.display();
    }
}