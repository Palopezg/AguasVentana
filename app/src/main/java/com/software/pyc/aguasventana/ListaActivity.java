package com.software.pyc.aguasventana;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import Class.CargaMedida;
import Class.SessionManager;
import Class.CargaMedida.OnSimpleDialogListener;
import Class.MedidaAdapter;
import Class.Medida;
import Class.ConsultaMedida;


import Data.MedidaContract;
import OpenHelper.Medida_OpenHelper;

public class ListaActivity extends AppCompatActivity implements OnSimpleDialogListener {

    ListView listViewMedidas;
    ArrayAdapter<String> arrayAdapter;
    Toolbar toolbar;

    static MedidaAdapter medidaAdapter;
    static List<Medida> listMedida;
    static Cursor c;
    static String rutaSeleccionada;
    static String opcion="general";
    //static String opcionBusqueda="Nombre";
    static String opcionBusqueda;
    static String opcionBusquedaAux;


    ConsultaMedida consulta = new ConsultaMedida();

    Medida_OpenHelper medidaOpenHelper = new Medida_OpenHelper(this);
    static int posicionList =5;



    public void actualizarDatos(){

//        switch (opcion ){
//            case "ruta":
//                c = medidaOpenHelper.getRutaMedidas(rutaSeleccionada, orderBy,opcionBusqueda);
//                break;
//            case "general":
//                c = medidaOpenHelper.getAllMedidas(orderBy,opcionBusqueda);
//                break;
//        }
//      c = medidaOpenHelper.getRutaMedidas(rutaSeleccionada, orderBy, opcionBusqueda);


        c = medidaOpenHelper.getAllMedidas(consulta.getOrderBy(),consulta.getWhere());
        listMedida = medidaOpenHelper.getListaMedidas(c);

        medidaAdapter = new MedidaAdapter(getApplicationContext(), listMedida);
        listViewMedidas.setAdapter(medidaAdapter);

        medidaAdapter.notifyDataSetChanged();

        listViewMedidas.setSelection(posicionList);

    }
    @Override
    public void onPossitiveButtonClick() {
        //medidaAdapter = new MedidaAdapter(getApplicationContext(), medidaOpenHelper.getListaMedidas(medidaOpenHelper.getAllMedidas(orderBy)));
        Toast.makeText(getApplicationContext(),"OnClickListener" ,Toast.LENGTH_SHORT).show();
        //medidaAdapter.notifyDataSetChanged();
        //listMedida = medidaOpenHelper.getListaMedidas(medidaOpenHelper.getAllMedidas());
        actualizarDatos();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        toolbar = (Toolbar) findViewById(R.id.toolbarPrincipal);
        setSupportActionBar(toolbar);
        //setTitle("Titulo");


        SessionManager sessionManager = new SessionManager(getApplicationContext());



        listViewMedidas = (ListView)findViewById(R.id.lvMedidas);

        final Button logOut = (Button)findViewById(R.id.btnLogOut);
        TextView user = (TextView)findViewById(R.id.tvUser);
        user.setText(sessionManager.getUser());

//Ordenamientos
        TextView orderByOrden = (TextView)findViewById(R.id.lvOrden);
        TextView orderByCodigo = (TextView)findViewById(R.id.lvCodigo);
        TextView orderByNombre = (TextView)findViewById(R.id.lvNombre);
        TextView orderByMedidor = (TextView)findViewById(R.id.lvMedidor);
        TextView orderByPartida = (TextView)findViewById(R.id.lvPartida);
        TextView orderByAnt = (TextView)findViewById(R.id.lvAnt);
        TextView orderByAct = (TextView)findViewById(R.id.lvAct);

        orderByOrden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (consulta.getOrderByMetodo().equalsIgnoreCase("desc")){
                    consulta.setOrderByMetodo("asc");
                }else{
                    consulta.setOrderByMetodo("desc");
                };

                consulta.setOrderBy(MedidaContract.MedidaEntry.ORDEN);
                posicionList=0;
                actualizarDatos();
            }
        });
        orderByCodigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (consulta.getOrderByMetodo().equalsIgnoreCase("desc")){
                    consulta.setOrderByMetodo("asc");
                }else{
                    consulta.setOrderByMetodo("desc");
                };

                consulta.setOrderBy(MedidaContract.MedidaEntry.CODIGO);
                posicionList=0;
                actualizarDatos();
            }
        });
        orderByNombre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (consulta.getOrderByMetodo().equalsIgnoreCase("desc")){
                    consulta.setOrderByMetodo("asc");
                }else{
                    consulta.setOrderByMetodo("desc");
                };

                consulta.setOrderBy(MedidaContract.MedidaEntry.NOMBRE);
                posicionList=0;
                actualizarDatos();
            }
        });
        orderByMedidor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (consulta.getOrderByMetodo().equalsIgnoreCase("desc")){
                    consulta.setOrderByMetodo("asc");
                }else{
                    consulta.setOrderByMetodo("desc");
                };

                consulta.setOrderBy(MedidaContract.MedidaEntry.MEDIDOR);
                posicionList=0;
                actualizarDatos();
            }
        });
        orderByPartida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (consulta.getOrderByMetodo().equalsIgnoreCase("desc")){
                    consulta.setOrderByMetodo("asc");
                }else{
                    consulta.setOrderByMetodo("desc");
                };

                consulta.setOrderBy(MedidaContract.MedidaEntry.PARTIDA);
                posicionList=0;
                actualizarDatos();
            }
        });
        orderByAnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (consulta.getOrderByMetodo().equalsIgnoreCase("desc")){
                    consulta.setOrderByMetodo("asc");
                }else{
                    consulta.setOrderByMetodo("desc");
                };

                consulta.setOrderBy(MedidaContract.MedidaEntry.EST_ANTERIOR);
                posicionList=0;
                actualizarDatos();
            }
        });
        orderByAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (consulta.getOrderByMetodo().equalsIgnoreCase("desc")){
                    consulta.setOrderByMetodo("asc");
                }else{
                    consulta.setOrderByMetodo("desc");
                };

                consulta.setOrderBy(MedidaContract.MedidaEntry.EST_ACTUAL);
                posicionList=0;
                actualizarDatos();
            }
        });

        logOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logOut();
            }
        });

        actualizarDatos();

        //Implementacion del spinner ruta
        Spinner spinner = (Spinner) findViewById(R.id.spRuta);
        String[] ruta_spinner = {"1","2","3","4"};

        spinner.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, ruta_spinner));

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long id)

            {


                rutaSeleccionada = MedidaContract.MedidaEntry.RUTA+"="+String.valueOf(adapterView.getItemAtPosition(pos));
                //opcion="ruta";

                consulta.setRuta(rutaSeleccionada);
                actualizarDatos();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {    }
        });


        //Implementacion del spinner busqueda
        Button btnBusqueda = (Button)findViewById(R.id.btnBusqueda);
        Spinner spinnerBusqueda = (Spinner) findViewById(R.id.spBusqueda);
        final EditText etbusqueda = (EditText)findViewById(R.id.etBusqueda2);

        String[] busqueda_spinner = {"Nombre","Partida","Medidor"};

        spinnerBusqueda.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, busqueda_spinner));

        spinnerBusqueda.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long id)

            {

                String busquedaSeleccionada = String.valueOf(adapterView.getItemAtPosition(pos));

                switch (busquedaSeleccionada){
                    case "Nombre":
                        busquedaSeleccionada = MedidaContract.MedidaEntry.NOMBRE;
                        break;
                    case "Partida":
                        busquedaSeleccionada = MedidaContract.MedidaEntry.PARTIDA;
                        break;
                    case "Medidor":
                        busquedaSeleccionada = MedidaContract.MedidaEntry.MEDIDOR;
                        break;
                }

                opcionBusquedaAux=busquedaSeleccionada;


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {    }
        });


        btnBusqueda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String busquedaValor = etbusqueda.getText().toString();

                opcionBusqueda=opcionBusquedaAux+" like '%"+busquedaValor+"%'";
                consulta.addWhereAnd(opcionBusqueda);
                actualizarDatos();

            }
        });



        // Eventos
        listViewMedidas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                posicionList=listViewMedidas.getFirstVisiblePosition();

                Medida currentMedida = medidaAdapter.getItem(position);
                //Toast.makeText(getApplicationContext(),"headerCount: \n" + currentMedida.getNombre(),Toast.LENGTH_SHORT).show();

                CargaMedida d = new CargaMedida();
                d.Carga(currentMedida);
                d.show(getFragmentManager(),"");


            }
        });
    }

    private void logOut(){
        SessionManager sessionManager = new SessionManager(getApplicationContext());
        sessionManager.logoutUser();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.logoutMenu:{
                logOut();

            }
        }

        return super.onOptionsItemSelected(item);
    }
}
