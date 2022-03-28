package org.myorg.basicejb.ejb;

import javax.ejb.Remote;

@Remote
public interface ReservationRemote extends BusinessInterface {
    void ping();
}