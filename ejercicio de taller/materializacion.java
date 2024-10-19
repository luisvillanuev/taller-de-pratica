//Herencia

// Clase base Vehiculo
class Vehiculo {
    public void mover() {
        System.out.println("El vehículo se está moviendo.");
    }
}

// Clase derivada Coche que hereda de Vehiculo
class Coche extends Vehiculo {
    public void tocarBocina() {
        System.out.println("El coche toca la bocina.");
    }
}

////////
//Implementación

// Interfaz Volador
interface Volador {
    void volar();
}

// Clase Avion que implementa Volador
class Avion implements Volador {
    @Override
    public void volar() {
        System.out.println("El avión está volando.");
    }
}

///////
//Dependencia

// Clase Motor
class Motor {
    public void encender() {
        System.out.println("El motor se enciende.");
    }
}

// Clase Auto que depende de Motor
class Auto {
    public void arrancar() {
        Motor motor = new Motor(); // Dependencia
        motor.encender();
        System.out.println("El auto está en marcha.");
    }
}

//////
//Agregación

// Clase Rueda
class Rueda {
    public void girar() {
        System.out.println("La rueda gira.");
    }
}

// Clase Bicicleta que tiene una o más Ruedas
class Bicicleta {
    private Rueda ruedaDelantera;
    private Rueda ruedaTrasera;

    public Bicicleta(Rueda ruedaDelantera, Rueda ruedaTrasera) {
        this.ruedaDelantera = ruedaDelantera;
        this.ruedaTrasera = ruedaTrasera;
    }

    public void mover() {
        ruedaDelantera.girar();
        ruedaTrasera.girar();
        System.out.println("La bicicleta se mueve.");
    }
}

///////
//Composición

// Clase Habitacion
class Habitacion {
    public void limpiar() {
        System.out.println("La habitación se está limpiando.");
    }
}

// Clase Casa que tiene Habitaciones (composición)
class Casa {
    private Habitacion habitacion;

    public Casa() {
        this.habitacion = new Habitacion(); // Casa controla la vida de Habitacion
    }

    public void mantener() {
        habitacion.limpiar();
        System.out.println("La casa está siendo mantenida.");
    }
}

//////
//Asociación

// Clase Profesor
class Profesor {
    private String nombre;
    private Curso curso; // Asociación bidireccional

    public Profesor(String nombre) {
        this.nombre = nombre;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}

// Clase Curso
class Curso {
    private String nombre;
    private Profesor profesor; // Asociación bidireccional

    public Curso(String nombre) {
        this.nombre = nombre;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
}
////////
//Clase Asociación (Relación de Muchos a Muchos)​

// Clase Curso (uno de los extremos de la relación)
class Curso {
    private String nombre;

    public Curso(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

// Clase Estudiante (otro extremo de la relación)
class Estudiante {
    private String nombre;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

// Clase Registro para modelar la relación muchos a muchos entre Curso y Estudiante
class Registro {
    private Estudiante estudiante;
    private Curso curso;

    public Registro(Estudiante estudiante, Curso curso) {
        this.estudiante = estudiante;
        this.curso = curso;
    }

    public void mostrarRegistro() {
        System.out.println(estudiante.getNombre() + " está inscrito en " + curso.getNombre());
    }
}
///////
//Cardinalidad

// Clase Empresa
class Empresa {
    private List<Empleado> empleados = new ArrayList<>();

    public void contratar(Empleado empleado) {
        empleados.add(empleado);
    }

    public void mostrarEmpleados() {
        for (Empleado empleado : empleados) {
            System.out.println(empleado.getNombre());
        }
    }
}

// Clase Empleado
class Empleado {
    private String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}