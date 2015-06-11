package org.ilroberts.builderdemo.item;

import org.ilroberts.packing.Packing;
import org.ilroberts.packing.Wrapper;

/**
 * Created by ilroberts on 11/06/15.
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing(){
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
