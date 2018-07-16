package com.booking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.booking.entities.HotelBooking;
import com.booking.repositories.BookingRepository;

@SpringBootApplication
public class BookingAppApplication implements CommandLineRunner {
	
	@Autowired
	private BookingRepository bookingRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(BookingAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		bookingRepository.save(new HotelBooking("Marriot", 200.50, 3));
		bookingRepository.save(new HotelBooking("Ibis", 90, 4));
		bookingRepository.save(new HotelBooking("Novotel", 140.74, 1));
		
	}
}
