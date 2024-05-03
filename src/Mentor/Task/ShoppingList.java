package src.Mentor.Task;

import java.util.Arrays;

public class ShoppingList {

    Item[] mehsul;

    public ShoppingList(Item[] mehsul) {
        this.mehsul = mehsul;
    }

    @Override
    public String toString() {
        return "ShoppingList{" +
                "mehsul=" + Arrays.toString(mehsul) +
                '}';
    }
}
