package com.taktak.businesslogic;


import com.taktak.businesslogic.value.UserBO;
import com.taktak.persistence.entity.UserEntity;
import com.taktak.persistence.facade.UserFacade;

import javax.inject.Inject;

public class UserData {

    @Inject
    private UserFacade facade;

    public UserBO getUserData(String username) {

        UserEntity user = facade.getUserData(username);

        // set the User-Data
        UserBO userBo = new UserBO();
        userBo.setFirstname(user.getFirstname());
        userBo.setLastname(user.getLastname());
        userBo.setUsername(user.getUsername());

        return userBo;
    }

}
