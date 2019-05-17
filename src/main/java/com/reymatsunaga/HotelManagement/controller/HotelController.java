package com.reymatsunaga.HotelManagement.controller;


import com.reymatsunaga.HotelManagement.dao.HotelDao;
import com.reymatsunaga.HotelManagement.model.Hotel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {
    private HotelDao hotelDao;

    public HotelController(HotelDao hotelDao) {
        this.hotelDao = hotelDao;
    }

    @GetMapping
    public List<Hotel> getAll() {
        List<Hotel> hotels = this.hotelDao.findAll();
        return hotels;
    }
}
