import javax.swing.*;
import java.awt.*;

/*
 * @Author: qph
 * @Date: 2019/10/17 10:05
 * @description: PACKAGE_NAME
 */
public class JLabelDemo extends JFrame {
    public JLabelDemo(){
        setBounds(100,100,100,100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        setVisible(true);

        JLabel l = new JLabel("这是一个标签");
//        l.setText("更改标签内容");
//        System.out.println(l.getText());
        l.setFont(new Font("微软雅黑",Font.BOLD,15));
        l.setForeground(Color.GREEN);//更改前景色，更改字体颜色

        c.add(l);


    }

    public static void main(String[] args) {
        new JLabelDemo();
    }
}
