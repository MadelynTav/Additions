package nyc.c4q.ac21.weatherclock;
/**
 * Created by c4q-tashasmith on 4/9/15.
 */

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.net.URL;


public class WeatherData
{
    JSONObject object;


    public WeatherData(String url)
    {
        URL mine = HTTP.stringToURL(url);
            String url1;
            url1 = HTTP.get(mine);
            object = (JSONObject) JSONValue.parse(url1);
        }



    public Double getTemp()
    {
        JSONObject main;
        main = (JSONObject) object.get("main");
        if(main == null) return null;
        Double temp = (Double) main.get("temp");
        temp = (((temp - 273)* 1.8) + 32);
        temp= Double.valueOf(temp.shortValue());

        if(temp == null) return null;

        return temp;
    }

    public Double getPressure()
    {

        JSONObject main = (JSONObject) object.get("main");
        if(main == null)
        {
            return null;
        }
        Double pressure = (Double) main.get("pressure");
        pressure = (pressure * 0.02952998751);
        if(pressure == null)
        {
            return null;
        }

        return pressure;
    }

    public Long getHumidity()
    {
        JSONObject main = (JSONObject) object.get("main");
        if(main == null)
        {
            return null;
        }
        Long humidity = (Long) main.get("humidity");
        if(humidity == null)
        {
            return null;
        }
        return humidity;
    }


}

