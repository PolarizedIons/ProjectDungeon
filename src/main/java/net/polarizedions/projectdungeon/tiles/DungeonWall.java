package net.polarizedions.projectdungeon.tiles;

import de.ellpeck.rockbottom.api.render.tile.ITileRenderer;
import de.ellpeck.rockbottom.api.tile.TileBasic;
import de.ellpeck.rockbottom.api.util.reg.ResourceName;
import net.polarizedions.projectdungeon.render.DungeonWallRenderer;

import static net.polarizedions.projectdungeon.init.Resources.DUNGEON_WALL;

public class DungeonWall extends TileBasic {
    public DungeonWall() {
        super(DUNGEON_WALL);
    }

    @Override
    protected ITileRenderer createRenderer(ResourceName name) {
        return new DungeonWallRenderer(name);
    }
}
