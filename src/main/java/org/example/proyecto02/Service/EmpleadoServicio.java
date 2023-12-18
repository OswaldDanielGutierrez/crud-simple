package org.example.proyecto02.Service;

import org.example.proyecto02.models.Empleado;
import org.example.proyecto02.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoServicio {

    @Autowired
    EmpleadoRepository empleadoRepository = new EmpleadoRepository();

    //SAVE
    public Empleado saveEmpleado(Empleado empleado){
        return empleadoRepository.guardarEmpleado(empleado);
    }

    //GET ALL
    public List<Empleado> getAllEmpleados(){
        return empleadoRepository.listarEmpleados();
    }

    //UPDATE
    public Empleado updateEmpleado(Empleado empleado){
        return empleadoRepository.actualizarEmpleado(empleado);
    }

    //DELETE
    public Empleado deleteEmpleado(int id){
        return empleadoRepository.eliminarEmpleado(id);
    }

    //GET EMAIL
    public Empleado getEmpleadoEmail(String email){
        return empleadoRepository.getEmpleadoEmail(email);
    }

    //GET ID
    public Empleado getEmpleadoId(int id){
        return empleadoRepository.getEmpleadoId(id);
    }

    //GET SUELTO
    public List<Empleado> getEmpleadoSueldo(){
        return empleadoRepository.getEmpleadosSueldo();
    }

    //GET EXPERIENCIA
    public List<Empleado> getEmpleadoExperiencia(){
        return empleadoRepository.getEmpleadosExperimentados();
    }
}
