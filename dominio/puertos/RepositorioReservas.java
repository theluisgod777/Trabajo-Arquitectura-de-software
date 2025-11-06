package dominio.puertos;

import dominio.modelos.Reserva;
import java.util.List;
import java.util.Optional;

public interface RepositorioReservas {
    Reserva guardar(Reserva reserva);
    Optional<Reserva> obtenerPorId(String id);
    List<Reserva> listarPorRestaurante(String idRestaurante);
    boolean eliminar(String id);
}
