package cscd212comparators.lab2;

import cscd212classes.lab2.Television;

import java.util.Comparator;

public class TelevisionModelScreenSizeComparator implements Comparator<Television> {

    @Override
    public int compare(cscd212classes.lab2.Television t1, cscd212classes.lab2.Television t2){
        if(t1 == null || t2 == null){
            throw new IllegalArgumentException("null parameter in TelevisionModelScreenSizeComparator");
        }
        if(t1.getModel().compareTo(t2.getModel()) == 0){
            if(t1.getScreenSize() - t2.getScreenSize() == 0){
                return 0;
            }
            return t1.getScreenSize() - t2.getScreenSize();
        }
        return t1.getModel().compareTo(t2.getModel());
    }
}
