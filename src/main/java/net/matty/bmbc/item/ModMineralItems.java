package net.matty.bmbc.item;

import net.matty.bmbc.BetterMineBetterCraft;
import net.matty.bmbc.item.custom.tooltips.MineralWithToolTipItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModMineralItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BetterMineBetterCraft.MOD_ID);

    //// Ingots and their raw variants
    //public static final RegistryObject<Item> ALUMINIUM = ITEMS.register("aluminium_ingot",
    //        () -> new MineralWithToolTipItem(new Item.Properties()
    //                ,"Chem. Formula: ", "Al"));
//
    //public static final RegistryObject<Item> BERYLLIUM = ITEMS.register("beryllium_ingot",
    //        () -> new MineralWithToolTipItem(new Item.Properties()
    //                ,"Chem. Formula: ", "Be"));
//
    //public static final RegistryObject<Item> BORON = ITEMS.register("boron_ingot",
    //        () -> new MineralWithToolTipItem(new Item.Properties()
    //                ,"Chem. Formula: ", "B"));
//
    //// Calcium (solid metal)
    //public static final RegistryObject<Item> CALCIUM = ITEMS.register("calcium",
    //        () -> new MineralWithToolTipItem(new Item.Properties()
    //                ,"Chem. Formula: ", "Ca"));
//
    //// Chromium
    //public static final RegistryObject<Item> CHROMIUM = ITEMS.register("chromium",
    //        () -> new MineralWithToolTipItem(new Item.Properties()
    //                ,"Chem. Formula: ", "Cr"));
//
    //public static final RegistryObject<Item> GERMANIUM = ITEMS.register("germanium",
    //        () -> new MineralWithToolTipItem(new Item.Properties()
    //                ,"Chem. Formula: ", "Ge"));
//
    // Magnetic Iron
    public static final RegistryObject<Item> MAGNETIC_IRON_INGOT = ITEMS.register("magnetic_iron_ingot",
            () -> new MineralWithToolTipItem(new Item.Properties()
                    ,"Chem. Formula: ", "Fe"));
//
    //// Lithium
    //public static final RegistryObject<Item> LITHIUM = ITEMS.register("lithium_ingot",
    //        () -> new MineralWithToolTipItem(new Item.Properties()
    //                ,"Chem. Formula: ", "Li"));
//
    //// Magnesium
    //public static final RegistryObject<Item> MAGNESIUM = ITEMS.register("magnesium_ingot",
    //        () -> new MineralWithToolTipItem(new Item.Properties()
    //                ,"Chem. Formula: ", "Mg"));
//
    //// Manganese
    //public static final RegistryObject<Item> MANGANESE = ITEMS.register("manganese_ingot",
    //        () -> new MineralWithToolTipItem(new Item.Properties()
    //                ,"Chem. Formula: ", "Mn"));
//
    //// Phosphorus
    //// White Phosphorus (translucent waxy solid)
    //public static final RegistryObject<Item> WHITE_PHOSPHORUS = ITEMS.register("white_phosphorus",
    //        () -> new MineralWithToolTipItem(new Item.Properties()
    //                , "Chem. Formula: ", "P₄"));
//
    //// Red Phosphorus (crystalline material)
    //public static final RegistryObject<Item> RED_PHOSPHORUS = ITEMS.register("red_phosphorus",
    //        () -> new MineralWithToolTipItem(new Item.Properties()
    //                , "Chem. Formula: ", "P"));
//
    //// Black Phosphorus (layered material)
    //public static final RegistryObject<Item> BLACK_PHOSPHORUS = ITEMS.register("black_phosphorus",
    //        () -> new MineralWithToolTipItem(new Item.Properties()
    //                , "Chem. Formula: ", "P₄"));
//
    //// Potassium (solid metal)
    //public static final RegistryObject<Item> POTASSIUM = ITEMS.register("potassium_ingot",
    //        () -> new MineralWithToolTipItem(new Item.Properties()
    //                ,"Chem. Formula: ", "K"));
//
    //public static final RegistryObject<Item> PURE_SILICON = ITEMS.register("pure_silicon_ingot",
    //        () -> new MineralWithToolTipItem(new Item.Properties()
    //                ,"Chem. Formula: ", "Si"));
//
    //// Raw Cobalt
    //public static final RegistryObject<Item> RAW_COBALT = ITEMS.register("raw_cobalt",
    //        () -> new MineralWithToolTipItem(new Item.Properties()
    //                ,"Chem. Formula: ", "Si"));
//
    //// Scandium
    //public static final RegistryObject<Item> SCANDIUM = ITEMS.register("scandium",
    //        () -> new MineralWithToolTipItem(new Item.Properties()
    //                ,"Chem. Formula: ", "Sc"));
//
    //// Silicon (solid metalloid)
    //public static final RegistryObject<Item> SILICON_CRYSTAL = ITEMS.register("silicon_crystal",
    //        () -> new MineralWithToolTipItem(new Item.Properties()
    //                ,"Chem. Formula: ", "Si"));
//
    //public static final RegistryObject<Item> SILVER = ITEMS.register("silver_ingot",
    //        () -> new MineralWithToolTipItem(new Item.Properties()
    //                ,"Chem. Formula: ", "Ag"));
//
    //// Sodium
    //public static final RegistryObject<Item> SODIUM = ITEMS.register("sodium_ingot",
    //        () -> new MineralWithToolTipItem(new Item.Properties()
    //                ,"Chem. Formula: ", "Na"));
//
    //public static final RegistryObject<Item> SOLID_OXYGEN = ITEMS.register("solid_oxygen",
    //        () -> new MineralWithToolTipItem(new Item.Properties()
    //                ,"Chem. Formula: ", "O₂"));
//
    //// Sulfur (yellow solid)
    //public static final RegistryObject<Item> SULFUR_SOLID = ITEMS.register("sulfur_crystal",
    //        () -> new MineralWithToolTipItem(new Item.Properties()
    //                , "Chem. Formula: ", "S"));
//
    //// Sulfur Powder
    //public static final RegistryObject<Item> SULFUR_POWDER = ITEMS.register("sulfur_powder",
    //        () -> new MineralWithToolTipItem(new Item.Properties()
    //                , "Chem. Formula: ", "S"));
//
    //// Titanium
    //public static final RegistryObject<Item> TITANIUM = ITEMS.register("titanium_ingot",
    //        () -> new MineralWithToolTipItem(new Item.Properties()
    //                , "Chem. Formula: ", "Ti"));
//
    //// Vanadium
    //public static final RegistryObject<Item> VANADIUM = ITEMS.register("vanadium_ingot",
    //        () -> new MineralWithToolTipItem(new Item.Properties()
    //                , "Chem. Formula: ", "V"));
//
    //// Minerals
    // Carnallite
    public static final RegistryObject<Item> CARNALLITE = ITEMS.register("carnallite",
            () -> new MineralWithToolTipItem(new Item.Properties(),
                    "Chem. Formula: ", "KMgCl₃·6(H₂O)"));

    // Crushed Bauxite
    public static final RegistryObject<Item> CRUSHED_BAUXITE = ITEMS.register("crushed_bauxite",
            () -> new MineralWithToolTipItem(new Item.Properties(),
                    "Chem. Formula: ", "Al₂H₂O₄"));

    // Dolomite
    public static final RegistryObject<Item> DOLOMITE = ITEMS.register("dolomite",
            () -> new MineralWithToolTipItem(new Item.Properties(),
                    "Chem. Formula: ", "CaMg(CO₃)₂"));

    // Evaporite
    public static final RegistryObject<Item> EVAPORITE = ITEMS.register("evaporite",
            () -> new MineralWithToolTipItem(new Item.Properties(),
                    "Chem. Formula: ", "NaCl"));

    // Magnesite
    public static final RegistryObject<Item> MAGNESITE = ITEMS.register("magnesite",
            () -> new MineralWithToolTipItem(new Item.Properties(),
                    "Chem. Formula: ", "MgCO₃"));

    // Pegmatite
    public static final RegistryObject<Item> PEGMATITE = ITEMS.register("pegmatite",
            () -> new Item(new Item.Properties()));

    // Phosphorite
    public static final RegistryObject<Item> PHOSPHORITE = ITEMS.register("phosphorite",
            () -> new MineralWithToolTipItem(new Item.Properties(),
                    "Chem. Formula: ", "Ca₅(PO₄)F₃"));

    // Bauxite
    public static final RegistryObject<Item> BAUXITE = ITEMS.register("raw_bauxite",
            () -> new MineralWithToolTipItem(new Item.Properties(),
                    "Chem. Formula: ", "Al₂H₂O₄"));

    public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
