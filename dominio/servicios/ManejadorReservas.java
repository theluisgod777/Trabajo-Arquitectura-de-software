package dominio.servicios;

import dominio.modelos.Reserva;
import java.util.List;

public class ManejadorReservas {
    // Lógica de negocio: validar disponibilidad, reglas de reserva, etc.

    public ManejadorReservas() {}

    public Reserva crearReserva(Reserva reserva) {
        // Implementar reglas de dominio aquí
        return reserva;
    }

    public boolean cancelarReserva(String idReserva) {
        return false;
    }

    public List<Reserva> listarReservasPorRestaurante(String idRestaurante) {
        return List.of();
    }
}
