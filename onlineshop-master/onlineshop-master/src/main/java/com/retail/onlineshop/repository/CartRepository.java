package com.retail.onlineshop.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.retail.onlineshop.model.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart,Integer> {
}
