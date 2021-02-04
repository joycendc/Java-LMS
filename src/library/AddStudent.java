package library;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

public class AddStudent extends javax.swing.JFrame {

    DBConnect db = new DBConnect();
    Color ex;
     boolean addbutt = false;
    boolean updbutt = false;
    public AddStudent() {
        ex = new Color(153, 0, 153);
        getRootPane().setBorder(BorderFactory.createLineBorder(ex, 3));
        init();
        upd.setVisible(false);
        del.setVisible(false);
        listen(0);
        clip.setVisible(false);
    }
    
    public AddStudent(Student student) {
        ex = new Color(255, 153, 0);
        getRootPane().setBorder(BorderFactory.createLineBorder(ex, 3));
        init();
        studentid.setText(student.getStudentID());
        fname.setText(student.getFname());      
        lname.setText(student.getLname());
        course.setSelectedItem(student.getCourse());
        if(student.getGender().equals(male.getText())){
            gender.setSelected(male.getModel(), rootPaneCheckingEnabled);
        }else{
            gender.setSelected(female.getModel(), rootPaneCheckingEnabled);
        }
        email.setText(student.getEmail());
        number.setText(student.getNumber());
        add.setVisible(false);
        studentid.setEnabled(false);
    
        this.setTitle("Update Student");
        course.setBackground(ex);
        listen(1);
    }
    
    void init(){
        initComponents();
        course.setModel(db.setCombo(false, "SELECT * FROM `course_details`;"));
    }
    
    void listen(int who){
        this.addWindowListener(new WindowListener(){
            @Override
            public void windowOpened(WindowEvent e) {}
            @Override
            public void windowClosing(WindowEvent e) {}
            @Override
            public void windowClosed(WindowEvent e) {}
            @Override
            public void windowIconified(WindowEvent e) {}
            @Override
            public void windowDeiconified(WindowEvent e) {}
            @Override
            public void windowActivated(WindowEvent e) {}
            
            @Override
            public void windowDeactivated(WindowEvent e) {
                if(who == 0 && !addbutt) dispose();
                else if(who == 1 && !updbutt) dispose();

            }
            
        });
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gender = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        studentid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        number = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        course = new javax.swing.JComboBox<>();
        upd = new javax.swing.JButton();
        del = new javax.swing.JButton();
        female = new javax.swing.JRadioButton();
        male = new javax.swing.JRadioButton();
        clip = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Student ID");

        studentid.setBackground(new java.awt.Color(249, 239, 255));
        studentid.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        studentid.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jLabel2.setText("Firstname");

        fname.setBackground(new java.awt.Color(249, 239, 255));
        fname.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        jLabel3.setText("Lastname");

        jLabel4.setText("Course");

        lname.setBackground(new java.awt.Color(249, 239, 255));
        lname.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        jLabel5.setText("Gender");

        jLabel6.setText("Email");

        email.setBackground(new java.awt.Color(249, 239, 255));
        email.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        jLabel7.setText("Phone Number");

        number.setBackground(new java.awt.Color(249, 239, 255));
        number.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        add.setBackground(new java.awt.Color(153, 0, 153));
        add.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("Add Student");
        add.setFocusPainted(false);
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(255, 255, 255));
        exit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        exit.setText("x");
        exit.setBorderPainted(false);
        exit.setFocusable(false);
        exit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
        });
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        course.setBackground(new java.awt.Color(153, 0, 153));
        course.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        course.setForeground(new java.awt.Color(255, 255, 255));
        course.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));

        upd.setBackground(new java.awt.Color(255, 153, 0));
        upd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        upd.setForeground(new java.awt.Color(255, 255, 255));
        upd.setText("Update Student");
        upd.setFocusPainted(false);
        upd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updActionPerformed(evt);
            }
        });

        del.setBackground(new java.awt.Color(255, 51, 51));
        del.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        del.setForeground(new java.awt.Color(255, 255, 255));
        del.setText("Delete Student");
        del.setFocusPainted(false);
        del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delActionPerformed(evt);
            }
        });

        female.setBackground(new java.awt.Color(255, 255, 255));
        gender.add(female);
        female.setText("Female");

        male.setBackground(new java.awt.Color(255, 255, 255));
        gender.add(male);
        male.setText("Male");

        clip.setBackground(new java.awt.Color(255, 255, 255));
        clip.setForeground(new java.awt.Color(0, 0, 0));
        clip.setText("Copy");
        clip.setBorder(null);
        clip.setFocusPainted(false);
        clip.setFocusable(false);
        clip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clipActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(upd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(del, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(male, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(female, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(number, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(studentid)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(clip, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentid, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(clip, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(female)
                    .addComponent(male))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(number, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(del, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(upd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    String isFieldsEmpty(){  
        if(studentid.getText().trim().equals("")) 
            return "Pleease enter student id";                           
        if(fname.getText().trim().equals("") || lname.getText().trim().equals("")) 
            return "Please enter your complete name";  
        if(course.getSelectedItem().toString().equals("--  SELECT  --")) 
            return "Please select your course";    
        if(!male.isSelected() && !female.isSelected()) 
            return "Please choose a gender"; 
        if(email.getText().trim().equals("")) 
            return "Please enter your email"; 
        if(!email.getText().trim().contains("@")) 
            return "Invalid email"; 
        if(number.getText().trim().equals("")) 
            return "Please enter your number"; 
        else 
            return "NO";       
    }
    
    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        Student student = new Student();
        student.setStudentID(studentid.getText());
        student.setFname(fname.getText());
        student.setLname(lname.getText());
        student.setCourse(course.getSelectedItem().toString());
        student.setGender(male.isSelected() ? male.getText() : female.getText());
        student.setEmail(email.getText());
        student.setNumber(number.getText());
        
        addbutt = true;
        if(!isFieldsEmpty().equals("NO")){  
            JOptionPane.showMessageDialog(null, isFieldsEmpty(), "Warning !",2);         
            addbutt = false;
        }else if(db.insertStudent(student)){
            this.dispose();
            JOptionPane.showMessageDialog(null, "Inserted !", "Success",2);
        }
    }//GEN-LAST:event_addActionPerformed

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        exit.setBackground(ex);
        exit.setForeground(Color.white);
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        exit.setBackground(Color.white);
        exit.setForeground(Color.black);
    }//GEN-LAST:event_exitMouseExited

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void updActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updActionPerformed
        Student student = new Student();
        student.setStudentID(studentid.getText());
        student.setFname(fname.getText());
        student.setLname(lname.getText());
        student.setCourse(course.getSelectedItem().toString());
        student.setGender(male.isSelected() ? male.getText() : female.getText());
        student.setEmail(email.getText());
        student.setNumber(number.getText());
        
        updbutt = true;
        if(!isFieldsEmpty().equals("NO")){  
            JOptionPane.showMessageDialog(null, isFieldsEmpty(), "Warning !",2);         
            addbutt = false;
        }else if(db.updateStudent(student)){
            this.dispose();
            JOptionPane.showMessageDialog(null, "Updated !", "Success",2);
        }
    }//GEN-LAST:event_updActionPerformed

    private void delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delActionPerformed
        int log = JOptionPane.showConfirmDialog(null,"Are you sure to delete " + fname.getText() +" "+ lname.getText() + " ?","Delete",0,2);
        if(log==0){
            db.deleteStudent(studentid.getText()); 
            JOptionPane.showMessageDialog(null, "Deleted !", "Success",2);
            this.dispose();
        }

    }//GEN-LAST:event_delActionPerformed

    private void clipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clipActionPerformed
        Clipboard c = Toolkit.getDefaultToolkit().getSystemClipboard();
        c.setContents(new StringSelection(studentid.getText()), null);
        this.dispose();
    }//GEN-LAST:event_clipActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton clip;
    private javax.swing.JComboBox<String> course;
    private javax.swing.JButton del;
    private javax.swing.JTextField email;
    private javax.swing.JButton exit;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField fname;
    private javax.swing.ButtonGroup gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lname;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField number;
    private javax.swing.JTextField studentid;
    private javax.swing.JButton upd;
    // End of variables declaration//GEN-END:variables
}