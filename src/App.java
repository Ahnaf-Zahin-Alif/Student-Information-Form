import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;


void main(){


JFrame frame = new JFrame("Student Information Form");
frame.setSize(500 , 600);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setLayout(null);



JLabel nameLabel = new JLabel("Name");
nameLabel.setBounds(30 , 30 , 80 , 25);
frame.add(nameLabel);


JTextField nameField = new JTextField();
nameField.setBounds(130 , 30 , 200 , 25);
frame.add(nameField);


JLabel idLabel = new JLabel("Id");
idLabel.setBounds(30 , 70 , 80 , 25);
frame.add(idLabel);


JTextField idField = new JTextField();
idField.setBounds(130 , 70 , 200 , 25);
frame.add(idField);


JLabel deptLabel = new JLabel("Department");
deptLabel.setBounds(30 , 110 , 100 , 25);
frame.add(deptLabel);

String[] departments = {"ICT" , "CSE" , "EEE" , "BBA" , "CIVIL" , "ENGLISH"};
JComboBox<String>deptBox = new JComboBox<>(departments);
deptBox.setBounds(130 , 110 , 200 , 25);
frame.add(deptBox);


JLabel genderLabel = new JLabel("Gender:");
genderLabel.setBounds(30 , 150 , 80 , 25);
frame.add(genderLabel);

JRadioButton maleRadio = new JRadioButton("Male");
maleRadio.setBounds(130 , 150 , 70 , 25);

JRadioButton femaleRadio = new JRadioButton("Female");
femaleRadio.setBounds(210 , 150 , 70 , 25);

ButtonGroup genderGroup = new ButtonGroup();
genderGroup.add(maleRadio);
genderGroup.add(femaleRadio);

frame.add(maleRadio);
frame.add(femaleRadio);


JLabel semesterLabel = new JLabel("Semester:");
semesterLabel.setBounds(30 , 190 , 80 , 25);
frame.add(semesterLabel);

String[] semesters = {"1st" , "2nd" , "3rd" , "4th" , "5th" , "6th" , "7th" ,"8th"};
JComboBox<String>semesterBox = new JComboBox<>(semesters);
semesterBox.setBounds(130 , 190, 200 , 25);
frame.add(semesterBox);

JButton submitBtn = new JButton("Submit");
submitBtn.setBounds(130 , 230 , 100 , 30);
frame.add(submitBtn);

JTextArea displayArea = new JTextArea();
displayArea.setBounds(30 , 280 , 420 , 200);
displayArea.setEditable(false);
frame.add(displayArea);


submitBtn.addActionListener(e -> {

    String name = nameField.getText();
    String id = idField.getText();
    String department = (String) deptBox.getSelectedItem();
    String semester = (String) semesterBox.getSelectedItem();

    String gender = "";
    if(maleRadio.isSelected()){
        gender = "Male";
    }else if(femaleRadio.isSelected()){
        gender = "Female";
    }else{
        gender = "Not Selected";
    }

    String result = "Name: " + name + "\n" + "Id: " + id + "\n" + "Department: " + department + "\n" +
    "Gender: " + gender + "\n" + "Semester: " + semester;


    displayArea.setText(result);

});


frame.setVisible(true);

}