
package edu.monmouth.campusvehicle;

public class CampusVehicle {
    private String id;
    private String location;
    private Color color;
    private boolean available;

    private final String DEFAULT_ID = "UNKNOWN";
    private final String DEFAULT_LOCATION = "UNKNOWN";
    private final boolean DEFAULT_AVAILABLE = true;
    private final Color DEFAULT_COLOR = Color.unknown;

    public CampusVehicle() {
        setId(DEFAULT_ID);
        setLocation(DEFAULT_LOCATION);
        setAvailable(DEFAULT_AVAILABLE);
        setColor(color);
    }

    public CampusVehicle(String id, String location, boolean available) {
        this(id, location, available, Color.unknown);
    }

    // New four-argument constructor
    public CampusVehicle(String id, String location,
                         boolean available, Color color) {
        setId(id);
        setLocation(location);
        setAvailable(available);
        setColor(color);
}

    public String getId() {
        return id;
    }
    
    public void setId(String id) {
    if (id == null
            || id.isEmpty()
            || id.length() < 6
            || id.length() > 18
            || !id.toUpperCase().startsWith("MU")) {
        this.id = DEFAULT_ID;
    } else {
        this.id = id.toLowerCase();
    }
}



    public String getLocation() {
        return location;
    }


    public void setLocation(String location) {
    	if (location != null
            && (location.equalsIgnoreCase("Library")
            || location.equalsIgnoreCase("University Bluffs")
            || location.equalsIgnoreCase("Parking Lot")
            || location.equalsIgnoreCase("Spruce Hall")
            || location.equalsIgnoreCase("Laurel Hall"))) {
        this.location = location.toLowerCase();
    } else {
        this.location = DEFAULT_LOCATION;
    }
}


    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    
    public Color getColor( ) {
    	return color;
    	
    }
    public void setColor(Color color) {
        if (color == null) {
            this.color = DEFAULT_COLOR;
        } else {
            this.color = color;
        }
    }


    public void checkOut() {
        if (available) {
            available = false;
        }
    }


    public void returnVehicle() {
        available = true;
    }
}

