package es.vcarmen.fragment09;

import android.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public class Fragment09 extends FragmentActivity {

    Adaptador paginador;
    ViewPager visor;
    ArrayList<Fragment> listaFragmentos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment09);

        listaFragmentos = new ArrayList<Fragment>();
        listaFragmentos.add(new Fragmento1());
        paginador=new Adaptador(getSupportFragmentManager(),listaFragmentos);
        visor=(ViewPager)findViewById(R.id.viewPager);
        visor.setAdapter(paginador);
    }
}
