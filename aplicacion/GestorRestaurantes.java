package aplicacion;

import dominio.modelos.Restaurante;
import dominio.puertos.RepositorioRestaurantes;
import java.util.Optional;

public class GestorRestaurantes {
    private final RepositorioRestaurantes repo;

    public GestorRestaurantes(RepositorioRestaurantes repo) {
        this.repo = repo;
    }

    public Optional<Restaurante> obtener(String id) {
        return repo.obtenerPorId(id);
    }
}
