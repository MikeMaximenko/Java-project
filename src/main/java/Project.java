//import it.my.pack.InterfaceInv.InterfaceInv;
//import it.my.pack.Essence.Essence;
import it.my.pack.IinterfaceOut.InterfaceOut;
import it.my.pack.Invert.Invert;
import it.my.pack.Outarray.OutArray;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;

/**
 * Project.
 */
final class Project {

    /**
     Default constructor.
     */
    private Project() {
    }

    /** double value1. */
    private static final Double VALUE1 = 11.1;

    /** double value2. */
    private static final Double VALUE2 = 22.2;


    /**
     * Main project function.
     * @param args of String.
     */
    public static void main(final String[] args) {

        List<Double> list = new LinkedList<Double>(); //Chose type array.

        list.add(VALUE1);
        list.add(VALUE2);
        list.add(VALUE1);
        list.add(VALUE2);
        list.add(VALUE1);


        InterfaceOut out = new OutArray(); //Interface call for output array.
        //InterfaceInv inv - new Invert();

                Scanner sc = new Scanner(System.in);
                try {
                    System.out.println("Input one element array of number :");
                    double a = sc.nextInt();
                    list.add(a);
                } catch (InputMismatchException e) {
                    System.out.println("It's not can be array element");
                } finally {
                    out.func(list);
                    Invert.func(list);
                    out.func(list);
                }




        /*Essence<Double> list2 = new Essence<Double>();
        list2.addList(VALUE1);
        list2.addList(VALUE2);         list2.addList(VALUE2);

        list2.addList(VALUE1);
        list2.showList();

        Invert.func(list2);*/ // why it's doesn't work?
    }

}











