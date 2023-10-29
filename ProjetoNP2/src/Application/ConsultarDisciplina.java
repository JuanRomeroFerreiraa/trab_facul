package Application;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class ConsultarDisciplina extends JFrame {

    public ConsultarDisciplina() // Contrutor
    {
        initComponents();
    }
    
    private void initComponents() // Componentes do Contrutor
    {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int heigth =  (int) (screenSize.getHeight() * 0.75);
        int width =  (int) (screenSize.getWidth() * 0.75);

        // Componentes
        
        
        titulo = new JLabel("CADASTRAMENTO DE DISCIPLINA");
         // matricula Auto generada ?
         
        CBSemana = new JLabel("Aulas por Semana");
        
        codDisc = new JTextField();
        nomeDisc = new JTextField();
        cargaHoraria = new JTextField();
        btnCadastrar = new JButton("Cadastrar");
        btnLimpar = new JButton("Limpar");
        sair = new JButton("Sair");
        
        grupoBotoes = new ButtonGroup();
        cursoRadioS1 = new JRadioButton("1");
        cursoRadioS2 = new JRadioButton("2");
        cursoRadioS3 = new JRadioButton("3");
        cursoRadioS4 = new JRadioButton("4");
        cursoRadioS5 = new JRadioButton("5");
        cursoRadioS6 = new JRadioButton("6");


        
        // Tema 
        
        
        
        bg1 =  new Color(189,147,249);
        bg2 = new Color(98 ,114,164);
        fg1 =  new Color(248,248,242);
        comment = new Color(68, 71, 90);
        
        texto = new Font("Hack",Font.PLAIN, 20);
        title = new Font("Hack",Font.BOLD, 32);
        subTitle = new Font("Hack",Font.PLAIN,15);

        
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        // Caracteristicas 
        
        setTitle("Sistema de Controle Academico");
        setSize(width, heigth);
        setLocation(240, 135);
        getContentPane().setBackground(new Color(40,42,54));
        

        // Adicionando a janela
        
        grupoBotoes.add(cursoRadioS1);
        grupoBotoes.add(cursoRadioS2);
        grupoBotoes.add(cursoRadioS3);
        grupoBotoes.add(cursoRadioS4);
        grupoBotoes.add(cursoRadioS5);
        grupoBotoes.add(cursoRadioS6);
        
        
        getContentPane().setLayout(null);
        getContentPane().add(btnCadastrar);
        getContentPane().add(btnLimpar);
        getContentPane().add(titulo);

        getContentPane().add(codDisc);
        getContentPane().add(nomeDisc);
        getContentPane().add(cargaHoraria);
        getContentPane().add(btnLimpar);
        getContentPane().add(btnCadastrar);
        getContentPane().add(sair);
        
        getContentPane().add(CBSemana);
        getContentPane().add(cursoRadioS1);
        getContentPane().add(cursoRadioS2);
        getContentPane().add(cursoRadioS3);
        getContentPane().add(cursoRadioS4);
        getContentPane().add(cursoRadioS5);
        getContentPane().add(cursoRadioS6);

        
        /// Titulo
        
        titulo.setBounds(width / 3, 20, 550, 50);
        titulo.setFont(title);
        titulo.setForeground(fg1);
        
        
        // Radio Button
        CBSemana.setBounds(1440-50-500,125,500,50);
        CBSemana.setFont(title);
        CBSemana.setForeground(fg1);
        
        
        cursoRadioS1.setBounds(1440-50-500, 180, 300, 30);
        cursoRadioS1.setFont(texto);
        cursoRadioS1.setBackground(bg2);
        cursoRadioS2.setBounds(1440-50-500, 210, 300, 30);
        cursoRadioS2.setFont(texto);
        cursoRadioS2.setBackground(bg2);
        cursoRadioS3.setBounds(1440-50-500, 240, 300, 30);
        cursoRadioS3.setFont(texto);
        cursoRadioS3.setBackground(bg2);
        cursoRadioS4.setBounds(1440-50-500, 270, 300, 30);
        cursoRadioS4.setFont(texto);
        cursoRadioS4.setBackground(bg2);
        cursoRadioS5.setBounds(1440-50-500, 300, 300, 30);
        cursoRadioS5.setFont(texto);
        cursoRadioS5.setBackground(bg2);
        cursoRadioS6.setBounds(1440-50-500, 330, 300, 30);
        cursoRadioS6.setFont(texto);
        cursoRadioS6.setBackground(bg2);
        
        /// 
        
        nomeDisc.setBounds(50,140,500,50);
        nomeDisc.setFont(texto);
        nomeDisc.setForeground(comment);
        nomeDisc.setBorder(BorderFactory.createTitledBorder(null,"Nome da Disciplina",TitledBorder.LEFT,TitledBorder.TOP,subTitle,comment));

        

        cargaHoraria.setBounds(50,210,500,50);
        cargaHoraria.setFont(texto);
        cargaHoraria.setForeground(comment);
        cargaHoraria.setBorder(BorderFactory.createTitledBorder(null,"Carga Horaria",TitledBorder.LEFT,TitledBorder.TOP,subTitle,comment));


        codDisc.setBounds(50,280,500,50);
        codDisc.setFont(texto);
        codDisc.setForeground(comment);
        codDisc.setBorder(BorderFactory.createTitledBorder(null,"Codigo da Disciplina",TitledBorder.LEFT,TitledBorder.TOP,subTitle,comment));

                      

        /// Botoes 


        System.out.println(heigth);
        System.out.println(width);
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
        
        
        // 
          

     
        // Eventos // 
        
        cargaHoraria.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
            char c = e.getKeyChar();
            if (!((c >= '0') && (c <= '9') ||
             (c == KeyEvent.VK_BACK_SPACE) ||
             (c == KeyEvent.VK_DELETE) || (c == KeyEvent.VK_SLASH)))        
          {
            JOptionPane.showMessageDialog(null, "Atençao!\nApenas Numeros");
            e.consume();
      }
    }
  });
        
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
    }
    
    
    // Eventos - Açoes
    
    private void btnCadastrarActionPerformed(ActionEvent evt)
        {
            System.out.println("Incluir");
        }
    
    private void btnLimparActionPerformed(ActionEvent evt)
        {
            codDisc.setText("");
            cargaHoraria.setText("");
            nomeDisc.setText("");
        }
    
    private void sairActionPerformed(ActionEvent evt)
    {
        new Principal().setVisible(true);
        dispose();
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
    private JLabel CBSemana;
    private JTextField codDisc;
    private JTextField nomeDisc;
    private JTextField cargaHoraria;
    private JButton btnCadastrar;
    private JButton btnLimpar;
    private JButton sair;
    private JRadioButton cursoRadioS1;
    private JRadioButton cursoRadioS2;
    private JRadioButton cursoRadioS3;
    private JRadioButton cursoRadioS4;
    private JRadioButton cursoRadioS5;
    private JRadioButton cursoRadioS6;
    private ButtonGroup grupoBotoes;
    
    private Color bg2;
    private Color bg1;
    private Color fg1;
    private Color comment;
    private Font texto;
    private Font title;
    private Font subTitle;
    
}
