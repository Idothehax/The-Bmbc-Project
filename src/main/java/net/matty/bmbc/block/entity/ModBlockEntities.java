package net.matty.bmbc.block.entity;

import net.matty.bmbc.BetterMineBetterCraft;
import net.matty.bmbc.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, BetterMineBetterCraft.MOD_ID);

    public static final RegistryObject<BlockEntityType<PressureVesselBlockEntity>> PRESSURE_VESSEL =
            BLOCK_ENTITIES.register("pressure_vessel", () ->
                    BlockEntityType.Builder.of(PressureVesselBlockEntity::new,
                            ModBlocks.PRESSURE_VESSEL.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }

}
