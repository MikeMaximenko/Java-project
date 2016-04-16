import it.my.pack.Invert.Invert;
//import org.junit.Before;
import it.my.pack.Outarray.OutArray;
import org.junit.Test;
//import sun.applet.Main;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

//import java.io.ByteArrayOutputStream;
//import java.io.PrintStream;



public class MainTest {



    @Test
    public void testInvert() {
        Invert c = new Invert();
        List<Double> list = new LinkedList<Double>();
        list.add(1.0);
        list.add(2.0);
        list.add(3.0);
        c.func(list);
        assertTrue(list.get(0) == 3.0);
    }

    @Test
    public void testOutArray() {
        OutArray c = new OutArray();
        List<Double> list = new LinkedList<Double>();
        list.add(1.0);
        c.func(list);

    }


}
