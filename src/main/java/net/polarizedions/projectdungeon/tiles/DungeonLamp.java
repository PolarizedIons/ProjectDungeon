package net.polarizedions.projectdungeon.tiles;

import de.ellpeck.rockbottom.api.tile.TileBasic;
import de.ellpeck.rockbottom.api.util.BoundBox;
import de.ellpeck.rockbottom.api.world.IWorld;
import de.ellpeck.rockbottom.api.world.layer.TileLayer;
import net.polarizedions.projectdungeon.init.Resources;

public class DungeonLamp extends TileBasic {
    public DungeonLamp() {
        super(Resources.DUNGEON_LAMP);
    }

    @Override
    public int getLight(IWorld world, int x, int y, TileLayer layer) {
        return 40;
    }

    @Override
    public BoundBox getBoundBox(IWorld world, int x, int y, TileLayer layer) {
        return null;
    }

    @Override
    public boolean isFullTile() {
        return false;
    }
}
