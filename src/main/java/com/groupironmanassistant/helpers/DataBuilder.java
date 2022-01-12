package com.groupironmanassistant.helpers;

        import com.google.gson.JsonObject;
        import com.google.gson.JsonArray;
        import com.groupironmanassistant.classes.GroupItem;
        import net.runelite.api.*;
        import net.runelite.api.coords.LocalPoint;
        import net.runelite.api.coords.WorldPoint;

        import java.util.Arrays;
        import java.util.LinkedList;
        import java.util.Queue;

public class DataBuilder {

    public class DataInventoryID {
        public final static int NOT_SET = -2;
        public final static int EMPTY = -1;
    }

    public class DataFlags {
        public final static int UNDEFINED = 0; // if set to undefined goal, the packet will send no matter what the upcomming tick
        public final static int NAME = 1;
        public final static int WORLD = 2;
        public final static int POSITION = 4;
        public final static int INVENTORY = 8;
        public final static int SKILLS = 16;
        public final static int EQUIPMENT = 32;
        public final static int HEALTH = 64;
        public final static int PRAYER = 128;
        public final static int ENERGY = 256;
        public final static int LOOT = 512;
        public final static int ACCOUNT_TYPE = 1024;

        public final static int ALL = NAME | WORLD | POSITION | HEALTH | PRAYER | ENERGY | INVENTORY | SKILLS | EQUIPMENT | ACCOUNT_TYPE; // | LOOT;
    }

    public final static int INVENTORY_SIZE = 28;
    public final static int EQUIPMENT_SIZE = 14; // 11 & 6 & 8 is missing for some reason, idk :D
    public final static int INVALID_WORLD = -1;

    public String name = null;
    public int world = INVALID_WORLD;
    public WorldPoint pos = null;
    public GroupItem[] groupitems = null;

    int health = -1;
    int prayer = -1;
    int energy = -1;
    int accountType = -1;

    public JsonObject data = null;

    public int goalProgress = DataFlags.UNDEFINED;
    public int goal = DataFlags.UNDEFINED;

    // indicates if data was modified
    public boolean wasChanged = false;

    public DataBuilder() {

    }

}