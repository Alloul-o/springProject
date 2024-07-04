package com.example.donationproject.service;

import com.example.donationproject.entities.Campaign;
import com.example.donationproject.repositories.CampaignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CampaingService {
    //    @Autowired
//    private CampaignRepository campaignRepository;
//
//    public List<Campaign> getAllCampaings() {
//        return campaignRepository.findAll().stream().toList();
//    }
    @Autowired
    private CampaignRepository campaignRepository;


    public Campaign saveCampaign(Campaign campaign) {
        return campaignRepository.save(campaign);
    }

    public List<Campaign> getAllCampaigns() {
        return campaignRepository.findAll();
    }

    public Campaign getCampaignById(Long id) {
        return campaignRepository.findById(id).orElse(null);
    }

    public void deleteCampaign(Long id) {
    }
}
