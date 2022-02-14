public class Cat extends Animal{



    public Cat(){}
    public Cat(String name, int age) {
        super(name, age);
    }


    @Override
    public void makeSound() {
        System.out.println("cats go meow meow ");
    }

    public void happyFeb(){
        System.out.println("finaaaaaaaaally");
    }


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
