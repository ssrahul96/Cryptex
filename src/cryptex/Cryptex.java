

package cryptex;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;


public class Cryptex{  
    
    
     FrameStart frameStart = new FrameStart();
        
        
        static Frame1 frame1 = new Frame1();
        static Frame2 frame2 = new Frame2();
        static Frame3 frame3 = new Frame3();
        static Frame4 frame4 = new Frame4();
        static Frame5 frame5 = new Frame5();
        static Frame6 frame6 = new Frame6();
        static Frame7 frame7 = new Frame7();
        static Frame8 frame8 = new Frame8();
        static Frame9 frame9 = new Frame9();
        static Frame10 frame10 = new Frame10();
        
        FrameTimeUp timeUp = new FrameTimeUp();
        
       FrameEnd frameEnd = new FrameEnd();
    
      int time = 1200;
       TimeClass tc = new TimeClass(time);
       Timer timer = new Timer(1000,tc);
      
    
       //int count;
    
    public static void main(String[] args) {
        
        Cryptex cryptex = new Cryptex();
        Dbconnect connect = new Dbconnect();
        
        String returnValue[][] = connect.getData();
        
                        frame1.jTextArea1.setText(returnValue[0][0] + " " + returnValue[0][1]);
                        frame1.jRadioButton1.setText(returnValue[0][2]);
                        frame1.jRadioButton2.setText(returnValue[0][3]);
                        frame1.jRadioButton3.setText(returnValue[0][4]);
                        frame1.jRadioButton4.setText(returnValue[0][5]);
                        frame1.jTextArea1.setEditable(false);      
                        
                        frame1.jTextArea2.setText(returnValue[1][0] + " " + returnValue[1][1]);
                        frame1.jRadioButton5.setText(returnValue[1][2]);
                        frame1.jRadioButton6.setText(returnValue[1][3]);
                        frame1.jRadioButton7.setText(returnValue[1][4]);
                        frame1.jRadioButton8.setText(returnValue[1][5]);
                        frame1.jTextArea2.setEditable(false);  
                        
                        //-------------------------------------------------------------  1
                        
                        frame2.jTextArea1.setText(returnValue[2][0] + " " + returnValue[2][1]);
                        frame2.jRadioButton1.setText(returnValue[2][2]);
                        frame2.jRadioButton2.setText(returnValue[2][3]);
                        frame2.jRadioButton3.setText(returnValue[2][4]);
                        frame2.jRadioButton4.setText(returnValue[2][5]);
                        frame2.jTextArea1.setEditable(false);
       
                        
                        frame2.jTextArea2.setText(returnValue[3][0] + " " + returnValue[3][1]);
                        frame2.jRadioButton5.setText(returnValue[3][2]);
                        frame2.jRadioButton6.setText(returnValue[3][3]);
                        frame2.jRadioButton7.setText(returnValue[3][4]);
                        frame2.jRadioButton8.setText(returnValue[3][5]);
                        frame2.jTextArea2.setEditable(false);
                        
                        //---------------------------------------------------------------- 2
                        
                        frame3.jTextArea1.setText(returnValue[4][0] + " " + returnValue[4][1]);
                        frame3.jRadioButton1.setText(returnValue[4][2]);
                        frame3.jRadioButton2.setText(returnValue[4][3]);
                        frame3.jRadioButton3.setText(returnValue[4][4]);
                        frame3.jRadioButton4.setText(returnValue[4][5]);
                        frame3.jTextArea1.setEditable(false);
       
                        
                        frame3.jTextArea2.setText(returnValue[5][0] + " " + returnValue[5][1]);
                        frame3.jRadioButton5.setText(returnValue[5][2]);
                        frame3.jRadioButton6.setText(returnValue[5][3]);
                        frame3.jRadioButton7.setText(returnValue[5][4]);
                        frame3.jRadioButton8.setText(returnValue[5][5]);
                        frame3.jTextArea2.setEditable(false);
                        
                        //----------------------------------------------------------------- 3
                        
                        frame4.jTextArea1.setText(returnValue[6][0] + " " + returnValue[6][1]);
                        frame4.jRadioButton1.setText(returnValue[6][2]);
                        frame4.jRadioButton2.setText(returnValue[6][3]);
                        frame4.jRadioButton3.setText(returnValue[6][4]);
                        frame4.jRadioButton4.setText(returnValue[6][5]);
                        frame4.jTextArea1.setEditable(false);
       
                        
                        frame4.jTextArea2.setText(returnValue[7][0] + " " + returnValue[7][1]);
                        frame4.jRadioButton5.setText(returnValue[7][2]);
                        frame4.jRadioButton6.setText(returnValue[7][3]);
                        frame4.jRadioButton7.setText(returnValue[7][4]);
                        frame4.jRadioButton8.setText(returnValue[7][5]);
                        frame4.jTextArea2.setEditable(false);
                        
                        //-----------------------------------------------------------------  4
                        
                        frame5.jTextArea1.setText(returnValue[8][0] + " " + returnValue[8][1]);
                        frame5.jRadioButton1.setText(returnValue[8][2]);
                        frame5.jRadioButton2.setText(returnValue[8][3]);
                        frame5.jRadioButton3.setText(returnValue[8][4]);
                        frame5.jRadioButton4.setText(returnValue[8][5]);
                        frame5.jTextArea1.setEditable(false);
       
                        
                        frame5.jTextArea2.setText(returnValue[9][0] + " " + returnValue[9][1]);
                        frame5.jRadioButton5.setText(returnValue[9][2]);
                        frame5.jRadioButton6.setText(returnValue[9][3]);
                        frame5.jRadioButton7.setText(returnValue[9][4]);
                        frame5.jRadioButton8.setText(returnValue[9][5]);
                        frame5.jTextArea2.setEditable(false);
                        
                         //-----------------------------------------------------------------  5
                        
                        frame6.jTextArea1.setText(returnValue[10][0] + " " + returnValue[10][1]);
                        frame6.jRadioButton1.setText(returnValue[10][2]);
                        frame6.jRadioButton2.setText(returnValue[10][3]);
                        frame6.jRadioButton3.setText(returnValue[10][4]);
                        frame6.jRadioButton4.setText(returnValue[10][5]);
                        frame6.jTextArea1.setEditable(false);
       
                        
                        frame6.jTextArea2.setText(returnValue[11][0] + " " + returnValue[11][1]);
                        frame6.jRadioButton5.setText(returnValue[11][2]);
                        frame6.jRadioButton6.setText(returnValue[11][3]);
                        frame6.jRadioButton7.setText(returnValue[11][4]);
                        frame6.jRadioButton8.setText(returnValue[11][5]);
                        frame6.jTextArea2.setEditable(false);
                        
                         //-----------------------------------------------------------------  6
                                    
                        frame7.jTextArea1.setText(returnValue[12][0] + " " + returnValue[12][1]);
                        frame7.jRadioButton1.setText(returnValue[12][2]);
                        frame7.jRadioButton2.setText(returnValue[12][3]);
                        frame7.jRadioButton3.setText(returnValue[12][4]);
                        frame7.jRadioButton4.setText(returnValue[12][5]);
                        frame7.jTextArea1.setEditable(false);
                        
                        frame7.jTextArea2.setText(returnValue[13][0] + " " + returnValue[13][1]);
                        frame7.jRadioButton5.setText(returnValue[13][2]);
                        frame7.jRadioButton6.setText(returnValue[13][3]);
                        frame7.jRadioButton7.setText(returnValue[13][4]);
                        frame7.jRadioButton8.setText(returnValue[13][5]);
                        frame7.jTextArea2.setEditable(false); 
                        
                        
                        //-----------------------------------------------------------------  7
                        
                        frame8.jTextArea1.setText(returnValue[14][0] + " " + returnValue[14][1]);
                        frame8.jRadioButton1.setText(returnValue[14][2]);
                        frame8.jRadioButton2.setText(returnValue[14][3]);
                        frame8.jRadioButton3.setText(returnValue[14][4]);
                        frame8.jRadioButton4.setText(returnValue[14][5]);
                        frame8.jTextArea1.setEditable(false);
                        
                        frame8.jTextArea2.setText(returnValue[15][0] + " " + returnValue[15][1]);
                        frame8.jRadioButton5.setText(returnValue[15][2]);
                        frame8.jRadioButton6.setText(returnValue[15][3]);
                        frame8.jRadioButton7.setText(returnValue[15][4]);
                        frame8.jRadioButton8.setText(returnValue[15][5]);
                        frame8.jTextArea2.setEditable(false);
                                               
                        
                        //-----------------------------------------------------------------  8
                        
                        frame9.jTextArea1.setText(returnValue[16][0] + " " + returnValue[16][1]);
                        frame9.jRadioButton1.setText(returnValue[16][2]);
                        frame9.jRadioButton2.setText(returnValue[16][3]);
                        frame9.jRadioButton3.setText(returnValue[16][4]);
                        frame9.jRadioButton4.setText(returnValue[16][5]);
                        frame9.jTextArea1.setEditable(false);
                        
                        frame9.jTextArea2.setText(returnValue[17][0] + " " + returnValue[17][1]);
                        frame9.jRadioButton5.setText(returnValue[17][2]);
                        frame9.jRadioButton6.setText(returnValue[17][3]);
                        frame9.jRadioButton7.setText(returnValue[17][4]);
                        frame9.jRadioButton8.setText(returnValue[17][5]);
                        frame9.jTextArea2.setEditable(false);                        
                                               
                        //-----------------------------------------------------------------  9
                     
                        frame10.jTextArea1.setText(returnValue[18][0] + " " + returnValue[18][1]);
                        frame10.jRadioButton1.setText(returnValue[18][2]);
                        frame10.jRadioButton2.setText(returnValue[18][3]);
                        frame10.jRadioButton3.setText(returnValue[18][4]);
                        frame10.jRadioButton4.setText(returnValue[18][5]);
                        frame10.jTextArea1.setEditable(false);
                        
                        frame10.jTextArea2.setText(returnValue[19][0] + " " + returnValue[19][1]);
                        frame10.jRadioButton5.setText(returnValue[19][2]);
                        frame10.jRadioButton6.setText(returnValue[19][3]);
                        frame10.jRadioButton7.setText(returnValue[19][4]);
                        frame10.jRadioButton8.setText(returnValue[19][5]);
                        frame10.jTextArea2.setEditable(false);
                        
                        
                        //-----------------------------------------------------------------  10
                        
                  
                               
       
        
         cryptex.frameStart.setVisible(true);
        
        cryptex.frameStart.start.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                              
                cryptex.timer.start();
                cryptex.frame1.setVisible(true);
                cryptex.frameStart.setVisible(false);
               
            }
        });
        
         cryptex.frame1.next1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cryptex.frame2.setVisible(true);
                cryptex.frame1.setVisible(false);
            }
        });
         
         cryptex.frame2.pre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cryptex.frame1.setVisible(true);
                cryptex.frame2.setVisible(false);
            }
        });
         
          cryptex.frame2.next2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                 cryptex.frame3.setVisible(true);
                cryptex.frame2.setVisible(false);
               
            }
        });
          
           cryptex.frame3.pre3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                cryptex.frame2.setVisible(true);
                cryptex.frame3.setVisible(false);
            }
        });
           
           cryptex.frame3.next3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                 cryptex.frame4.setVisible(true);
                cryptex.frame3.setVisible(false);
               
            }
        });
        cryptex.frame4.next4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                 cryptex.frame5.setVisible(true);
                cryptex.frame4.setVisible(false);
               
            }
        });
        cryptex.frame5.next5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                 cryptex.frame6.setVisible(true);
                cryptex.frame5.setVisible(false);
               
            }
        });
        cryptex.frame6.next6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                 cryptex.frame7.setVisible(true);
                cryptex.frame6.setVisible(false);
               
            }
        });
        cryptex.frame7.next7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                 cryptex.frame8.setVisible(true);
                cryptex.frame7.setVisible(false);
               
            }
        });
        cryptex.frame8.next8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                 cryptex.frame9.setVisible(true);
                cryptex.frame8.setVisible(false);
               
            }
        });
        cryptex.frame9.next9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                 cryptex.frame10.setVisible(true);
                cryptex.frame9.setVisible(false);
               
            }
        });
        cryptex.frame4.pre4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                cryptex.frame3.setVisible(true);
                cryptex.frame4.setVisible(false);
            }
        });
        cryptex.frame5.pre5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                cryptex.frame4.setVisible(true);
                cryptex.frame5.setVisible(false);
            }
        });
        cryptex.frame6.pre6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                cryptex.frame5.setVisible(true);
                cryptex.frame6.setVisible(false);
            }
        });
        cryptex.frame7.pre7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                cryptex.frame6.setVisible(true);
                cryptex.frame7.setVisible(false);
            }
        });
        cryptex.frame8.pre8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                cryptex.frame7.setVisible(true);
                cryptex.frame8.setVisible(false);
            }
        });
        cryptex.frame9.pre9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                cryptex.frame8.setVisible(true);
                cryptex.frame9.setVisible(false);
            }
        });
        cryptex.frame10.pre10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                cryptex.frame9.setVisible(true);
                cryptex.frame10.setVisible(false);
            }
        });
        
        cryptex.frame10.submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                int count=0;
             
                
                int x1=Integer.parseInt(returnValue[0][6]);
                int x2=Integer.parseInt(returnValue[1][6]);
                int x3=Integer.parseInt(returnValue[2][6]);
                int x4=Integer.parseInt(returnValue[3][6]);
                int x5=Integer.parseInt(returnValue[4][6]);
                int x6=Integer.parseInt(returnValue[5][6]);
                int x7=Integer.parseInt(returnValue[6][6]);
                int x8=Integer.parseInt(returnValue[7][6]);
                int x9=Integer.parseInt(returnValue[8][6]);
                int x10=Integer.parseInt(returnValue[9][6]);
                int x11=Integer.parseInt(returnValue[10][6]);
                int x12=Integer.parseInt(returnValue[11][6]);
                int x13=Integer.parseInt(returnValue[12][6]);
                int x14=Integer.parseInt(returnValue[13][6]);
                int x15=Integer.parseInt(returnValue[14][6]);
                int x16=Integer.parseInt(returnValue[15][6]);
                int x17=Integer.parseInt(returnValue[16][6]);
                int x18=Integer.parseInt(returnValue[17][6]);
                int x19=Integer.parseInt(returnValue[18][6]);
                int x20=Integer.parseInt(returnValue[19][6]);
                
                
                //x1=x2=x3=x4=x5=x6=x7=x8=x9=x10=1;
                //x11=x12=x13=x14=x15=x16=x17=x18=x19=x20=1;
                        
                if(frame1.i == x1){
                    count++;
                }
                
                if(frame1.j == x2){
                    count++;
                }
                if(frame2.i == x3){
                    count++;
                }
                if(frame2.j == x4){
                    count++;
                }
                if(frame3.i == x5){
                    count++;
                }
                if(frame3.j == x6){
                    count++;
                }
                if(frame4.i == x7){
                    count++;
                }
                if(frame4.j == x8){
                    count++;
                }
                if(frame5.i == x9){
                    count++;
                }
                if(frame5.j == x10){
                    count++;
                }
                if(frame6.i == x11){
                    count++;
                }
                if(frame6.j == x12){
                    count++;
                }
                if(frame7.i == x13){
                    count++;
                }
                if(frame7.j == x14){
                    count++;
                }
                if(frame8.i == x15){
                    count++;
                }
                if(frame8.j == x16){
                    count++;
                }
                if(frame9.i == x17){
                    count++;
                }
                if(frame9.j == x18){
                    count++;
                }
                if(frame10.i == x19){
                    count++;
                }
                if(frame10.j == x20){
                    count++;
                }
                           
                String s = ""+ count;               
                
                int c = cryptex.tc.current();
              
                
                cryptex.frameEnd.score.setText(s);
                cryptex.frameEnd.timeLeft.setText(""+c);
                cryptex.frameEnd.setVisible(true);
                cryptex.frame10.setVisible(false);
                cryptex.timer.stop();
                //System.out.println(cryptex.count);
                //int rno=1111;
                
                String rno1 = FrameStart.jTextField2.getText();
                int rno = Integer.parseInt(rno1);
                
                String name = FrameStart.jTextField1.getText();
                Dbconnect db = new Dbconnect();
                db.putData(name,rno,count,c);
            }

            private int parseInt(String returnValue) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        cryptex.timeUp.submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               
                int count=0;
               
                int x1=Integer.parseInt(returnValue[0][6]);
                int x2=Integer.parseInt(returnValue[1][6]);
                int x3=Integer.parseInt(returnValue[2][6]);
                int x4=Integer.parseInt(returnValue[3][6]);
                int x5=Integer.parseInt(returnValue[4][6]);
                int x6=Integer.parseInt(returnValue[5][6]);
                int x7=Integer.parseInt(returnValue[6][6]);
                int x8=Integer.parseInt(returnValue[7][6]);
                int x9=Integer.parseInt(returnValue[8][6]);
                int x10=Integer.parseInt(returnValue[9][6]);
                int x11=Integer.parseInt(returnValue[10][6]);
                int x12=Integer.parseInt(returnValue[11][6]);
                int x13=Integer.parseInt(returnValue[12][6]);
                int x14=Integer.parseInt(returnValue[13][6]);
                int x15=Integer.parseInt(returnValue[14][6]);
                int x16=Integer.parseInt(returnValue[15][6]);
                int x17=Integer.parseInt(returnValue[16][6]);
                int x18=Integer.parseInt(returnValue[17][6]);
                int x19=Integer.parseInt(returnValue[18][6]);
                int x20=Integer.parseInt(returnValue[19][6]);
                
                if(frame1.i == x1){
                    count++;
                }
                
                if(frame1.j == x2){
                    count++;
                }
                if(frame2.i == x3){
                    count++;
                }
                if(frame2.j == x4){
                    count++;
                }
                if(frame3.i == x5){
                    count++;
                }
                if(frame3.j == x6){
                    count++;
                }
                if(frame4.i == x7){
                    count++;
                }
                if(frame4.j == x8){
                    count++;
                }
                if(frame5.i == x9){
                    count++;
                }
                if(frame5.j == x10){
                    count++;
                }
                if(frame6.i == x11){
                    count++;
                }
                if(frame6.j == x12){
                    count++;
                }
                if(frame7.i == x13){
                    count++;
                }
                if(frame7.j == x14){
                    count++;
                }
                if(frame8.i == x15){
                    count++;
                }
                if(frame8.j == x16){
                    count++;
                }
                if(frame9.i == x17){
                    count++;
                }
                if(frame9.j == x18){
                    count++;
                }
                if(frame10.i == x19){
                    count++;
                }
                if(frame10.j == x2){
                    count++;
                }
                           
                String s = ""+ count;               
                
                int c = cryptex.tc.current();
                //int rno=6666;
               
                cryptex.frameEnd.score.setText(s);
                cryptex.frameEnd.timeLeft.setText(""+c);
                cryptex.frameEnd.setVisible(true);
                cryptex.frame10.setVisible(false);
                //System.out.println(cryptex.count);
                //connect.putData(rno,cryptex.count);
                
                String rno1 = FrameStart.jTextField2.getText();
                int rno = Integer.parseInt(rno1);
                
                String name = FrameStart.jTextField1.getText();
                Dbconnect db = new Dbconnect();
                db.putData(name,rno,count,c);
            
            }
        });
        
    }
    
    
    
    
    public class TimeClass implements ActionListener {
        
        int counter;
        
        public TimeClass(int c) {
            counter = c;
        }

        
        public void actionPerformed(ActionEvent e) {
            
            counter --;
            
            if(counter >= 1) {
                
                frame1.timer2.setText("" +counter);
                frame2.timer2.setText("" +counter);
                frame3.timer3.setText("" +counter);
                frame4.timer4.setText("" +counter);
                frame5.timer5.setText("" +counter);
                frame6.timer6.setText("" +counter);
                frame7.timer7.setText("" +counter);
                frame8.timer8.setText("" +counter);
                frame9.timer9.setText("" +counter);
                frame10.timer10.setText("" +counter);
                
            }
            else {
                timer.stop();
                timeUp.setVisible(true);
                frame1.setVisible(false);
                frame2.setVisible(false);
                frame3.setVisible(false);
                frame4.setVisible(false);
                frame5.setVisible(false);
                frame6.setVisible(false);
                frame7.setVisible(false);
                frame8.setVisible(false);
                frame9.setVisible(false);
                frame10.setVisible(false);
                
            }
           
        
    }
        public int current() {
            return counter;
        }
        }
    }

