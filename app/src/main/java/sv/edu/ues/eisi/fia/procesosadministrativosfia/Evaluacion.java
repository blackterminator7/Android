package sv.edu.ues.eisi.fia.procesosadministrativosfia;

import java.sql.Date;
import java.sql.Time;

class Evaluacion {
    private String idEvaluacion, nombreEva;
    private Date fechaEvaluacion;
    private Time horaEvaluacion;

    public String getIdEvaluacion() {
        return idEvaluacion;
    }

    public void setIdEvaluacion(String idEvaluacion) {
        this.idEvaluacion = idEvaluacion;
    }

    public String getNombreEva() {
        return nombreEva;
    }

    public void setNombreEva(String nombreEva) {
        this.nombreEva = nombreEva;
    }

    public Date getFechaEvaluacion() {
        return fechaEvaluacion;
    }

    public void setFechaEvaluacion(Date fechaEvaluacion) {
        this.fechaEvaluacion = fechaEvaluacion;
    }

    public Time getHoraEvaluacion() {
        return horaEvaluacion;
    }

    public void setHoraEvaluacion(Time horaEvaluacion) {
        this.horaEvaluacion = horaEvaluacion;
    }
}
