package net.kaupenjoe.mccourse.item;

import net.kaupenjoe.mccourse.MCCourseMod;
import net.kaupenjoe.mccourse.entity.ModEntities;
import net.kaupenjoe.mccourse.item.custom.ChainsawItem;
import net.kaupenjoe.mccourse.item.custom.FuelItem;
import net.kaupenjoe.mccourse.item.custom.TomahawkItem;
import net.kaupenjoe.mccourse.item.custom.WarturtleArmorItem;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MCCourseMod.MOD_ID);

    public static final RegistryObject<Item> AZURITE = ITEMS.register("azurite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_AZURITE = ITEMS.register("raw_azurite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHAINSAW = ITEMS.register("chainsaw",
            () -> new ChainsawItem(new Item.Properties().durability(32)));
    public static final RegistryObject<Item> ONION = ITEMS.register("onion",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ONION)) {
                @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    pTooltipComponents.add(Component.translatable("tooltip.mccourse.onion.tooltip.1"));
                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }
            });
    public static final RegistryObject<Item> AURORA_ASHES = ITEMS.register("aurora_ashes",
            () -> new FuelItem(new Item.Properties(), 800));

    public static final RegistryObject<Item> CAPYBARA_SPAWN_EGG = ITEMS.register("capybara_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.CAPYBARA,0x664216, 0xdeab1f,
                    new Item.Properties()));
    public static final RegistryObject<Item> GIRAFFE_SPAWN_EGG = ITEMS.register("giraffe_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.GIRAFFE,0xe7d7a5, 0x7e5b41,
                    new Item.Properties()));
    public static final RegistryObject<Item> WARTURTLE_SPAWN_EGG = ITEMS.register("warturtle_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.WARTURTLE,0x7e9680, 0xc5d1c5,
                    new Item.Properties()));

    public static final RegistryObject<Item> TOMAHAWK = ITEMS.register("tomahawk",
            () -> new TomahawkItem(new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> IRON_WARTURTLE_ARMOR = ITEMS.register("iron_warturtle_armor",
            () -> new WarturtleArmorItem(ArmorMaterials.IRON, new Item.Properties().durability(200)));
    public static final RegistryObject<Item> GOLD_WARTURTLE_ARMOR = ITEMS.register("gold_warturtle_armor",
            () -> new WarturtleArmorItem(ArmorMaterials.GOLD, new Item.Properties().durability(400)));
    public static final RegistryObject<Item> DIAMOND_WARTURTLE_ARMOR = ITEMS.register("diamond_warturtle_armor",
            () -> new WarturtleArmorItem(ArmorMaterials.DIAMOND, new Item.Properties().durability(600)));
    public static final RegistryObject<Item> NETHERITE_WARTURTLE_ARMOR = ITEMS.register("netherite_warturtle_armor",
            () -> new WarturtleArmorItem(ArmorMaterials.NETHERITE, new Item.Properties().durability(800)));
    public static final RegistryObject<Item> AZURITE_WARTURTLE_ARMOR = ITEMS.register("azurite_warturtle_armor",
            () -> new WarturtleArmorItem(ArmorMaterials.IRON, new Item.Properties().durability(1000)));
    
    

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
