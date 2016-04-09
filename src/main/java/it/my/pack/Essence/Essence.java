package it.my.pack.Essence;

import java.util.LinkedList;
import java.util.List;

/**
 * Class-essence.
 * @param <T> type function.
 */

public final class Essence<T> {

    /**
     * Constructor.
     */
    public Essence() {
    }

    /**
     * Initialization.
     */
    private List<T> list = new LinkedList<T>(); //T type array

    /**
     * Add element to List.
     * @param tmp of T.
     */
    public void addList(final T tmp) {
        list.add(tmp);
    }

    /**
     * Show List.
     */
    public void showList() {
        for (Object l : list) {
            System.out.print("{" + l + "}");
        }
        System.out.println();
    }
}

