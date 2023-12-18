package org.example.proyecto02.repository;

import org.example.proyecto02.models.Empleado;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmpleadoRepository {

    private List<Empleado> listaEmpleados = new ArrayList<>();

    //GUARDAR EMPLEADO
    public Empleado guardarEmpleado(Empleado empleado){

        Empleado empleado1 = new Empleado();

        empleado.setId(empleado1.getId());
        empleado.setNombre(empleado1.getNombre());
        empleado.setApellido(empleado1.getApellido());
        empleado.setEdad(empleado1.getEdad());
        empleado.setSueldo(empleado1.getSueldo());
        empleado.setEmail(empleado1.getEmail());
        empleado.setAnosExperiencia(empleado1.getAnosExperiencia());
        empleado.setNumeroCelular(empleado1.getNumeroCelular());
        listaEmpleados.add(empleado);

        return empleado1;
    }

    //LISTAR EMPLEADOS
    public List<Empleado> listarEmpleados(){
        return  listaEmpleados;
    }

    //ACTUALIZAR EMPLEADO
    public Empleado actualizarEmpleado(Empleado empleado){

    //Comprobar si el empleado existe
        int id = 0;
        int idPosicion = 0;

        for (Empleado emple: listaEmpleados){
            if (empleado.getId() == emple.getId()){
                id = emple.getId();
                idPosicion = listaEmpleados.indexOf(emple);
                break;
            }
        }

        Empleado empleado2 = new Empleado();
        empleado.setId(empleado2.getId());
        empleado.setNombre(empleado2.getNombre());
        empleado.setApellido(empleado2.getApellido());
        empleado.setEdad(empleado2.getEdad());
        empleado.setSueldo(empleado2.getSueldo());
        empleado.setEmail(empleado2.getEmail());
        empleado.setAnosExperiencia(empleado2.getAnosExperiencia());
        empleado.setNumeroCelular(empleado2.getNumeroCelular());
        listaEmpleados.add(empleado);

        return empleado;
    }

    //ELIMIINAR EMPLEADO
    public Empleado eliminarEmpleado(int id){
        for (Empleado emple: listaEmpleados){
            if (id == emple.getId()){
                listaEmpleados.remove(emple);
            }
        }
        return null;
    }

    //LISTAR EMPLEADO POR EMAIL
    public Empleado getEmpleadoEmail(String email){
        for (Empleado emple: listaEmpleados){
            if (email == emple.getEmail()){
                return emple;
            }
        }
        return null;
    }

    //LISTAR EMPLEADO POR ID
    public Empleado getEmpleadoId(int id){
        Empleado empleadoSolicitado = new Empleado();
        for (Empleado emple: listaEmpleados){
            if (id == emple.getId()){
                empleadoSolicitado = emple;
            }
        }
        return empleadoSolicitado;
    }

    //LISTAR EMPLEADOS CON SUELDO A MAYOR A 1000
    public List<Empleado> getEmpleadosSueldo(){
        int sueldo = 1000;
        List<Empleado> listaEmpleadosSueldo = new ArrayList<>();
        for (Empleado emple: listaEmpleados){
            if (emple.getSueldo() >= sueldo){
                listaEmpleadosSueldo.add(emple);
            }
        }
        return null;
    }

    //LISTAR EMPLEADOS CON 5 AÑOS DE EXP
    public List<Empleado> getEmpleadosExperimentados(){
        int experiencia = 5;
        List<Empleado> listaEmpleadosExperimentados = new ArrayList<>();
        for (Empleado emple: listaEmpleados){
            if (emple.getAnosExperiencia() >= experiencia){
                listaEmpleadosExperimentados.add(emple);
            }
        }
        return null;
    }

}
