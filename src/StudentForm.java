import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentForm {
    private JTextField nameTextField;
    private JTextField marks1TextField;
    private JTextField marks2TextField;
    private JTextField marks3TextField;
    private JTextField totalTextField;
    private JTextField avgTextField;
    private JTextField gradeTextField;
    private JButton calculateButton;
    private JPanel MainPanel;


    public static void main(String[] args) {
        JFrame frame = new JFrame("student");
        frame.setContentPane(new StudentForm().MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public StudentForm() {
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int m1,m2,m3,tot;
                double avg;

                m1 = Integer.parseInt(marks1TextField.getText());
                m2 = Integer.parseInt(marks2TextField.getText());
                m3 = Integer.parseInt(marks3TextField.getText());

                tot = m1 + m2 + m3;

                totalTextField.setText(String.valueOf(tot));

                avg = tot/3;

                avgTextField.setText(String.valueOf(avg));

                if(avg > 50)
                {
                    gradeTextField.setText("Pass");
                }
                else
                {
                    gradeTextField.setText("Fail");
                }
            }
        });
    }

}
