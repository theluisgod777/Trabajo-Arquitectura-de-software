package infraestructura.api;

import dominio.modelos.Restaurante;
import dominio.puertos.RepositorioRestaurantes;
import java.util.Optional;

public class AdaptadorAPIRestaurante implements RepositorioRestaurantes {
    // Adaptador a una API externa de restaurantes
    @Override
    public Optional<Restaurante> obtenerPorId(String id) {
        return Optional.empty();
    }
}
