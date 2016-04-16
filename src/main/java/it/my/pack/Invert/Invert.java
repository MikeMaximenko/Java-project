package it.my.pack.Invert;

//import it.my.pack.InterfaceInv.InterfaceInv;
//import it.my.pack.IinterfaceOut.InterfaceOut;


import java.util.List;



/**
 * The inversion class arrays of <T> type.
 */

public final class  Invert {

    /**
     Default constructor.
     */
    public Invert() {
    }

    /**
     * Invert input arrays.
     * @param <T> of chose type.
     * @param list of T type.
     * @throws Throwable of ?.
     */


    public static  <T> void  func(final List<T> list) {      // Invert function
        T tmp1; T tmp2;
        int i;
        int k = list.size() - 1;

        for (i = 0; i < list.size() / 2; i++) {
            tmp1 = list.get(i);
            tmp2 = list.get(k - i);
            list.set(i, tmp2);
            list.set(k - i, tmp1);
        }
    }

}
