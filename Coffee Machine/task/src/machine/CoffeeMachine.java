package machine;

import java.util.Scanner;

public class CoffeeMachine {
    final static int WATER_NEED = 200;
    final static int MILK_NEED = 50;
    final static int CB_NEED = 15;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.print("> ");
//        int cups = scanner.nextInt();
//        calculatingIngredient(cups);
        run(scanner);
    }

    public static void run(Scanner scanner){
        int water = waterInput(scanner);
        int milk = milkInput(scanner);
        int cb = coffeeBeansInput(scanner);

        calculatingIngredient(scanner,water,milk,cb);



    }


    public static int waterInput(Scanner scanner){
        System.out.println("Write how many ml of water the coffee machine has:");
        System.out.print("> ");
        int water = scanner.nextInt();
        return water;
    }
    public static int milkInput(Scanner scanner){
        System.out.println("Write how many ml of milk the coffee machine has: ");
        System.out.print("> ");
        int milk = scanner.nextInt();
        return milk;
    }
    public static int coffeeBeansInput(Scanner scanner){
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        System.out.print("> ");
        int grams = scanner.nextInt();
        return grams;
    }

    public static void calculatingIngredient(Scanner scanner, int waterResource, int milkResource, int coffeeBeanResource){
        int cups;
        System.out.println("Write how many cups of coffee you will need:");
        System.out.print("> ");
        cups = scanner.nextInt();
        int waterNeed = cups * WATER_NEED;
        int milkNeed = cups * MILK_NEED;
        int coffeeBeansNeed = cups * CB_NEED;

        if(waterResource >= waterNeed && milkResource >= milkNeed && coffeeBeanResource >= coffeeBeansNeed){
            // đủ nguyên liệu
            enoughIngredient(waterResource,milkResource,coffeeBeanResource,cups);
        }else{
            // không đủ nguyên liệu
            notEnoughIngredient(waterResource,milkResource,coffeeBeanResource);
        }



    }
    public static void enoughIngredient(int water, int milk ,int coffBeans, int cups){
        int waterNeed = cups * WATER_NEED;
        int milkNeed = cups * MILK_NEED;
        int cbNeed = cups * CB_NEED;

        if((water - waterNeed >= WATER_NEED) && (milk - milkNeed >= MILK_NEED) && (coffBeans - cbNeed >= CB_NEED)){
            // more cups
            enoughForMoreCups(water - waterNeed, milk - milkNeed, coffBeans - cbNeed);
        }else{
            System.out.println("Yes, I can make that amount of coffee");
        }
    }
    public static void enoughForMoreCups(int waterLeft, int milkLeft, int cbLeft){
        int _water = waterLeft;
        int _milk = milkLeft;
        int _cb = cbLeft;

        int count = 0;
        boolean notStop = true;

        while(notStop){
            if(_water >= WATER_NEED && _milk >= MILK_NEED && _cb >= CB_NEED){
                _water = _water - WATER_NEED;
                _milk = _milk - MILK_NEED;
                _cb  = _cb - CB_NEED;
                notStop = true;
                count = count + 1;
            }else{
                notStop = false;
            }
        }
        System.out.println("Yes, I can make that amount of coffee (and even " + count + " more than that)");
    }
    public static void notEnoughIngredient(int water, int milk, int coffeeBeans){
        int _water = water;
        int _milk = milk;
        int _cb = coffeeBeans;
        int count = 0;

        boolean notStop = true;
        while(notStop){
            if(_water >= WATER_NEED && _milk >= MILK_NEED && _cb >= CB_NEED){
                _water = _water - WATER_NEED;
                _milk = _milk - MILK_NEED;
                _cb  = _cb - CB_NEED;
                notStop = true;
                count = count + 1;
            }else{
                notStop = false;
            }
        }
        System.out.println("No, I can make only " + count + " cup(s) of coffee");

    }

}
