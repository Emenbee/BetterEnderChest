package nl.rutgerkok.BetterEnderChest;

import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;

public class BetterEnderHolder implements InventoryHolder {
    private String ownerName;// never displayed, stores the name
    private boolean correctCase;// whether the name has been verified to be
				// case-correct

    public BetterEnderHolder(String ownerName, boolean correctCase) {
	this.ownerName = ownerName;
	this.correctCase = correctCase;
    }

    @Override
    public Inventory getInventory() {
	return null;
    }

    public String getOwnerName() {
	return ownerName;
    }

    public boolean isOwnerNameCaseCorrect() {
	return correctCase;
    }

    public void setOwnerName(String newName, boolean correctCase) {
	ownerName = newName;
	this.correctCase = correctCase;
    }
}