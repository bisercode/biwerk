package org.myorg.basicejb.ejb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateless;

@Stateless
public class ReservationEJB implements ReservationLocal, ReservationRemote {
    private static Logger logger = LoggerFactory.getLogger(ReservationEJB.class);

    @PostConstruct
    public void init() {
        logger.debug("*** ReservationEJB.init() ***");
    }

    @PreDestroy
    public void destroy() {
        logger.debug("*** ReservationEJB.destroy() ***");
    }

    @Override
    public void ping() {
        logger.debug("ping called");
        businessMethod();
    }

    @Override
    public void businessMethod() {
        logger.debug("businessMethod called");
    }
}
