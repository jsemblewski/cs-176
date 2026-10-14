
package edu.monmouth.campusvehicle;

public class CampusVehicle {
    private String id;
    private String location;
    private boolean available;

    private final String DEFAULT_ID = "UNKNOWN";
    private final String DEFAULT_LOCATION = "UNKNOWN";
    private final boolean DEFAULT_AVAILABLE = true;

    public CampusVehicle() {
        setId(DEFAULT_ID);
        setLocation(DEFAULT_LOCATION);
        setAvailable(DEFAULT_AVAILABLE);
    }

    public CampusVehicle(String id, String location, boolean available) {
        setId(id);
        setLocation(location);
        setAvailable(available);
    }

    public String getId() {
        return id;
    }
    
    public void setId(String id) {
    if (id == null
            || id.isEmpty()
            || id.length() < 4
            || id.length() > 12
            || !id.startsWith("MU")) {
        this.id = DEFAULT_ID;
    } else {
        this.id = id;
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
        this.location = location;
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


    public void checkOut() {
        if (available) {
            available = false;
        }
    }


    public void returnVehicle() {
        available = true;
    }
}
