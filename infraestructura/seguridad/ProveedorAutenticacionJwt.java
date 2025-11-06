package infraestructura.seguridad;

import dominio.puertos.ServicioAutenticacion;

public class ProveedorAutenticacionJwt implements ServicioAutenticacion {
    public ProveedorAutenticacionJwt() {}

    @Override
    public boolean validarToken(String token) {
        // Validar firma, expiración, claims
        return false;
    }

    @Override
    public String obtenerUsuarioDesdeToken(String token) {
        return null;
    }
}
