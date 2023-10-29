package Application;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.lang.Object;

public class Principal extends JFrame {

    public Principal() // Contrutor
    {
        initComponents();
    }
    
    private void initComponents() // Componentes do Contrutor
    {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int heigth =  (int) (screenSize.getHeight() * 0.75); // 1440
        int width =  (int) (screenSize.getWidth() * 0.75); // 810

        // Barra de Menu
        menBar = new JMenuBar();
        font = new Font("Hack",Font.PLAIN,16);
        icon = new ImageIcon("src/Application/Theme/IconeYorha.png");
        logo = new JLabel();
        logo.setBackground(Color.white);

        // Itens na barra de menu
        menCad = new JMenu("Cadastrar");
        menPes = new JMenu("Mostrar");
        menManu = new JMenu("Manutencao");
        menSair = new JMenu("Sair");

        // Itens no Menu
        cadCurso = new JMenuItem();
        cadDisc = new JMenuItem();
        cadAluno = new JMenuItem();
        cadProf = new JMenuItem();
        pesCurso = new JMenuItem("Curso");
        pesDisc = new JMenuItem("Disciplina");
        pesAluno = new JMenuItem("Aluno");
        pesProf = new JMenuItem("Professor");
        
        itemSair = new JMenuItem("Sair");
        
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
        setTitle("Yorha: for the glory of Mankind");
        setSize(width, heigth);
        setLocation(240, 135);
        getContentPane().setBackground(new Color(40,42,54));
        
        getContentPane().setLayout(null);
        getContentPane().add(logo);
        
        // Caracteristicas dos Itens Menu
        
        logo.setBounds(300, 300 ,480, 360);
        logo.setIcon(icon);
        
        
        menCad.setFont(new Font("Hack", Font.BOLD, 20));
        
        cadCurso.setText("Curso");
        cadCurso.setFont(font);
        cadDisc.setText("Disciplina");
        cadDisc.setFont(font);
        cadAluno.setText("Aluno");
        cadAluno.setFont(font);
        cadProf.setText("Professor");
        cadProf.setFont(font);
        
        // Add no menu Cadastrar
        
        menCad.add(cadCurso);
        menCad.add(cadDisc);
        menCad.add(cadAluno);
        menCad.add(cadProf);
        
        // Caracteristicas dos itens Mostrar
        
        menPes.setText("Mostrar");
        menPes.setFont(new Font("Hack", Font.BOLD, 20));
        
        pesCurso.setFont(font);
        pesDisc.setFont(font);
        pesAluno.setFont(font);
        pesProf.setFont(font);
   
        
        // Add no Menu Pes
        
        menPes.add(pesCurso);
        menPes.add(pesDisc);
        menPes.add(pesAluno);
        menPes.add(pesProf);
        
        // Add no Menu Manutencao
        
        menManu.add(altCurso = new JMenuItem("Curso"));
        menManu.add(altAluno = new JMenuItem("Aluno"));
        menManu.add(altProf = new JMenuItem("Professor"));
        menManu.add(altDisc = new JMenuItem("Disciplina"));
        
        altCurso.setFont(font);
        altAluno.setFont(font);
        altProf.setFont(font);
        altDisc.setFont(font);
        
        
        
        
        
        
        
        
        //
        
        
        menSair.setFont(new Font("Hack", Font.BOLD, 20));
        menSair.setForeground(Color.red);
        
        itemSair.setFont(font);
        itemSair.setForeground(Color.red);
        menSair.add(itemSair);
        
        menManu.setFont(new Font("Hack", Font.BOLD,20));
        
        // Adiciona no Menu Bar

        menBar.add(menCad);
        menBar.add(menPes);
        menBar.add(menManu);
        menBar.add(menSair);
        
        setJMenuBar(menBar);
        
        // Eventos - Listener
        
        cadCurso.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cadCurso(evt);
            }
            
        });
        cadProf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cadProf(evt);
            }
        });
        
        cadAluno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cadAluno(evt);
            }
        });
        
        cadDisc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cadDisc(evt);
            }
        });
        
        pesAluno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                pesAluno(evt);
            }
        });
        
        pesProf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                pesProf(evt);
            }
        });
        
        pesDisc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                pesDisc(evt);
            }
        });
        
        pesCurso.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                pesCurso(evt);
            }
        });
        
        altAluno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                altAluno(evt);
            }
        });
        
        altProf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                altProf(evt);
            }
        });
        
        altDisc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                altDisc(evt);
            }
        });
        
        altCurso.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                altCurso(evt);
            }
        });
        
        
        
        itemSair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                itemSairActionPerformed(evt);
            }
        });
        

        
       
    }
    

    // Eventos - Açoes
    
    private void cadAluno(ActionEvent evt)
        {
            new CadastrarAluno().setVisible(true);
            dispose();
        }
    
    private void cadCurso(ActionEvent evt)
        {
            new CadastrarCurso().setVisible(true);
            dispose();
        }
    
    private void cadProf(ActionEvent evt)
        {
            new CadastrarProfessor().setVisible(true);
            dispose();
        }    
    private void cadDisc(ActionEvent evt)
        {
            new CadastrarDisciplina().setVisible(true);
            dispose();
        }
    
    private void pesAluno(ActionEvent evt)
        {
            new ConsultarAluno().setVisible(true);
            dispose();
        }
    
    private void pesProf(ActionEvent evt)
        {
            new ConsultarProfessor().setVisible(true);
            dispose();
        }
    
    private void pesDisc(ActionEvent evt)
        {
            new ConsultarDisciplina().setVisible(true);
            dispose();
        }
    
    private void pesCurso(ActionEvent evt)
        {
            new ConsultarCurso().setVisible(true);
            dispose();
        }
    
    private void altAluno(ActionEvent evt)
        {
            new AlterarAluno().setVisible(true);
            dispose();
        }
    
    private void altProf(ActionEvent evt)
        {
            new AlterarProfessor().setVisible(true);
            dispose();
        }
    
    private void altCurso(ActionEvent evt)
        {
            new AlterarCurso().setVisible(true);
            dispose();
        }
    
    private void altDisc(ActionEvent evt)
        {
            new AlterarDisciplina().setVisible(true);
            dispose();
        }
        
    private void itemSairActionPerformed(ActionEvent evt)
        {
            System.exit(0);
        }
    
    
    // Main
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
//                new CadastrarCurso().setVisible(true);
                new CadastrarDisciplina().setVisible(true);
//                  new LoginScreen().setVisible(true);
                }
        });
    }
    
    
    // Private Itens (Abstraçao)
    
    private ImageIcon icon;
    private JLabel logo;
    private JMenuBar menBar;
    private JMenu menCad;
    private JMenu menPes;
    private JMenu menManu;
    private JMenu menSair;
    private JMenuItem cadCurso;
    private JMenuItem cadDisc;
    private JMenuItem cadAluno;
    private JMenuItem cadProf;
    private JMenuItem pesCurso;
    private JMenuItem pesDisc;
    private JMenuItem pesAluno;
    private JMenuItem pesProf;
    private JMenuItem altAluno;
    private JMenuItem altProf;
    private JMenuItem altDisc;
    private JMenuItem altCurso;
    private JMenuItem itemSair;
    private Font font;
    
}
