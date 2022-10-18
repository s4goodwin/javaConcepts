public class nestedForLoop {

    public static void main(String[] args) {

        //https://www.youtube.com/watch?v=sk9xYje9XAQ&list=PL59LTecnGM1Mg6I4i_KbS0w5bPcDjl7oz&index=1

        for (int i = 0; i < 5; i++){
            System.out.println("this will print 5 times");
        }
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        String[] colors = {"red", "blue", "green"};
        for (int i = 0; i < colors.length; i++){
            System.out.println(colors[i]);
        }
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        String[][] fancyColors = {{"red", "blue", "green"},
                                  {"cyan", "magenta", "turquoise"}};
        for (int i = 0; i < 2; i++){                                            //loops through row
            for (int j = 0; j < 3; j++){                                        //loops through column
                System.out.println(fancyColors[i][j]);
            }
        }
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 10; j++){
                System.out.println("i is "+ i +" and j is "+ j);
            }
        }
    }

}
