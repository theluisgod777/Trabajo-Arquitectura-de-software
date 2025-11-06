package dominio.puertos;

import dominio.modelos.Restaurante;
import java.util.Optional;

public interface RepositorioRestaurantes {
    Optional<Restaurante> obtenerPorId(String id);
}
