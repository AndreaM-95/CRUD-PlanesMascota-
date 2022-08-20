
package Controlador;

import Clases.*;
import Modelo.*;

public class CtPlan {
    MdPlan MdPlan;
    
    public CtPlan(){
        this.MdPlan = new MdPlan();
    }
    
    public boolean crearPlan(Plan p){
        try{
            this.MdPlan.crearPlan(p);
        }catch (Exception e){
            return false;
        }
        return true;
    }
    
    public Plan buscarPlan(String codigo){
        Plan p = null;
        p = this.MdPlan.buscarPlan(codigo);
        return p;
    }
    
    public boolean actualizarPlan(Plan p){
        return this.MdPlan.actualizarPlan(p);
    }
    
    public boolean borrarPlan(Plan p){
        return this.MdPlan.borrarPlan(p);
    }
    
    /*
    public LinkedList<Plan> listarTodosPlan() {
        LinkedList<Plan> resultado = new LinkedList();
        try {
            resultado = this.MdPlan.buscarTodosPlanes();
        } catch (Exception e) {

        }
        return resultado;
    }*/
}
