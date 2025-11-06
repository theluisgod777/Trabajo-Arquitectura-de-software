package aplicacion;

import dominio.modelos.Reserva;
import dominio.puertos.RepositorioReservas;
import dominio.servicios.ManejadorReservas;
import java.util.List;

public class GestorReservas {
    private final ManejadorReservas manejador;
    private final RepositorioReservas repositorio;

    public GestorReservas(ManejadorReservas manejador, RepositorioReservas repositorio) {
        this.manejador = manejador;
        this.repositorio = repositorio;
    }

    public Reserva crearReserva(Reserva r) {
        Reserva creada = manejador.crearReserva(r);
        return repositorio.guardar(creada);
    }

    public boolean cancelarReserva(String id) {
        boolean ok = repositorio.eliminar(id);
        if (ok) manejador.cancelarReserva(id);
        return ok;
    }

    public List<Reserva> listarPorRestaurante(String idRestaurante) {
        return repositorio.listarPorRestaurante(idRestaurante);
    }
}
