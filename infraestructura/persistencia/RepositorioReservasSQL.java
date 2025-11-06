package infraestructura.persistencia;

import dominio.modelos.Reserva;
import dominio.puertos.RepositorioReservas;
import java.util.List;
import java.util.Optional;

public class RepositorioReservasSQL implements RepositorioReservas {

    public RepositorioReservasSQL() {}

    @Override
    public Reserva guardar(Reserva reserva) {
        // Implementación SQL u ORM
        return reserva;
    }

    @Override
    public Optional<Reserva> obtenerPorId(String id) {
        return Optional.empty();
    }

    @Override
    public List<Reserva> listarPorRestaurante(String idRestaurante) {
        return List.of();
    }

    @Override
    public boolean eliminar(String id) {
        return false;
    }
}
