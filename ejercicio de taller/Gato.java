
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


