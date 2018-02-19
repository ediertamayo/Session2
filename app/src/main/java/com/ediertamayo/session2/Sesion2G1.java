package com.ediertamayo.session2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class Sesion2G1 extends AppCompatActivity {

    EditText eCorreo, eNombre;
    //Button bGuardar;
    String nombre, correo,data="";
    CheckBox cNadar,cCine,cGym;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sesion2_g1);

        eCorreo=findViewById(R.id.eCorreo);
        eNombre=findViewById(R.id.eNombre);
        cCine=findViewById(R.id.cCine);
        cNadar=findViewById(R.id.cNadar);
        cGym=findViewById(R.id.cGym);
        /*bGuardar=findViewById(R.id.bGuardar);

        bGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nombre=eNombre.getText().toString();
                eCorreo.setText(nombre);
            }
        });*/
    }

    public void guardar(View view) {
        int id=view.getId();

        if(id==R.id.bGuardar){
            data=data+eNombre.getText().toString();
            eCorreo.setText(data);
        }
        //Para utilizar 1 unico metodo y saber cual boton fue presionado
    }

    public void onRadioButtonClicked(View view) {
        int id=view.getId();

        if(id==R.id.rMasculino){
            data=data+"Sexo:Masculino--->";
        }else{
            data=data+"Sexo:Femenino";
        }
    }
//Comentario de prueba
    public void oncCheckBoxClicked(View view) {
        int id=view.getId();

        switch(id){
            case R.id.cCine:
                if(cCine.isChecked()){
                    data=data+cCine;
                }
        }
    }
}
