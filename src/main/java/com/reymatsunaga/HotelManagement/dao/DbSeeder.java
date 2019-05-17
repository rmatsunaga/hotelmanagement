package com.reymatsunaga.HotelManagement.dao;

import com.reymatsunaga.HotelManagement.model.Address;
import com.reymatsunaga.HotelManagement.model.Hotel;
import com.reymatsunaga.HotelManagement.model.Review;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DbSeeder implements CommandLineRunner {

    private HotelDao hotelDao;

    public DbSeeder(HotelDao hotelDao) {
        this.hotelDao = hotelDao;
    }

    @Override
    public void run(String... strings) throws Exception {
        Hotel marriot = new Hotel(
                "Marriot",
                130,
                new Address("Paris", "France"),
                Arrays.asList(
                        new Review("John", 8, false),
                        new Review("Mary", 7, true)
                )
        );
        Hotel ibis = new Hotel(
                "Ibis",
                90,
                new Address("Bucharest", "Romania"),
                Arrays.asList(
                        new Review("Teddy", 9, true)
                )
        );

        Hotel sofitel = new Hotel(
                "Sofitel",
                200,
                new Address("Rome", "Italy"),
                new ArrayList<>()
        );

        // Drop All Hotels

        this.hotelDao.deleteAll();

        // Add Hotels to database

        List<Hotel> hotels = Arrays.asList(marriot, ibis, sofitel);
        this.hotelDao.saveAll(hotels);
    }
}
