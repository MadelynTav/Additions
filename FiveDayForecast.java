package nyc.c4q.ac21.weatherclock;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.io.IOException;
import java.net.URL;

/**
 * Created by c4q-madelyntavarez on 4/9/15.
 */
public class FiveDayForecast
{
    JSONObject object;


    public FiveDayForecast(String url)
    {       boolean type=true;
            URL mine = HTTP.stringToURL(url);
            String url1;
            url1 = HTTP.get(mine);
            object = (JSONObject) JSONValue.parse(url1);
    }

        public Double getTomorrowTemp()
            {
                JSONArray all = (JSONArray) object.get("list");
                if(all == null) return null;
                JSONObject block= (JSONObject) all.get(0);
                JSONObject temp= (JSONObject) block.get("temp");
                if(temp==null) return null;
                Double day = (Double) temp.get("day");
                Double day1= (((day- 273)* 9d/5) + 32);
                day1=Double.valueOf(day1.intValue());
                if(day == null) return null;

                return day1;
            }
    public Double getDayAfterTomorrowTemp()
    {
        JSONArray all = (JSONArray) object.get("list");
        if(all == null) return null;
        JSONObject block= (JSONObject) all.get(1);
        JSONObject temp= (JSONObject) block.get("temp");
        if(temp==null) return null;
        Double day = (Double) temp.get("day");
        Double day1= (((day- 273)* 9d/5) + 32);
        day1=Double.valueOf(day1.intValue());
        if(day == null) return null;

        return day1;
    }
    public Double getDayThreeTemp()
    {
        JSONArray all = (JSONArray) object.get("list");
        if(all == null) return null;
        JSONObject block= (JSONObject) all.get(2);
        JSONObject temp= (JSONObject) block.get("temp");
        if(temp==null) return null;
        Double day = (Double) temp.get("day");
        Double day1= (((day- 273)* 9d/5) + 32);
        day1=Double.valueOf(day1.intValue());
        if(day == null) return null;

        return day1;
    }
    public Double getDayFourTemp()
    {
        JSONArray all = (JSONArray) object.get("list");
        if(all == null) return null;
        JSONObject block= (JSONObject) all.get(3);
        JSONObject temp= (JSONObject) block.get("temp");
        if(temp==null) return null;
        Double day = (Double) temp.get("day");
        Double day1= (((day- 273)* 9d/5) + 32);
        day1=Double.valueOf(day1.intValue());
        if(day == null) return null;

        return day1;
    }
    public Double getDayFiveTemp()
    {
        JSONArray all = (JSONArray) object.get("list");
        if(all == null) return null;
        JSONObject block= (JSONObject) all.get(4);
        JSONObject temp= (JSONObject) block.get("temp");
        if(temp==null) return null;
        Double day = (Double) temp.get("day");
        Double day1= (((day- 273)* 9d/5) + 32);
        day1=Double.valueOf(day1.intValue());
        if(day == null) return null;

        return day1;
    }

    public String getTomorrowWeatherType(){
        JSONArray all = (JSONArray) object.get("list");
        if(all == null) return null;
        JSONObject block= (JSONObject) all.get(0);
        JSONArray weather=(JSONArray) block.get("weather");
        JSONObject look= (JSONObject) weather.get(0);
        String type= (String) look.get("description");
        return type;
    }

    public String getDayAfterTomorrowWeatherType(){
        JSONArray all = (JSONArray) object.get("list");
        if(all == null) return null;
        JSONObject block= (JSONObject) all.get(1);
        JSONArray weather=(JSONArray) block.get("weather");
        JSONObject look= (JSONObject) weather.get(0);
        String type= (String) look.get("description");
        return type;
    }
    public String getDayThreeWeatherType(){
        JSONArray all = (JSONArray) object.get("list");
        if(all == null) return null;
        JSONObject block= (JSONObject) all.get(2);
        JSONArray weather=(JSONArray) block.get("weather");
        JSONObject look= (JSONObject) weather.get(0);
        String type= (String) look.get("description");
        return type;
    }
    public String getDayFourWeatherType(){
        JSONArray all = (JSONArray) object.get("list");
        if(all == null) return null;
        JSONObject block= (JSONObject) all.get(3);
        JSONArray weather=(JSONArray) block.get("weather");
        JSONObject look= (JSONObject) weather.get(0);
        String type= (String) look.get("description");
        return type;
    }
    public String getDay5WeatherType(){
        JSONArray all = (JSONArray) object.get("list");
        if(all == null) return null;
        JSONObject block= (JSONObject) all.get(4);
        JSONArray weather=(JSONArray) block.get("weather");
        JSONObject look= (JSONObject) weather.get(0);
        String type= (String) look.get("description");
        return type;
    }
    }

