package net.brodino.weaponmasterfixin.client;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.LoggerFactory;

public class WeaponMasterFixinClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        LoggerFactory.getLogger("weaponmasterfixin").info("Initializing Weapon Master Fixin");
    }
}
