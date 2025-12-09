public class Lab20{

    public static void main(String[] args){

          HiddenWord puzzle = new HiddenWord("HARPS");
            System.out.println(puzzle.getHint("AAAAA") + " it should print +A+++");
            System.out.println(puzzle.getHint("HELLO") + " it should print H****");
            System.out.println(puzzle.getHint("HEART") + " it should print H*++*");
            System.out.println(puzzle.getHint("HARMS") + " it should print HAR*S");
            System.out.println(puzzle.getHint("HARPS") + " it should print HARPS");
    }

}//end class