package gian.rrhh.controllers;

import gian.rrhh.exceptions.NotFoundException;
import gian.rrhh.model.Empleado;
import gian.rrhh.service.EmpleadoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("rrhh-app")//http:localhost:8080/rrhh-app
@CrossOrigin(value = "http://localhost:3000")
public class EmpleadoController {

    private static final Logger logger = LoggerFactory.getLogger(EmpleadoController.class);

    @Autowired
    private EmpleadoService empleadoService;

    //http:localhost:8080/rrhh-app/empleados
    @GetMapping("/empleados")
    public List<Empleado> listAllEmpleado(){
        var empleados = empleadoService.listEmpleados();
        empleados.forEach((empleado -> logger.info(empleado.toString())));
        return empleados;
    }

    @PostMapping("/empleados")
    public Empleado saveEmpleado(@RequestBody Empleado empleado){
        logger.info("Empleado añadido: " + empleado);
        return empleadoService.saveEmpleado(empleado);
    }

    @GetMapping("/empleados/{id}")
    public ResponseEntity<Empleado> findByIdEmpleado(@PathVariable Integer id){
        Empleado empleado = empleadoService.findByIdEmpleado(id);
        if(empleado == null){
            throw new NotFoundException("Empleado no encontrado");
        }
        return ResponseEntity.ok(empleado);
    }

    @PutMapping("empleados/{id}")
    public ResponseEntity<Empleado> editEmpleado(@PathVariable Integer id, @RequestBody Empleado empleado){
        Empleado empleadoEncontrado = empleadoService.findByIdEmpleado(id);
        if(empleado == null){
            throw new NotFoundException("Empleado no encontrado");
        }
        empleadoEncontrado.setNombre(empleado.getNombre());
        empleadoEncontrado.setDepartamento(empleado.getDepartamento());
        empleadoEncontrado.setSalario(empleado.getSalario());
        empleadoService.saveEmpleado(empleadoEncontrado);
        return ResponseEntity.ok(empleadoEncontrado);
    }

    @DeleteMapping("empleados/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteEmpleado(@PathVariable Integer id){
        Empleado empleado =empleadoService.findByIdEmpleado(id);
        if(empleado == null){
            throw new NotFoundException("Empleado no encontrado");
        }
        empleadoService.deleteEmpleado(id);
        Map<String, Boolean> respuesta = new HashMap<>();
        respuesta.put("eliminado", Boolean.TRUE);// Json {Weliminado":"true}
        return ResponseEntity.ok(respuesta);
    }

}
