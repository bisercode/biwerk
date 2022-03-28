package org.myorg.basicejb.earejb;

import org.junit.Before;
import org.junit.Test;
import org.myorg.basicejb.ejb.MySingeltonInterface;
import org.myorg.basicejb.ejb.ReservationRemote;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import static org.junit.Assert.*;

public class ReservationIT {
    private static final Logger logger = LoggerFactory.getLogger(ReservationIT.class);
    private static final String reservationJNDI = System.getProperty("jndi.name.reservation");
    private static final String singeltonJNDI = System.getProperty("jndi.name.mysingelton");
    private InitialContext jndi;
    private MySingeltonInterface mySingeltonInterface;
    private ReservationRemote reservationist;

    @Before
    public void setUp() throws NamingException {
        logger.debug("getting jndi initial context");
        jndi = new InitialContext();
        logger.debug("jndi={}", jndi.getEnvironment());

        assertNotNull("jndi.name.reservation not supplied", reservationJNDI);
        logger.debug("jndi name:{}", reservationJNDI);

        reservationist = (ReservationRemote) jndi.lookup(reservationJNDI);
        logger.debug("reservationist={}", reservationist);

        mySingeltonInterface = (MySingeltonInterface) jndi.lookup(singeltonJNDI);

    }

    @Test
    public void testPing() {
        logger.info("*** testPing ***");
        reservationist.ping();
    }

    @Test
    public void myTest() {
      logger.info("### Nr of calls to singelton: " + mySingeltonInterface.test());
    }
}