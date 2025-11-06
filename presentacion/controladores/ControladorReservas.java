package presentacion.controladores;

import aplicacion.GestorReservas;
import dominio.modelos.Reserva;
import java.util.List;

public class ControladorReservas {
    private final GestorReservas gestor;

    public ControladorReservas(GestorReservas gestor) {
        this.gestor = gestor;
    }

    // Métodos que manejarían peticiones HTTP (simulados)
    public Reserva crear(Reserva r) { return gestor.crearReserva(r); }
    public boolean eliminar(String id) { return gestor.cancelarReserva(id); }
    public List<Reserva> listar(String idRestaurante) { return gestor.listarPorRestaurante(idRestaurante); }
}
