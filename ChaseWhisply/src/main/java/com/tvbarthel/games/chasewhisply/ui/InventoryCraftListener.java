package com.tvbarthel.games.chasewhisply.ui;

import com.tvbarthel.games.chasewhisply.model.inventory.InventoryItemEntry;

public interface InventoryCraftListener {
    public void onCraftRequested(InventoryItemEntry inventoryItemEntry);
}
