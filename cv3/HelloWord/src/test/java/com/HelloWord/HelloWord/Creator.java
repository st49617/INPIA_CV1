package com.HelloWord.HelloWord;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.applet.AppletContext;

@Repository
public class Creator {

    @Autowired
    AppletContext appletContext;

    public Object save(Object entity) {
        String repoClassName = entity.getClass().getSimpleName();
        String repositoryBeanName = repoClassName
        return null;
    }

}
