package med.voll.api.medico;

import med.voll.api.models.Medico;

public record DatosListadoMedico(String nombre, String especialidad, String documento, String email) {

    public DatosListadoMedico(Medico medico){
        this(medico.getNombre(),medico.getEspecialidad().toString(),medico.getDocumento(),medico.getEmail());
    }
}
