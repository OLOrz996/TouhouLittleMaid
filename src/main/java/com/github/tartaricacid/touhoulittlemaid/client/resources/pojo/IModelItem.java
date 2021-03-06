package com.github.tartaricacid.touhoulittlemaid.client.resources.pojo;

import net.minecraft.util.ResourceLocation;

import java.util.List;

public interface IModelItem {
    ResourceLocation getModelId();

    String getName();

    ResourceLocation getModel();

    List<ResourceLocation> getAnimation();

    ResourceLocation getTexture();

    List<String> getDescription();

    float getRenderItemScale();

    <T extends IModelItem> T decorate();
}
