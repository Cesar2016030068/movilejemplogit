package comvg.example.cursosandroid.micalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText txtNum1;
    EditText txtNum2;
    EditText Res;

    float res;

    Button btnSuma;
    Button btnResta;
    Button btnDivi;
    Button btnMult;
    Button Cerrar;
    Button Limpiar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNum1 = (EditText) findViewById(R.id.txtNum1);
        txtNum2 = (EditText) findViewById(R.id.txtNum2);
        Res = (EditText) findViewById(R.id.Res);

        btnSuma = (Button) findViewById(R.id.btnSuma);
        btnResta = (Button) findViewById(R.id.btnResta);
        btnMult = (Button) findViewById(R.id.btnMult);
        btnDivi = (Button) findViewById(R.id.btnDivi);
        Limpiar = (Button) findViewById(R.id.btnLimpiar);
        Cerrar = (Button) findViewById(R.id.btnCerrar);


        btnSuma.setOnClickListener(this);
        btnResta.setOnClickListener(this);
        btnDivi.setOnClickListener(this);
        btnMult.setOnClickListener(this);
        Limpiar.setOnClickListener(this);
        Cerrar.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        Operaciones obj = new Operaciones();


        if (btnSuma == v){



        }else if (btnResta == v){

        }else if (btnMult == v){

        }else if (btnDivi == v){

        }else if (Limpiar == v){

        }else if (Cerrar == v){

        }

    }
}
