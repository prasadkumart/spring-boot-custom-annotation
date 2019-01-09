
package com.bah.poc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bah.poc.model.Product;

@Repository
public interface ProductPriceRepository extends JpaRepository<Product, Long> {

}
