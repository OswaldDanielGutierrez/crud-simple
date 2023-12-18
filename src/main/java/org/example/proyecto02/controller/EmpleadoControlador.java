package org.example.proyecto02.controller;

import org.example.proyecto02.Service.EmpleadoServicio;
import org.example.proyecto02.models.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/empleados")
public class EmpleadoControlador {

    @Autowired
    private EmpleadoServicio empleadoServicio;

    @PostMapping ("/guardar")
    public Empleado guardarEmpleado(@RequestBody Empleado empleado){
        return empleadoServicio.saveEmpleado(empleado);
    }

    @GetMapping("/mostrarTodos")
    public List<Empleado> mostrarEmpleados(){
        return empleadoServicio.getAllEmpleados();
    }

    @PutMapping("/Actualizar")
    public Empleado actualizarEmpleado(@RequestBody Empleado empleado){
        return empleadoServicio.updateEmpleado(empleado);
    }

    @DeleteMapping("/Borrar")
    public Empleado borrarEmpleado (@PathVariable int id){
        return empleadoServicio.deleteEmpleado(id);
    }

    @GetMapping("/BuscarEmail{email}")
    public Empleado buscarEmpleadoEmail (@PathVariable String email){
        return empleadoServicio.getEmpleadoEmail(email);
    }

    @GetMapping("/{id}")
    public Empleado buscarEmpleadoId (@PathVariable int id){
        return empleadoServicio.getEmpleadoId(id);
    }

    @GetMapping("/buscarSueldo")
    public List<Empleado> buscarEmpleadoSueldo (){
        return empleadoServicio.getEmpleadoSueldo();
    }

    @GetMapping("/BuscarExperiencia")
    public List<Empleado> buscarEmpleadoExperiencia(){
        return empleadoServicio.getEmpleadoExperiencia();
    }

}
