package Class;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.software.pyc.aguasventana.R;

import java.util.List;

/**
 * Created by pablo on 1/5/2018.
 */

public class MedidaAdapter  extends ArrayAdapter<Medida> {
    public MedidaAdapter(Context context, List<Medida> objects) {
        super(context,0, objects);
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtener inflater.

        LayoutInflater inflater = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // ¿Existe el view actual?
        //      if (null == convertView) {
        View itemView = inflater.inflate(R.layout.item_lista, null);

        //      }


        // Referencias UI.
        TextView ruta    = (TextView) itemView.findViewById(R.id.itemRuta);
        TextView nombre  = (TextView) itemView.findViewById(R.id.itemNombre);
        TextView orden   = (TextView) itemView.findViewById(R.id.itemOrden);
        TextView codigo  = (TextView) itemView.findViewById(R.id.itemCodigo);
        TextView medidor = (TextView) itemView.findViewById(R.id.itemMedidor);
        TextView partida = (TextView) itemView.findViewById(R.id.itemPartida);
        TextView estAnt  = (TextView) itemView.findViewById(R.id.itemAnt);
        TextView estAct  = (TextView) itemView.findViewById(R.id.itemAct);

        //TextView btn = (TextView) itemView.findViewById(R.id.content_request_btn) ;

        RelativeLayout rl = (RelativeLayout) itemView.findViewById(R.id.rlItem);


        // Medida actual.
        Medida medida = getItem(position);


        // Setup.
 /*       int colorFondo = Color.WHITE;

        if (medida.getActualizado().equalsIgnoreCase("TRUE")){

            colorFondo =  Color.parseColor("#ffbf12");

        }
        if (medida.getActualizado().equalsIgnoreCase("FALSE")){
            colorFondo = Color.parseColor("#ef5350");
        }
*/


        ruta.setText(medida.getRuta());
        nombre.setText(medida.getNombre());
        orden.setText(medida.getOrden());
        codigo.setText(medida.getCodigo());
        medidor.setText(medida.getMedidor());
        partida.setText(medida.getPartida());
        estAnt.setText(medida.getEstadoAnterior());
        estAct.setText(medida.getEstadoActual());
        //rl.setBackgroundColor(colorFondo);
        //btn.setBackgroundColor(colorFondo);

        return itemView;
    }
}
