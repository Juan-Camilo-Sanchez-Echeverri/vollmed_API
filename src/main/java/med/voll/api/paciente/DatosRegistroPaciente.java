package med.voll.api.paciente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.models.DatosDireccion;

public record DatosRegistroPaciente(@NotBlank
                                    String nombre,
                                    @NotBlank @Email
                                    String email,
                                    @NotBlank
                                    String telefono,
                                    @NotBlank
                                    @Pattern(regexp = "\\d{7,14}")
                                    String documento,
                                    @NotNull
                                    @Valid
                                    DatosDireccion direccion) {
}
