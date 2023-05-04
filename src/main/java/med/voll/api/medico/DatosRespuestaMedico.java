package med.voll.api.medico;

import med.voll.api.models.DatosDireccion;

public record DatosRespuestaMedico(Long id, String nombre, String email, String telefono, String documento, DatosDireccion direccion){
}
