
package AgeCalculator;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Toufiq
 */
public class Calculator extends JFrame implements ActionListener {
    
   

    JLabel lab = new JLabel();
    JPanel p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, pl;
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, ll;
    JTextField day, month, year, d, m, y, yy, mm, dd, dy;
    JButton b1, b2;
   
    String d1, m1, y1, d2, m2, y2;

    int di1 = 0, mi1 = 0, yi1 = 0, di2 = 0, mi2 = 0, yi2 = 0, final_day, final_month, final_year, tempd1, tempd2, tempm1, tempm2, final_day1, temp, i, sub;

    Calculator() {
        //   JFrame frame=new JFrame("Age Calculator");
       
        
        
        super("Age Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        
        setSize(500, 600);

        GridBagLayout gb = new GridBagLayout();

        GridBagConstraints gbs = new GridBagConstraints();

        setLayout(gb);
      //  p1=new JPanel();

        //setLayout(new FlowLayout()); 
        l1 = new JLabel("                                       " + "" + "          Day               Month           Year");

        p2 = new JPanel();
        l4 = new JLabel("     Your Birthdate:");
        l4.setForeground(new java.awt.Color(51, 51, 255));
        l4.setFont(new java.awt.Font("Book Antiqua", 0, 18));

        day = new JTextField(4);
        day.setBackground(new java.awt.Color(255, 204, 255));
        day.setFont(new java.awt.Font("Times New Roman", 0, 18));
        day.setForeground(new java.awt.Color(51, 51, 51));


        month = new JTextField(4);
        month.setBackground(new java.awt.Color(255, 204, 255));
        month.setFont(new java.awt.Font("Times New Roman", 0, 18));
        month.setForeground(new java.awt.Color(51, 51, 51));
        
        
        
       

        year = new JTextField(4);
        year.setBackground(new java.awt.Color(255, 204, 255));
        year.setFont(new java.awt.Font("Times New Roman", 0, 18));
        year.setForeground(new java.awt.Color(51, 51, 51));
        
        
        
        
        
        l5 = new JLabel("                                                " +   "" +     "Day               Month            Year");
        
        p4 = new JPanel();

        l8 = new JLabel("       Present Date:");
        l8.setForeground(new java.awt.Color(51, 51, 255));
        l8.setFont(new java.awt.Font("Book Antiqua", 0, 18));

        d = new JTextField(4);
        d.setBackground(new java.awt.Color(255, 204, 255));
        d.setFont(new java.awt.Font("Times New Roman", 0, 18));
        d.setForeground(new java.awt.Color(51, 51, 51));
        
        
        
        
  
//        d2=d.getText();
//        di2=Integer.parseInt(d2);
        m = new JTextField(4);
        m.setBackground(new java.awt.Color(255, 204, 255));
        m.setFont(new java.awt.Font("Times New Roman", 0, 18));
        m.setForeground(new java.awt.Color(51, 51, 51));
        
        
        
        
        
//         m2=m.getText();
//        mi2=Integer.parseInt(m2);
        y = new JTextField(4);
        y.setBackground(new java.awt.Color(255, 204, 255));
        y.setFont(new java.awt.Font("Times New Roman", 0, 18));
        y.setForeground(new java.awt.Color(51, 51, 51));
        
        
        
        

        p2.add(l4);
        p2.add(day);
        p2.add(month);
        p2.add(year);

    
        p4.add(l8);

        p4.add(d);
        p4.add(m);
        p4.add(y);

        p5 = new JPanel();

       b1 = new JButton("Calculate");
       b1.setBackground(new java.awt.Color(255, 153, 102));
       b1.setFont(new java.awt.Font("Arial", 1, 16));
       b1.setForeground(new java.awt.Color(153, 0, 51));
        
        
        
        b2 = new JButton("Reset");
        b2.setBackground(new java.awt.Color(153, 204, 0));
        b2.setForeground(new java.awt.Color(255, 0, 51));
        b2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16));
        
        
        b1.addActionListener(this);
        b2.addActionListener(this);

        p5.add(b1);
        p5.add(b2);

        p6 = new JPanel();

        l9 = new JLabel("You Have Been Living For:");
        
        l9.setFont(new java.awt.Font("Nirmala UI", 1, 22));
        l9.setForeground(new java.awt.Color(0, 204, 0));
        
        
        
        
        //yy=new JTextField(10);
        p6.add(l9);
        p7 = new JPanel();
        
        
        l10 = new JLabel("Years: ");
        l10.setFont(new java.awt.Font("Book Antiqua", 0, 18));
        l10.setForeground(new java.awt.Color(255, 0, 204));
        
    
        yy = new JTextField(10);
        yy.setBackground(new java.awt.Color(204, 255, 204));
        yy.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        yy.setForeground(new java.awt.Color(0, 0, 255));
        
        
        
        
        
        p7.add(l10);
        p7.add(yy);
        p8 = new JPanel();
        
        l11 = new JLabel("Months:");
        l11.setFont(new java.awt.Font("Book Antiqua", 0, 18));
        l11.setForeground(new java.awt.Color(255, 0, 204));
        
        
        
        
        
        mm = new JTextField(10);
        mm.setBackground(new java.awt.Color(204, 255, 204));
        mm.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        mm.setForeground(new java.awt.Color(0, 0, 255));
        
        
        
        
        
        p8.add(l11);
        p8.add(mm);

        p9 = new JPanel();

        l12 = new JLabel("Days:  ");
        l12.setFont(new java.awt.Font("Book Antiqua", 0, 18));
        l12.setForeground(new java.awt.Color(255, 0, 204));
        
        
        dd = new JTextField(10);
        dd.setBackground(new java.awt.Color(204, 255, 204));
        dd.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        dd.setForeground(new java.awt.Color(0, 0, 255));
        
        
        
        
        p9.add(l12);
        p9.add(dd);
        

       
        l13 = new JLabel("Your next birthday will come after:");
       
        l13.setFont(new java.awt.Font("Nirmala UI", 1, 22));
        l13.setForeground(new java.awt.Color(51, 51, 255));
        
        dy = new JTextField(10);
        dy.setBackground(new java.awt.Color(204, 255, 153));
        dy.setFont(new java.awt.Font("Times New Roman", 0, 18)); 
        dy.setForeground(new java.awt.Color(255, 51, 0));
      

        
        pl = new JPanel();
        ll = new JLabel("I AM FEELING LUCKY !! ");
        ll.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ll.setForeground(new java.awt.Color(204, 0, 102)); 

        pl.add(ll);

        gbs.weighty = 1.0;

        gbs.anchor = GridBagConstraints.NORTH;

        gbs.gridwidth = GridBagConstraints.REMAINDER;

        gb.setConstraints(l1, gbs);

        gbs.anchor = GridBagConstraints.NORTH;

        gbs.gridwidth = GridBagConstraints.REMAINDER;

        gb.setConstraints(p2, gbs);

        gbs.anchor = GridBagConstraints.NORTH;

        gbs.gridwidth = GridBagConstraints.REMAINDER;

        gb.setConstraints(l5, gbs);

        gbs.anchor = GridBagConstraints.NORTH;

        gbs.gridwidth = GridBagConstraints.REMAINDER;

        gb.setConstraints(p4, gbs);

        gbs.anchor = GridBagConstraints.NORTH;

        gbs.gridwidth = GridBagConstraints.REMAINDER;

        gb.setConstraints(p5, gbs);

        gbs.anchor = GridBagConstraints.NORTH;

        gbs.gridwidth = GridBagConstraints.REMAINDER;

        gb.setConstraints(p6, gbs);

        gbs.anchor = GridBagConstraints.NORTH;

        gbs.gridwidth = GridBagConstraints.REMAINDER;

        gb.setConstraints(p7, gbs);

        gbs.anchor = GridBagConstraints.NORTH;

        gbs.gridwidth = GridBagConstraints.REMAINDER;

        gb.setConstraints(p8, gbs);

        gbs.anchor = GridBagConstraints.NORTH;

        gbs.gridwidth = GridBagConstraints.REMAINDER;

        gb.setConstraints(p9, gbs);

        gbs.anchor = GridBagConstraints.NORTH;

        gbs.gridwidth = GridBagConstraints.REMAINDER;

        gb.setConstraints(l13, gbs);

        gbs.anchor = GridBagConstraints.NORTH;

        gbs.gridwidth = GridBagConstraints.REMAINDER;

        gb.setConstraints(dy, gbs);

        gbs.anchor = GridBagConstraints.NORTH;

        gbs.gridwidth = GridBagConstraints.REMAINDER;

        gb.setConstraints(pl, gbs);

        add(l1);
        add(p2);

        add(l5);
        add(p4);

        add(p5);
        add(p6);

        add(p7);

        add(p8);
        add(p9);

        add(l13);
        add(dy);
        add(pl);

        setVisible(true);

     
    }

    public void actionPerformed(ActionEvent ae) {

        try {
            d1 = day.getText();
            di1 = Integer.parseInt(d1);

            m1 = month.getText();
            mi1 = Integer.parseInt(m1);

            y1 = year.getText();
            yi1 = Integer.parseInt(y1);

            d2 = d.getText();
            di2 = Integer.parseInt(d2);

            m2 = m.getText();
            mi2 = Integer.parseInt(m2);

            y2 = y.getText();
            yi2 = Integer.parseInt(y2);
        

        } catch (NumberFormatException e) {

        }

        if (ae.getSource() == b1) {
            compute();
        }

        if (ae.getSource() == b2) {

            reset();

        }

    }

    private void compute() {

        
        tempd1 = di1;
        tempd2 = di2;
        tempm1 = mi1;
        tempm2 = mi2;

        if (di2 >= di1) {
            final_day = di2 - di1;
        } else if (di2 < di1) {

            if (mi1 == 11 || mi1 == 4 || mi1 == 6 || mi1 == 9) {

                di2 = di2 + 30;

                System.out.println("di2=" + di2);

                final_day = di2 - di1;
            } else if (mi1 == 2) {
                di2 = di2 + 28;
                final_day = di2 - di1;

            } else {
                di2 = di2 + 31;

                final_day = di2 - di1;
            }

            mi1 = mi1 + 1;

        }

        if (mi2 >= mi1) {
            final_month = mi2 - mi1;
        } else if (mi2 < mi1) {

            mi2 = mi2 + 12;
            final_month = mi2 - mi1;
            yi1 = yi1 + 1;
        }

        final_year = yi2 - yi1;

        if (final_year <= 0) {
            final_year = 0;
        }

        //counting total days to go....
        if (tempd1 == tempd2 && tempm1 == tempm2) {
            final_day = 0;

        } 
        
        
         if(tempm1==tempm2 && tempd1>=tempd2)
        {

            final_day1=tempd1-tempd2;
        }

 

        else if (tempm1 > tempm2 || (tempm1 == tempm2 && tempd1 > tempd2)) {

            final_day1 = 0;

            for (i = tempm2 + 1; i < tempm1; i++) {

                if (i == 2) {
                    final_day1 = final_day1 + 28;
                } else if (i == 9 || i == 4 || i == 6 || i == 11) {
                    final_day1 = final_day1 + 30;
                } else {
                    final_day1 = final_day1 + 31;
                }
            }

            if (tempm2 == 2) {
                final_day1 = final_day1 + (28 - tempd2);
            } else if (tempm2 == 9 || tempm2 == 4 || tempm2 == 6 || tempm2 == 11) {
                final_day1 = final_day1 + (30 - tempd2);
            } else {
                final_day1 = final_day1 + (31 - tempd2);
            }

            final_day1 = final_day1 + tempd1;

        } else if (tempm1 < tempm2) {

            final_day1 = 0;

            for (i = tempm2 + 1; i <= 12; i++) {

                if (i == 2) {
                    final_day1 = final_day1 + 28;
                } else if (i == 9 || i == 4 || i == 6 || i == 11) {
                    final_day1 = final_day1 + 30;
                } else {
                    final_day1 = final_day1 + 31;
                }
            }

            for (i = 1; i < tempm1; i++) {

                if (i == 2) {
                    final_day1 = final_day1 + 28;
                } else if (i == 9 || i == 4 || i == 6 || i == 11) {
                    final_day1 = final_day1 + 30;
                } else {
                    final_day1 = final_day1 + 31;
                }

            }

            if (tempm2 == 2) {
                final_day1 = final_day1 + (28 - tempd2);
            } else if (tempm2 == 9 || tempm2 == 4 || tempm2 == 6 || tempm2 == 11) {
                final_day1 = final_day1 + (30 - tempd2);
            } else {
                final_day1 = final_day1 + (31 - tempd2);
            }

            final_day1 = final_day1 + tempd1;

        } else if (tempm1 == tempm2 && tempd1 < tempd2) {

            sub = tempd2 - tempd1;

            final_day1 = 365 - sub;

        }

        String dr = String.valueOf(final_day);
        dd.setText(dr);
        dd.setEditable(false);

        String dr1 = String.valueOf(final_month);
        mm.setText(dr1);
        mm.setEditable(false);

        String dr2 = String.valueOf(final_year);
        yy.setText(dr2);
        yy.setEditable(false);

        String dr3 = String.valueOf(final_day1);
        dy.setText(dr3+" Days");
        dy.setEditable(false);
       
    }

    private void reset() {

        day.setText(null);

        month.setText(null);
        year.setText(null);

        d.setText(null);
        m.setText(null);

        y.setText(null);

        dd.setText(null);
        mm.setText(null);

        yy.setText(null);
        dy.setText(null);
        

    }

}


class MainCalculator {

    public static void main(String args[]) {
        Calculator ob1 = new Calculator();
    }
}
