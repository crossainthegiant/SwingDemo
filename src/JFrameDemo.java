/*
 * @Author: qph
 * @Date: 2019/10/16 19:37
 * @description: Swing常用组件，JFrame窗体，JDialog对话框,JPanel面板（不能单独显示），JButton,JLabel,JCheckBox
 * JRadioButton,JTextField,JPassword,JComBox下拉框
 * JTextArea文本域，JList列表框,JOptionPane小对话框
 */
import javax.swing.*;
import java.awt.*;

public class JFrameDemo extends JFrame{//让Demo类成为窗体
    public JFrameDemo(){
//        JFrame f = new JFrame("窗体标题");//创建窗体对象
        setVisible(true);//设置窗体可见
        setTitle("窗体标题");//设置窗体标题
        /*
         * EXIT_ON_CLOSE：隐藏窗口并停止程序
         * DO_NOTHING_ON_CLOSE:禁用关闭功能
         * HIDE_ON_CLOSE:隐藏窗体但不停止程序
         * DISPOSE_ON_CLOSE:释放窗体资源
         */

       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        f.setSize(300,200);//设置窗体大小，单位是像素
//        f.setLocation(200,200);//设置坐标，单位是像素
        setBounds(200,200,300,200);//设置窗体坐标和大小，单位像素

        Container c = getContentPane();//获取窗体容器
        c.setBackground(Color.WHITE);//设置背景颜色
        JLabel l = new JLabel("这是一个窗体");
        c.add(l);//添加组件
//        c.remove(l);//删除组件
        c.validate();//验证容器中的组件
//        f.setContentPane(c);//重新载入容器

        setResizable(false);//设置窗体是否可以改变大小
        System.out.println(getX()+getY());//获取窗体位置
    }
    public static void main(String[] args) {
       new JFrameDemo();
    }
}
