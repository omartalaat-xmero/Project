import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraduatedStudentInterface extends JFrame {

    private JTable graduatedTable;
    private JTextField studentNameField, studentIdField, studentCoursesField, studentGradeField;
    private JButton addStudentButton, addCourseButton;
    private JScrollPane scrollPane;
    private DefaultTableModel coursesTableModel;

    public GraduatedStudentInterface() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Graduated Student Profile");
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        UIManager.put("Label.font", new Font("Segoe UI", Font.PLAIN, 14));
        UIManager.put("Button.font", new Font("Segoe UI", Font.BOLD, 14));
        UIManager.put("TextField.font", new Font("Segoe UI", Font.PLAIN, 14));

        UIManager.put("Panel.background", new Color(240, 240, 240)); // خلفية فاتحة
        UIManager.put("TabbedPane.background", new Color(240, 240, 240)); // خلفية فاتحة للتبويبات
        UIManager.put("TabbedPane.selected", new Color(66, 133, 244));  // لون التبويب المحدد
        UIManager.put("Button.background", new Color(66, 133, 244));  // لون الأزرار
        UIManager.put("Button.foreground", Color.WHITE);  // لون النص في الأزرار

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(240, 240, 240));  // خلفية فاتحة للوحة

        JLabel studentNameLabel = new JLabel("Student Name:");
        studentNameLabel.setBounds(20, 20, 150, 25);
        studentNameLabel.setForeground(Color.BLACK);
        panel.add(studentNameLabel);

        studentNameField = new JTextField();
        studentNameField.setBounds(180, 20, 250, 25);
        studentNameField.setBackground(new Color(220, 220, 220));
        studentNameField.setForeground(Color.BLACK);
        panel.add(studentNameField);

        JLabel studentIdLabel = new JLabel("Student ID:");
        studentIdLabel.setBounds(20, 60, 150, 25);
        studentIdLabel.setForeground(Color.BLACK);
        panel.add(studentIdLabel);

        studentIdField = new JTextField();
        studentIdField.setBounds(180, 60, 250, 25);
        studentIdField.setBackground(new Color(220, 220, 220));
        studentIdField.setForeground(Color.BLACK);
        panel.add(studentIdField);

        JLabel studentCoursesLabel = new JLabel("Courses Completed:");
        studentCoursesLabel.setBounds(20, 100, 150, 25);
        studentCoursesLabel.setForeground(Color.BLACK);
        panel.add(studentCoursesLabel);

        studentCoursesField = new JTextField();
        studentCoursesField.setBounds(180, 100, 250, 25);
        studentCoursesField.setBackground(new Color(220, 220, 220));
        studentCoursesField.setForeground(Color.BLACK);
        panel.add(studentCoursesField);

        JLabel studentGradeLabel = new JLabel("Final Grade:");
        studentGradeLabel.setBounds(20, 140, 150, 25);
        studentGradeLabel.setForeground(Color.BLACK);
        panel.add(studentGradeLabel);

        studentGradeField = new JTextField();
        studentGradeField.setBounds(180, 140, 250, 25);
        studentGradeField.setBackground(new Color(220, 220, 220));
        studentGradeField.setForeground(Color.BLACK);
        panel.add(studentGradeField);

        addStudentButton = new JButton("Add Graduated Student");
        addStudentButton.setBounds(180, 180, 250, 30);
        addStudentButton.setBackground(new Color(66, 133, 244));
        addStudentButton.setForeground(Color.WHITE);
        addStudentButton.setBorder(BorderFactory.createLineBorder(new Color(66, 133, 244), 2));
        addStudentButton.setFocusPainted(false);
        addStudentButton.setFont(new Font("Segoe UI", Font.BOLD, 14));
        panel.add(addStudentButton);

        JLabel coursesLabel = new JLabel("Courses and Grades:");
        coursesLabel.setBounds(20, 220, 150, 25);
        coursesLabel.setForeground(Color.BLACK);
        panel.add(coursesLabel);

        coursesTableModel = new DefaultTableModel(new Object[]{"Course Name", "Grade"}, 0);
        JTable coursesTable = new JTable(coursesTableModel);
        coursesTable.setBackground(new Color(230, 230, 230));
        coursesTable.setForeground(Color.BLACK);
        JScrollPane coursesScrollPane = new JScrollPane(coursesTable);
        coursesScrollPane.setBounds(20, 250, 740, 150);
        panel.add(coursesScrollPane);

        addCourseButton = new JButton("Add Course");
        addCourseButton.setBounds(180, 420, 250, 30);
        addCourseButton.setBackground(new Color(66, 133, 244));
        addCourseButton.setForeground(Color.WHITE);
        addCourseButton.setBorder(BorderFactory.createLineBorder(new Color(66, 133, 244), 2));
        addCourseButton.setFocusPainted(false);
        addCourseButton.setFont(new Font("Segoe UI", Font.BOLD, 14));
        panel.add(addCourseButton);

        addStudentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addGraduatedStudent();
            }
        });

        addCourseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addCourse();
            }
        });

        add(panel);
    }

    private void addGraduatedStudent() {
        String studentName = studentNameField.getText();
        String studentId = studentIdField.getText();
        String coursesCompleted = studentCoursesField.getText();
        String finalGrade = studentGradeField.getText();

        if (studentName.isEmpty() || studentId.isEmpty() || coursesCompleted.isEmpty() || finalGrade.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all the fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        DefaultTableModel model = (DefaultTableModel) graduatedTable.getModel();
        model.addRow(new Object[]{studentName, studentId, coursesCompleted, finalGrade});

        studentNameField.setText("");
        studentIdField.setText("");
        studentCoursesField.setText("");
        studentGradeField.setText("");
    }

    private void addCourse() {
        String courseName = studentCoursesField.getText();
        String grade = studentGradeField.getText();

        if (courseName.isEmpty() || grade.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in the course and grade fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        coursesTableModel.addRow(new Object[]{courseName, grade});

        studentCoursesField.setText("");
        studentGradeField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GraduatedStudentInterface().setVisible(true);
            }
        });
    }
}
