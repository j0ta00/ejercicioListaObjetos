package es.iesnervion.juanjomz.ejerciciolistaobjetos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private static Arma hacha=new Arma("hacha",R.drawable.hacha);
    private static Arma espada=new Arma("espada",R.drawable.espada);
    private static Arma escudo=new Arma("escudo",R.drawable.escudo);
    private static final Arma[] items=new Arma[]{hacha,espada,escudo,hacha,espada,escudo,hacha,espada,escudo,hacha,espada,escudo};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView ls=findViewById(R.id.lista);
        ls.setAdapter(new IconAdapter<Arma>(this, R.layout.row, R.id.label, items));


    }public class IconAdapter<T>  extends ArrayAdapter<T> {

        public IconAdapter(Context context, int resource, int textViewResourceId, T[] objects) {
            super(context, resource, textViewResourceId, objects);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent){
            Arma arma=items[position];
            View row=super.getView(position, convertView, parent);
            ImageView icon=(ImageView) row.findViewById(R.id.icon);
            icon.setImageResource(arma.getIdFoto());
            TextView label = (TextView) row.findViewById(R.id.label);
            label.setText(arma.getNombre().toUpperCase(Locale.ROOT));
            return row;
        }
    }

}