package dev.joshiy13.nocraftingtable.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.minecraft.block.Blocks;
import net.minecraft.util.ActionResult;

public class NocraftingtableClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        UseBlockCallback.EVENT.register((player, world, hand, hitResult) -> {
            if (world.getBlockState(hitResult.getBlockPos()).getBlock() == Blocks.CRAFTING_TABLE) {
                return ActionResult.FAIL;
            }
            return ActionResult.PASS;
        });
    }
}
