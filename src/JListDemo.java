import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * @Author: qph
 * @Date: 2019/10/17 15:42
 * @description: PACKAGE_NAME
 */
public class JListDemo extends JFrame {
    public JListDemo() {
        setBounds(100, 100, 217, 167);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);

        String[] items = {"a", "s", "f", "g"};
//        JList<String> jl = new JList<>(items);
        DefaultListModel<String> model = new DefaultListModel<>();
        for (String tmp : items) {
            model.addElement(tmp);//向数据模型添加元素
        }
        JList<String> jl = new JList<>();
        jl.setModel(model);//列表框载入数据模型
        jl.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//单选模式
        jl.setBounds(10, 10, 100, 100);

        JScrollPane js = new JScrollPane(jl);
        js.setBounds(10, 10, 100, 100);
        c.add(js);
        //获取选中的值，创建JButton
        JButton btn = new JButton("确认");
        btn.setBounds(120, 90, 70, 32);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //获取列表框中选中的所有元素
                java.util.List<String> values = jl.getSelectedValuesList();
                for (String tmp : values) {
                    System.out.println(tmp);
                }
                System.out.println("------------end------------");
            }

        });

        c.add(btn);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JListDemo();
    }
}
