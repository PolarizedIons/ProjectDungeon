package net.polarizedions.projectdungeon.tiles;

import de.ellpeck.rockbottom.api.entity.Entity;
import de.ellpeck.rockbottom.api.item.ItemInstance;
import de.ellpeck.rockbottom.api.render.tile.ITileRenderer;
import de.ellpeck.rockbottom.api.tile.TileBasic;
import de.ellpeck.rockbottom.api.util.reg.ResourceName;
import de.ellpeck.rockbottom.api.world.IWorld;
import de.ellpeck.rockbottom.api.world.layer.TileLayer;
import net.polarizedions.projectdungeon.init.Tiles;
import net.polarizedions.projectdungeon.render.DungeonWallTrimRenderer;

import java.util.Collections;
import java.util.List;

import static net.polarizedions.projectdungeon.init.Resources.DUNGEON_WALL_TRIM;

public class DungeonWallTrim extends TileBasic {
    public DungeonWallTrim() {
        super(DUNGEON_WALL_TRIM);
    }

    @Override
    protected ITileRenderer createRenderer(ResourceName name) {
        return new DungeonWallTrimRenderer(name);
    }
}
