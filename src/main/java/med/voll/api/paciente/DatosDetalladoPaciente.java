package med.voll.api.paciente;

import med.voll.api.models.Direccion;
import med.voll.api.models.Paciente;

public record DatosDetalladoPaciente(String nombre, String email, String telefono, String documento, Direccion direccion) {
    public DatosDetalladoPaciente(Paciente paciente) {
        this(paciente.getNombre(), paciente.getEmail(), paciente.getTelefono(), paciente.getDocumento(), paciente.getDireccion());
    }
}
