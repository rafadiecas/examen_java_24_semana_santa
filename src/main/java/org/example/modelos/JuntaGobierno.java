package org.example.modelos;

import lombok.*;
import org.example.enums.CargoJunta;

import java.time.LocalDate;
import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(exclude = {"hermandad","personalJunta"})
@ToString(exclude = {"hermandad", "personalJunta"})
public class JuntaGobierno {
    private  Hermandad hermandad;
    private Map<CargoJunta, Hermano> personalJunta;
    private LocalDate fechaInicioMandato;
    private LocalDate fechaFinMandato;

}
