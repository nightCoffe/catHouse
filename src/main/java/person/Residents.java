package person;

public class Residents {
    public static void main(String[] args) {

        Cat firstCat = new Cat();
        firstCat.name = "Faster";
        firstCat.age = 5;

        Cat secondCat = new Cat();
        secondCat.name = "Slowly";
        secondCat.age = 14;

        Cat threeCat = new Cat();
        threeCat.name = "Crazy";
        threeCat.age = 2;

        firstCat.sayHello();
        secondCat.sayHello();
        threeCat.sayHello();

        firstCat.goFunDrinkALot();
        secondCat.printDrinkToDeath();
        threeCat.printDrinkMilkWithMeat();

        firstCat.sayGoodbye();
        secondCat.sayGoodbye();
        threeCat.sayGoodbye();
    }
}
