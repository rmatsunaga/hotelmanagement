package com.reymatsunaga.HotelManagement.dao;

import com.reymatsunaga.HotelManagement.model.Hotel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelDao extends MongoRepository<Hotel, String> {
    Hotel getById(String id);
    List<Hotel> findByPricePerNightLessThan(int maxPrice);
}
