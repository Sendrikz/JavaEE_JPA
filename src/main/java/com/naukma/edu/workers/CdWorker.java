package com.naukma.edu.workers;

import com.naukma.edu.dao.CdDao;
import com.naukma.edu.enteties.Cd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CdWorker {

    @Autowired
    private CdDao cdDao;

    public Cd addCd(Cd cd){
        cdDao.addCd(cd);
        System.out.println(cd);
        return cd;
    }

}
