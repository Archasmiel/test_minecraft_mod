package com.archasmiel.lightandgloom.item.armor.copper;

import com.archasmiel.lightandgloom.util.ModArmorMaterial;
import com.archasmiel.lightandgloom.item.ModItems;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;

public class CopperBoots extends ArmorItem {

    public CopperBoots() {
        super(ModArmorMaterial.COPPER, EquipmentSlotType.FEET, ModItems.usualItemTab);
    }

}
