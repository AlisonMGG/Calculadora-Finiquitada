
package calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class ventana extends JFrame{
    
     JPanel panelInicio = new JPanel();
    JTextField txtValor1 = new JTextField();
  char simbolo = ' ';
    JLabel lblresultado = new JLabel("");
    int valor1 = 0;
    public ventana(){
    this.setVisible(true);                          //HACE VICIBLE LA VENTANA.
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);   //BOTON PARA CERRAR VENTANA.
      
    
    }   
    
      public void insertarPanel(){                    //PARA CREAR UN PANEL,  NOS PERMITE REUTILIZAR LA VENTANA
        
        this.getContentPane().add(panelInicio);
        //panelInicio.setBackground(Color.blue);    //APLICA COLOR AL PANEL
       
        panelInicio.setLayout(null);                //DESACTIVA LA ORGANISACIOIN AUTOMATICA
    }      
    
    public void insertarEtiquetas(){
        JLabel lblValor1 = new JLabel("");
        lblValor1.setBounds(20, 20, 160, 15);
        panelInicio.add(lblValor1);

      
        
        
        lblresultado.setBounds(50, 180, 45, 40);
        panelInicio.add(lblresultado);
    }
    
    
    public void insertarTexto(){       
       
        txtValor1.setBounds(20, 30, 305, 70);
        panelInicio.add(txtValor1);
        txtValor1.repaint();

      
        
    }
    
     public void insertarBotones() {
     JButton btn1 = new JButton("1");
        btn1.setBounds(25, 120, 70, 60);
        panelInicio.add(btn1);
        btn1.repaint();

        ActionListener agregar1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String union = txtValor1.getText() + "1";
                txtValor1.setText(union);
            }
        };
        btn1.addActionListener(agregar1);
        
        
        JButton btn2 = new JButton("2");
        btn2.setBounds(100, 120, 70, 60);
        panelInicio.add(btn2);
        btn2.repaint();
        
        ActionListener agregar2 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String union = txtValor1.getText() + "2";
                txtValor1.setText(union);
            }
        };
        btn2.addActionListener(agregar2);
        
        
        
        JButton btn3 = new JButton("3");
        btn3.setBounds(175, 120, 70, 60);
        panelInicio.add(btn3);
        btn3.repaint();
        
        ActionListener agregar3 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String union = txtValor1.getText() + "3";
                txtValor1.setText(union);
            }
        };
        btn3.addActionListener(agregar3);
        
        
        
        
         JButton btn4 = new JButton("4");
        btn4.setBounds(25, 185, 70, 60);
        panelInicio.add(btn4);
        btn4.repaint();
        
        ActionListener agregar4 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String union = txtValor1.getText() + "4";
                txtValor1.setText(union);
            }
        };
        btn4.addActionListener(agregar4);
        
        
        
        
        
         JButton btn5 = new JButton("5");
        btn5.setBounds(100, 185, 70, 60);
        panelInicio.add(btn5);
        btn5.repaint();
        
        ActionListener agregar5 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String union = txtValor1.getText() + "5";
                txtValor1.setText(union);
            }
        };
        btn5.addActionListener(agregar5);
      
        
        
        
        
          JButton btn6 = new JButton("6");
        btn6.setBounds(175, 185, 70, 60);
        panelInicio.add(btn6);
        btn6.repaint();
        
        ActionListener agregar6 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String union = txtValor1.getText() + "6";
                txtValor1.setText(union);
            }
        };
        btn6.addActionListener(agregar6);
        
        
        
        
        
        
        JButton btn7 = new JButton("7");
        btn7.setBounds(25, 251, 70, 60);
        panelInicio.add(btn7);
        btn7.repaint();
        
        ActionListener agregar7 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String union = txtValor1.getText() + "7";
                txtValor1.setText(union);
            }
        };
        btn7.addActionListener(agregar7);
        
        
        
        
        JButton btn8 = new JButton("8");
        btn8.setBounds(100, 251, 70, 60);
        panelInicio.add(btn8);
        btn8.repaint();
        
        ActionListener agregar8 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String union = txtValor1.getText() + "8";
                txtValor1.setText(union);
            }
        };
        btn8.addActionListener(agregar8);
        
        
        
        
        
         JButton btn9 = new JButton("9");
        btn9.setBounds(175, 251, 70, 60);
        panelInicio.add(btn9);
        btn9.repaint();
        
        ActionListener agregar9 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String union = txtValor1.getText() + "9";
                txtValor1.setText(union);
            }
        };
        btn9.addActionListener(agregar9);
        
        
        
        
        
        
        JButton btn0 = new JButton("0");
        btn0.setBounds(25, 320, 70, 60);
        panelInicio.add(btn0);
        btn0.repaint();
        
        ActionListener agregar0 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String union = txtValor1.getText() + "0";
                txtValor1.setText(union);
            }
        };
        btn0.addActionListener(agregar0);
        
        
        
        
        //////////////////////////////////////////////
     
   // try {
        
        JButton btnSum = new JButton("+");
        panelInicio.add(btnSum);
        btnSum.setBounds(250, 120, 70, 60);
        ActionListener suma2 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtValor1.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Debe ingresar un valor");
                }else{
                    valor1 += Integer.parseInt(txtValor1.getText());
                    simbolo = '+';
                    txtValor1.setText("");
                }
            }
        };
        btnSum.addActionListener(suma2);
        
        
        
        
         JButton btnRes = new JButton("-");
        panelInicio.add(btnRes);
        btnRes.setBounds(250, 185, 70, 60);
        ActionListener res2 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtValor1.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Debe ingresar un valor");
                }else{
                    if(valor1 == 0){
                        valor1 = Integer.parseInt(txtValor1.getText());
                    }else{
                        valor1 -= Integer.parseInt(txtValor1.getText());
                    }
                    simbolo = '-';
                    txtValor1.setText("");
                }
            }
        };
        btnRes.addActionListener(res2);
        
        
        
        
        
        JButton btnIgual = new JButton("=");
        panelInicio.add(btnIgual);
        btnIgual.setBounds(25, 385, 220, 60);
        ActionListener resultado = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int resultado = 0;
                if (simbolo == '+') {
                    resultado = valor1 + Integer.parseInt(txtValor1.getText());  
                }else if(simbolo == '-'){
                    resultado = valor1 - Integer.parseInt(txtValor1.getText());   
                }
                txtValor1.setText(String.valueOf(resultado));
                valor1 = 0;
                
            }
        };
        btnIgual.addActionListener(resultado);
        
        
        
        
         JButton btnBorrar = new JButton("CE");
        panelInicio.add(btnBorrar);
        btnBorrar.setBounds(100, 320, 70, 60);
        
        ActionListener borrarUno = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                                
                String union = "";
                for (int i = 0; i < txtValor1.getText().length() - 1; i++) {
                    union = union + txtValor1.getText().charAt(i);
                }
                
                txtValor1.setText(union);
                
            }
        };
        
        btnBorrar.addActionListener(borrarUno);
        
        

        
        
         JButton btnRaiz = new JButton("√");
        panelInicio.add(btnRaiz);
        btnRaiz.setBounds(250, 385, 70, 60);
        ActionListener resRaiz = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtValor1.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Debe ingresar un valor");
                }else{
                    if(Double.parseDouble(txtValor1.getText()) >= 0){
                        double total = Math.sqrt(Double.parseDouble(txtValor1.getText()));
                        txtValor1.setText(String.valueOf(total));
                        valor1 = 0;
                    }else{
                        JOptionPane.showMessageDialog(null, "Sus datos son matematicamente erroneos");
                    }
                }
            }
        };
        btnRaiz.addActionListener(resRaiz);
        
        
        
      //  } catch(Exception e) {

//System.out.println("ERROR: el valor de tipo String contiene caracteres no numéricos");


        
        
        
        ////
        
        
        
         JButton btnBorrart = new JButton("C");
        panelInicio.add(btnBorrart);
        btnBorrart.setBounds(175, 320, 70, 60);
        
        ActionListener borrartodo = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                                
                String union = "";
                for (int i = 0; i < txtValor1.getText().length() - 10000; i++) {
                    union = union + txtValor1.getText().charAt(i);
                }
                
                txtValor1.setText(union);
                
            }
        };
        
        btnBorrart.addActionListener(borrartodo);
        
        

       
        
        
         
        JButton btnMul = new JButton("x");
        panelInicio.add(btnMul);
        btnMul.setBounds(250, 251, 70, 60);
        ActionListener Mult = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtValor1.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Debe ingresar un valor");
                }else{
                    if(valor1 == 0){
                        valor1 = Integer.parseInt(txtValor1.getText());
                    }else{
                        valor1 *= Integer.parseInt(txtValor1.getText());
                    }
                    
                    txtValor1.setText("");
                }
            }
        };
    
        btnMul.addActionListener(Mult);
      
        
        
        
        
        
        
        
        
        JButton btnDiv = new JButton("÷");
        btnDiv.setBounds(250, 320, 70, 60);
        panelInicio.add(btnDiv);
        btnDiv.repaint();
        ActionListener Div = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtValor1.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Debe ingresar un valor");
                } else {
                    if (valor1 == 0) {
                        valor1 = Integer.parseInt(txtValor1.getText());
                    } else {
                        valor1 /= Integer.parseInt(txtValor1.getText());
                    }
                    
                    txtValor1.setText("");
                }
            }
        };
        btnDiv.addActionListener(Div);
        
        
     }
     
}
