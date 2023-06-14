package net.sixik.crafttweakerutils.ct.entity.player.client;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.mojang.blaze3d.vertex.PoseStack;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@ZenCodeType.Name("mods.crafttweakerutils.api.client.MCPoseStack")
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
