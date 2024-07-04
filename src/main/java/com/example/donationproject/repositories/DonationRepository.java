package com.example.donationproject.repositories;

import com.example.donationproject.entities.Donation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonationRepository extends JpaRepository<Donation, Long> {
}
