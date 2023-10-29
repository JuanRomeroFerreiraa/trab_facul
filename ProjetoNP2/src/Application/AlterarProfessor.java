package Application;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

import javax.swing.border.TitledBorder;


public class AlterarProfessor extends JFrame {

    public AlterarProfessor() // Contrutor
    {
        initComponents();
    }
    
    private void initComponents() // Componentes do Contrutor
    {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int heigth =  (int) (screenSize.getHeight() * 0.75);
        int width =  (int) (screenSize.getWidth() * 0.75);

        // -- Componentes do Contructor -- //
        
        //Data
        
        //Labels
        titulo = new JLabel("MANUTENCAO DE PROFESSOR");
        especLabel = new JLabel("Especificacao Professor");
        tituloLabel = new JLabel("Titulo Professor");
        
        //Button
        btnCadastrar = new JButton("Cadastrar");
        btnLimpar = new JButton("Limpar");
        sair = new JButton("Sair");
        
        //Check Box
        especCB = new ButtonGroup();
        tituloCB = new ButtonGroup();
     
        especItem1 = new JCheckBox("Direito");
        especItem2 = new JCheckBox("Informatica");
        especItem3 = new JCheckBox("Matematica");
        especItem4 = new JCheckBox("Medicina");
        especItem5 = new JCheckBox("Neurociencia");
        especItem6 = new JCheckBox("Fisica");
        
        tituloItem1 = new JCheckBox("Especialista");
        tituloItem2 = new JCheckBox("Lato Sensu");
        tituloItem3 = new JCheckBox("Mestrado");
        tituloItem4 = new JCheckBox("Doutorado");
        
        
        especCB.add(especItem1);
        especCB.add(especItem2);
        especCB.add(especItem3);
        especCB.add(especItem4);
        especCB.add(especItem5);
        especCB.add(especItem6);
        
        tituloCB.add(tituloItem1);
        tituloCB.add(tituloItem2);
        tituloCB.add(tituloItem3);
        tituloCB.add(tituloItem4);
        
        //TextFields 
        dtNascTxt = new JFormattedTextField();
        identProf = new JTextField();
        nomeProf = new JTextField();
        endRua = new JTextField();
        endNum = new JTextField();
        endBairro = new JTextField();
        endCid = new JTextField();
        endEstd = new JTextField();
        endTel = new JTextField();
        endCel = new JTextField();
     
        // Tema
  
        bg1 =  new Color(189,147,249);
        bg2 = new Color(98 ,114,164);
        fg1 =  new Color(248,248,242);
        comment = new Color(68, 71, 90);
        
        // Fontes
        texto = new Font("Hack",Font.PLAIN, 20);
        subTexto = new Font("Hack",Font.BOLD,23);
        title = new Font("Hack",Font.BOLD, 32);
        subTitle = new Font("Hack",Font.PLAIN,15);

           
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        // Caracteristicas  do Frame
        
        setTitle("Sistema de Controle Academico");
        setSize(width, heigth);
        setLocation(240, 135);
        getContentPane().setBackground(new Color(40,42,54));
        

        // Adicionando a janela
        
        getContentPane().setLayout(null);
        getContentPane().add(btnCadastrar);
        getContentPane().add(btnLimpar);
        getContentPane().add(titulo);
        getContentPane().add(identProf);
        getContentPane().add(nomeProf);
        getContentPane().add(dtNascTxt);
        getContentPane().add(btnLimpar);
        getContentPane().add(btnCadastrar);
        getContentPane().add(sair);
        getContentPane().add(endRua);
        getContentPane().add(endNum);
        getContentPane().add(endCid);
        getContentPane().add(endBairro);
        getContentPane().add(endEstd);
        getContentPane().add(endTel);
        getContentPane().add(endCel);
        getContentPane().add(especLabel);
        getContentPane().add(tituloLabel);
        getContentPane().add(especItem1);
        getContentPane().add(especItem2);
        getContentPane().add(especItem3);
        getContentPane().add(especItem4);
        getContentPane().add(especItem5);
        getContentPane().add(especItem6);
        getContentPane().add(tituloItem1);
        getContentPane().add(tituloItem2);
        getContentPane().add(tituloItem3);
        getContentPane().add(tituloItem4);

        
        /// Labels
        
        titulo.setBounds(width / 3, 20, 550, 50);
        titulo.setFont(title);
        titulo.setForeground(fg1);
        
        especLabel.setBounds(width / 2 + 200, 120, 500, 50);
        especLabel.setFont(subTexto);
        especLabel.setForeground(fg1);
        
        tituloLabel.setBounds(width / 2 + 200, 350, 500, 50);
        tituloLabel.setFont(subTexto);
        tituloLabel.setForeground(fg1);
        
        // CheckBoxes 
        
        especItem1.setBounds(width / 2 + 200,180,300,20);
        especItem1.setFont(texto);
        especItem1.setForeground(comment);
        
        especItem2.setBounds(width / 2 + 200,200,300,20);
        especItem2.setFont(texto);
        especItem2.setForeground(comment);
        
        especItem3.setBounds(width / 2 + 200,220,300,20);
        especItem3.setFont(texto);
        especItem3.setForeground(comment);
        
        especItem4.setBounds(width / 2 + 200,240,300,20);
        especItem4.setFont(texto);
        especItem4.setForeground(comment);
        
        especItem5.setBounds(width / 2 + 200,260,300,20);
        especItem5.setFont(texto);
        especItem5.setForeground(comment);
        
        especItem6.setBounds(width / 2 + 200,280,300,20);
        especItem6.setFont(texto);
        especItem6.setForeground(comment);
        
        tituloItem1.setBounds(width / 2 + 200,410,300,20);
        tituloItem1.setFont(texto);
        tituloItem1.setForeground(comment);
        
        tituloItem2.setBounds(width / 2 + 200,430,300,20);
        tituloItem2.setFont(texto);
        tituloItem2.setForeground(comment);
        
        tituloItem3.setBounds(width / 2 + 200,450,300,20);
        tituloItem3.setFont(texto);
        tituloItem3.setForeground(comment);
        
        tituloItem4.setBounds(width / 2 + 200,470,300,20);
        tituloItem4.setFont(texto);
        tituloItem4.setForeground(comment);
        
        /// Text Fields
        
        nomeProf.setBounds(50,140,620,50);
        nomeProf.setFont(texto);
        nomeProf.setForeground(comment);
        nomeProf.setBorder(BorderFactory.createTitledBorder(null,"Nome do Professor",TitledBorder.LEFT,TitledBorder.TOP,subTitle,comment));

        dtNascTxt.setBounds(50,210,620,50);
        dtNascTxt.setFont(texto);
        dtNascTxt.setForeground(comment);
        dtNascTxt.setBorder(BorderFactory.createTitledBorder(null,"Data de Nascimento",TitledBorder.LEFT,TitledBorder.TOP,subTitle,comment));
        
        identProf.setBounds(50,280,620,50);
        identProf.setFont(texto);
        identProf.setForeground(comment);
        identProf.setBorder(BorderFactory.createTitledBorder(null,"Identidade do Professor",TitledBorder.LEFT,TitledBorder.TOP,subTitle,comment));

        endRua.setBounds(50,350,500,50);
        endRua.setFont(texto);
        endRua.setForeground(comment);
        endRua.setBorder(BorderFactory.createTitledBorder(null,"Endereço",TitledBorder.LEFT,TitledBorder.TOP,subTitle,comment));
        
        endNum.setBounds(560,350,110,50);
        endNum.setFont(texto);
        endNum.setForeground(comment);
        endNum.setBorder(BorderFactory.createTitledBorder(null,"Numero",TitledBorder.LEFT,TitledBorder.TOP,subTitle,comment));
        
        endBairro.setBounds(50,420,200,50);
        endBairro.setFont(texto);
        endBairro.setForeground(comment);
        endBairro.setBorder(BorderFactory.createTitledBorder(null,"Bairro",TitledBorder.LEFT,TitledBorder.TOP,subTitle,comment));
        
        endCid.setBounds(260,420,200,50);
        endCid.setFont(texto);
        endCid.setForeground(comment);
        endCid.setBorder(BorderFactory.createTitledBorder(null,"Cidade",TitledBorder.LEFT,TitledBorder.TOP,subTitle,comment));
        
        endEstd.setBounds(470,420,200,50);
        endEstd.setFont(texto);
        endEstd.setForeground(comment);
        endEstd.setBorder(BorderFactory.createTitledBorder(null,"Estado",TitledBorder.LEFT,TitledBorder.TOP,subTitle,comment));
        
        endTel.setBounds(50,490,300,50);
        endTel.setFont(texto);
        endTel.setForeground(comment);
        endTel.setBorder(BorderFactory.createTitledBorder(null,"Telefone Fixo",TitledBorder.LEFT,TitledBorder.TOP,subTitle,comment));
        
        endCel.setBounds(360,490,310,50);
        endCel.setFont(texto);
        endCel.setForeground(comment);
        endCel.setBorder(BorderFactory.createTitledBorder(null,"Celular",TitledBorder.LEFT,TitledBorder.TOP,subTitle,comment));
        /// Botoes 

        btnCadastrar.setBounds(50,heigth - 100 - 50,360,100);
        btnCadastrar.setFont(title);
        btnCadastrar.setBackground(bg1);
        btnCadastrar.setForeground(fg1);
        
        btnLimpar.setBounds(540, heigth - 100 - 50, 360, 100);
        btnLimpar.setFont(title);
        btnLimpar.setBackground(bg1);
        btnLimpar.setForeground(fg1);
        
        sair.setBounds(width - 360 - 50,heigth - 100 - 50,360,100);
        sair.setFont(title);
        sair.setBackground(bg1);
        sair.setForeground(fg1);
     
        // Eventos // 
        
        
        btnCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        btnLimpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        
        sair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                sairActionPerformed(evt);
           }
        });
        
        
        // Restricao de Numeros
        restrictInputToNumbersAndSlash(dtNascTxt);
        restrictInputToNumbers(endNum);
        restrictInputToNumbers(endTel);
        restrictInputToNumbers(endCel);
        restrictInputToLetters(nomeProf);

    }
    
    // 
    
    // Eventos - Açoes

    private void btnCadastrarActionPerformed(ActionEvent evt)
        {
            System.out.println("Incluir");
            String data = dtNascTxt.getText();
            System.out.println(data);
        }
    
    private void btnLimparActionPerformed(ActionEvent evt)
        {
            identProf.setText("");
            nomeProf.setText("");
            dtNascTxt.setText("");
            endRua.setText("");
            endNum.setText("");
            endBairro.setText("");
            endCid.setText("");
            endEstd.setText("");
            endTel.setText("");
            endCel.setText("");
        }
    
    private void sairActionPerformed(ActionEvent evt)
    {
        new Principal().setVisible(true);
        dispose();
    }
    
    // Funcoes uteis
    
    public static void restrictInputToNumbersAndSlash(JTextField textField) {
    textField.addKeyListener(new KeyAdapter() {
        @Override
        public void keyTyped(KeyEvent e) {
            char c = e.getKeyChar();
            if (!((c >= '0' && c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || (c == KeyEvent.VK_SLASH))) {
                e.consume();
            }
        }
    });
}
    
    public static void restrictInputToNumbers(JTextField textField) {
    textField.addKeyListener(new KeyAdapter() {
        @Override
        public void keyTyped(KeyEvent e) {
            char c = e.getKeyChar();
            Character.toLowerCase(c);
            if (!((c >= '0' && c <= '9') ||(c == KeyEvent.VK_DELETE))) {
                e.consume();
            }
        }
    });
}
    
    public static void restrictInputToLetters(JTextField textField) {
    textField.addKeyListener(new KeyAdapter() {
        @Override
        public void keyTyped(KeyEvent e) {
            char c = e.getKeyChar();
            
            if (!((c >= 'A' && c <= 'z') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || (c == KeyEvent.VK_SLASH) || (c == KeyEvent.VK_SPACE))) {
                e.consume();
            }
        }
    });
}
    
    // Main 
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    
    

    private JLabel titulo;
    private JLabel especLabel;
    private JLabel tituloLabel;
    private JTextField identProf;
    private JTextField nomeProf;
    private JFormattedTextField dtNascTxt;
    private JTextField endRua;
    private JTextField endNum;
    private JTextField endBairro;
    private JTextField endCid;
    private JTextField endEstd;
    private JTextField endTel;
    private JTextField endCel;
    private JButton btnCadastrar;
    private JButton btnLimpar;
    private JButton sair;
    private JCheckBox especProf;
    
    private JCheckBox especItem1;private JCheckBox especItem2;
    private JCheckBox especItem3;private JCheckBox especItem4;
    private JCheckBox especItem5;private JCheckBox especItem6;
    
    private JCheckBox tituloItem1;private JCheckBox tituloItem2;
    private JCheckBox tituloItem3;private JCheckBox tituloItem4;
    
    private JCheckBox tituloProf;
    private ButtonGroup especCB;
    private ButtonGroup tituloCB;
    
    private Color bg2;
    private Color bg1;
    private Color fg1;
    private Color comment;
    private Font subTexto;
    private Font subTitle;
    private Font texto;
    private Font title;
    
}

