package com.reymatsunaga.HotelManagement.controller;


import com.reymatsunaga.HotelManagement.dao.HotelDao;
import com.reymatsunaga.HotelManagement.model.Hotel;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {
    private HotelDao hotelDao;

    public HotelController(HotelDao hotelDao) {
        this.hotelDao = hotelDao;
    }

    @GetMapping("/all")
    public List<Hotel> getAll() {
        List<Hotel> hotels = this.hotelDao.findAll();
        return hotels;
    }

    @PutMapping
    public void insert(@RequestBody Hotel hotel) {
        this.hotelDao.insert(hotel);
    }

    @PostMapping
    public void update(@RequestBody Hotel hotel) {
        this.hotelDao.save(hotel);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String id) {
        this.hotelDao.deleteById(id);
    }

    @GetMapping("/{id}")
    public Hotel getById(@PathVariable("id") String id) {
        Hotel hotel = this.hotelDao.getById(id);
        return hotel;
    }
    @GetMapping("/price/{maxPrice}")
    public List<Hotel> findByPricePerNightLessThan(@PathVariable("maxPrice") int maxPrice) {
        List<Hotel> hotels = this.hotelDao.findByPricePerNightLessThan(maxPrice);

        return hotels;
    }

    @GetMapping("/address/{city}")
    public List<Hotel> getByCity(@PathVariable("city") String city) {
        List<Hotel> hotels = this.hotelDao.findByCity(city);


        return hotels;
    }
}
