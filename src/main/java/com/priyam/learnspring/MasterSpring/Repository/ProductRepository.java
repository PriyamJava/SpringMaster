package com.priyam.learnspring.MasterSpring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.priyam.learnspring.MasterSpring.modal.Products;



@Repository
public interface ProductRepository extends JpaRepository<Products, Long>{

}