import java.util.ArrayList;
import java.util.List;

public class RemoveElement {
    public static List<String> removeLongerThan(List<String> list, int maxLength ) {
        List<String> removed = new ArrayList<String>();
        for ( int i = list.size() - 1; i >= 0; i-- )
            if ( list.get( i ).length() >= maxLength ) {
                removed.add( list.get( i ) );
                list.remove( i );
            }
        return removed;
    }
}
