package org.bukkit.craftbukkit.v1_12_R1.block;

import net.minecraft.tileentity.TileEntityEnderChest;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.EnderChest;

public class CraftEnderChest extends CraftBlockEntityState<TileEntityEnderChest> implements EnderChest {

    public CraftEnderChest(final Block block) {
        super(block, TileEntityEnderChest.class);
    }

    public CraftEnderChest(final Material material, final TileEntityEnderChest te) {
        super(material, te);
    }
}
