package com.vti.testing.controller;

import com.vti.testing.dto.AddressDTO;
import com.vti.testing.entity.Address;
import com.vti.testing.repository.IAddressRepository;
import com.vti.testing.service.IAddressService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/address")
public class AddressController {
    @Autowired
    private IAddressService addressService;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping("{id}")
    public AddressDTO getAddressById(@PathVariable int id){
        Address address = addressService.getAddressById(id);
        return modelMapper.map(address, AddressDTO.class);
    }

}
