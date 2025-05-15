package net.brodino.weaponmasterfixin.mixin;

import com.minecraftserverzone.weaponmaster.setup.PlayerEntityExtension;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import org.spongepowered.asm.mixin.Mixin;


@Mixin(value = PlayerEntity.class, priority = 1500)
public abstract class WeaponMasterFix implements PlayerEntityExtension {

    public ItemStack hotbarSlot1;
    public ItemStack hotbarSlot2;
    public ItemStack hotbarSlot3;
    public ItemStack hotbarSlot4;
    public ItemStack hotbarSlot5;
    public ItemStack hotbarSlot6;
    public ItemStack hotbarSlot7;
    public ItemStack hotbarSlot8;
    public ItemStack hotbarSlot9;

    public ItemStack[] getHotbarSlots() {
        ItemStack air = new ItemStack(Items.AIR);
        return new ItemStack[]{
                this.hotbarSlot1 == null ? air : this.hotbarSlot1,
                this.hotbarSlot2 == null ? air : this.hotbarSlot2,
                this.hotbarSlot3 == null ? air : this.hotbarSlot3,
                this.hotbarSlot4 == null ? air : this.hotbarSlot4,
                this.hotbarSlot5 == null ? air : this.hotbarSlot5,
                this.hotbarSlot6 == null ? air : this.hotbarSlot6,
                this.hotbarSlot7 == null ? air : this.hotbarSlot7,
                this.hotbarSlot8 == null ? air : this.hotbarSlot8,
                this.hotbarSlot9 == null ? air : this.hotbarSlot9
        };
    }
}
