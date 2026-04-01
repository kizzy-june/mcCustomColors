package veemo.kizzyjune.customcolorz;

import net.neoforged.neoforge.common.ModConfigSpec;

public class Config {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    public static final ModConfigSpec.ConfigValue<String> CLOUD_COLOR_HEX;
    public static final ModConfigSpec.ConfigValue<String> SKY_COLOR_HEX;
    public static final ModConfigSpec.ConfigValue<String> FOLIAGE_COLOR_HEX;
    public static final ModConfigSpec.ConfigValue<String> GRASS_COLOR_HEX;
    public static final ModConfigSpec.ConfigValue<String> WATER_COLOR_HEX;
    public static final ModConfigSpec.ConfigValue<String> FOG_COLOR_HEX;
    public static final ModConfigSpec.ConfigValue<Boolean> USE_DEFAULT_CLOUD_COLOR;
    public static final ModConfigSpec.ConfigValue<Boolean> USE_DEFAULT_SKY_COLOR;
    public static final ModConfigSpec.ConfigValue<Boolean> USE_DEFAULT_FOLIAGE_COLOR;
    public static final ModConfigSpec.ConfigValue<Boolean> USE_DEFAULT_GRASS_COLOR;
    public static final ModConfigSpec.ConfigValue<Boolean> USE_DEFAULT_WATER_COLOR;
    public static final ModConfigSpec.ConfigValue<Boolean> USE_DEFAULT_FOG_COLOR;

    static {
        BUILDER.push("Color settings");

        CLOUD_COLOR_HEX = BUILDER
                .comment("The hex color for the clouds, this takes a few seconds to apply! Do F3 + T to apply faster!")
                .define("cloudColor", "#e35c07");

        SKY_COLOR_HEX = BUILDER
                .comment("The hex color for the sky")
                .define("skyColor", "#e35c07");

        FOLIAGE_COLOR_HEX = BUILDER
                .comment("The hex color for the foliage color, You need to do F3 + T after changing this option!")
                .define("foliageColor", "#e35c07");

        WATER_COLOR_HEX = BUILDER
                .comment("The hex color for the water color, You need to do F3 + T after changing this option!")
                .define("waterColor", "#e35c07");

        GRASS_COLOR_HEX = BUILDER
                .comment("The hex color for the grass color, You need to do F3 + T after changing this option!")
                .define("grassColor", "#e35c07");

        FOG_COLOR_HEX = BUILDER
                .comment("The hex color for the fog color, this takes a few seconds to apply!")
                .define("fogColor", "#e35c07");

        USE_DEFAULT_CLOUD_COLOR = BUILDER
                .comment("Use default cloud color, this takes a few seconds to apply! Do F3 + T to apply faster!")
                .define("useDefaultCloudColor", true);

        USE_DEFAULT_SKY_COLOR = BUILDER
                .comment("Use default sky color")
                .define("useDefaultSkyColor", true);

        USE_DEFAULT_FOLIAGE_COLOR = BUILDER
                .comment("Use default foliage color, You need to do F3 + T after changing this option!")
                .define("useDefaultFoliageColor", true);

        USE_DEFAULT_GRASS_COLOR = BUILDER
                .comment("Use default grass color, You need to do F3 + T after changing this option!")
                .define("useDefaultGrassColor", true);

        USE_DEFAULT_WATER_COLOR = BUILDER
                .comment("Use default water color, You need to do F3 + T after changing this option!")
                .define("useDefaultWaterColor", true);

        USE_DEFAULT_FOG_COLOR = BUILDER
                .comment("Use default fog color")
                .define("useDefaultFogColor", true);


        BUILDER.pop();
    }

    public static final ModConfigSpec SPEC = BUILDER.build();
}
