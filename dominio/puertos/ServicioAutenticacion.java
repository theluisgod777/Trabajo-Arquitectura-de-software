package dominio.puertos;

public interface ServicioAutenticacion {
    boolean validarToken(String token);
    String obtenerUsuarioDesdeToken(String token);
}
