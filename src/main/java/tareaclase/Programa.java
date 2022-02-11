package tareaclase;

import java.util.Arrays;

/**
 *
 * @author ajbazan01
 */
public class Programa {

    public static void main(String[] args) {

        /*CajonCalcetines cc = new CajonCalcetines();
        
        System.out.println(cc);
        
        cc.emparejarCalcetines(); */
        
        CajonCalcetines cc2 = new CajonCalcetines(1);
        
        System.out.println(cc2);
        
        cc2.emparejarCalcetines();

        System.out.println(cc2.getAux());
        System.out.println(cc2.getAux2());
        System.out.println(Arrays.toString(cc2.getCalArray()));


    }

}
