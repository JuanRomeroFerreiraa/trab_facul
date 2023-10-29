package Application;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.lang.Object;
import Ferramentas.Darcula;
import javax.swing.border.TitledBorder;

public class AlterarCurso extends JFrame {

    public AlterarCurso() // Contrutor
    {
        initComponents();
    }
    
    private void initComponents() // Componentes do Contrutor
    {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int heigth =  (int) (screenSize.getHeight() * 0.75);
        int width =  (int) (screenSize.getWidth() * 0.75);

        // Componentes
        
        titulo = new JLabel("CADASTRAMENTO DOS CURSOS");
        cursosTxt = new JLabel("Nome do Curso");
        tipoCurso = new JLabel("Tipo de Curso");
        codCursoTxt = new JTextField();
        cargaHTxt = new JTextField();
        codInstTxt = new JTextField();
        btnCadastrar = new JButton("Cadastrar");
        btnLimpar = new JButton("Limpar");
        sair = new JButton("Sair");
        cursosCB = new JList<>();
        cursoRadioB1 = new JRadioButton("Bacharel");
        cursoRadioB2 = new JRadioButton("Gestao");
        cursoRadioB3 = new JRadioButton("Outros");
        grupoBotoes = new ButtonGroup();
        
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
        getContentPane().add(codCursoTxt);
        getContentPane().add(cargaHTxt);
        getContentPane().add(codInstTxt);
        getContentPane().add(btnLimpar);
        getContentPane().add(btnCadastrar);
        getContentPane().add(sair);
        getContentPane().add(cursosCB);
        getContentPane().add(cursosTxt);
        getContentPane().add(tipoCurso);
        getContentPane().add(cursoRadioB1);
        getContentPane().add(cursoRadioB2);
        getContentPane().add(cursoRadioB3);
        
        /// Titulo
        
        titulo.setBounds(width / 3, 20, 480, 50);
        titulo.setFont(title);
        titulo.setForeground(fg1);
        
        /// 
        System.out.println("Altura" + width / 3);

        codCursoTxt.setBounds(50,150,500,50);
        codCursoTxt.setFont(texto);
        codCursoTxt.setForeground(comment);
        codCursoTxt.setBorder(BorderFactory.createTitledBorder(null,"Codigo do Curso",TitledBorder.LEFT,TitledBorder.TOP,subTitle,comment));


        cargaHTxt.setBounds(50,210,500,50);
        cargaHTxt.setFont(texto);
        cargaHTxt.setForeground(comment);
        cargaHTxt.setBorder(BorderFactory.createTitledBorder(null,"Carga Horaria",TitledBorder.LEFT,TitledBorder.TOP,subTitle,comment));

        codInstTxt.setBounds(50,270,500,50);
        codInstTxt.setFont(texto);
        codInstTxt.setForeground(comment);
        codInstTxt.setBorder(BorderFactory.createTitledBorder(null,"Codigo do Instituto",TitledBorder.LEFT,TitledBorder.TOP,subTitle,comment));

        
        // Tipo de Curso (Botao Radio)
        
        grupoBotoes.add(cursoRadioB1);
        grupoBotoes.add(cursoRadioB2);
        grupoBotoes.add(cursoRadioB3);
        
        
//                        
        tipoCurso.setFont(texto);
        tipoCurso.setForeground(fg1);
        tipoCurso.setBounds(50, 350, width / 4, heigth /10);
        
        cursoRadioB1.setBounds(50, 420, width / 4, 50);
        cursoRadioB1.setFont(texto);
        cursoRadioB1.setBackground(bg2);
        cursoRadioB1.setForeground(fg1);
        
        cursoRadioB2.setBounds(50, 470, width / 4, 50);
        cursoRadioB2.setFont(texto);
        cursoRadioB2.setForeground(fg1);
        cursoRadioB2.setBackground(bg2);
        
        cursoRadioB3.setBounds(50, 520, width / 4, 50);
        cursoRadioB3.setFont(texto);
        cursoRadioB3.setForeground(fg1);
        cursoRadioB3.setBackground(bg2);
               
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
            String[] strings = { "Administraçao de Empresas", "Bio Medicina", "Ciencias Biologicas", "Ciencias da Computacao", "Direito", "Educacao Fisica", "Farmacologia", "Rede de Computadores" , "Sistema de Informaçoes" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        cursosCB.setFont(texto);

     
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
    }
    
    
    // Eventos - Açoes
    
    private void btnCadastrarActionPerformed(ActionEvent evt)
        {
            System.out.println("Incluir");
        }
    
    private void btnLimparActionPerformed(ActionEvent evt)
        {
            codCursoTxt.setText("");
            codInstTxt.setText("");
            cargaHTxt.setText("");
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
    private JLabel tipoCurso;
    private JLabel cursosTxt;
    
    private JTextField codCursoTxt;
    private JTextField cargaHTxt;
    private JTextField codInstTxt;
    
    private JButton btnCadastrar;
    private JButton btnLimpar;
    private JButton sair;
    
    private JList cursosCB;
    private JRadioButton cursoRadioB1;
    private JRadioButton cursoRadioB2;
    private JRadioButton cursoRadioB3;
    private ButtonGroup grupoBotoes;
    
    private Color bg2;
    private Color bg1;
    private Color fg1;
    private Color comment;
    
    private Font texto;
    private Font title;
    private Font subTitle;
    
}