import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * @Author: qph
 * @Date: 2019/10/17 15:15
 * @description: 下拉框
 */
public class JComboBoxDemo extends JFrame {
    public JComboBoxDemo(){
        setBounds(100,100,190,120);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);
//        String[] items = {"元素1","元素2","元素3","元素4"};
//        JComboBox<String> comboBox = new JComboBox(items);
//        comboBox.addItem("身份证");
//        comboBox.addItem("学生证");
//        comboBox.addItem("工作证");
        JComboBox<String> comboBox = new JComboBox();
        String[] items = {"元素1","元素2","元素3","元素4"};
        ComboBoxModel cm = new DefaultComboBoxModel(items);//下拉列表模型
        comboBox.setModel(cm);//向列表中添加数据模型
        comboBox.setEditable(true);//下拉列表里的值是否可以编辑
        JButton btn = new JButton("打印");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("选中的索引"+comboBox.getSelectedIndex());//获取选中的索引
                System.out.println("选中的值"+comboBox.getSelectedItem());//获取选中的值
            }

        });
        comboBox.setBounds(10,10,80,21);
        btn.setBounds(100,10,60,20);
        c.add(btn);
        c.add(comboBox);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JComboBoxDemo();
    }
}
