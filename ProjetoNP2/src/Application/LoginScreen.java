package Application;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class LoginScreen extends JFrame {

    public LoginScreen() // Contrutor
    {
        initComponents();
    }
    
    private void initComponents() // Componentes do Contrutor
    {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int heigth =  (int) ((int) screenSize.getHeight() * 0.25); // 270
        int width =  (int) ((int) screenSize.getWidth() * 0.25); // 480
        
        System.out.println("Altura: " + heigth + "\nLargura: " + width);
        password = new JPasswordField();
        user = new JTextField();
        entrar = new JButton("Entrar");
        sair = new JButton("Sair");
        help = new JButton("?");

        comment = new Color(98, 114, 164);
        
        texto = new Font("Hack",Font.PLAIN, 18);
        subTitle = new Font("Hack",Font.PLAIN,15);
        title = new Font("Hack",Font.BOLD, 10);
        
     
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        
        // Caracteristicas dos Componentes

        setTitle("Tela de Login");
        setSize(width, heigth);
        setLocation(1920 / 2 - 120, 1080 / 2 - 120);
        getContentPane().setBackground(new Color(40,42,54));
        
        user.setBounds(60,30,360,50);
        user.setText("");
        password.setBounds(60,100,360,50);
        sair.setBounds(280, 180,140,40);
        entrar.setBounds(60,180,140,40);
        help.setBounds(220,180, 40,40);

        user.setBorder(BorderFactory.createTitledBorder(null,"Usuario",TitledBorder.LEFT,TitledBorder.TOP,subTitle,comment));
        password.setBorder(BorderFactory.createTitledBorder(null,"Senha",TitledBorder.LEFT,TitledBorder.TOP,subTitle,comment));
        
        user.setFont(texto);
        password.setFont(texto);
        entrar.setFont(texto);
        sair.setFont(texto);
        help.setFont(title);
        
        

        
        // Add no Frame
        
        getContentPane().setLayout(null);
        getContentPane().add(user);
        getContentPane().add(password);
        getContentPane().add(entrar);
        getContentPane().add(sair);
        getContentPane().add(help);
                
        


        
        // Eventos - Listener
                

        entrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                entrarAuth(evt);
            }
            
        });

    
    
        help.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                helpHelp(evt);
            }
            
        });
        
        sair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                sairApp(evt);
            }
            
        });
        
        
        
        

}
        // Eventos - Açoes
        
    private void entrarAuth(ActionEvent evt)
        {
            String usuario = user.getText().toUpperCase();
            String pass = password.getText().toUpperCase();
            
            
            if(usuario.equals("ADMIN") && pass.equals("SENHA"))
            {
                new Principal().setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Usuario ou Senha Invalidos! ");
            }
        }
    
    private void helpHelp(ActionEvent evt)
    {
        JOptionPane.showMessageDialog(rootPane, "Usuario Padrao: ADMIN\nSenha Padrao: SENHAk","Ajuda", HEIGHT);
    }
        
    private void sairApp(ActionEvent evt)
    {
        System.exit(0);
    }
        
    // Main
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginScreen().setVisible(true);
                new Principal().setVisible(true);
//                  new CadastrarDisciplina().setVisible(true);
//                    new CadastrarAluno().setVisible(true);
//                        new CadastrarProfessor().setVisible(true);
                }
        });
    }
    
    
    // Private Itens (Abstraçao)
    
    private JTextField user;
    private JPasswordField password;
    private JButton entrar;
    private JButton sair;
    private JButton help;
    
    private Color comment;
    private Font texto;
    private Font title;
    private Font subTitle;

}

