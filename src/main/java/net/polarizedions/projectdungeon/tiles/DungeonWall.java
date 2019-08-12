package net.polarizedions.projectdungeon.tiles;

import de.ellpeck.rockbottom.api.entity.Entity;
import de.ellpeck.rockbottom.api.item.ItemInstance;
import de.ellpeck.rockbottom.api.tile.TileBasic;
import de.ellpeck.rockbottom.api.util.reg.ResourceName;
import de.ellpeck.rockbottom.api.world.IWorld;
import de.ellpeck.rockbottom.api.world.layer.TileLayer;
import net.polarizedions.projectdungeon.init.Resources;
import net.polarizedions.projectdungeon.init.Tiles;

import java.util.Collections;
import java.util.List;

public class DungeonWall extends TileBasic {
    public DungeonWall() {
        super(Resources.DUNGEON_WALL);
    }

    @Override
    public List<ItemInstance> getDrops(IWorld world, int x, int y, TileLayer layer, Entity destroyer) {
        return Collections.singletonList(new ItemInstance(Tiles.DUNGEON_WALL));
    }
}
