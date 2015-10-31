/**
* Universidad Del Valle de Guatemala
* 29-oct-2015
* Pablo Díaz 13203
*/

package lexerparsergenerator;

import java.util.Objects;

/**
 *
 * @author Pablo
 * @param <T>
 */
public class Produccion<T> {

    private T cabeza;
    private T cuerpo;
    
    public Produccion(){
        
    }

    public Produccion(T cabeza, T cuerpo) {
        this.cabeza = cabeza;
        this.cuerpo = cuerpo;
    }
    
    

    public String getCabeza() {
        return cabeza.toString().trim();
    }

    public void setCabeza(T cabeza) {
        this.cabeza = cabeza;
    }

    public String getCuerpo() {
        return cuerpo.toString().trim();
    }

    public void setCuerpo(T cuerpo) {
        this.cuerpo = cuerpo;
    }

    @Override
    public String toString() {
        return cabeza + " => " + cuerpo;
    }

   
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produccion<?> other = (Produccion<?>) obj;
        if (!Objects.equals(this.cabeza, other.cabeza)) {
            return false;
        }
        if (!Objects.equals(this.cuerpo, other.cuerpo)) {
            return false;
        }
        return true;
    }

  

 
    
    
    
    
}
