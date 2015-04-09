package edu.syr.alice.util;

import java.util.logging.Logger;

/**
 * Created by Alice Yu on 3/22/15.
 * Email: zyu05@syr.edu
 */
public class AliceLogger {
    private static final String LOG_TAG = "Alice_Place_Logger";
    private static final Logger LOGGER = Logger.getLogger(LOG_TAG);

    public static void logI(String msg){
        LOGGER.info(msg);
    }

    public static void logW(String msg){
        LOGGER.warning(msg);
    }

    public static void logE(String msg){
        LOGGER.severe(msg);
    }
}
