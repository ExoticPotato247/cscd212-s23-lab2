package cscd212comparators.lab2;

import cscd212classes.lab2.Television;

import java.util.Comparator;

public class TelevisionResolutionMakeDescendingComparator implements Comparator<Television> {
    @Override
    public int compare(cscd212classes.lab2.Television t1, cscd212classes.lab2.Television t2){
        if (t1 == null || t2 == null){
            throw new IllegalArgumentException("null parameter in TelevisionResolutionMakeDescendingComparator");
        }
        if (t2.getResolution() - t1.getResolution() == 0){
            if(t2.getMake().compareTo(t1.getMake()) == 0){
                return 0;
            }
            return t2.getMake().compareTo(t1.getMake());
        }
        return t2.getResolution() - t1.getResolution();
    }
}
