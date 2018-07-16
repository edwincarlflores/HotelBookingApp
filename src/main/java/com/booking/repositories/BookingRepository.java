package com.booking.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.booking.entities.HotelBooking;

@Repository
public interface BookingRepository extends JpaRepository<HotelBooking, Long> {
	List<HotelBooking> findByPricePerNightLessThan(double price);
}
