/**
 * Globe Fintech Innovations Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.task.scheduler.service.controler;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author ronelle.feranil
 * @version $Id: Controler.java, v 0.1 17 Aug 2018 1:55:50 PM ronelle.feranil
 *          Exp $
 */
@RestController
public class ApplicationControler {

    final static Logger logger = LoggerFactory.getLogger(ApplicationControler.class);

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String proccessTest() throws IOException {
        MDC.put("xdi", "about smoketest");
        logger.info("proccessTest Start");

        InputStream is = this.getClass().getClassLoader()
            .getResourceAsStream("META-INF/MANIFEST.MF");
        Properties prop = new Properties();
        prop.load(is);
        String properties = prop.entrySet().stream().map(e -> e.getKey() + ":" + e.getValue())
            .collect(Collectors.joining("\n"));

        logger.info("proccessTest End: {}", properties);
        return properties;
    }
}
