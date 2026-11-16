package edu.monmouth.campusvehicle;

public final class CampusVehicleConstants {

    public static final String DEFAULT_ID = "UNKNOWN";
    public static final String DEFAULT_LOCATION = "UNKNOWN";
    public static final boolean DEFAULT_AVAILABLE = true;
    public static final Color DEFAULT_COLOR = Color.unknown;

    public static final int MIN_ID_LENGTH = 6;
    public static final int MAX_ID_LENGTH = 18;

    public static final String ID_PREFIX = "MU";

    public static final String[] VALID_LOCATIONS = {
        "Library",
        "University Bluffs",
        "Parking Lot",
        "Spruce Hall",
        "Laurel Hall"
    };

    public static final int NUMBER_OF_VEHICLES = 10;
    public static final int INITIAL_ARRAY_SIZE = 5;

    private CampusVehicleConstants() {
    }
}
