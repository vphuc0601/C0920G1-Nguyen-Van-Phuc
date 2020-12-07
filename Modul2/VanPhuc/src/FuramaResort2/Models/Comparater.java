package FuramaResort2.Models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class Comparater implements Comparator<Custosmer> {
    @Override
    public int compare(Custosmer o1, Custosmer o2) {
        if (o1.getHoten().equals(o2.getHoten())) {
            SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
            Date date1 = null;
            Date date2 = null;
            try {
                date1 = f.parse(o1.getNgaysinh());
                date2 = f.parse(o2.getNgaysinh());
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (date1.compareTo(date2) == 0) {
                return o1.getHoten().compareTo(o2.getHoten());
            } else {
                return date1.compareTo(date2);
            }
        }
        return o1.getHoten().compareTo(o2.getHoten());
    }
}

