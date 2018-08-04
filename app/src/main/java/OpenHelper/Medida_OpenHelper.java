package OpenHelper;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Class.Medida;

import Data.MedidaContract;

/**
 * Created by pablo on 15/7/2018.
 */

public class Medida_OpenHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Aguas.db";

    public Medida_OpenHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        // Creacion de la tabla
        db.execSQL("CREATE TABLE " + MedidaContract.MedidaEntry.TABLE_NAME + " ("
                + MedidaContract.MedidaEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + MedidaContract.MedidaEntry.RUTA + " TEXT NOT NULL,"
                + MedidaContract.MedidaEntry.ORDEN + " TEXT NOT NULL,"
                + MedidaContract.MedidaEntry.CODIGO + " TEXT NOT NULL,"
                + MedidaContract.MedidaEntry.NOMBRE + " TEXT NOT NULL,"
                + MedidaContract.MedidaEntry.MEDIDOR + " TEXT,"
                + MedidaContract.MedidaEntry.PARTIDA + " TEXT NOT NULL,"
                + MedidaContract.MedidaEntry.EST_ANTERIOR + " TEXT NOT NULL,"
                + MedidaContract.MedidaEntry.EST_ACTUAL + " TEXT NOT NULL,"
                + MedidaContract.MedidaEntry.FECH_ACT + " TEXT NOT NULL,"
                + MedidaContract.MedidaEntry.ACTUALIZADO + " TEXT NOT NULL,"
                + MedidaContract.MedidaEntry.USUARIO + " TEXT)");


        //Agregar Valores
        mockData(db);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    private void mockData(SQLiteDatabase sqLiteDatabase) {
        mockMedida(sqLiteDatabase, new Medida("1","1","10","411","Pablo","511","3035","600","","","FALSE",""     ));
        mockMedida(sqLiteDatabase, new Medida("2","1","11","411","Cristian","512","3036","601","","","FALSE",""  ));
        mockMedida(sqLiteDatabase, new Medida("3","1","12","411","Vero","513","3037","602","","","FALSE",""      ));
        mockMedida(sqLiteDatabase, new Medida("4","1","13","411","Nico","514","3038","603","","","FALSE",""      ));
        mockMedida(sqLiteDatabase, new Medida("5","1","14","411","German","515","3039","604","","","FALSE",""    ));
        mockMedida(sqLiteDatabase, new Medida("6","1","15","411","Florencia","516","3040","605","","","FALSE","" ));
        mockMedida(sqLiteDatabase, new Medida("7","1","16","411","Monica","517","3041","606","","","FALSE",""    ));
        mockMedida(sqLiteDatabase, new Medida("8","1","17","411","Gustavo","518","3042","607","","","FALSE",""   ));
        mockMedida(sqLiteDatabase, new Medida("9","1","18","411","Patricia","519","3043","608","","","FALSE",""  ));
        mockMedida(sqLiteDatabase, new Medida("10","1","19","411","Ruben","520","3044","609","","","FALSE",""    ));
        mockMedida(sqLiteDatabase, new Medida("11","1","20","411","Carlos","521","3045","610","","","FALSE",""   ));
        mockMedida(sqLiteDatabase, new Medida("12","2","30","411","Raul","522","3046","611","","","FALSE",""     ));
        mockMedida(sqLiteDatabase, new Medida("13","2","31","411","Alejandro","523","3047","612","","","FALSE",""));
        mockMedida(sqLiteDatabase, new Medida("14","2","32","411","Alejandra","524","3048","613","","","FALSE",""));
        mockMedida(sqLiteDatabase, new Medida("15","2","33","411","Pablo","525","3049","614","","","FALSE",""    ));
        mockMedida(sqLiteDatabase, new Medida("16","2","34","411","Cristian","526","3050","615","","","FALSE","" ));
        mockMedida(sqLiteDatabase, new Medida("17","2","35","411","Vero","527","3051","616","","","FALSE",""     ));
        mockMedida(sqLiteDatabase, new Medida("18","2","36","411","Nico","528","3052","617","","","FALSE",""     ));
        mockMedida(sqLiteDatabase, new Medida("19","2","37","411","German","529","3053","618","","","FALSE",""   ));
        mockMedida(sqLiteDatabase, new Medida("20","2","38","411","Florencia","530","3054","619","","","FALSE",""));
        mockMedida(sqLiteDatabase, new Medida("21","2","39","411","Monica","531","3055","620","","","FALSE",""   ));
        mockMedida(sqLiteDatabase, new Medida("22","2","40","411","Gustavo","532","3056","621","","","FALSE",""  ));
        mockMedida(sqLiteDatabase, new Medida("23","2","41","411","Patricia","533","3057","622","","","FALSE","" ));
        mockMedida(sqLiteDatabase, new Medida("24","3","50","411","Ruben","534","3058","623","","","FALSE",""    ));
        mockMedida(sqLiteDatabase, new Medida("25","3","51","411","Carlos","535","3059","624","","","FALSE",""   ));
        mockMedida(sqLiteDatabase, new Medida("26","3","52","411","Raul","536","3060","625","","","FALSE",""     ));
        mockMedida(sqLiteDatabase, new Medida("27","3","53","411","Alejandro","537","3061","626","","","FALSE",""));
        mockMedida(sqLiteDatabase, new Medida("28","3","54","411","Alejandra","538","3062","627","","","FALSE",""));
        mockMedida(sqLiteDatabase, new Medida("29","3","55","411","Pablo","539","3063","628","","","FALSE",""    ));
        mockMedida(sqLiteDatabase, new Medida("30","3","56","411","Cristian","540","3064","629","","","FALSE","" ));
        mockMedida(sqLiteDatabase, new Medida("31","3","57","411","Vero","541","3065","630","","","FALSE",""     ));
        mockMedida(sqLiteDatabase, new Medida("32","3","58","411","Nico","542","3066","631","","","FALSE",""     ));
        mockMedida(sqLiteDatabase, new Medida("33","3","59","411","German","543","3067","632","","","FALSE",""   ));
        mockMedida(sqLiteDatabase, new Medida("34","3","60","411","Florencia","544","3068","633","","","FALSE",""));
        mockMedida(sqLiteDatabase, new Medida("35","3","61","411","Monica","545","3069","634","","","FALSE",""   ));
        mockMedida(sqLiteDatabase, new Medida("36","3","62","411","Gustavo","546","3070","635","","","FALSE",""  ));
        mockMedida(sqLiteDatabase, new Medida("37","3","63","411","Patricia","547","3071","636","","","FALSE","" ));
        mockMedida(sqLiteDatabase, new Medida("38","3","64","411","Ruben","548","3072","637","","","FALSE",""    ));
        mockMedida(sqLiteDatabase, new Medida("39","3","65","411","Carlos","549","3073","638","","","FALSE",""   ));
        mockMedida(sqLiteDatabase, new Medida("40","3","66","411","Raul","550","3074","639","","","FALSE",""     ));
        mockMedida(sqLiteDatabase, new Medida("41","3","67","411","Alejandro","551","3075","640","","","FALSE",""));
        mockMedida(sqLiteDatabase, new Medida("42","3","68","411","Alejandra","552","3076","641","","","FALSE",""));
        mockMedida(sqLiteDatabase, new Medida("43","3","69","411","Pablo","553","3077","642","","","FALSE",""    ));
        mockMedida(sqLiteDatabase, new Medida("44","4","80","411","Cristian","554","3078","643","","","FALSE","" ));
        mockMedida(sqLiteDatabase, new Medida("45","4","81","411","Vero","555","3079","644","","","FALSE",""     ));
        mockMedida(sqLiteDatabase, new Medida("46","4","82","411","Nico","556","3080","645","","","FALSE",""     ));
        mockMedida(sqLiteDatabase, new Medida("47","4","83","411","German","557","3081","646","","","FALSE",""   ));
        mockMedida(sqLiteDatabase, new Medida("48","4","84","411","Florencia","558","3082","647","","","FALSE",""));
        mockMedida(sqLiteDatabase, new Medida("49","4","85","411","Monica","559","3083","648","","","FALSE",""   ));
        mockMedida(sqLiteDatabase, new Medida("50","4","86","411","Gustavo","560","3084","649","","","FALSE",""  ));
        mockMedida(sqLiteDatabase, new Medida("51","4","87","411","Patricia","561","3085","650","","","FALSE","" ));
        mockMedida(sqLiteDatabase, new Medida("52","4","88","411","Ruben","562","3086","651","","","FALSE",""    ));
        mockMedida(sqLiteDatabase, new Medida("53","4","89","411","Carlos","563","3087","652","","","FALSE",""   ));
        mockMedida(sqLiteDatabase, new Medida("54","4","90","411","Raul","564","3088","653","","","FALSE",""     ));
        mockMedida(sqLiteDatabase, new Medida("55","4","91","411","Alejandro","565","3089","654","","","FALSE",""));
        mockMedida(sqLiteDatabase, new Medida("56","4","92","411","Alejandra","566","3090","655","","","FALSE",""));
        mockMedida(sqLiteDatabase, new Medida("57","4","93","411","Pablo","567","3091","656","","","FALSE",""    ));
        mockMedida(sqLiteDatabase, new Medida("58","4","94","411","Cristian","568","3092","657","","","FALSE","" ));
        mockMedida(sqLiteDatabase, new Medida("59","4","95","411","Vero","569","3093","658","","","FALSE",""     ));
        mockMedida(sqLiteDatabase, new Medida("60","4","96","411","Nico","570","3094","659","","","FALSE",""     ));
        mockMedida(sqLiteDatabase, new Medida("61","4","97","411","German","571","3095","660","","","FALSE",""   ));
        mockMedida(sqLiteDatabase, new Medida("62","4","98","411","Florencia","572","3096","661","","","FALSE",""));
        mockMedida(sqLiteDatabase, new Medida("63","4","99","411","Monica","573","3097","662","","","FALSE",""   ));
        mockMedida(sqLiteDatabase, new Medida("64","4","100","411","Gustavo","574","3098","663","","","FALSE","" ));
        mockMedida(sqLiteDatabase, new Medida("65","4","101","411","Patricia","575","3099","664","","","FALSE",""));

    }

    public long mockMedida(SQLiteDatabase db, Medida medida) {
        return db.insert(
                MedidaContract.MedidaEntry.TABLE_NAME,
                null,
                medida.toContentValues());
    }




    // Trae Todos los datos de la base
    public Cursor getAllMedidas(String orderBy, String busqueda) {

        Cursor c = null;
        c = this.getReadableDatabase()
                .query(
                        MedidaContract.MedidaEntry.TABLE_NAME,
                        null,
                        busqueda,
                        null,
                        null,
                        null,
                        orderBy);
        return c;
    }

    // Trae Todos los datos de la base
    public Cursor getRutaMedidas(String ruta, String orderBy,  String busqueda) {

        Cursor c = null;
        c = this.getReadableDatabase()
                .query(
                        MedidaContract.MedidaEntry.TABLE_NAME,
                        null,
                        busqueda,
                        null,
                        null,
                        null,
                        orderBy);
        return c;
    }

    //Pasa un cursor a cun List para usarlo en el adapter
    public List<Medida> getListaMedidas(Cursor c) {
        List<Medida> listaMedida = new ArrayList<>();

        // Si el cursor contiene datos los añadimos al List
        if (c.moveToFirst()) {
            do {

                listaMedida.add(new Medida(c.getString(0),c.getString(1),c.getString(2),
                        c.getString(3),c.getString(4),c.getString(5),
                        c.getString(6),c.getString(7),c.getString(8),
                        c.getString(9),c.getString(10),c.getString(11)));
            } while (c.moveToNext());
        }

        return listaMedida;

    }

    public boolean cargaEstado(String id,String estAct, String cargado){

        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(MedidaContract.MedidaEntry.EST_ACTUAL,estAct);
        cv.put(MedidaContract.MedidaEntry.ACTUALIZADO ,cargado);
        sqLiteDatabase.update(MedidaContract.MedidaEntry.TABLE_NAME, cv,"_id="+id,null);
        return true;
    }
}
