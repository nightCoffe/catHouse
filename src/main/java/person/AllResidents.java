package person;

public class AllResidents extends ResidentsCats{
    public static void main(String[] args) {

        ResidentsCats firstCat = new ResidentsCats();
        firstCat.name = "Faster";
        firstCat.age = 5;

        ResidentsCats secondCat = new ResidentsCats();
        secondCat.name = "Slowly";
        secondCat.age = 14;

        ResidentsCats threeCat = new ResidentsCats();
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
