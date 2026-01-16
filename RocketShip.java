// Zac Kimball
// 1/15/2026
// CPW 140
// Rocket Ship


public class RocketShip {
    public static final int ROCKET_SIZE = 3;
    
    public static void main( String[] args ) {
        printNoseCone();
        printBody();
        printNozzle();
    }

    /**
        Print the nozzle at the bottom of the rocket.
        This reuses the pattern of the nose cone.
     */
    public static void printNozzle() {
        printNoseCone();
    }
    
    /**
        Print the nose cone. There is a pattern of **
        down the middle of the cone with a widening pattern
        of //...\\ on either side.
     **/
    public static void printNoseCone() {

        for( int i = 0; i <= ROCKET_SIZE - 1; i++ ) {                // I had to space out lines to better understand the pattern.
            
            for( int j = 1; j <= ROCKET_SIZE - i; j++ ) {
                System.out.print( " " );
            }

            for( int j = 1; j <= i + 1; j++ ) {
                System.out.print( "/" );
            }

            System.out.print( "**" );

            for( int j = 1; j <= i + 1; j++ ) {
                System.out.print( "\\" );
            }
            
            System.out.println();
        }
        
    }
    
    /**
    Print body of rocket. This is a two-stage pattern
    with a diamond pattern in the top half and an
    hour glass on the bottom.
     */
    public static void printBody() {
        printEdge();
        printDiamondTop();
        printDiamondBottom();        
        printEdge();
        printDiamondBottom();        
        printDiamondTop();       
        printEdge();        
    }
    
    /**
        Print the top half of two diamonds between vertical lines.
     */
    public static void printDiamondTop() {
        for( int i = 3; i <= ROCKET_SIZE; i++ ) {
            System.out.print( "|" );

            for( int j = 1; j <= ROCKET_SIZE - 1; j++ ) {
                System.out.print( "./\\." );
            }
            
            System.out.println("|");
        }
        
            for( int i = 3; i <= ROCKET_SIZE; i++ ) {
                System.out.print( "|" );

                for( int j = 0; j <= ROCKET_SIZE; j++ ) {
                    System.out.print("/\\");
                }

                System.out.println("|");
            }

            
        }
    
    /**
        Print the bottom half of two diamonds between vertical lines.
     */
    public static void printDiamondBottom() {
        for( int i = 3; i <= ROCKET_SIZE; i++ ) {
            System.out.print( "|" );

            for( int j = 0; j <= ROCKET_SIZE; j++ ) {
                System.out.print("\\/");
            }

            System.out.println("|");
        }
        for( int i = 2; i <= ROCKET_SIZE - 1; i++ ) {          //It was at this time everything started falling in place
            System.out.print( "|" );

            for( int j = 1; j <= ROCKET_SIZE - 1; j++ ) {
                System.out.print( ".\\/." );
            }
            
            System.out.println("|");
            
        }
    }
    /**
        Print +=*=*=*...=+ to fit the width of the rocket.
     */
    public static void printEdge() {
        // your code goes here.
        //System.out.print( "+=" );
        
        for( int i = 4; i <= ROCKET_SIZE + 1; i++ ) {
            System.out.print( "+" );

            for( int j =1; j <= ROCKET_SIZE + 1; j++ ) {
                System.out.print( "=*" );
            }
            System.out.print( "+" );
        }
        System.out.println();
    }
}


//    /**\
//   //**\\
//  ///**\\\
// +=*=*=*=*+
// |./\../\.|
// |/\/\/\/\|
// |\/\/\/\/|
// |.\/..\/.|
// +=*=*=*=*+
// |\/\/\/\/|
// |.\/..\/.|
// |./\../\.|
// |/\/\/\/\|
// +=*=*=*=*+
//    /**\
//   //**\\
//  ///**\\\