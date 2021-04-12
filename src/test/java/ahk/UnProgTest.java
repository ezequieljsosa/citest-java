package ahk;

import ar.edu.ahk.UnProg;
import org.junit.Assert;
import org.junit.Test;

public class UnProgTest {

    @Test
    public void testHacerAlgo(){
        UnProg up = new UnProg();
        Assert.assertEquals(4,up.hacerAlgo(2));
    }



}
