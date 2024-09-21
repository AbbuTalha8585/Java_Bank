package bank.management.system;

import java.awt.*;
import javax.swing.*;

import java.awt.event.*;



public class SignupTwo extends JFrame implements ActionListener {
        
        JTextField PAN,Aadher;
        JButton next;
        JRadioButton syes,sno,eyes,eno;
        JComboBox religion,Category,Income,education,Occupation;
        String formno;
        
        
      SignupTwo(String formno){
          
          this.formno = formno;
          
          setLayout(null);
          setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
          
          
         
          
          JLabel additionalDetails = new JLabel("Page 2: ADDITIONAL DETAILS ");
          additionalDetails.setFont( new Font("Raleway", Font.BOLD, 22));
          additionalDetails.setBounds( 290, 80, 400, 30);
          add(additionalDetails);
          
          JLabel Religion = new JLabel(" Religion:");
           Religion.setFont( new Font("Raleway", Font.BOLD, 20));
           Religion.setBounds( 100, 140, 100, 30);
          add(Religion);
          
          String valReligion[] = {"Muslim","Hindu", "sikh", "other"};
            religion =new JComboBox(valReligion);
          religion.setBounds( 300,  140,  400,  30);
          religion.setBackground(Color. WHITE);
          add(religion);
       
          
           JLabel  category = new JLabel("Category:");
           category.setFont( new Font("Raleway", Font.BOLD, 20));
           category.setBounds( 100, 190, 200, 30);
          add(category);
          
           String valCategory[]={"OBC", "SC", "ST", "GENERAL", "OTHER"};
             Category = new JComboBox(valCategory);
          Category.setBounds( 300,  190,  400,  30);
          Category.setBackground(Color. WHITE);
          add(Category);
          
          
           JLabel   income = new JLabel(" Income :");
           income.setFont( new Font("Raleway", Font.BOLD, 20));
           income.setBounds( 100, 240, 200, 30);
          add(income);
          
          String valincomr[]={" Null", "<1,50,000", " <2,50,000", " <5,00,000", " upto 10,00,000"};
               Income = new JComboBox(valincomr);
           Income.setBounds( 300,  240,  200,  30);
           Income.setBackground(Color. WHITE);
          add(Income);
     
          
          JLabel   Educational = new JLabel(" Educational:");
            Educational.setFont( new Font("Raleway", Font.BOLD, 20));
            Educational.setBounds( 100, 290, 200, 30);
          add( Educational);
          
            String educationValues[]={" Graduation", "Non_Graduation", " post_Graduation", "other"};
              education = new JComboBox(educationValues);
           education.setBounds( 300,  290,  400,  30);
           education.setBackground(Color. WHITE);
          add(education);
          
       
          
           JLabel   occupation = new JLabel(" Occupation :");
             occupation.setFont( new Font("Raleway", Font.BOLD, 20));
             occupation.setBounds( 100, 340, 200, 30);
          add(  occupation);
          
          String occupationValues[]={" Bussiness", " salaried", " Self Employed", " other"};
              Occupation = new JComboBox(occupationValues);
           Occupation.setBounds( 300,  340,  400,  30);
           Occupation.setBackground(Color. WHITE);
          add(Occupation);
          
          
        
          
            JLabel    add = new JLabel(" PAN number :");
             add.setFont( new Font("Raleway", Font.BOLD, 20));
              add.setBounds( 100, 390, 200, 30);
          add(   add);
          
             PAN = new JTextField();
           PAN.setFont(new Font("Raleway",Font.BOLD, 14));
           PAN.setBounds( 300,  390,  400,  30);
          add( PAN);
          
          
            JLabel    city = new JLabel("  Aadher Number :");
              city.setFont( new Font("Raleway", Font.BOLD, 20));
              city.setBounds( 100, 440, 200, 30);
          add(   city);
          
            Aadher = new JTextField();
           Aadher.setFont(new Font("Raleway",Font.BOLD, 14));
           Aadher.setBounds( 300,  440,  400,  30);
          add(Aadher);
          
            JLabel    state = new JLabel("  Senior Citizen :");
              state.setFont( new Font("Raleway", Font.BOLD, 20));
              state.setBounds( 100, 490, 200, 30);
          add(   state);
          
             syes = new JRadioButton(" Yes");
          syes.setBounds(300, 490, 60, 30);
          syes.setBackground(Color. WHITE);
          add(syes);
          
            sno = new JRadioButton(" No");
          sno.setBounds(450, 490, 80, 30);
          sno.setBackground(Color. WHITE);
          add( sno);
          
          ButtonGroup sgendergroup = new ButtonGroup();
          sgendergroup.add( syes);
          sgendergroup.add( sno);
          
            JLabel    pin = new JLabel("  Exisiting Account :");
              pin.setFont( new Font("Raleway", Font.BOLD, 20));
              pin.setBounds( 100, 540, 200, 30);
          add(   pin);
          
           eyes = new JRadioButton(" Yes");
          eyes.setBounds(300, 540, 60, 30);
          eyes.setBackground(Color. WHITE);
          add(eyes);
          
           eno = new JRadioButton(" No");
          eno.setBounds(450, 540, 80, 30);
          eno.setBackground(Color. WHITE);
          add( eno);
          
          ButtonGroup egendergroup = new ButtonGroup();
          egendergroup.add( eyes);
          egendergroup.add( eno);
          
           next =new JButton("NEXT");
          next.setBackground(Color. BLACK);
          next.setForeground(Color. WHITE);
          next.setFont(new Font("raleway",Font.BOLD,14));
          next.setBounds( 620, 660, 80, 30);
          next.addActionListener(this);
          add(next);
          
          
          
          getContentPane().setBackground(Color. WHITE);
          
          
          setSize(850, 800);
          setLocation(350,10);
          setVisible(true);
      }
      public void actionPerformed(ActionEvent ae) {
          String formno = "" ;
          String sreligion = (String) religion.getSelectedItem();
          String sCategory= (String) Category.getSelectedItem();
          String sIncome= (String)Income.getSelectedItem();
           String seducation = (String) education.getSelectedItem();
          String sOccupation= (String) Occupation.getSelectedItem();
          String  seniorcitizen =null;
          if ( syes.isSelected()){
              seniorcitizen = " Yes";
          }else if (sno.isSelected()){
              seniorcitizen = " No";
          }
          String   exisitingaccount =null;
          if ( eyes.isSelected()){
              exisitingaccount = " Yes";
          }else if (eno.isSelected()){
              exisitingaccount = " No";
          }
      
          
          String span= PAN.getText();
          String saadher= Aadher.getText();
         ;

          
     try {
    Conn c = new Conn();
    String query = "INSERT INTO signupTwo VALUES('" + formno + "', '" + sreligion + "', '" + sCategory + "', '" + sIncome + "', '" + seducation + "', '" + sOccupation + "', '" + seniorcitizen + "', '" + exisitingaccount + "', '" + span + "', '" + saadher + "')";
    c.s.executeUpdate(query);
    JOptionPane.showMessageDialog(null, "Details Submitted Successfully");
    
    setVisible(false);
    new SignupThree(formno).setVisible(true);
    
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, "Error Occurred: " + e.getMessage());
    e.printStackTrace();
}

   
 }
      public static void main(String[] args) {
        new SignupTwo("");
    }


  
}



