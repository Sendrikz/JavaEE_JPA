package com.naukma.edu.dao;

import com.naukma.edu.enteties.Address;

public interface AddressDao {
    Address addAddress(Address address);
    Address getAddress(int id);
    void saveAddress(Address address);
}
