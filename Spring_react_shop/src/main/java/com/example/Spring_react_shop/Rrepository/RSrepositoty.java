package com.example.Spring_react_shop.Rrepository;

import com.example.Spring_react_shop.REntity.RSEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RSrepositoty extends JpaRepository<RSEntity,Long> {
    @Override
    List<RSEntity> findAll();
}
