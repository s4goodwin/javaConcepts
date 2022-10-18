import java.util.ArrayList;

public class forEachLoop {

    //https://www.youtube.com/watch?v=t8mmNbgKA8w

    public static void main(String[] args) {
        /*String [] cars = {"escape", "fusion", "explorer"};
        for (int i = 0; i < cars.length; i++){                  //for loop
            System.out.println(cars[i]);
        }
        for (String car : cars){                                //for each loop
            System.out.println(car);
        }*/

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(3);
        numbers.add(7);
        numbers.add(2);

        for (int a : numbers){
            System.out.println(a);
        }
        for (int i = 0; i< numbers.size(); i++){
            System.out.println(numbers.get(i));
        }
    }
}
