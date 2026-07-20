package com.inventario.demo.repository;

import com.inventario.demo.model.entity.ProductoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface ProductoRepository extends CrudRepository<ProductoEntity, Integer> {
    Optional<ProductoEntity> findByCodigoAndPasillo(String codigo, String pasillo);
}