package org.example.modelos;

import lombok.*;
import org.example.enums.TipoTitular;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Titular {
    private String nombreCompleto;
    private String apodo;
    private LocalDate fechaCreacion;
    private TipoTitular tipoTitutar;

}
