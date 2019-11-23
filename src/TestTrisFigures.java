public class TestTrisFigures implements TestTrisFiguresInterface {

    int[][] figA =
            {{79, 32, 32, 32},
                    {79, 32, 32, 32},
                    {79, 32, 32, 32},
                    {79, 32, 32, 32}};

    int[][] figB =
            {{32, 32, 32},
                    {79, 79, 79},
                    {32, 79, 32}};

    int[][] figC =
            {{79, 79},
                    {79, 79}};

    int[][] figD =
            {{79, 32, 32, 32},
                    {79, 32, 32, 32},
                    {79, 32, 32, 32},
                    {79, 79, 32, 32}};

    int[][] figE =
            {{32, 32, 32, 79},
                    {32, 32, 32, 79},
                    {32, 32, 32, 79},
                    {32, 32, 79, 79}};

    int[][] figF =
            {{32, 32, 32},
                    {32, 79, 79},
                    {79, 79, 32}};


    @Override
    public void rotateRight(String fig) {

        if (fig == "figA") {

            int[][] temp = new int[figA.length][figA.length];

            int k = figA.length - 1;

            for (int i = 0; i < figA.length; i++) {
                for (int j = 0; j < figA[0].length; j++) {
                    temp[i][k] = figA[j][i];
                    k = k - 1;
                }
                k = figA.length - 1;
            }

            for (int i = 0; i < figA.length; i++) {
                for (int j = 0; j < figA[0].length; j++) {
                    figA[i][j] = temp[i][j];
                }
            }

        } else if (fig == "figB") {

            int[][] temp = new int[figB.length][figB.length];

            int k = figB.length - 1;

            for (int i = 0; i < figB.length; i++) {
                for (int j = 0; j < figB[0].length; j++) {
                    temp[i][k] = figB[j][i];
                    k = k - 1;
                }
                k = figB.length - 1;
            }

            for (int i = 0; i < figB.length; i++) {
                for (int j = 0; j < figB.length; j++) {
                    figB[i][j] = temp[i][j];
                }
            }

        } else if (fig == "figC") {

            int[][] temp = new int[figC.length][figC.length];

            int k = figC.length - 1;

            for (int i = 0; i < figC.length; i++) {
                for (int j = 0; j < figC[0].length; j++) {
                    temp[i][k] = figC[j][i];
                    k = k - 1;
                }
                k = figC.length - 1;
            }

            for (int i = 0; i < figC.length; i++) {
                for (int j = 0; j < figC.length; j++) {
                    figC[i][j] = temp[i][j];
                }
            }
        } else if (fig == "figD") {

            int[][] temp = new int[figD.length][figD.length];

            int k = figD.length - 1;

            for (int i = 0; i < figD.length; i++) {
                for (int j = 0; j < figD[0].length; j++) {
                    temp[i][k] = figD[j][i];
                    k = k - 1;
                }
                k = figD.length - 1;
            }

            for (int i = 0; i < figD.length; i++) {
                for (int j = 0; j < figD.length; j++) {
                    figD[i][j] = temp[i][j];
                }
            }
        } else if (fig == "figE") {

            int[][] temp = new int[figE.length][figE.length];

            int k = figE.length - 1;

            for (int i = 0; i < figE.length; i++) {
                for (int j = 0; j < figE[0].length; j++) {
                    temp[i][k] = figE[j][i];
                    k = k - 1;
                }
                k = figE.length - 1;
            }

            for (int i = 0; i < figE.length; i++) {
                for (int j = 0; j < figE.length; j++) {
                    figE[i][j] = temp[i][j];
                }
            }
        } else if (fig == "figF") {

            int[][] temp = new int[figF.length][figF.length];

            int k = figF.length - 1;

            for (int i = 0; i < figF.length; i++) {
                for (int j = 0; j < figF[0].length; j++) {
                    temp[i][k] = figF[j][i];
                    k = k - 1;
                }
                k = figF.length - 1;
            }

            for (int i = 0; i < figF.length; i++) {
                for (int j = 0; j < figF.length; j++) {
                    figF[i][j] = temp[i][j];
                }
            }

        }

    }

    @Override
    public void rotateLeft(String fig) {

        if (fig == "figA") {

            int[][] temp = new int[figA.length][figA.length];
            int k = 0;
            for (int i = figA.length - 1; i > -1; i--) {
                for (int j = 0; j < figA.length; j++) {
                    temp[i][j] = figA[j][k];
                }
                k++;
            }

            for (int i = 0; i < figA.length; i++) {
                for (int j = 0; j < figA.length; j++) {
                    figA[i][j] = temp[i][j];
                }
            }

        } else if (fig == "figB") {

            int[][] temp = new int[figB.length][figB.length];
            int k = 0;
            for (int i = figB.length - 1; i > -1; i--) {
                for (int j = 0; j < figB.length; j++) {
                    temp[i][j] = figB[j][k];
                }
                k++;
            }

            for (int i = 0; i < figB.length; i++) {
                for (int j = 0; j < figB.length; j++) {
                    figB[i][j] = temp[i][j];
                }
            }

        } else if (fig == "figC") {

            int[][] temp = new int[figC.length][figC.length];
            int k = 0;
            for (int i = figC.length - 1; i > -1; i--) {
                for (int j = 0; j < figC.length; j++) {
                    temp[i][j] = figC[j][k];
                }
                k++;
            }

            for (int i = 0; i < figC.length; i++) {
                for (int j = 0; j < figC.length; j++) {
                    figC[i][j] = temp[i][j];
                }
            }
        } else if (fig == "figD") {

            int[][] temp = new int[figD.length][figD.length];
            int k = 0;
            for (int i = figD.length - 1; i > -1; i--) {
                for (int j = 0; j < figD.length; j++) {
                    temp[i][j] = figD[j][k];
                }
                k++;
            }

            for (int i = 0; i < figD.length; i++) {
                for (int j = 0; j < figD.length; j++) {
                    figD[i][j] = temp[i][j];
                }
            }
        } else if (fig == "figE") {

            int[][] temp = new int[figE.length][figE.length];
            int k = 0;
            for (int i = figE.length - 1; i > -1; i--) {
                for (int j = 0; j < figE.length; j++) {
                    temp[i][j] = figE[j][k];
                }
                k++;
            }

            for (int i = 0; i < figE.length; i++) {
                for (int j = 0; j < figE.length; j++) {
                    figE[i][j] = temp[i][j];
                }
            }
        } else if (fig == "figF") {

            int[][] temp = new int[figF.length][figF.length];
            int k = 0;
            for (int i = figF.length - 1; i > -1; i--) {
                for (int j = 0; j < figF.length; j++) {
                    temp[i][j] = figF[j][k];
                }
                k++;
            }

        }

    }

    @Override
    public void AlignFigBBlockLeft() {

        boolean test = false;

        for (int i = 0; i < figB.length; i++) {
            if (figB[i][0] == 32) {
                test = true;
            }
        }

        if (test) {
            for (int i = 0; i < figB.length; i++) {
                for (int j = 1; j < figB.length; j++) {
                    figB[i][j - 1] = figB[i][j];
                    figB[i][j] = 32;
                }
            }

        }
    }

    @Override
    public void AlignFigBlockRight() {

        boolean test = false;

        for (int i = 0; i < 2; i++) {
            if (figB[i][2] == 32) {
                test = true;
            }
        }

        if (test) {
            for (int i = 2; i > 0; i--) {
                for (int j = 0; j<2; j++) {
                    figB[j][i-1] = figB[j][i];
                    figB[j][i] = 32;
                }
            }
        }
    }

    @Override
    public void showFigA() {
        for (int i = 0; i < figA.length; i++) {
            for (int j = 0; j < figA.length; j++) {
                System.out.print((char) figA[i][j]);
            }
            System.out.print("\n");
        }
    }

    @Override
    public void showFigB() {
        for (int i = 0; i < figB.length; i++) {
            for (int j = 0; j < figB.length; j++) {
                System.out.print((char) figB[i][j]);
            }
            System.out.print("\n");
        }
    }

    @Override
    public void showFigC() {
        for (int i = 0; i < figC.length; i++) {
            for (int j = 0; j < figC.length; j++) {
                System.out.print((char) figC[i][j]);
            }
            System.out.print("\n");
        }
    }

    @Override
    public void showFigD() {
        for (int i = 0; i < figD.length; i++) {
            for (int j = 0; j < figD.length; j++) {
                System.out.print((char) figD[i][j]);
            }
            System.out.print("\n");
        }
    }

    @Override
    public void showFigE() {
        for (int i = 0; i < figE.length; i++) {
            for (int j = 0; j < figE.length; j++) {
                System.out.print((char) figE[i][j]);
            }
            System.out.print("\n");
        }
    }

    @Override
    public void showFigF() {
        for (int i = 0; i < figF.length; i++) {
            for (int j = 0; j < figF.length; j++) {
                System.out.print((char) figF[i][j]);
            }
            System.out.print("\n");
        }
    }

}
