package net.polarizedions.projectdungeon.init;

import de.ellpeck.rockbottom.api.tile.Tile;
import net.polarizedions.projectdungeon.ProjectDungeon;
import net.polarizedions.projectdungeon.tiles.DungeonWall;

public class Tiles {
    public static Tile DUNGEON_WALL;

    public static void init() {
        ProjectDungeon.getLogger().info("Loading Tiles...");
        DUNGEON_WALL = new DungeonWall().register();

    }
}
