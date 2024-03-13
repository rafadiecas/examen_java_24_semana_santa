package org.example.modelos;

import lombok.*;
import org.example.enums.DiaSalida;
import org.example.enums.TipoCuota;

import java.time.LocalTime;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(exclude = {"hermanos", "juntaGobierno"})
@ToString(exclude = {"hermanos", "juntaGobierno"})
public class Hermandad {
    private String nombreCompleto;
    private String nombreCorto;
    private List<Hermano> hermanos;
    private Double cuotaHermano;
    private TipoCuota tipoCuota;
    private JuntaGobierno juntaGobierno;
    private String sedeCanonica;
    private DiaSalida diaSalida;
    private LocalTime horaSalida;
    private LocalTime horaLlegada;

}
