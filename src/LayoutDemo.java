import javax.swing.*;
import java.awt.*;

/*
 * @Author: qph
 * @Date: 2019/10/17 10:40
 * @description: 绝对布局（null布局）：使用坐标来控制位置（组件左上角第一个元素的位置而确定）
 */
public class LayoutDemo extends JFrame {
    public LayoutDemo(){
        setBounds(100,100,200,150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
//        setLayout(null);//将容器的布局设为绝对布局
        c.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));//设置流布局（默认是居中显示的）
//        c.setLayout(new BorderLayout());//设置为边界布局：共有五个区域，使用c.add(xx,pos)指定位置，东南西北中
        c.setLayout(new GridLayout(7,3,5,5));//网格布局，七行三列，水平间距为5像素，垂直间距为5像素
        JButton b1 = new JButton("按钮1"),b2 = new JButton("按钮2");//添加两个按钮
        b1.setBounds(10,30,80,30);//设置按钮在容器中的坐标和大小
        b2.setBounds(60,70,100,20);
        c.add(b1);
        c.add(b2);
        setVisible(true);
    }

    public static void main(String[] args) {
        new LayoutDemo();
    }
}
