package Dao;

import Beans.Tabla;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DTabla implements IDao<Tabla>{
    private List<Tabla> array=new ArrayList<>();
    private String ruta=new File("src/Gui/TXTCategoria.txt").toString();
    
    public void MCargarTexto(){
        File farm=new File(ruta);
        if(farm.exists()){
            ObjectInputStream entrada=null;
            try{
                entrada=new ObjectInputStream(new FileInputStream(ruta));
                array = (ArrayList)entrada.readObject();
                entrada.close();
            }catch(Exception ex)
            {JOptionPane.showMessageDialog(null, "IOExp:"+ex.getMessage());}
        }else JOptionPane.showMessageDialog(null, "No existe el archivo");
    }
    
    public void MGuardarTexto(){
        ObjectOutputStream salida=null;
        try{
            salida=new ObjectOutputStream(new FileOutputStream(ruta));
            salida.writeObject(array);
            salida.close();
        }catch(IOException ex)
        {JOptionPane.showMessageDialog(null, "IOExp:"+ex.getMessage());}
    }
    
    @Override
    public DefaultTableModel getTable() {
        Object col[]={"Producto","Precio","Fecha de ingreso","Fecha de vencimiento","Importado desde","Existencias"};
        DefaultTableModel mdl=new DefaultTableModel(col, 0);
        for (Tabla row: array) {
            mdl.addRow(new Object[]{row.getPro(),row.getPre(), row.getFdi(),row.getFdv(),row.getImp(),row.getExis()});
        }
        return mdl;
    }

    @Override
    public void getGuardar(Tabla obj) {
        array.add(obj);
        MGuardarTexto();
    }


    @Override
    public void getActualizar(Tabla obj, int f) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void getEliminar(Object cod) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getBuscar(Object bus) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Tabla getAtributo(int f) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getTamano() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
