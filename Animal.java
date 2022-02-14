public abstract class Animal  implements IEat,IDrink{
    //data
    public String name;
    public int age ;


    public Animal(){

    }


    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void makeSound(){
        System.out.println("the animal  making sound ");
    }


    @Override
    public void eat(){
        System.out.println("eating the grass");
    }
    @Override
    public void drink(){
        System.out.println("animals dink water ");
    }

    @Override
    public String toString() {
        return ""+getClass().getName()+"{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
