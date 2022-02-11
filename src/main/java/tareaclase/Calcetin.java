
package tareaclase;

import java.util.Objects;
import java.util.Random;

/**
 *
 * @author ajbazan01
 */
public class Calcetin {

    private int talla;
    private ColorCalcetines color;

    private Random r = new Random();

    public Calcetin() {

        this.talla = r.nextInt(3) + 40;
        
        int ramColor = r.nextInt(3);
        
        switch(ramColor){
            case 0:
                this.color = ColorCalcetines.NEGRO;
                break;
            case 1:
                this.color = ColorCalcetines.GRIS_CLARO;
                break;
            case 2:
                this.color = ColorCalcetines.GRIS_OSCURO;
                break;
        } 

    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public ColorCalcetines getColor() {
        return color;
    }

    public void setColor(ColorCalcetines color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "\n[Talla:" + talla + " Color: " + color + "]";
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.talla;
        hash = 53 * hash + Objects.hashCode(this.color);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Calcetin other = (Calcetin) obj;
        if (this.talla != other.talla) {
            return false;
        }
        return this.color == other.color;
    }
    
    

}
