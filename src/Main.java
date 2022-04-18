import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int action;
        Cat[] allCats = new Cat[4];
        allCats[0] = new Cat("Стичь", 5, false);
        allCats[1] = new Cat("Балу", 30, false);
        allCats[2] = new Cat("Барсик", 10, false);
        allCats[3] = new Cat("Моня", 45, false);


        Plate plate = new Plate(50);
        plate.info();
        for (int i = 0; i < allCats.length; i++) {
            if (allCats[i].fullness == false && allCats[i].appetite < plate.food){
                allCats[i].eat(plate);
                allCats[i].fullness = true;
                System.out.println("Котик " + allCats[i].name + " сыт");
            } else {
                System.out.println("Котик " + allCats[i].name + " еще");
            }
        }
        plate.info();
        System.out.println("Сколько корма вы хотите добавить?");
        action = sc.nextInt();
        plate.increaseFood(action);
        plate.info();

    }
}

