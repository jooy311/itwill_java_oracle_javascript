package project.manager.frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSplitPane;
import javax.swing.JTextField;

import javax.swing.JDesktopPane;
import javax.swing.JButton;
import javax.swing.JPasswordField;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.SQLException;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSplitPane;
import javax.swing.JTextField;

import javax.swing.JDesktopPane;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class SignUpFrame extends JFrame implements ActionListener {
   
   private usermemberDAO dao = new usermemberDAO();      
   private Member member;
   private JPasswordField passwordField;
   private JTextField nameTxt;
   private JTextField myworkplace;
   private JTextField myPay;
   private JTextField idTxt;
   private boolean checkedId = false;
   private JButton cancelBtn;
   private JButton joinBtn;
   private JButton checkIdBtn;
   

   // 생성자
   public SignUpFrame(String title) {
      super(title);
      init();
      
      //setDefaultCloseOperation(EXIT_ON_CLOSE);
      this.addWindowListener(new WindowAdapter() {
         @Override
         public void windowClosing(WindowEvent e) {
            setVisible(false);;
         }
      });
      
      setBounds(0, 0, 403, 486);
      setVisible(true);

      
      //이벤트 등록
      cancelBtn.addActionListener(this);
      joinBtn.addActionListener(this);
      checkIdBtn.addActionListener(this);
   
   }

   // 디자인 만드는 메소드
   public void init() {
      getContentPane().setBackground(SystemColor.activeCaption);

      JPanel panel = new JPanel();
      panel.setForeground(SystemColor.controlLtHighlight);
      panel.setBackground(new Color(255, 192, 203));
      getContentPane().add(panel, BorderLayout.NORTH);

      JLabel lblNewLabel = new JLabel("[\uD68C\uC6D0\uAC00\uC785]");
      lblNewLabel.setForeground(new Color(0, 0, 0));
      lblNewLabel.setFont(new Font("나눔바른펜", Font.PLAIN, 25));
      panel.add(lblNewLabel);

      JDesktopPane desktopPane = new JDesktopPane();
      desktopPane.setBackground(new Color(255, 250, 250));
      getContentPane().add(desktopPane, BorderLayout.CENTER);

      checkIdBtn = new JButton("\uC911\uBCF5\uD655\uC778");
      checkIdBtn.setBackground(new Color(255, 182, 193));
      checkIdBtn.setFont(new Font("Dialog", Font.PLAIN, 10));
      checkIdBtn.setBounds(253, 39, 84, 37);
      desktopPane.add(checkIdBtn);

      JDesktopPane desktopPane_1 = new JDesktopPane();
      desktopPane_1.setBackground(new Color(255, 250, 250));
      desktopPane_1.setBounds(153, 336, 224, 60);
      desktopPane.add(desktopPane_1);

      cancelBtn = new JButton("\uCDE8\uC18C");
      cancelBtn.setFont(new Font("나눔바른펜", Font.PLAIN, 15));
      cancelBtn.setBounds(128, 10, 84, 37);
      desktopPane_1.add(cancelBtn);

      joinBtn = new JButton("\uAC00\uC785\uD558\uAE30");
      joinBtn.setBackground(new Color(255, 182, 193));
      joinBtn.setFont(new Font("Dialog", Font.PLAIN, 11));
      joinBtn.setBounds(28, 10, 84, 37);
      desktopPane_1.add(joinBtn);

      passwordField = new JPasswordField();
      passwordField.setBounds(143, 99, 204, 35);
      desktopPane.add(passwordField);

      idTxt = new JTextField();
      idTxt.setBounds(145, 40, 96, 35);
      desktopPane.add(idTxt);
      idTxt.setColumns(10);

      JLabel label = new JLabel(" \uBE44\uBC00\uBC88\uD638 ");
      label.setFont(new Font("Dialog", Font.PLAIN, 13));
      label.setBounds(42, 100, 72, 27);
      desktopPane.add(label);

      JLabel label_1 = new JLabel(" \uC544\uC774\uB514 ");
      label_1.setFont(new Font("Dialog", Font.PLAIN, 13));
      label_1.setBounds(44, 45, 58, 27);
      desktopPane.add(label_1);

      nameTxt = new JTextField();
      nameTxt.setBounds(143, 163, 155, 35);
      desktopPane.add(nameTxt);
      nameTxt.setColumns(10);

      JLabel label_2 = new JLabel("  \uC774\uB984  ");
      label_2.setBounds(52, 161, 53, 35);
      desktopPane.add(label_2);
      label_2.setFont(new Font("Dialog", Font.PLAIN, 13));

      JLabel label_3 = new JLabel(" \uD604\uC7AC \uB098\uC758 \uADFC\uBB34\uC9C0 ");
      label_3.setBounds(12, 219, 130, 35);
      desktopPane.add(label_3);
      label_3.setFont(new Font("Dialog", Font.PLAIN, 13));

      myworkplace = new JTextField();
      myworkplace.setBounds(143, 221, 233, 35);
      desktopPane.add(myworkplace);
      myworkplace.setColumns(10);

      JLabel label_4 = new JLabel(" \uB098\uC758 \uD604\uC7AC \uC2DC\uAE09 ");
      label_4.setBounds(12, 281, 115, 35);
      desktopPane.add(label_4);
      label_4.setFont(new Font("Dialog", Font.PLAIN, 13));

      myPay = new JTextField();
      myPay.setBounds(143, 283, 233, 35);
      desktopPane.add(myPay);
      myPay.setColumns(10);
   }

   // 이벤트 핸들러
   @Override
   public void actionPerformed(ActionEvent e) {
      Object src = e.getSource();
      String pwd = String.valueOf(passwordField.getPassword());
      /**
       * 해야하는 유효성 검사 1) 빈칸으로 중복검사를 눌렀을떼 2) 중복검사 3) 비밀번호 유효성검사 4) 시급 - 숫자형이 아닐때 또는
       * 소수점으로찍었을때 - 경고다이얼로그 뜨게 한다.
       * 
       * --일단은 그냥 push 해보기로 하장
       */
      if (src == cancelBtn) {
         setVisible(false);
         //this.dispose();
      } else if(src == checkIdBtn) {
         if(idTxt.getText().length() == 0 || idTxt.getText().length() < 4) {
            JOptionPane.showMessageDialog(this, "아이디는 4글자 이상으로 적어주세요!");
         } else {
            try {
               
               if(dao.checkId(idTxt.getText())) {
                  JOptionPane.showMessageDialog(this, "사용가능한 아이디입니다.");
                  checkedId = true;
               }else {
                  JOptionPane.showMessageDialog(this, "이미 사용중인 아이디 입니다!");
               }      
               
            } catch (SQLException e1) {
               JOptionPane.showMessageDialog(this, "알수없는 오류가 발생했습니다.");
            }
         }
         
      } else if (src == joinBtn) {         
         if(!checkedId) {
            JOptionPane.showMessageDialog(this, "아이디 중복확인을 해주세요!");
            idTxt.requestFocus();//아이디칸에 다시 포커스를 맞춰준다.
         } else if (pwd.length() < 4 || pwd.length() > 10) {
            JOptionPane.showMessageDialog(this, "비밀번호는 4자리 이상 10자리 이하로 설정해주세요!");
         } else if (nameTxt.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "이름을 반드시 입력해주세요!");
         } else if (myworkplace.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "근무지를 반드시 입력해주세요!");
         }else if(myPay.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "시급을 반드시 입력해주세요!");
         }else if(myPay.getText().equals("0")) {
            JOptionPane.showMessageDialog(this, "시급을 정확한 숫자로 입력해주세요!");
         }else {            
            member = new Member(idTxt.getText(), String.valueOf(passwordField.getPassword()),
                   nameTxt.getText(), myworkplace.getText() , myPay.getText());
            
            try {
               if(dao.join(member)) {
                  JOptionPane.showMessageDialog(this, "가입이 완료되었습니다!");         
                  //setVisible(false);
                  
                  this.dispose();
               }else {
                  JOptionPane.showMessageDialog(this, "가입에 실패하였습니다!!ㅠㅠ");      
               }
               
            } catch (SQLException e1) {
               e1.printStackTrace();
            }
         }
      }

   }

}
