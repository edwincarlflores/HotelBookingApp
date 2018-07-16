package com.booking.seeders;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.booking.entities.HotelBooking;
import com.booking.repositories.BookingRepository;

public class DatabaseSeeder implements CommandLineRunner{

	private BookingRepository bookingRepository;
	
	@Autowired
	public DatabaseSeeder() {
		this.bookingRepository = bookingRepository;
	}
	
	
	@Override
	public void run(String... args) throws Exception {
		
		bookingRepository.save(new HotelBooking("Marriot", 200.50, 3));
		bookingRepository.save(new HotelBooking("Ibis", 90, 4));
		bookingRepository.save(new HotelBooking("Novotel", 140.74, 1));
	}

}
