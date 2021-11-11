package com.practica.circulotexto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //creamos una Activity y le asociamos un objeto View, creado en el constructor de la
        //clase DibujaCirculo
        setContentView(new CirculoConTexto(this));
    }

    //clase que hereda de View
    public class CirculoConTexto extends View {

        //constructor. Establece la vista mediante el contexto recibido de la actividad
        //que lo invoca
        public CirculoConTexto(Context context) {
            super(context);
        }

        //sobreescribimos el método onDraw de la clase View, que será el responsable de
        //dibujar la vista mediante un objeto de la clase Canvas que recibe como parámetro
        @Override
        protected void onDraw(Canvas canvas) {
           /*
           //a)
            //instanciamos objeto de la clase Path, que permite definir un trazado a partir
            // de segmentos de línea y curvas. también puede ser utilizado para dibujar un texto
            // sobre el trazado marcado. En este caso , no le pasamos nada al constructor, por tanto
            //estamos creando una ruta vacía
            Path trazo = new Path();

            //Agrega un contorno de círculo cerrado a la ruta. El último parámetro indica que la
            //dirección será contraria a las agujas del reloj
            trazo.addCircle(150, 150, 100, Direction.CCW);

            //creamos un pincel y definimos sus características
            Paint pincel = new Paint();
            pincel.setColor(Color.BLUE);
            pincel.setStrokeWidth(8);
            pincel.setStyle(Style.STROKE);

            //mediante el canvas, dibujamos la ruta, pasándole el trazo y el pincel
            canvas.drawPath(trazo, pincel);

            //redefinimios el pincel
            pincel.setStrokeWidth(1);
            pincel.setStyle(Style.FILL);
            pincel.setTextSize(20);
            pincel.setTypeface(Typeface.SANS_SERIF);

            //dibuja el texto a lo largo de la ruta especificada, con el pincel indicado.
            //el parámetro hOffset establece la distancia a lo largo de la ruta para agregar
            //a la posición inicial del texto. El parámetro vOffset determina la distancia
            //por encima (-) o por debajo (+) (en sentido antihorario) de la ruta para colocar el texto
            canvas.drawTextOnPath("David Andrés Otero", trazo, 10, 40, pincel);

        */

            /*
            //b) MODIFICA EL SENTIDO DEL TEXTO

            Path trazo = new Path();
            trazo.addCircle(150, 150, 100, Direction.CW);

            Paint pincel = new Paint();
            pincel.setColor(Color.BLUE);
            pincel.setStrokeWidth(8);
            pincel.setStyle(Style.STROKE);

            canvas.drawPath(trazo, pincel);

            pincel.setStrokeWidth(1);
            pincel.setStyle(Style.FILL);
            pincel.setTextSize(20);
            pincel.setTypeface(Typeface.SANS_SERIF);

            canvas.drawTextOnPath("David Andrés Otero", trazo, 10, -40, pincel);

            */


            //c) TEXTO POR DENTRO DEL CIRCULO EN SENTIDO HORARIO
            /*
            Path trazo = new Path();
            trazo.addCircle(150, 150, 100, Direction.CW);

            Paint pincel = new Paint();
            pincel.setColor(Color.BLUE);
            pincel.setStrokeWidth(8);
            pincel.setStyle(Style.STROKE);

            canvas.drawPath(trazo, pincel);

            pincel.setStrokeWidth(1);
            pincel.setStyle(Style.FILL);
            pincel.setTextSize(20);
            pincel.setTypeface(Typeface.SANS_SERIF);

            canvas.drawTextOnPath("David Andrés Otero", trazo, 10, 40, pincel);
            */

            // d) TEXTO POR DENTRO DEL CIRCULO EN SENTIDO ANTIHORARIO

            Path trazo = new Path();
            trazo.addCircle(150, 150, 100, Direction.CCW);

            Paint pincel = new Paint();
            pincel.setColor(Color.BLUE);
            pincel.setStrokeWidth(8);
            pincel.setStyle(Style.STROKE);

            canvas.drawPath(trazo, pincel);

            pincel.setStrokeWidth(1);
            pincel.setStyle(Style.FILL);
            pincel.setTextSize(20);
            pincel.setTypeface(Typeface.SANS_SERIF);

            canvas.drawTextOnPath("David Andrés Otero", trazo, 10, -40, pincel);
        }
    }
}



























