import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TestTrisApp extends JFrame implements KeyListener, ActionListener {

    Timer timer = new Timer(1000, this);

    JPanel jp;

    TestTrisMap map = new TestTrisMap();
    static int keyD; // obrot w lewo
    static int keyA; // obrot w prawo
    static int keyL; // krok w prawo
    static int keyK; // krok w lewo

    static int pozX;
    static int pozY;

    TestTrisFigures fig = new TestTrisFigures();

    int setWidth = 448 + 44; // 14
    int setHeight = 608 + 78; // 19

    public TestTrisApp() {

        super("testTris v.0.1");
        super.setSize(setWidth, setHeight);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);

        pozX = 0;
        pozY = 0;

        //key = new Keyboard();
        //key.addKeyListener(key);
        //key.setFocusable(true);
        addKeyListener(this);
        this.setFocusable(true);
        jp = new GPanel();
        jp.setFocusable(true);

        //super.add(key);
        super.add(jp);
    }

    public static void main(String[] args) {
        TestTrisApp g1 = new TestTrisApp();
        g1.setVisible(true);

        g1.timer.start();

    }

    class GPanel extends JPanel {
        public GPanel() {
            super.setPreferredSize(new Dimension(setWidth, setHeight));
        }

        @Override
        public void paint(Graphics g) {
            //System.out.println(map.mapa.length+" / "+map.mapa[0].length);

            int pozXklocek = 0;
            int pozYklocek = 0;



            /*
            if (map.mapa[pozYklocek][pozXklocek] != 32) {

                for (int k = 0; k < fig.figB.length; k++) {
                    for (int l = 0; l < fig.figB.length; l++){
                        if(fig.figB[k][l] == 79) {
                            map.mapa[k + pozYklocek - 3][l + pozXklocek] = 79;
                        }
                    }
                }
                pozX = 0;
                pozY = 0;

            }
            */

            // Sprawdzam czy cos jest pod klockiem

            pozXklocek = (pozX) / 34;
            pozYklocek = (pozY) / 34;
            boolean stopAndDraw = false;

            for (int i = 0; i < fig.figB.length; i++) {
                for (int j = 0; j < fig.figB.length; j++) {

                    if (pozYklocek + 4 > map.mapa.length) {
                        stopAndDraw = true;
                        pozX = 0;
                        pozY = 0;
                        break;
                    }

                    if(map.mapa[pozYklocek+i][pozXklocek+j] != 32){
                        stopAndDraw = true;
                        pozX = 0;
                        pozY = 0;
                        break;
                    }
                }
            }
            // przepisuje klocek na mape w miejscu zatrzymania
            if (stopAndDraw) {
                for (int i = 0; i < fig.figB.length; i++) {
                    for (int j = 0; j < fig.figB.length; j++) {
                        if (fig.figB[i][j] == 79) {
                            map.mapa[pozYklocek + i][pozXklocek + j] = 79;
                        }
                    }
                }
            }

            // Sprawdzam czy cos jest pod klockiem - koniec

            // rysowanie mapy
            for (int i = 0; i < map.mapa.length; i++) {
                for (int j = 0; j < map.mapa[0].length; j++) {
                    if (map.mapa[i][j] == 79) {
                        g.setColor(Color.blue);
                        g.fillRect(34 * j, 34 * i, 32, 32);
                        //System.out.println(i + " / " + j);
                    }
                }
            }

            // rysowanie klocka

            for (int i = 0; i < fig.figB.length; i++) {
                for (int j = 0; j < fig.figB.length; j++)
                    if (fig.figB[i][j] == 79) {

                        g.setColor(Color.blue);
                        g.fillRect(pozX + 34 * j, pozY + 34 * i, 32, 32);

/*
                        if (map.mapa[pozYklocek][pozXklocek] != 32) {

                            for (int k = 0; k < fig.figB.length; k++) {
                                for (int l = 0; l < fig.figB.length; l++){
                                    if(fig.figB[k][l] == 79) {
                                        map.mapa[k + pozYklocek - 2][l + pozXklocek] = 79;
                                    }
                                }
                            }
                            pozX = 0;
                            pozY = 0;

                        }
*/

                    }
                //System.out.println("pozXKlocek: " + pozXklocek + " pozYKlocek: " + pozYklocek);

            }

        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        int kod = e.getKeyCode();

        if (kod == 68) {
            // key D
            fig.rotateRight("figB");
            //fig.AlignFigBlockRight();
        }

        if (kod == 65) {
            // key A
            fig.rotateLeft("figB");
            //fig.AlignFigBBlockLeft();
        }

        // 75 k
        if (kod == 75) {
            if (pozX > 0) {
                pozX -= 34;
            }
        }
        // 76 l
        if (kod == 76) {
            if (pozX < 374) {
                pozX += 34;
            }
        }

        System.out.println(e.getKeyCode());

        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == timer) {

            pozY += 34;
            System.out.println(" pozX: "+pozX+"/"+(pozX/32)+" pozY: " + pozY+"/"+(pozY/32)+" dl mapy:"+"figB.length: "+fig.figB.length);
            repaint();

        }
    }
}
