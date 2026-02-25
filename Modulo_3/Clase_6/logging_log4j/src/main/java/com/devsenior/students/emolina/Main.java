package com.devsenior.students.emolina;

import org.apache.logging.log4j.*;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Mensaje de INFO");
        logger.debug("mensaje de debug");
        logger.trace("mensaje trace?");
        logger.warn("mensaje warn");
        logger.error("Mensaje error");
        logger.fatal("mensaje fatal");
    }
}