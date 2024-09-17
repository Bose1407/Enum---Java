package Enum;

enum pizzaSize{
    SMALL(8, 200,90),
    MEDIUM(10, 300,150),
    LARGE(12, 400,300),
    EXTRA_LARGE(16, 600,400);

    private int diameter;
    private int size;
    private int price;

    pizzaSize(int d,int s,int p){
        diameter = d;
        size = s;
        this.price = p;
    }

    int getDiameter(){
        return this.diameter;
    }

    int getSize(){
        return this.size;
    }
    int getPrize(){
        return this.price;
    }

    int priceWithTopings(int noOfTopings){
        int costOfTopings = 20;
        return this.price * (costOfTopings*noOfTopings);
    }

    public static pizzaSize getSizeWithDiameter(int diameter){
        for(pizzaSize size : pizzaSize.values()){
            if(size.getDiameter() == diameter ){
                return size;
            }
        }
        return null;
    }

}

public class Enum{
    public static void main(String[] args) {

        pizzaSize obj = pizzaSize.MEDIUM;

        System.out.println("Size of the Pizza : "+obj.getSize());

        System.out.println("Cost of Pizzas with Toppings :"+obj.priceWithTopings(5));

        System.out.println("Diameter of the Pizza : "+pizzaSize.getSizeWithDiameter(12));
    }
}