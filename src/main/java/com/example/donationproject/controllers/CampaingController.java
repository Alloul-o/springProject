package com.example.donationproject.controllers;

import com.example.donationproject.entities.Campaign;
import com.example.donationproject.service.CampaingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.donationproject.service.UserService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RestController
@RequestMapping("campaings")
public class CampaingController {

    @Autowired
    private CampaingService campaignService;

    @GetMapping("/all")
    public String getAllCampaigns(Model model) {
        List<Campaign> campaigns = campaignService.getAllCampaigns();
        model.addAttribute("campaigns", campaigns);
        return "campaigns";
    }

    @GetMapping("/{id}")
    public String getCampaignById(@PathVariable Long id, Model model) {
        Campaign campaign = campaignService.getCampaignById(id);
        model.addAttribute("campaign", campaign);
        return "campaign";
    }

    @GetMapping("/new")
    public String createCampaignForm(Model model) {
        model.addAttribute("campaign", new Campaign());
        return "new-campaign";
    }

    @PostMapping
    public String createCampaign(@ModelAttribute Campaign campaign) {
        campaignService.saveCampaign(campaign);
        return "redirect:/campaigns";
    }

    @DeleteMapping("/{id}")
    public String deleteCampaign(@PathVariable Long id) {
        campaignService.deleteCampaign(id);
        return "redirect:/campaigns";
    }
}
