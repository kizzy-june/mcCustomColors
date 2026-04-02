package veemo.kizzyjune.customcolorz;

public class ColorProcessor {

    // Too lazy to give all longs and strings unique names so for every int it's just longA and Hex

    public static int cloudColor() {
        String Hex = Config.CLOUD_COLOR_HEX.get();

        if (Hex.startsWith("#")) {
            Hex = Hex.substring(1);
        }

        try {
            long longA = Long.parseLong(Hex, 16);

            if (Hex.length() <= 6) {
                return (int) (-1876985 | longA);
            }
            return (int) longA;
        } catch (NumberFormatException e) {
            return -1876985;
        }
    }

    public static int skyColor() {
        String Hex = Config.SKY_COLOR_HEX.get();

        if (Hex.startsWith("#")) {
            Hex = Hex.substring(1);
        }

        try {
            long longA = Long.parseLong(Hex, 16);

            if (Hex.length() <= 6) {
                return (int) (-1876985 | longA);
            }
            return (int) longA;
        } catch (NumberFormatException e) {
            return 1876985;
        }
    }

    public static int foliageColor() {
        String Hex = Config.FOLIAGE_COLOR_HEX.get();

        if (Hex.startsWith("#")) {
            Hex = Hex.substring(1);
        }

        try {
            long longA = Long.parseLong(Hex, 16);

            if (Hex.length() <= 6) {
                return (int) (-1876985 | longA);
            }
            return (int) longA;
        } catch (NumberFormatException e) {
            return -1876985;

        }
    }

    public static int waterColor() {
        String Hex = Config.WATER_COLOR_HEX.get();

        if (Hex.startsWith("#")) {
            Hex = Hex.substring(1);
        }

        try {
            long longA = Long.parseLong(Hex, 16);

            if (Hex.length() <= 6) {
                return (int) (-1876985 | longA);
            }
            return (int) longA;
        } catch (NumberFormatException e) {
            return -1876985;
        }
    }

    public static int grassColor() {
        String Hex = Config.GRASS_COLOR_HEX.get();

        if (Hex.startsWith("#")) {
            Hex = Hex.substring(1);
        }

        try {
            long longA = Long.parseLong(Hex, 16);

            if (Hex.length() <= 6) {
                return (int) (-1876985 | longA);
            }
            return (int) longA;
        } catch (NumberFormatException e) {
            return -1876985;
        }
    }

    public static int fogColor() {
        String Hex = Config.FOG_COLOR_HEX.get();

        if (Hex.startsWith("#")) {
            Hex = Hex.substring(1);
        }

        try {
            long longA = Long.parseLong(Hex, 16);

            if (Hex.length() <= 6) {
                return (int) (-1876985 | longA);
            }
            return (int) longA;
        } catch (NumberFormatException e) {
            return -1876985;
        }
    }
}
