package com.list.noticia.app.appnoticialist.gui;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import com.list.noticia.app.appnoticialist.R;
import com.list.noticia.app.appnoticialist.gui.dominio.Noticia;
import java.util.ArrayList;
import java.util.List;

import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

public class MainActivity extends AppCompatActivity {
    private static Context contexto;
    private ListView listaNoticias;
    private List<Noticia> noticias;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contexto = this;
        listaNoticias = (ListView) findViewById(R.id.lista);
        noticias = new ArrayList<>();


    }

}
