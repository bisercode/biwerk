package org.myorg.basicejb.ejb;

import javax.ejb.Remote;

@Remote
public interface MySingeltonInterface {
    String test();
}
