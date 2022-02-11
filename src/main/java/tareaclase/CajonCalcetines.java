package tareaclase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author ajbazan01
 */
public class CajonCalcetines {

    private Random r = new Random();
    //private int numCalcetines = r.nextInt(10) + 10;
    private int numCalcetines = 5;
    private Calcetin[] calArray = new Calcetin[numCalcetines];
    private ArrayList<Calcetin> aux = new ArrayList<>();
    private ArrayList<Calcetin> aux2 = new ArrayList<>();

    public CajonCalcetines() {

        for (int i = 0; i < calArray.length; i++) {

            calArray[i] = new Calcetin();

        }

    }
    
    public CajonCalcetines(int numeroIrrelevante){
        
        
        
        for (int i = 0; i < calArray.length; i++) {

            calArray[i] = new Calcetin();

        }
        
        calArray[0].setColor(ColorCalcetines.NEGRO);
        calArray[0].setTalla(40);
        calArray[1].setColor(ColorCalcetines.NEGRO);
        calArray[1].setTalla(40);
        calArray[2].setColor(ColorCalcetines.GRIS_CLARO);
        calArray[2].setTalla(40);
        calArray[3].setColor(ColorCalcetines.GRIS_CLARO);
        calArray[3].setTalla(40);
        calArray[4].setColor(ColorCalcetines.GRIS_OSCURO);
        calArray[4].setTalla(40);
        
    }

    @Override
    public String toString() {
        return "Calcetines: " + Arrays.toString(calArray);
    }

    public ArrayList<Calcetin> emparejarCalcetines() {

        // ¿Qué necesito para devolver un true si todos los calcetines están emparejados?
        // Necesito que un Calcetin sea comparado con el resto, y si son pareja, sacarlos para no entorpecer
        aux.addAll(Arrays.asList(this.calArray));

        for (Calcetin calArray1 : calArray) {
            for (int j = 0; j < aux.size(); j++) {
                if (calArray1 == aux.get(j)) {
                    System.out.println("Se ha emparejado uno");
                    aux2.add(aux.get(j));
                    aux.remove(j);
                }
            }
        }

        return aux2;
    }

    public Calcetin[] getCalArray() {
        return calArray;
    }

    public ArrayList<Calcetin> getAux() {
        return aux;
    }

    public ArrayList<Calcetin> getAux2() {
        return aux2;
    }
    
    
    

}
