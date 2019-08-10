package net.polarizedions.projectdungeon;

import de.ellpeck.rockbottom.api.IApiHandler;
import de.ellpeck.rockbottom.api.IGameInstance;
import de.ellpeck.rockbottom.api.assets.IAssetManager;
import de.ellpeck.rockbottom.api.event.IEventHandler;
import de.ellpeck.rockbottom.api.mod.IMod;
import de.ellpeck.rockbottom.api.util.reg.ResourceName;
import net.polarizedions.projectdungeon.init.Resources;
import net.polarizedions.projectdungeon.init.Tiles;

import java.util.logging.Logger;

public class ProjectDungeon implements IMod{

    public static ProjectDungeon instance;

    private Logger modLogger;

    public ProjectDungeon(){
        instance = this;
    }

    public static Logger getLogger(){
        return instance.modLogger;
    }

    public static ResourceName createRes(String name){
        return new ResourceName(instance, name);
    }

    @Override
    public String getDisplayName(){
        return "Project Dungeon";
    }

    @Override
    public String getId(){
        return "projectdungeon";
    }

    @Override
    public String getVersion(){
        return "@VERSION@";
    }

    @Override
    public String getResourceLocation(){
        return "assets/projectdungeon";
    }

    @Override
    public String getDescription(){
        return "Adds fun dungeons to RockBottom";
    }

    @Override
    public void prePreInit(IGameInstance game, IApiHandler apiHandler, IEventHandler eventHandler){
        this.modLogger = apiHandler.createLogger(this.getDisplayName());
    }

    @Override
    public void preInit(IGameInstance game, IApiHandler apiHandler, IEventHandler eventHandler){

    }

    @Override
    public void init(IGameInstance game, IApiHandler apiHandler, IEventHandler eventHandler){
        Tiles.init();
    }

    @Override
    public void postInitAssets(IGameInstance game, IAssetManager assetManager, IApiHandler apiHandler){

    }

    @Override
    public void initAssets(IGameInstance game, IAssetManager assetManager, IApiHandler apiHandler) {
        assetManager.getShaderProgram(Resources.DUNGEON_WALL_TRIM).setDefaultValues(game.getWidth(), game.getHeight());
    }
}
