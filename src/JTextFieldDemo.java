import javax.swing.*;
import java.awt.*;

/*
 * @Author: qph
 * @Date: 2019/10/17 16:08
 * @description: 文本框
 */
public class JTextFieldDemo extends JFrame {
    public JTextFieldDemo(){
       setBounds(100,100,250,100);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JTextField jtf = new JTextField("aaa");//设置初始值aaa
        jtf.setColumns(20);//设置文本框长度
        jtf.setFont(new Font("黑体",Font.PLAIN,20));
        c.add(jtf);



       setVisible(true);
    }

    public static void main(String[] args) {
        new JTextFieldDemo();
    }
}
