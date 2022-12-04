public class IntArrayFormatter {
    private String array;
    private String all;

    public IntArrayFormatter() { //Not exactly needed, but I decided to initialize the Strings since my instructor tells me to
        array = "[";
        all = "";
    }

    public String Format (int[] clone) { //Formats 1D array
        array = "[";

        for (int i=0;i<clone.length;i++) {
            array += clone[i] + ", ";
        }
        array += "\b\b]";
        return array;
    }

    public String Format2D (int[][] clone, int j) { //Formats 2D arrays, int for which intended level
        array = "[";

        for (int i=0;i<clone[j].length;i++) {
            array += clone[j][i] + ", ";
        }

        array += "\b\b]";
        return array;
    }

    public String Format3D (int[][][] clone, int j, int k) { //Formats 3D arrays, ints for which intended level
        array = "[";

        for (int i=0;i<clone[j][k].length;i++) {
            array += clone[j][k][i] + ", ";
        }

        array += "\b\b]";
        return array;
    }


    public String formatAll2D (int[][] clone) { //Formats the 2D array into a nice package
        all = "";

        for (int i=0;i<clone.length;i++) {
                all += "[" + i + "]: " + Format2D(clone, i) + "\n";
        }

       return all;
    }

    public String formatAll3D (int[][][] clone) { //Formats the 3D array into a nice package
        all = "";

        for (int i = 0; i < clone.length; i++) {
            for (int j = 0; j < clone[i].length; j++) {
                all += "[" + i + "][" + j + "]: " + Format3D(clone, i, j) + "\n";
            }
        }

        return all;
    }

    /* Hope you all enjoy! This is just a simple project I decided to upload this for use on my other PCs as well as for whoever wants a small formatting class :)*/

}

