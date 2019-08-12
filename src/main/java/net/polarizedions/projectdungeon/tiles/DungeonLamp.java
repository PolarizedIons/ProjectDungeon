package net.polarizedions.projectdungeon.tiles;

import de.ellpeck.rockbottom.api.entity.Entity;
import de.ellpeck.rockbottom.api.entity.player.AbstractEntityPlayer;
import de.ellpeck.rockbottom.api.item.ItemInstance;
import de.ellpeck.rockbottom.api.tile.Tile;
import de.ellpeck.rockbottom.api.tile.TileBasic;
import de.ellpeck.rockbottom.api.util.BoundBox;
import de.ellpeck.rockbottom.api.world.IWorld;
import de.ellpeck.rockbottom.api.world.layer.TileLayer;
import net.polarizedions.projectdungeon.init.Resources;
import net.polarizedions.projectdungeon.init.Tiles;

import java.util.Collections;
import java.util.List;

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

    @Override
    public boolean canPlaceInLayer(TileLayer layer) {
        return layer == TileLayer.MAIN;
    }

    @Override
    public boolean canPlace(IWorld world, int x, int y, TileLayer layer, AbstractEntityPlayer player) {
        return ! world.getState(TileLayer.BACKGROUND, x, y).getTile().isAir();
    }

    @Override
    public boolean canStay(IWorld world, int x, int y, TileLayer layer, int changedX, int changedY, TileLayer changedLayer) {
        return ! world.getState(TileLayer.BACKGROUND, x, y).getTile().isAir();
    }

    @Override
    public List<ItemInstance> getDrops(IWorld world, int x, int y, TileLayer layer, Entity destroyer) {
        return Collections.singletonList(new ItemInstance(Tiles.DUNGEON_LAMP));
    }
}
