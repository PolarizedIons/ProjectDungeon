package net.polarizedions.projectdungeon.render;

import de.ellpeck.rockbottom.api.IGameInstance;
import de.ellpeck.rockbottom.api.IRenderer;
import de.ellpeck.rockbottom.api.RockBottomAPI;
import de.ellpeck.rockbottom.api.assets.IAssetManager;
import de.ellpeck.rockbottom.api.assets.IShaderProgram;
import de.ellpeck.rockbottom.api.render.tile.DefaultTileRenderer;
import de.ellpeck.rockbottom.api.tile.state.TileState;
import de.ellpeck.rockbottom.api.util.reg.ResourceName;
import de.ellpeck.rockbottom.api.world.IWorld;
import de.ellpeck.rockbottom.api.world.layer.TileLayer;
import net.polarizedions.projectdungeon.init.Resources;
import net.polarizedions.projectdungeon.tiles.DungeonWallTrim;

public class DungeonWallTrimRenderer extends DefaultTileRenderer<DungeonWallTrim> {
    public DungeonWallTrimRenderer(ResourceName texture) {
        super(texture);
    }

    @Override
    public void render(IGameInstance game, IAssetManager manager, IRenderer g, IWorld world, DungeonWallTrim tile, TileState state, int x, int y, TileLayer layer, float renderX, float renderY, float scale, int[] light) {
        IShaderProgram shader = RockBottomAPI.getGame().getAssetManager().getShaderProgram(Resources.DUNGEON_WALL_TRIM);
        shader.setUniform("time", RockBottomAPI.getGame().getWorld().getTotalTime());
        shader.setUniform("resolution", RockBottomAPI.getGame().getWidth(), RockBottomAPI.getGame().getHeight());
        g.setProgram(shader);
        super.render(game, manager, g, world, tile, state, x, y, layer, renderX, renderY, scale, light);
        g.setProgram(null);
    }
}
