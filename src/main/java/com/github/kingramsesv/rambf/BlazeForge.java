package com.github.kingramsesv.rambf;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod(BlazeForge.MODID)
public class BlazeForge {

    public static final String MODID = "rambf";

    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public BlazeForge(){
        LOGGER.debug("Hello from BlazeForge!");
    }

}
