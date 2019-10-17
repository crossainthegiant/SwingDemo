import javax.swing.*;
import java.awt.*;

/*
 * @Author: qph
 * @Date: 2019/10/17 11:12
 * @description: PACKAGE_NAME
 */
public class GridBagLayoutDemo extends JFrame {
    JFrame f = new JFrame();//主窗体
    Container c;//主容器

    void createFrame() {
        c = f.getContentPane();
        c.setLayout(new GridBagLayout());
        f.setSize(800, 600);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void init() {
        GridBagConstraints g1 = new GridBagConstraints();
        g1.gridx = 0;
        g1.gridy = 0;
        c.add(new JButton("组件1"), g1);

        GridBagConstraints g2 = new GridBagConstraints();
        g2.gridx = 1;
        g2.gridy = 1;
        c.add(new JButton("组件2"), g2);

        GridBagConstraints g3 = new GridBagConstraints();
        g3.gridx = 3;
        g3.gridy = 3;
        c.add(new JButton("组件3"), g3);
    }

    void createButton() {
        for (int i = 0; i < 9; i++) {
            GridBagConstraints g1 = new GridBagConstraints();
            g1.gridx = i;
            g1.gridy = 0;
            c.add(new JButton("组件"), g1);

            GridBagConstraints g2 = new GridBagConstraints();
            g2.gridx = 0;
            g2.gridy = i;
            c.add(new JButton("组件"), g2);
        }
    }

    void init2() {
        GridBagConstraints g1 = new GridBagConstraints();
        g1.gridx = 1;
        g1.gridy = 1;
        c.add(new JButton("组件1"), g1);

        GridBagConstraints g2 = new GridBagConstraints();
        g2.gridx = 2;
        g2.gridy = 2;
        g2.gridwidth = 2;
        g2.gridheight = 1;
        c.add(new JButton("组件2"), g2);

        GridBagConstraints g3 = new GridBagConstraints();
        g3.gridx = 4;
        g3.gridy = 4;
        g3.gridwidth = 2;
        g3.gridheight = 2;
        c.add(new JButton("组件3"), g3);
    }

    void init3() {
        GridBagConstraints g1 = new GridBagConstraints();
        g1.gridx = 1;
        g1.gridy = 1;
        g1.gridwidth = 2;
        g1.gridheight = 2;
        c.add(new JButton("none"), g1);

        GridBagConstraints g2 = new GridBagConstraints();
        g2.gridx = 3;
        g2.gridy = 1;
        g2.gridwidth = 2;
        g2.gridheight = 2;
        g2.fill = GridBagConstraints.HORIZONTAL;
        c.add(new JButton("HORIZONTAL"), g2);

        GridBagConstraints g3 = new GridBagConstraints();
        g3.gridx = 5;
        g3.gridy = 1;
        g3.gridwidth = 2;
        g3.gridheight = 2;
        g3.fill = GridBagConstraints.VERTICAL;
        c.add(new JButton("VERTICAL"), g3);

        GridBagConstraints g4 = new GridBagConstraints();
        g4.gridx = 7;
        g4.gridy = 3;
        g4.gridwidth = 2;
        g4.gridheight = 2;
        g4.fill = GridBagConstraints.BOTH;
        c.add(new JButton("BOTH"), g3);
    }
    void init4(){
        GridBagConstraints g1 = new GridBagConstraints();
        g1.gridx = 1;
        g1.gridy = 1;
        g1.gridwidth = 2;
        g1.gridheight = 2;
        g1.anchor = GridBagConstraints.NORTH;
        c.add(new JButton("none"), g1);

        GridBagConstraints g2 = new GridBagConstraints();
        g2.gridx = 3;
        g2.gridy = 1;
        g2.gridwidth = 2;
        g2.gridheight = 2;
        g2.fill = GridBagConstraints.HORIZONTAL;
        c.add(new JButton("HORIZONTAL"), g2);

        GridBagConstraints g3 = new GridBagConstraints();
        g3.gridx = 5;
        g3.gridy = 1;
        g3.gridwidth = 2;
        g3.gridheight = 2;
        g3.fill = GridBagConstraints.VERTICAL;
        c.add(new JButton("VERTICAL"), g3);

        GridBagConstraints g4 = new GridBagConstraints();
        g4.gridx = 7;
        g4.gridy = 3;
        g4.gridwidth = 2;
        g4.gridheight = 2;
        g4.fill = GridBagConstraints.BOTH;
        c.add(new JButton("BOTH"), g3);
    }

    public static void main(String[] args) {
        GridBagLayoutDemo d = new GridBagLayoutDemo();
        d.createFrame();
//        d.init();
        d.createButton();
//        d.init2();
        d.init3();
        d.f.setVisible(true);
    }
}
