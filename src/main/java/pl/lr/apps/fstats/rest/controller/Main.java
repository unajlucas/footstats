package pl.lr.apps.fstats.rest.controller;

import org.apache.naming.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import pl.lr.apps.fstats.rest.RequestResponseFactoryI;

public abstract class Main {

    @Autowired
    protected RequestResponseFactoryI restRequestResponseFactory;

}
