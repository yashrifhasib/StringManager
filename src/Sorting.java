import java.util.ArrayList;
import java.util.List;

public class Sorting {
    public static ArrayList<String> Sort( ArrayList<String> allNames ) {
        int lowPosition;
        for ( int i = 0; i < allNames.size() - 1; i++ ) {
            lowPosition = i;
            for ( int j = i + 1; j < allNames.size(); j++ ) {
                if ( allNames.get( j ).toLowerCase().compareTo( allNames.get( lowPosition ).toLowerCase() ) < 0 ) {
                    lowPosition = j;
                }
            }
            Swap( i, lowPosition, allNames );
        }

        return allNames;
    }

    private static void Swap(int indexOne, int indexTwo, ArrayList<String> names) {
        names.set( indexOne, names.set( indexTwo, names.get( indexOne ) ) );
    }
}