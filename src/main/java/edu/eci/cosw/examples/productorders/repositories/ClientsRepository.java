/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cosw.examples.productorders.repositories;

import edu.eci.cosw.examples.productorders.services.ServicesException;
import edu.eci.cosw.samples.model.Cliente;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author carlos.sanchez-v
 */
public interface ClientsRepository extends JpaRepository<Cliente, Integer>{

   @Query("select p.cliente from Pedido p left join p.detallesPedidos as dp left join dp.producto as prod with prod.precio>?1")
    public List<Cliente> clienteByPrice(Integer price) throws ServicesException;
}
