package org.myorg.basicejb.earejb;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReservationIT {
    private static final Logger logger = LoggerFactory.getLogger(ReservationIT.class);
    private InitialContext jndi;

    @Before
    public void setUp() throws NamingException {
        logger.debug("getting jndi initial context");
        jndi = new InitialContext();
        logger.debug("jndi={}", jndi.getEnvironment());
      //  jndi.lookup("jms");

      //  jndi.lookup("/basicejb-ejb-1.0-SNAPSHOT/ReservationEJB!org.myorg.basicejb.ejb.ReservationRemote");
    }

    @Test
    public void testPing() {
        logger.info("*** testPing ***");
    }
}