package nl.rutgerkok.betterenderchest;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.meta.ItemMeta;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;

/**
 * Simple item meta implementation that supports name and lore.
 *
 */
public final class NameableItemMeta implements ItemMeta {
    
    private String name = null;
    private ImmutableList<String> lore = ImmutableList.of();

    @Override
    public boolean addEnchant(Enchantment ench, int level, boolean ignoreLevelRestriction) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void addItemFlags(ItemFlag... itemFlags) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ItemMeta clone() {
        try {
            ItemMeta meta = (ItemMeta) super.clone();
            meta.setDisplayName(getDisplayName());
            meta.setLore(getLore());
            return meta;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override
    public String getDisplayName() {
        return name;
    }

    @Override
    public int getEnchantLevel(Enchantment ench) {
        return 0;
    }

    @Override
    public Map<Enchantment, Integer> getEnchants() {
        return ImmutableMap.of();
    }

    @Override
    public Set<ItemFlag> getItemFlags() {
        return ImmutableSet.of();
    }

    @Override
    public List<String> getLore() {
        return lore;
    }

    @Override
    public boolean hasConflictingEnchant(Enchantment ench) {
        return false;
    }

    @Override
    public boolean hasDisplayName() {
        return name != null;
    }

    @Override
    public boolean hasEnchant(Enchantment ench) {
        return false;
    }

    @Override
    public boolean hasEnchants() {
        return false;
    }

    @Override
    public boolean hasItemFlag(ItemFlag flag) {
        return false;
    }

    @Override
    public boolean hasLore() {
        return !lore.isEmpty();
    }

    @Override
    public boolean removeEnchant(Enchantment ench) {
        return false;
    }

    @Override
    public void removeItemFlags(ItemFlag... itemFlags) {
        // Empty!
    }

    @Override
    public Map<String, Object> serialize() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setDisplayName(String name) {
        this.name = name;
    }

    @Override
    public void setLore(List<String> lore) {
        this.lore = ImmutableList.copyOf(lore);
    }

    public Spigot spigot() {
        throw new UnsupportedOperationException();
    }

}
