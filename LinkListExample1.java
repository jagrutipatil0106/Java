import java.util.*;
import javafx.util.Pair;

 class Test {
  
    public static void main(String args[])
    {
        // Creating object of the
        // class linked list
        LinkedList<Pair <String,Integer>> item_price = new LinkedList<Pair <String,Integer>>();

        item_price.add(new Pair <String,Integer> ("Sugar", 90));
        item_price.add(new Pair <String,Integer> ("Mango", 190));

         System.out.println(item_price);

    }
}

