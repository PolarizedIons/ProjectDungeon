package net.polarizedions.projectdungeon.render;

import de.ellpeck.rockbottom.api.IGameInstance;
import de.ellpeck.rockbottom.api.IRenderer;
import de.ellpeck.rockbottom.api.assets.IAssetManager;
import de.ellpeck.rockbottom.api.render.tile.DefaultTileRenderer;
import de.ellpeck.rockbottom.api.tile.state.TileState;
import de.ellpeck.rockbottom.api.util.reg.ResourceName;
import de.ellpeck.rockbottom.api.world.IWorld;
import de.ellpeck.rockbottom.api.world.layer.TileLayer;
import net.polarizedions.projectdungeon.init.Resources;
import net.polarizedions.projectdungeon.tiles.DungeonWall;

public class DungeonWallRenderer extends DefaultTileRenderer<DungeonWall> {
    public DungeonWallRenderer(ResourceName texture) {
        super(texture);
    }

    @Override
    public void render(IGameInstance game, IAssetManager manager, IRenderer g, IWorld world, DungeonWall tile, TileState state, int x, int y, TileLayer layer, float renderX, float renderY, float scale, int[] light) {
        ///IShaderProgram shader = RockBottomAPI.getGame().getAssetManager().getShaderProgram(Resources.DUNGEON_WALL);
        //shader.setUniform("time", RockBottomAPI.getGame().getWorld().getTotalTime());
        //g.setProgram(shader);
        super.render(game, manager, g, world, tile, state, x, y, layer, renderX, renderY, scale, light);
        //g.setProgram(null);
    }

    @Override
    public ResourceName getRenderShader(IGameInstance game, IAssetManager manager, IRenderer g, IWorld world, DungeonWall tile, TileState state, int x, int y, TileLayer layer) {
        return Resources.DUNGEON_WALL;
    }
}
