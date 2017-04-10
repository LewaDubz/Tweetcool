import sun.java2d.pipe.SpanShapeRenderer;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by byteforce on 2017.04.10..
 */
public class User {
    protected String name;
    protected String comment;

    public String getTime() {
        return sdf.toString();
    }

    public String getName() {
        return name;

    }

    public String getComment() {
        return comment;
    }
    protected  Calendar cal = Calendar.getInstance();
    protected String sdf = new String("YYYY-MM-DD-HH-mm");

    protected String time;

    public User(String name, String comment) {
        this.sdf = sdf.format(String.valueOf(cal.getTime()));
        this.name = name;
        this.comment = comment;

    }

}
