package com.example.travelagency.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.travelagency.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
