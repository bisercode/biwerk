package org.myorg.basicejb.ejb;

import javax.ejb.*;

@Singleton
@AccessTimeout(100L)
public class MySingeltonImpl implements MySingeltonInterface{

    Integer counter = new Integer(0);

    @Override
    @Lock(LockType.READ)
    public String test() {
        counter++;
        return counter.toString();
    }
}
