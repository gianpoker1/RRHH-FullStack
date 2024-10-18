package gian.rrhh.service;

import gian.rrhh.model.Empleado;
import gian.rrhh.repositories.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoService implements IEmpleadoService{

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Override
    public List<Empleado> listEmpleados() {
        return empleadoRepository.findAll();
    }

    @Override
    public Empleado findByIdEmpleado(int idEmpleado) {
        return empleadoRepository.findById(idEmpleado).orElse(null);
    }

    @Override
    public Empleado saveEmpleado(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    @Override
    public void deleteEmpleado(int idEmpleado) {
        empleadoRepository.deleteById(idEmpleado);
    }
}
