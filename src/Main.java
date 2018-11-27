import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main( String[] args ) {
        List<String> names = new ArrayList<String>();
        names.add( "Bob" );names.add( "John" );names.add( "Eric" );names.add( "Yashrif" );names.add( "Saiful" );
        names.add( "Wiggle" );names.add( "NikoBro" );names.add( "Burzinsky" );names.add( "Gold" );names.add( "Victor" );

        System.out.println( RemoveElement.removeLongerThan( names, 7 ) );
        System.out.println( Sorting.Sort( ( ArrayList<String> ) names  ) );
    }
}
