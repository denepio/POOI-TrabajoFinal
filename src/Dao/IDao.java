package Dao;

import javax.swing.table.DefaultTableModel;

public interface IDao <T>{
    DefaultTableModel getTable();
    void getGuardar(T obj);
    void getActualizar(T obj,int f);
    void getEliminar(Object cod);
    int getBuscar(Object bus);
    T getAtributo(int f);
    int getTamano();
}
