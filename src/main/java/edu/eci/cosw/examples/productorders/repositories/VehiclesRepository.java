/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cosw.examples.productorders.repositories;


import edu.eci.cosw.examples.productorders.services.ServicesException;
import edu.eci.cosw.samples.model.Despacho;
import edu.eci.cosw.samples.model.Producto;
import edu.eci.cosw.samples.model.Vehiculo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author carlos.sanchez-v
 */
public interface VehiclesRepository extends JpaRepository<Vehiculo, String>{
    @Query("select d.vehiculo from Despacho d  inner join d.pedidos as p  inner join p.detallesPedidos as dp inner join dp.producto as prod with prod.idproducto=?1")
    public List<Vehiculo> vehicleByProductId(Integer productId) throws ServicesException;
}
//select d.vehiculo.placa from Despacho d  inner join d.pedidos as p  inner join p.detallesPedidos as dp inner join dp.producto as prod with prod.idproducto=1
//select p.cliente.idcliente, p.cliente.nombre from Pedido p left join p.detallesPedidos as dp left join dp.producto as prod with prod.precio>6000