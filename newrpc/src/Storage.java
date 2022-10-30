public class Storage {
    private int ID;
    private String Potato;
    private String Cabbage;
    private String Onion;
    private int LocationID;
    public Storage(){ }
    public Storage(int ID,String Potato,String Cabbage, String Onion, int LocationID){
        this.ID = ID;
        this.Potato = Potato;
        this.Cabbage = Cabbage;
        this.Onion = Onion;
        this.LocationID = LocationID;
    }
    public int getID() {
        return ID;
    }
    public String getPotato() {
        return Potato;
    }
    public String getCabbage() {
        return Cabbage;
    }
    public String getOnion() {
        return Onion;
    }
    public int getLocationID() {
        return LocationID;
    }
    public void setID(Integer ID) {
        this.ID = ID;
    }
    public void setPotato(String Potato) {
        this.Potato = Potato;
    }
    public void setCabbage(String Cabbage) {
        this.Cabbage = Cabbage;
    }
    public void setOnion(String Onion) {
        this.Onion = Onion;
    }
    public void setLocationID(Integer LocationID) {
        this.LocationID = LocationID;
    }
}
