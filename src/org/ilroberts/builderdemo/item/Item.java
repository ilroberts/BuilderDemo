package org.ilroberts.builderdemo.item;

import org.ilroberts.packing.Packing;

/**
 * Created by ilroberts on 11/06/15.
 */
public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
