import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminInterface extends JFrame {

    private JTabbedPane tabbedPane;
    private JPanel studentPanel, instructorPanel, coursesPanel;
    private JTextField studentNameField, studentIdField, studentCoursesField;
    private JTextField instructorNameField, instructorIdField, instructorCoursesField;
    private JTextField courseNameField;
    private JButton addStudentButton, addInstructorButton, addCourseButton, removeCourseButton;
    private JTable studentTable, instructorTable, coursesTable;
    private JScrollPane studentScrollPane, instructorScrollPane, coursesScrollPane;

    public AdminInterface() {
        initComponents();
    }

    private void initComponents() {

        setTitle("Admin Interface");
        setSize(1000, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        UIManager.put("Label.font", new Font("Segoe UI", Font.PLAIN, 14));
        UIManager.put("Button.font", new Font("Segoe UI", Font.BOLD, 14));
        UIManager.put("TextField.font", new Font("Segoe UI", Font.PLAIN, 14));

        tabbedPane = new JTabbedPane();

        studentPanel = new JPanel();
        studentPanel.setLayout(null);
        studentPanel.setBackground(new Color(245, 245, 245));

        JLabel studentNameLabel = new JLabel("Student Name:");
        studentNameLabel.setBounds(20, 20, 150, 25);
        studentNameLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        studentPanel.add(studentNameLabel);

        studentNameField = new JTextField();
        studentNameField.setBounds(180, 20, 250, 25);
        studentPanel.add(studentNameField);

        JLabel studentIdLabel = new JLabel("Student ID:");
        studentIdLabel.setBounds(20, 60, 150, 25);
        studentIdLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        studentPanel.add(studentIdLabel);

        studentIdField = new JTextField();
        studentIdField.setBounds(180, 60, 250, 25);
        studentPanel.add(studentIdField);

        JLabel studentCoursesLabel = new JLabel("Courses:");
        studentCoursesLabel.setBounds(20, 100, 150, 25);
        studentCoursesLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        studentPanel.add(studentCoursesLabel);

        studentCoursesField = new JTextField();
        studentCoursesField.setBounds(180, 100, 250, 25);
        studentPanel.add(studentCoursesField);

        addStudentButton = new JButton("Add Student");
        addStudentButton.setBounds(180, 140, 150, 30);
        addStudentButton.setBackground(new Color(66, 133, 244));
        addStudentButton.setForeground(Color.WHITE);
        addStudentButton.setBorder(BorderFactory.createLineBorder(new Color(66, 133, 244), 2));
        addStudentButton.setFocusPainted(false);
        addStudentButton.setFont(new Font("Segoe UI", Font.BOLD, 14));
        studentPanel.add(addStudentButton);

        studentTable = new JTable(new DefaultTableModel(new Object[] {"Name", "ID", "Courses", "Total Grade"}, 0));
        studentScrollPane = new JScrollPane(studentTable);
        studentScrollPane.setBounds(20, 200, 850, 250);
        studentPanel.add(studentScrollPane);

        addStudentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addStudent();
            }
        });

        tabbedPane.addTab("Students", studentPanel);

        instructorPanel = new JPanel();
        instructorPanel.setLayout(null);
        instructorPanel.setBackground(new Color(245, 245, 245));

        JLabel instructorNameLabel = new JLabel("Instructor Name:");
        instructorNameLabel.setBounds(20, 20, 150, 25);
        instructorNameLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        instructorPanel.add(instructorNameLabel);

        instructorNameField = new JTextField();
        instructorNameField.setBounds(180, 20, 250, 25);
        instructorPanel.add(instructorNameField);

        JLabel instructorIdLabel = new JLabel("Instructor ID:");
        instructorIdLabel.setBounds(20, 60, 150, 25);
        instructorIdLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        instructorPanel.add(instructorIdLabel);

        instructorIdField = new JTextField();
        instructorIdField.setBounds(180, 60, 250, 25);
        instructorPanel.add(instructorIdField);

        JLabel instructorCoursesLabel = new JLabel("Courses:");
        instructorCoursesLabel.setBounds(20, 100, 150, 25);
        instructorCoursesLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        instructorPanel.add(instructorCoursesLabel);

        instructorCoursesField = new JTextField();
        instructorCoursesField.setBounds(180, 100, 250, 25);
        instructorPanel.add(instructorCoursesField);

        addInstructorButton = new JButton("Add Instructor");
        addInstructorButton.setBounds(180, 140, 150, 30);
        addInstructorButton.setBackground(new Color(66, 133, 244));
        addInstructorButton.setForeground(Color.WHITE);
        addInstructorButton.setBorder(BorderFactory.createLineBorder(new Color(66, 133, 244), 2));
        addInstructorButton.setFocusPainted(false);
        addInstructorButton.setFont(new Font("Segoe UI", Font.BOLD, 14));
        instructorPanel.add(addInstructorButton);

        instructorTable = new JTable(new DefaultTableModel(new Object[] {"Name", "ID", "Courses"}, 0));
        instructorScrollPane = new JScrollPane(instructorTable);
        instructorScrollPane.setBounds(20, 200, 850, 250);
        instructorPanel.add(instructorScrollPane);

        addInstructorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addInstructor();
            }
        });

        tabbedPane.addTab("Instructors", instructorPanel);

        coursesPanel = new JPanel();
        coursesPanel.setLayout(null);
        coursesPanel.setBackground(new Color(245, 245, 245));

        JLabel courseNameLabel = new JLabel("Course Name:");
        courseNameLabel.setBounds(20, 20, 150, 25);
        courseNameLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        coursesPanel.add(courseNameLabel);

        courseNameField = new JTextField();
        courseNameField.setBounds(180, 20, 250, 25);
        coursesPanel.add(courseNameField);

        addCourseButton = new JButton("Add Course");
        addCourseButton.setBounds(180, 60, 150, 30);
        addCourseButton.setBackground(new Color(66, 133, 244));
        addCourseButton.setForeground(Color.WHITE);
        addCourseButton.setBorder(BorderFactory.createLineBorder(new Color(66, 133, 244), 2));
        addCourseButton.setFocusPainted(false);
        addCourseButton.setFont(new Font("Segoe UI", Font.BOLD, 14));
        coursesPanel.add(addCourseButton);

        removeCourseButton = new JButton("Remove Course");
        removeCourseButton.setBounds(360, 60, 150, 30);
        removeCourseButton.setBackground(new Color(244, 67, 54));
        removeCourseButton.setForeground(Color.WHITE);
        removeCourseButton.setBorder(BorderFactory.createLineBorder(new Color(244, 67, 54), 2));
        removeCourseButton.setFocusPainted(false);
        removeCourseButton.setFont(new Font("Segoe UI", Font.BOLD, 14));
        coursesPanel.add(removeCourseButton);

        coursesTable = new JTable(new DefaultTableModel(new Object[] {"Course Name"}, 0));
        coursesScrollPane = new JScrollPane(coursesTable);
        coursesScrollPane.setBounds(20, 100, 850, 250);
        coursesPanel.add(coursesScrollPane);

        addCourseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addCourse();
            }
        });

        removeCourseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removeCourse();
            }
        });

        tabbedPane.addTab("Courses", coursesPanel);

        add(tabbedPane);
    }

    private void addStudent() {
        String studentName = studentNameField.getText();
        String studentId = studentIdField.getText();
        String courses = studentCoursesField.getText();

        DefaultTableModel model = (DefaultTableModel) studentTable.getModel();
        model.addRow(new Object[]{studentName, studentId, courses, "0"});

        studentNameField.setText("");
        studentIdField.setText("");
        studentCoursesField.setText("");
    }

    private void addInstructor() {
        String instructorName = instructorNameField.getText();
        String instructorId = instructorIdField.getText();
        String courses = instructorCoursesField.getText();

        DefaultTableModel model = (DefaultTableModel) instructorTable.getModel();
        model.addRow(new Object[]{instructorName, instructorId, courses});

        instructorNameField.setText("");
        instructorIdField.setText("");
        instructorCoursesField.setText("");
    }

    private void addCourse() {
        String courseName = courseNameField.getText();
        if (!courseName.isEmpty()) {
            DefaultTableModel model = (DefaultTableModel) coursesTable.getModel();
            model.addRow(new Object[]{courseName});

            courseNameField.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Please enter a course name.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void removeCourse() {
        int selectedRow = coursesTable.getSelectedRow();
        if (selectedRow != -1) {
            DefaultTableModel model = (DefaultTableModel) coursesTable.getModel();
            model.removeRow(selectedRow);
        } else {
            JOptionPane.showMessageDialog(this, "Please select a course to remove.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AdminInterface().setVisible(true);
            }
        });
    }
}
