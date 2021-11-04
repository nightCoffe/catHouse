package person;

public class Cat {
    String name;
    int age;

    public void sayHello() {
        System.out.println("Hello, my name is " + this.name + " and I'm " + this.age);
    }

    public void goFunDrinkALot() {
        System.out.println("Let's go drink beer!");
    }

    public void printDrinkToDeath() {
        System.out.println("Let's go drink vodka!!!!");
    }

    public void printDrinkMilkWithMeat() {
        System.out.println("Let's go drink milk and eat meet!");
    }

    public void sayGoodbye() {
        System.out.println("Bye bye! See You later!");
    }

    public void takeBirthday() {
        if (age == age + 1) {
            System.out.println("Yahooo, start party! Happy birthday my friend!");
        } else {
            System.out.println("It's mistake!");
        }
    }
}
