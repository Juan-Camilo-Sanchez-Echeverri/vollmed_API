package med.voll.api.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.api.models.DatosDireccion;
import med.voll.api.models.Direccion;

public record DatosActualizarMedico(@NotNull Long id, String nombre, String documento, DatosDireccion direccion) {
}
