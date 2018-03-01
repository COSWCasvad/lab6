/*
 * Copyright (C) 2016 Pivotal Software, Inc.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package edu.eci.cosw.examples.productorders.services;

import edu.eci.cosw.samples.model.Despacho;
import edu.eci.cosw.samples.model.Pedido;
import edu.eci.cosw.samples.model.Producto;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author hcadavid
 */
public interface ApplicationServices {
    
    public List<Pedido> getAllOrders() throws ServicesException;
    
    public Pedido orderById(Integer id) throws ServicesException;;
    
    public List<Producto> getAllProducts() throws ServicesException;;
    
    public Despacho dispatchByID(Integer id) throws ServicesException;
    
    public InputStream dispatchQRByID(Integer id) throws ServicesException,SQLException;
    
}
