package com.example.travelagency.service;

import com.example.travelagency.entity.Destination;
import com.example.travelagency.repository.DestinationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DestinationService {

    @Autowired
    private DestinationRepository destinationRepository;

    public List<Destination> getAllDestinations() {
        return destinationRepository.findAll();
    }

    public Destination getDestinationById(Long id) {
        return destinationRepository.findById(id).orElse(null);
    }

    public Destination createDestination(Destination destination) {
        return destinationRepository.save(destination);
    }

    public Destination updateDestination(Long id, Destination destinationDetails) {
        Destination destination = destinationRepository.findById(id).orElse(null);
        if (destination != null) {
            destination.setImageUrl(destinationDetails.getImageUrl());
            destination.setName(destinationDetails.getName());
            destination.setPrice(destinationDetails.getPrice());
            return destinationRepository.save(destination);
        }
        return null;
    }

    public void deleteDestination(Long id) {
        destinationRepository.deleteById(id);
    }
}
