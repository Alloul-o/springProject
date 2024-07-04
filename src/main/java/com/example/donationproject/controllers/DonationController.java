package com.example.donationproject.controllers;


import com.example.donationproject.entities.Donation;
import com.example.donationproject.service.CampaingService;
import com.example.donationproject.service.DonationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller

@RequestMapping("donations")
public class DonationController {
//    @Autowired
//    private DonationService donationService;
//
//    @GetMapping("/all")
//    public List<Donation> getAllDonations() {
//        return donationService.getAllDonations();
//    }
//    @PostMapping("/add")
//    public ResponseEntity<Donation> createDonation(@RequestBody Donation donation) {
//        Donation createdDonation = donationService.createDonation(donation);
//        return ResponseEntity.ok(createdDonation);
//    }
@Autowired
private DonationService donationService;

    @GetMapping
    public String getAllDonations(Model model) {
        List<Donation> donations = donationService.getAllDonations();
        model.addAttribute("donations", donations);
        return "donations";
    }

    @GetMapping("/{id}")
    public String getDonationById(@PathVariable Long id, Model model) {
        Donation donation = donationService.getDonationById(id);
        model.addAttribute("donation", donation);
        return "donation";
    }

    @GetMapping("/new")
    public String createDonationForm(Model model) {
        model.addAttribute("donation", new Donation());
        return "new-donation";
    }

    @PostMapping
    public String createDonation(@ModelAttribute Donation donation) {
        donationService.saveDonation(donation);
        return "redirect:/donations";
    }

    @DeleteMapping("/{id}")
    public String deleteDonation(@PathVariable Long id) {
        donationService.deleteDonation(id);
        return "redirect:/donations";
    }
}
