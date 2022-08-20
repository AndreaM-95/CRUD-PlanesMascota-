package Controlador;

import Clases.*;
import Modelo.*;
import java.util.LinkedList;
import javax.swing.JComboBox;

public class CtCliente {

    MdCliente MdCliente;

    public CtCliente() {
        this.MdCliente = new MdCliente();
    }

    public boolean crearCliente(Cliente c) {
        try {
            this.MdCliente.crearCliente(c);
        } 
        catch (Exception e) {
            return false;
        }
        return true;
    }

    public Cliente buscarCliente(String identificacion) {
        Cliente c = null;
        c = this.MdCliente.buscarCliente(identificacion);
        return c;
    }

    public boolean actualizarCliente(Cliente c) {
        return this.MdCliente.actualizarCliente(c);
    }

    public boolean borrarCliente(Cliente p) {
        return this.MdCliente.borrarCliente(p);
    }

    /*
    public LinkedList<Cliente> listarTodosClientes() {
        LinkedList<Cliente> resultado = new LinkedList();
        try {
            resultado = this.MdCliente.buscarTodosClientes();
        } catch (Exception e) {

        }
        return resultado;
    }*/

    public int obtenerIdPKClienteComboBox(LinkedList<Cliente> cl, JComboBox cbCliente) {
        //Guardo la posición del comboBox con lo que seeccionó el usuario
        int indiceComboCliente = -1;
        indiceComboCliente = cbCliente.getSelectedIndex();

        int idPKCliente = -1; //Variable para almacenar la pk del cliente, si no toman nada tomará el valor de -1
        int indiceListaCliente = -1; //Variable para comparar la lista con el plan

        /*Pregunto si hay algo seleccionado en el plan, si el #elementos de la lista es maor que el índice de plan
        y si los nombres del plan y la lista son iguales.
         */
        if (indiceComboCliente >= 0 && cl.size() > indiceComboCliente && cbCliente.getSelectedItem().toString().equals(
                (cl.get(indiceComboCliente).getNombres() + " " + cl.get(indiceComboCliente).getApellidos()))) {
            indiceListaCliente = indiceComboCliente; //Guardo el valor del índice del combo

            idPKCliente = cl.get(indiceListaCliente).getIdPk();
        }
        return idPKCliente;
    }

}
