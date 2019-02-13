package mycput.ac.za;

import org.junit.Assert;
import org.junit.Test;

public class Comparator {
    @Test
    public void verify()

    {
        Controlor controlor = new Controlor();
        Assert.assertEquals("ESPOIR",controlor.compair());
    }
}
