import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

void main() {

    JFrame frame = new JFrame("Student Information Form");
    frame.setSize(350, 350);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(null);

    JLabel nameLabel = new JLabel("Name");
    nameLabel.setBounds(30, 30, 90, 25);
    frame.add(nameLabel);

    JTextField nameField = new JTextField();
    nameField.setBounds(140, 30, 200, 28);
    frame.add(nameField);

    JLabel idLabel = new JLabel("Id");
    idLabel.setBounds(30, 70, 90, 25);
    frame.add(idLabel);

    JTextField idField = new JTextField();
    idField.setBounds(140, 70, 200, 28);
    frame.add(idField);

    JLabel deptLabel = new JLabel("Department");
    deptLabel.setBounds(30, 110, 110, 25);
    frame.add(deptLabel);

    String[] departments = {"CSE", "EEE", "BBA", "CIVIL", "ENGLISH"};
    JComboBox<String> deptBox = new JComboBox<>(departments);
    deptBox.setBounds(140, 110, 200, 28);
    frame.add(deptBox);

    JLabel genderLabel = new JLabel("Gender:");
    genderLabel.setBounds(30, 150, 90, 25);
    frame.add(genderLabel);

    JRadioButton maleRadio = new JRadioButton("Male");
    maleRadio.setBounds(140, 150, 80, 25);

    JRadioButton femaleRadio = new JRadioButton("Female");
    femaleRadio.setBounds(230, 150, 90, 25);

    ButtonGroup genderGroup = new ButtonGroup();
    genderGroup.add(maleRadio);
    genderGroup.add(femaleRadio);

    frame.add(maleRadio);
    frame.add(femaleRadio);

    JLabel semesterLabel = new JLabel("Semester:");
    semesterLabel.setBounds(30, 190, 90, 25);
    frame.add(semesterLabel);

    String[] semesters = {"1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th"};
    JComboBox<String> semesterBox = new JComboBox<>(semesters);
    semesterBox.setBounds(140, 190, 200, 28);
    frame.add(semesterBox);

    JButton submitBtn = new JButton("Submit");
    submitBtn.setBounds(140, 230, 100, 32);
    frame.add(submitBtn);

    JTextArea displayArea = new JTextArea();
    displayArea.setBounds(30, 280, 420, 200);
    displayArea.setEditable(false);
    frame.add(displayArea);

    frame.setVisible(true);
}