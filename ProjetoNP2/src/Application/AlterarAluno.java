package Application;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.border.TitledBorder;

public class AlterarAluno extends JFrame {

    public AlterarAluno() // Contrutor
    {
        initComponents();
    }
    
    private void initComponents() // Componentes do Contrutor
    {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int heigth =  (int) (screenSize.getHeight() * 0.75);
        int width =  (int) (screenSize.getWidth() * 0.75);

        // Componentes
        
        dtFormat = new SimpleDateFormat("dd/MM/yyyy");
        
        titulo = new JLabel("CONSULTA DE ALUNO");
         // matricula Auto generada ?

        
        codCurso = new JTextField();
        nomeAluno = new JTextField();
        dtNascTxt = new JFormattedTextField();

        nota1.setBorder(BorderFactory.createTitledBorder(null,"Faltas",TitledBorder.LEFT,TitledBorder.TOP,texto,comment));
        btnCadastrar = new JButton("Cadastrar");
        btnLimpar = new JButton("Limpar");
        sair = new JButton("Sair");
        cursosCB = new JList<>();


        
        // Tema 
        
        
        
        bg1 =  new Color(189,147,249);
        bg2 = new Color(98 ,114,164);
        fg1 =  new Color(248,248,242);
        comment = new Color(68, 71, 90);
        
        texto = new Font("Hack",Font.PLAIN, 20);
        subTitle = new Font("Hack",Font.PLAIN,15);
        title = new Font("Hack",Font.BOLD, 32);
        
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        // Caracteristicas 
        
        setTitle("Sistema de Controle Academico");
        setSize(width, heigth);
        setLocation(240, 135);
        getContentPane().setBackground(new Color(40,42,54));
        

        // Adicionando a janela
        
        getContentPane().setLayout(null);
        getContentPane().add(btnCadastrar);
        getContentPane().add(btnLimpar);
        getContentPane().add(titulo);

        getContentPane().add(codCurso);
        getContentPane().add(nomeAluno);
        getContentPane().add(dtNascTxt);
        getContentPane().add(btnLimpar);
        getContentPane().add(btnCadastrar);
        getContentPane().add(sair);
        getContentPane().add(cursosCB);

        
        /// Titulo
        
        titulo.setBounds(width / 3, 20, 480, 50);
        titulo.setFont(title);
        titulo.setForeground(fg1);
        
        /// 
        
        nomeAluno.setBounds(50,140,500,50);
        nomeAluno.setFont(texto);
        nomeAluno.setForeground(comment);
        nomeAluno.setBorder(BorderFactory.createTitledBorder(null,"Nome do Aluno",TitledBorder.LEFT,TitledBorder.TOP,subTitle,comment));

        dtNascTxt.setBounds(50,210,500,50);
        dtNascTxt.setFont(texto);
        dtNascTxt.setForeground(comment);
        dtNascTxt.setBorder(BorderFactory.createTitledBorder(null,"Data de Nascimento",TitledBorder.LEFT,TitledBorder.TOP,subTitle,comment));
        
        

        codCurso.setBounds(50,280,500,50);
        codCurso.setFont(texto);
        codCurso.setForeground(comment);
        codCurso.setBorder(BorderFactory.createTitledBorder(null,"Codigo do Curso",TitledBorder.LEFT,TitledBorder.TOP,subTitle,comment));

                      

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
          
        cursosCB.setBounds(width - width / 3 - 50, 150,width / 3, heigth - 400 );
        cursosCB.setBorder(BorderFactory.createTitledBorder(null,"Nome do Curso",TitledBorder.CENTER,TitledBorder.TOP,texto,comment));
        cursosCB.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "100 - Administraçao de Empresas", "110 - Bio Medicina", "111 - Ciencias Biologicas", "115 - Ciencias da Computacao", "120 - Direito", "125 - Educacao Fisica", "130 - Farmacologia", "135 - Rede de Computadores" , "140 - Sistema de Informaçoes" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        cursosCB.setFont(texto);

     
        // Eventos // 
        int n = 0;
        dtNascTxt.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
//            global int count = 2;
            char c = e.getKeyChar();
            if (!((c >= '0') && (c <= '9') ||
             (c == KeyEvent.VK_BACK_SPACE) ||
             (c == KeyEvent.VK_DELETE) || (c == KeyEvent.VK_SLASH)))        
          {
            e.consume();
      }
//            count+=1;
//                System.out.println(count);
            
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
            String data = dtNascTxt.getText();
            System.out.println(data);
        }
    
    private void btnLimparActionPerformed(ActionEvent evt)
        {
            codCurso.setText("");
            nomeAluno.setText("");
            dtNascTxt.setText("");
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
    private JTextField codCurso;
    private JTextField nomeAluno;
    private JFormattedTextField dtNascTxt;
    private JTextField faltas;
    private JTextField nota1;
    private JTextField nota2;
    private JLabel media;
    private JButton btnCadastrar;
    private JButton btnLimpar;
    private JButton sair;
    private JList cursosCB;
    private DateFormat dtFormat;
    
    private Color bg2;
    private Color bg1;
    private Color fg1;
    private Color comment;
    private Font subTitle;
    private Font texto;
    private Font title;
    
}

