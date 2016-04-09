package it.my.pack.Outarray;

import java.util.List;
import it.my.pack.IinterfaceOut.InterfaceOut;


/**
   The output class for array.
 */
public final class OutArray implements InterfaceOut {

    /**
     * Constructor.
     */
    public OutArray() {
    }


    /**
     * Output array.
     * @param list of T type.
     */
    public  void func(final List<?> list) {       // Function Output
        for (Object l : list) {
            System.out.print("{" + l + "}");
        }
        System.out.println();
    }

}
