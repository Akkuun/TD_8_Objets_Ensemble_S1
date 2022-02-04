import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class TestEE {
    public static void main(String[] args) {
        int[]tab=new int[]{10,6,6,9};
        EE ensemble1=new EE(100,tab);
       ensemble1.toStringEE();
EE ensemble2=new EE(ensemble1);
    }
}
