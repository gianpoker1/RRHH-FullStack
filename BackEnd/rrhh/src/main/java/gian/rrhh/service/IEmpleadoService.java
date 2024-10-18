package gian.rrhh.service;

import gian.rrhh.model.Empleado;

import java.util.List;

public interface IEmpleadoService{
    public List<Empleado> listEmpleados();
    public Empleado findByIdEmpleado(int idEmpleado);
    public Empleado saveEmpleado(Empleado empleado);
    public void deleteEmpleado(int idEmpleado);
}
