package com.naukma.edu.dao.impl;

import com.naukma.edu.dao.AddressDao;
import com.naukma.edu.enteties.Address;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Transactional
@Repository("addressDao")
public class AddressDaoJpaImpl implements AddressDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Address addAddress(Address address) {
        em.persist(address);
        return address;
    }

    @Override
    public Address getAddress(int id) {
        return em.find(Address.class, id);
    }

    @Override
    public void saveAddress(Address address) {
        em.merge(address);
    }
}
