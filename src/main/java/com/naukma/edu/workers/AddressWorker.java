package com.naukma.edu.workers;

import com.naukma.edu.dao.AddressDao;
import com.naukma.edu.enteties.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("addressWorker")
public class AddressWorker {

    @Autowired
    private AddressDao addressDao;

    public Address addAddress(Address address) {
        address = addressDao.addAddress(address);
        System.out.println(address);
        return address;
    }
}
