package zaiCodeChallenges.dto.primary;

import java.io.Serializable;

public class PrimaryBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Request request;
    private Location location;
    private Current current;
    public void setRequest(Request request) {
         this.request = request;
     }
     public Request getRequest() {
         return request;
     }

    public void setLocation(Location location) {
         this.location = location;
     }
     public Location getLocation() {
         return location;
     }

    public void setCurrent(Current current) {
         this.current = current;
     }
     public Current getCurrent() {
         return current;
     }

}