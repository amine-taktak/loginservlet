package com.taktak.businesslogic;

import com.taktak.persistence.entity.UserEntity;
import com.taktak.persistence.facade.UserFacade;

import javax.inject.Inject;
import java.util.List;

/**
 * @author Amine Taktak
 * @created 23.05.2020
 */
public class LoginChecker {

    @Inject
    private UserFacade userFacade;

    public boolean checkLogin(String username, String password) {

        List<UserEntity> users = userFacade.existsByQueryParameters(username, password);

        return users.size() == 1;
    }
}
