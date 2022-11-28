
package com.gestion.empleados.repositorios;

import com.gestion.empleados.entidades.Empleado;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface EmpleadoRepository extends PagingAndSortingRepository<Empleado, Long>{
    
}
