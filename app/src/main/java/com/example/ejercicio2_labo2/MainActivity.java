package com.example.ejercicio2_labo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imagen11,imagen21,imagen31,
    imagen12,imagen22,imagen32,
            imagen13,imagen23,imagen33;

    private int contador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagen11=findViewById(R.id.columna11);
        imagen12=findViewById(R.id.columna12);
        imagen13=findViewById(R.id.columna13);
        imagen21=findViewById(R.id.columna21);
        imagen22=findViewById(R.id.columna22);
        imagen23=findViewById(R.id.columna23);
        imagen31=findViewById(R.id.columna31);
        imagen32=findViewById(R.id.columna32);
        imagen33=findViewById(R.id.columna33);

        imagen11.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                 contador+=1;
                if (contador==1){
                    imagen11.setImageResource(R.mipmap.imagen2);
                }
                else if (contador==2){
                    imagen11.setImageResource(R.mipmap.imagen3);
                }
                else if (contador==3){
                    imagen11.setImageResource(R.mipmap.imagen1);
                    contador=0;
                }

            }
        });
        imagen12.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                contador+=1;
                if (contador==1){
                    imagen12.setImageResource(R.mipmap.imagen2);
                }
                else if (contador==2){
                    imagen12.setImageResource(R.mipmap.imagen3);
                }
                else if (contador==3){
                    imagen12.setImageResource(R.mipmap.imagen1);
                    contador=0;
                }

            }
        });
        imagen13.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                contador+=1;if (contador==1){
                    imagen13.setImageResource(R.mipmap.imagen3);
                }
                else if (contador==2){
                    imagen13.setImageResource(R.mipmap.imagen2);
                }
                else if (contador==3){
                    imagen13.setImageResource(R.mipmap.imagen1);
                    contador=0;
                }

            }
        });
        imagen21.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                contador+=1;
                if (contador==1){
                    imagen21.setImageResource(R.mipmap.imagen1);
                }
                else if (contador==2){
                    imagen21.setImageResource(R.mipmap.imagen3);
                }
                else if (contador==3){
                    imagen21.setImageResource(R.mipmap.imagen2);
                    contador=0;
                }

            }
        });
        imagen22.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                contador+=1;
                if (contador==1){
                    imagen22.setImageResource(R.mipmap.imagen2);
                }
                else if (contador==2){
                    imagen22.setImageResource(R.mipmap.imagen3);
                }
                else if (contador==3){
                    imagen22.setImageResource(R.mipmap.imagen1);
                    contador=0;
                }

            }
        });
        imagen23.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                contador+=1;
                if (contador==1){
                    imagen23.setImageResource(R.mipmap.imagen2);
                }
                else if (contador==2){
                    imagen23.setImageResource(R.mipmap.imagen3);
                }
                else if (contador==3){
                    imagen23.setImageResource(R.mipmap.imagen1);
                    contador=0;
                }

            }
        });
        imagen31.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                contador+=1;
                if (contador==1){
                    imagen31.setImageResource(R.mipmap.imagen2);
                }
                else if (contador==2){
                    imagen31.setImageResource(R.mipmap.imagen3);
                }
                else if (contador==3){
                    imagen31.setImageResource(R.mipmap.imagen1);
                    contador=0;
                }

            }
        });
        imagen32.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                contador+=1;
                if (contador==1){
                    imagen32.setImageResource(R.mipmap.imagen2);
                }
                else if (contador==2){
                    imagen32.setImageResource(R.mipmap.imagen3);
                }
                else if (contador==3){
                    imagen32.setImageResource(R.mipmap.imagen1);
                    contador=0;
                }

            }
        });
        imagen33.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                contador+=1;
                if (contador==1){
                    imagen33.setImageResource(R.mipmap.imagen2);
                }
                else if (contador==2){
                    imagen33.setImageResource(R.mipmap.imagen3);
                }
                else if (contador==3){
                    imagen33.setImageResource(R.mipmap.imagen1);
                    contador=0;
                }
            }
        });





    }
}
