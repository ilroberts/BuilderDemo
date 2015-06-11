package org.ilroberts.builderdemo.item;

import org.ilroberts.packing.Bottle;
import org.ilroberts.packing.Packing;

/**
 * Created by ilroberts on 11/06/15.
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing(){
        return new Bottle();
    }

    @Override
    public abstract float price();
}
