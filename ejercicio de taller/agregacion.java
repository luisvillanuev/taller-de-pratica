//Clase Equipo con Jugadores

// Clase Jugador

class Jugador {
    private String nombre;

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

// Clase Equipo que tiene Jugadores (agregación)
class Equipo {
    private List<Jugador> jugadores;

    // Constructor por defecto
    public Equipo() {
        this.jugadores = new ArrayList<>();
    }

    // Método para agregar un jugador
    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    // Método para buscar un jugador por nombre
    public Jugador buscarJugador(String nombre) {
        return jugadores.stream()
                        .filter(jugador -> jugador.getNombre().equals(nombre))
                        .findFirst()
                        .orElse(null);
    }

    // Método para eliminar un jugador
    public boolean eliminarJugador(Jugador jugador) {
        return jugadores.remove(jugador);
    }

    // Método para eliminar todos los jugadores
    public void eliminarTodosLosJugadores() {
        jugadores.clear();
    }
}


/////////

//Clase Casa con Puerta

// Clase Puerta
class Puerta {
    private String material;

    public Puerta(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
}

// Clase Casa que se compone de una Puerta
class Casa {
    private Puerta puerta;

    // Constructor que recibe una Puerta
    public Casa(Puerta puerta) {
        if (puerta == null) {
            throw new IllegalArgumentException("Una casa no puede existir sin una puerta.");
        }
        this.puerta = puerta;
    }

    // Método para obtener la puerta
    public Puerta obtenerPuerta() {
        return puerta;
    }

    // Método para agregar una nueva puerta
    public void cambiarPuerta(Puerta nuevaPuerta) {
        if (nuevaPuerta == null) {
            throw new IllegalArgumentException("La puerta no puede ser nula.");
        }
        this.puerta = nuevaPuerta;
    }

    // Método para eliminar la puerta (lanzar excepción si se intenta eliminar)
    public void eliminarPuerta() {
        throw new UnsupportedOperationException("No se puede eliminar la puerta. La casa dejaría de existir.");
    }
}

//////

//Clase Matrimonio para modelar relación entre Persona y Evento

// Clase Persona
class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

// Clase Evento
class Evento {
    private String descripcion;

    public Evento(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}

// Clase Matrimonio para modelar la relación muchos a muchos
class Matrimonio {
    private Persona persona;
    private Evento evento;

    public Matrimonio(Persona persona, Evento evento) {
        this.persona = persona;
        this.evento = evento;
    }

    public void mostrarRelacion() {
        System.out.println(persona.getNombre() + " está relacionado con el evento " + evento.getDescripcion());
    }
}