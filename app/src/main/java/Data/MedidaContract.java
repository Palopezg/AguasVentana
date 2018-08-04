package Data;

import android.provider.BaseColumns;

/**
 * Created by pablo on 15/7/2018.
 */

public class MedidaContract {
    public static abstract class MedidaEntry implements BaseColumns{
        public static final String TABLE_NAME ="medida";
        public static final String ID = "_id";
        public static final String RUTA = "ruta";
        public static final String ORDEN = "orden";
        public static final String CODIGO = "codigo";
        public static final String NOMBRE = "nombre";
        public static final String MEDIDOR = "medidor";
        public static final String PARTIDA = "partida";
        public static final String EST_ANTERIOR = "estadoAnterior";
        public static final String EST_ACTUAL = "estadoActual";
        public static final String FECH_ACT = "fechaActualizacion";
        public static final String ACTUALIZADO = "actualizado";
        public static final String USUARIO = "usuario";
    }
}
