package com.example.donationproject.service;

import com.example.donationproject.entities.Donation;
import com.example.donationproject.repositories.CampaignRepository;
import com.example.donationproject.repositories.DonationRepository;
import com.example.donationproject.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DonationService {
//    @Autowired
//    private DonationRepository donationRepository;
//    @Autowired
//    private UserRepository userRepository;
//    @Autowired
//    private CampaignRepository campaignRepository;
//
//    public List<Donation> getAllDonations() {
//        return donationRepository.findAll().stream().toList();
//    }
//
//    public Donation createDonation(Donation donation) {
//        if(userRepository.existsById(donation.getUser().getId())
//        && campaignRepository.existsById(donation.getCampaign().getId())){
//        donationRepository.save(donation);
//        } else if( !userRepository.existsById(donation.getUser().getId())
//                && campaignRepository.existsById(donation.getCampaign().getId())){
//            userRepository.save(donation.getUser());
//            donationRepository.save(donation);
//        } else {
//            campaignRepository.save(donation.getCampaign());
//            donationRepository.save(donation);
//        }
//
//        return donation;
//    }
@Autowired
private DonationRepository donationRepository;

    public Donation saveDonation(Donation donation) {
        return donationRepository.save(donation);
    }

    public List<Donation> getAllDonations() {
        return donationRepository.findAll();
    }

    public void deleteDonation(Long id) {
    }

    public Donation getDonationById(Long id) {
        Optional<Donation> donationOptional = donationRepository.findById(id);
        return donationOptional.orElse(null);
    }

//    public List<Donation> getDonationsByCampaignId(Long campaignId) {
//        return donationRepository.findByCampaignId(campaignId);
//    }
}
