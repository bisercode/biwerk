package org.myorg.basicejb.earejb;

import org.junit.Before;
import org.junit.Test;
import org.myorg.basicejb.ejb.MySingeltonInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.naming.InitialContext;
import javax.naming.NamingException;

public class ReservationIT {
    private static final Logger logger = LoggerFactory.getLogger(ReservationIT.class);
    private InitialContext jndi;
    MySingeltonInterface mySingeltonInterface;

    @Before
    public void setUp() throws NamingException {
        logger.debug("getting jndi initial context");
        jndi = new InitialContext();
        logger.debug("jndi={}", jndi.getEnvironment());
      //  jndi.lookup("jms");

        jndi.lookup("basicejb-ear-1.0-SNAPSHOT/basicejb-ejb-1.0-SNAPSHOT/ReservationEJB!org.myorg.basicejb.ejb.ReservationRemote");
        mySingeltonInterface = (MySingeltonInterface)jndi.lookup("basicejb-ear-1.0-SNAPSHOT/basicejb-ejb-1.0-SNAPSHOT/MySingeltonImpl!org.myorg.basicejb.ejb.MySingeltonInterface");

    }

    @Test
    public void testPing() {
        logger.info("*** testPing ***");
    }

    @Test
    public void myTest() {
      System.out.println("### Nr of calls to singelton: " + mySingeltonInterface.test());
      logger.info("### Nr of calls to singelton: " + mySingeltonInterface.test());
    }
}