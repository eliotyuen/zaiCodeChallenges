package zaiCodeChallenges.dto.primary;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Location {

    private String name;
    private String country;
    private String region;
    private String lat;
    private String lon;
    @JsonProperty("timezone_id")
    private String timezoneId;
    private String localtime;
    @JsonProperty("localtime_epoch")
    private int localtimeEpoch;
    @JsonProperty("utc_offset")
    private String utcOffset;
    public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }

    public void setCountry(String country) {
         this.country = country;
     }
     public String getCountry() {
         return country;
     }

    public void setRegion(String region) {
         this.region = region;
     }
     public String getRegion() {
         return region;
     }

    public void setLat(String lat) {
         this.lat = lat;
     }
     public String getLat() {
         return lat;
     }

    public void setLon(String lon) {
         this.lon = lon;
     }
     public String getLon() {
         return lon;
     }

    public void setTimezoneId(String timezoneId) {
         this.timezoneId = timezoneId;
     }
     public String getTimezoneId() {
         return timezoneId;
     }

    public void setLocaltime(String localtime) {
         this.localtime = localtime;
     }
     public String getLocaltime() {
         return localtime;
     }

    public void setLocaltimeEpoch(int localtimeEpoch) {
         this.localtimeEpoch = localtimeEpoch;
     }
     public int getLocaltimeEpoch() {
         return localtimeEpoch;
     }

    public void setUtcOffset(String utcOffset) {
         this.utcOffset = utcOffset;
     }
     public String getUtcOffset() {
         return utcOffset;
     }

}