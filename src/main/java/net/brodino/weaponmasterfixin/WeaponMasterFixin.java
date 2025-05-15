package net.brodino.weaponmasterfixin;

import net.fabricmc.api.ModInitializer;
import org.slf4j.LoggerFactory;

public class WeaponMasterFixin implements ModInitializer {

    @Override
    public void onInitialize() {
        LoggerFactory.getLogger("weaponmasterfixin").info("Initializing Weapon Master Fixin");
    }
}
