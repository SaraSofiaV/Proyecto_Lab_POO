package model;

public class Equipos {
    private Integer cod_unico;
    private String nombre_eq;
    private String tipo_eq;
    private String lab_pertenece;
    private String estado_act;
    private Double valor_est;
    private Integer semestre_min;
    private String descripcion_tec;
    private Integer acumulado_uso;

    public Equipos(Integer cod_unico, String nombre, String tipo_eq,
                   String lab_pertenece, String estado_act, Double valor_est,
                   Integer semestre_min, String descripcion_tec, Integer acumulado_uso)
            throws IllegalArgumentException {
        //validaciones
        if (cod_unico == null || cod_unico <= 0) {
            throw new IllegalArgumentException("Error, codigo vacio");
        }
        if (nombre == null || nombre_eq.trim().isEmpty()) {
            throw new IllegalArgumentException("Error, nombre vacio");
        }
        if () { //terminar
        }
        if (valor_est==null || valor_est<0){
            throw new IllegalArgumentException("Error, valor nulo o negativo");
        }
        if (semestre_min==null||semestre_min<1){
            throw new IllegalArgumentException("Error, semestre mínimo inválido");
        }

        this.cod_unico=cod_unico;
        this.nombre_eq=nombre;
        this.tipo_eq=tipo_eq;
        this.lab_pertenece=lab_pertenece;
        this.estado_act=estado_act;
        this.valor_est=valor_est;
        this.semestre_min=semestre_min;
        this.descripcion_tec=descripcion_tec;
        this.acumulado_uso=(acumulado_uso != null)? acumulado_uso:0;

    }
}
