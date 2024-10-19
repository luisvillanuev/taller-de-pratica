//Clases Abstractas y Métodos Abstractos

// Clase abstracta Animal
abstract class Animal {
    // Método abstracto (sin implementación)
    public abstract void hacerSonido();
}

// Clase Perro que extiende de Animal
class Perro extends Animal {
    // Implementación del método abstracto
    @Override
    public void hacerSonido() {
        System.out.println("Guau");
    }
}

//Interfaces y implements

// Interfaz Nadador
interface Nadador {
    void nadar();
}

// Clase Pez que implementa Nadador
class Pez implements Nadador {
    @Override
    public void nadar() {
        System.out.println("El pez está nadando.");
    }
}

//Uso de extends y implements​

// Clase abstracta Instrumento
abstract class Instrumento {
    public abstract void tocar();
}

// Interfaz Afinable
interface Afinable {
    void afinar();
}

// Clase Guitarra que extiende Instrumento e implementa Afinable
class Guitarra extends Instrumento implements Afinable {
    @Override
    public void tocar() {
        System.out.println("La guitarra está tocando.");
    }

    @Override
    public void afinar() {
        System.out.println("La guitarra está afinada.");
    }
}

////////
//Uso de super y @Override​


// Clase Gato que extiende de Animal

class Animal {
    protected String sonido = "Sonido de animal";

    public void hacerSonido() {
        System.out.println(sonido);
    }
}

// Clase Gato que extiende de Animal
class Gato extends Animal {
    public Gato() {
        super.sonido = "Miau"; // Uso de super para modificar el atributo de la clase padre
    }

    @Override
    public void hacerSonido() {
        super.hacerSonido(); // Llamada al método de la clase padre
        System.out.println("El gato maúlla.");
    }
}
///////
// final y protected​

// Clase final que no puede ser heredada
final class Constante {
    public final int valor = 42; // Variable final que no puede ser modificada

    // Método final que no puede ser sobrescrito
    public final void mostrarValor() {
        System.out.println("Valor: " + valor);
    }
}

// Clase ClasePadre con un método protegido
class ClasePadre {
    protected void metodoProtegido() {
        System.out.println("Este es un método protegido.");
    }
}

// Clase SubClase que hereda de ClasePadre
class SubClase extends ClasePadre {
    public void usarMetodoProtegido() {
        metodoProtegido(); // Acceso al método protegido de la clase padre
    }
}

////////
// Polimorfismo y Sobreescritura de Métodos

// Clase Vehiculo
class Vehiculo {
    public void mover() {
        System.out.println("El vehículo se mueve.");
    }
}

// Clase Avion que sobrescribe mover
class Avion extends Vehiculo {
    @Override
    public void mover() {
        System.out.println("El avión vuela.");
    }
}

// Clase principal
public class HerenciaYInterfaces {
    public static void main(String[] args) {
        Vehiculo v = new Avion(); // Polimorfismo
        v.mover(); // Llama al método mover de la clase Avion
    }
}
