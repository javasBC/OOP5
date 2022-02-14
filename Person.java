public class Person implements IEat,IDrink{
    public String name;
    public int  age;

    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void eat(){
        System.out.println("humans eat with a fork ");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void drink(){
        System.out.println("humans drink coffee ");
    }


}
