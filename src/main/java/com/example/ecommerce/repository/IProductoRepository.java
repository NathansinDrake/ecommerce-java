package com.example.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ecommerce.model.Producto;

public interface IProductoRepository extends JpaRepository<Producto, Integer> {

}
