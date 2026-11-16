
package edu.monmouth.campusvehicle;

public class CampusVehicle {

    private String id;
    private String location;
    private Color color;
    private boolean available;

    public CampusVehicle() {
        setId(CampusVehicleConstants.DEFAULT_ID);
        setLocation(CampusVehicleConstants.DEFAULT_LOCATION);
        setAvailable(CampusVehicleConstants.DEFAULT_AVAILABLE);
        setColor(CampusVehicleConstants.DEFAULT_COLOR);
    }

    public CampusVehicle(String id, String location, boolean available) {
        this(id, location, available, CampusVehicleConstants.DEFAULT_COLOR);
    }

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
                || id.length() < CampusVehicleConstants.MIN_ID_LENGTH
                || id.length() > CampusVehicleConstants.MAX_ID_LENGTH
                || !id.toUpperCase().startsWith(CampusVehicleConstants.ID_PREFIX)) {

            this.id = CampusVehicleConstants.DEFAULT_ID;

        } else {
            this.id = id.toLowerCase();
        }
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {

        boolean valid = false;

        if (location != null) {

            for (String validLocation : CampusVehicleConstants.VALID_LOCATIONS) {

                if (location.equalsIgnoreCase(validLocation)) {
                    valid = true;
                    break;
                }
            }
        }

        if (valid) {
            this.location = location.toLowerCase();
        } else {
            this.location = CampusVehicleConstants.DEFAULT_LOCATION;
        }
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {

        if (color == null) {
            this.color = CampusVehicleConstants.DEFAULT_COLOR;
        } else {
            this.color = color;
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

