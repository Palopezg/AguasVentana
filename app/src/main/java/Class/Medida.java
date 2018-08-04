package Class;

import android.content.ContentValues;

import Data.MedidaContract;

/**
 * Created by pablo on 15/7/2018.
 */

public class Medida {
    private String id, ruta, orden, codigo, medidor, estadoAnterior, estadoActual;
    private String usuario;
    private String nombre, partida;
    private String fechaActualizacion;
    private String actualizado;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMedidor() {
        return medidor;
    }

    public void setMedidor(String medidor) {
        this.medidor = medidor;
    }

    public String getEstadoAnterior() {
        return estadoAnterior;
    }

    public void setEstadoAnterior(String estadoAnterior) {
        this.estadoAnterior = estadoAnterior;
    }

    public String getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(String estadoActual) {
        this.estadoActual = estadoActual;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPartida() {
        return partida;
    }

    public void setPartida(String partida) {
        this.partida = partida;
    }

    public String getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(String fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public String getActualizado() {
        return actualizado;
    }

    public void setActualizado(String actualizado) {
        this.actualizado = actualizado;
    }

    public Medida(String id, String ruta, String orden, String codigo, String nombre, String medidor,  String partida,  String estadoAnterior, String estadoActual,  String fechaActualizacion, String actualizado, String usuario) {
        this.id = id;
        this.ruta = ruta;
        this.orden = orden;
        this.codigo = codigo;
        this.medidor = medidor;
        this.estadoAnterior = estadoAnterior;
        this.estadoActual = estadoActual;
        this.usuario = usuario;
        this.nombre = nombre;
        this.partida = partida;
        this.fechaActualizacion = fechaActualizacion;
        this.actualizado = actualizado;
    }



    public ContentValues toContentValues() {
        ContentValues values = new ContentValues();
        values.put(MedidaContract.MedidaEntry.ID,id );
        values.put(MedidaContract.MedidaEntry.RUTA,ruta );
        values.put(MedidaContract.MedidaEntry.ORDEN,orden );
        values.put(MedidaContract.MedidaEntry.CODIGO,codigo );
        values.put(MedidaContract.MedidaEntry.NOMBRE,nombre );
        values.put(MedidaContract.MedidaEntry.MEDIDOR,medidor );
        values.put(MedidaContract.MedidaEntry.PARTIDA,partida );
        values.put(MedidaContract.MedidaEntry.EST_ANTERIOR,estadoAnterior );
        values.put(MedidaContract.MedidaEntry.EST_ACTUAL,estadoActual );
        values.put(MedidaContract.MedidaEntry.FECH_ACT,fechaActualizacion );
        values.put(MedidaContract.MedidaEntry.ACTUALIZADO,actualizado );
        values.put(MedidaContract.MedidaEntry.USUARIO,usuario );
        
        return values;
    }
}
