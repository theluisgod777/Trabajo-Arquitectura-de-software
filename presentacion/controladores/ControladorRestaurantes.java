package presentacion.controladores;

import aplicacion.GestorRestaurantes;
import dominio.modelos.Restaurante;
import java.util.Optional;

public class ControladorRestaurantes {
    private final GestorRestaurantes gestor;
    public ControladorRestaurantes(GestorRestaurantes g) { this.gestor = g; }
    public Optional<Restaurante> obtener(String id) { return gestor.obtener(id); }
}
