package cscd212comparators.lab2;

import cscd212classes.lab2.Television;

import java.util.Comparator;

public class TelevisionScreenSizeComparator implements Comparator<Television> {
    @Override
    public int compare(cscd212classes.lab2.Television t1, cscd212classes.lab2.Television t2){
        if(t1 == null || t2 == null){
            throw new IllegalArgumentException("null parameter in TelevisionScreenSizeComparator");
        }
        if(t1.getScreenSize() - t2.getScreenSize() == 0){
            return 0;
        }
        return t1.getScreenSize() - t2.getScreenSize();
    }
}
