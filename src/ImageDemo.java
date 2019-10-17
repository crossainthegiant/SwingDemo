import javax.swing.*;
import java.awt.*;
import java.net.URL;

/*
 * @Author: qph
 * @Date: 2019/10/17 10:20
 * @description: PACKAGE_NAME
 */
public class ImageDemo extends JFrame {
    public ImageDemo(){
        setBounds(200,200,500,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();

        JLabel l = new JLabel("这是一个展示图片的标签");//使用标签添加图片
//        URL url = ImageDemo.class.getResource("RFP.png");//获取图片url路径
//        System.out.println(url);
//        Icon icon = new ImageIcon(url);//获取相应路径下的图片文件
        Icon icon = new ImageIcon("src/RFP.png");
        l.setIcon(icon);//添加图片
        setVisible(true);
        c.add(l);
    }


    public static void main(String[] args) {
        new ImageDemo();
    }
}
