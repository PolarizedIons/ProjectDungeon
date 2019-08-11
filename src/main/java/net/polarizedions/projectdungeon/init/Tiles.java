package net.polarizedions.projectdungeon.init;

import de.ellpeck.rockbottom.api.tile.Tile;
import de.ellpeck.rockbottom.api.tile.TileBasic;
import net.polarizedions.projectdungeon.ProjectDungeon;
import net.polarizedions.projectdungeon.tiles.DungeonLamp;
import net.polarizedions.projectdungeon.tiles.DungeonWallTrim;

public class Tiles {
    public static Tile DUNGEON_WALL_TRIM;
    public static Tile DUNGEON_WALL;
    private static Tile DUNGEON_LAMP;

    public static void init() {
        ProjectDungeon.getLogger().info("Loading Tiles...");
        DUNGEON_WALL_TRIM = new DungeonWallTrim().register();
        DUNGEON_WALL = new TileBasic(Resources.DUNGEON_WALL).register();
        DUNGEON_LAMP = new DungeonLamp().register();
    }
}
