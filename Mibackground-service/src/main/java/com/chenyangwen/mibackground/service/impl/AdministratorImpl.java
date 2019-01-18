package com.chenyangwen.mibackground.service.impl;

import com.chenyangwen.mibackground.common.utils.MD5Util;
import com.chenyangwen.mibackground.dao.AdministratorDao;
import com.chenyangwen.mibackground.entity.Administrator;
import com.chenyangwen.mibackground.service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdministratorImpl implements AdministratorService {

    @Autowired
    AdministratorDao dao;

    public List<Administrator> getAllAdministrators(Administrator administrator) {
        return dao.getAllAdministrators(administrator);
    }

    public int addAdministrator(Administrator administrator) {
        return dao.addAdministrator(administrator);
    }

    public int editAdministrator(Administrator administrator) {
        return dao.editAdministrator(administrator);
    }

    public int loginSelect(String administratorUsername, String administratorPassword) {
        return dao.loginSelect(administratorUsername,MD5Util.md5(administratorPassword));
    }

    public int initPassword(Administrator administrator) {
        return dao.initPassword(administrator);
    }
}
