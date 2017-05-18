package com.sheepy.interfaces;

import com.sheepy.enums.ItemSlot;

/**
 * Created by sheepy on 5/18/17.
 */
public interface EquippableItem extends Item {
    ItemSlot getItemSlot();
}
