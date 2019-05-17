package com.reymatsunaga.HotelManagement.dao;

import com.reymatsunaga.HotelManagement.model.Hotel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelDao extends MongoRepository<Hotel, String> {
}
