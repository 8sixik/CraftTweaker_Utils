package net.sixik.crafttweakersixikutils.integration.crafttweaker.Entity.type.player.Client;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
<<<<<<< Updated upstream
=======
import com.blamejared.crafttweaker_annotations.annotations.Document;
>>>>>>> Stashed changes
import com.mojang.blaze3d.vertex.PoseStack;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
<<<<<<< Updated upstream
=======
@Document("mods/sixikutils/utils/entity/type/player/client/PoseStack")
>>>>>>> Stashed changes
@ZenCodeType.Name("mods.crafttweakerutils.api.client.PoseStack")
public class MCPoseStack {

    PoseStack poseStack;
    public MCPoseStack(PoseStack poseStack){
        this.poseStack = poseStack;
    }

    @ZenCodeType.Method
    public PoseStack getPoseStack() {
        return poseStack;
    }
}
