package sv.edu.ues.eisi.fia.procesosadministrativosfia;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.sql.Date;

public class Evaluacion_insertar extends Activity {
    ControladorBase helper;
    EditText editAsignatura, editCiclo, editTipoEvaluacion, editFecha, editNumero, editEvaluacion;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluacion_insertar);
        helper = new ControladorBase(this);
        editAsignatura = (EditText) findViewById(R.id.editCodasignatura);
        editCiclo = (EditText) findViewById(R.id.editCodciclo);
        editTipoEvaluacion = (EditText) findViewById(R.id.editCodtipoeval);
        editEvaluacion = (EditText) findViewById(R.id.editCodigo);
        editFecha = (EditText) findViewById(R.id.editFechaeval);
        editNumero = (EditText) findViewById(R.id.editNumeval);
    }

    public void insertarEvaluacion(View v){
        String asignatura = editAsignatura.getText().toString();
        String ciclo = editCiclo.getText().toString();
        String tipoEval = editTipoEvaluacion.getText().toString();
        String evaluacion = editEvaluacion.getText().toString();
        Date fecha = Date.valueOf(editFecha.getText().toString());
        Integer numero = Integer.valueOf(editNumero.getText().toString());
        String regInsertados;

        Evaluacion eval = new Evaluacion();
        eval.setCodAsignatura(asignatura);
        eval.setCodCiclo(ciclo);
        eval.setCodTipoEval(tipoEval);
        eval.setIdEvaluacion(evaluacion);
        eval.setFechaEvaluacion(fecha);
        eval.setNumeroEvaluacion(numero);
        helper.abrir();
        regInsertados = helper.insertar(eval);
        helper.cerrar();
        Toast.makeText(this, regInsertados, Toast.LENGTH_SHORT).show();
    }

    public void limpiarTexto(View v){
        editAsignatura.setText("");
        editCiclo.setText("");
        editTipoEvaluacion.setText("");
        editEvaluacion.setText("");
        editFecha.setText("");
        editNumero.setText("");
    }
}
