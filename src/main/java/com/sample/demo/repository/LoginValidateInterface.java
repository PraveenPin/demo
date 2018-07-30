package com.sample.demo.repository;

import com.sample.demo.model.Login;
import com.sample.demo.model.Response;

public interface LoginValidateInterface {

    public Response isValidUser(Login login);
}