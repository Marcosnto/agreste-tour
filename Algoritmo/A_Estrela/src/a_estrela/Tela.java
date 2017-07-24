package a_estrela;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Tela extends JFrame implements ActionListener {

    public JComboBox<String> combo_1 = new JComboBox<String>();
    public JComboBox<String> combo_2 = new JComboBox<String>();
    JButton limpar = new JButton("Limpar");
    JButton Okay = new JButton("Mostrar");
    JButton Sair = new JButton("Sair");
    JButton Sobre = new JButton("Sobre");
    JTextArea Caminho = new JTextArea();

    private final JLabel pontoFreiPaulo;
    private final JLabel pontoRibeiropolis;
    private final JLabel pontoCarira;
    private final JLabel pontoAparecida;
    private final JLabel pontoAleixo;
    private final JLabel pontoPinhao;
    private final JLabel pontoPedraMole;
    private final JLabel pontoMacambira;
    private final JLabel pontoItabaiana;
    private final JLabel pontoMalhador;
    private final JLabel pontoSaoDomingos;
    private final JLabel pontoAreiaBranca;
    private final JLabel pontoMoitaBonita;
    private final JLabel pontoBrito;

    private boolean ativado = true;
    Thread tFreiPaulo;
    Thread tCarira;
    Thread tAparecida;
    Thread tAleixo;
    Thread tAreiaBranca;
    Thread tRibeiropolis;
    Thread tPinhao;
    Thread tPedraMole;
    Thread tMacambira;
    Thread tItabaiana;
    Thread tMalhador;
    Thread tSaoDomingos;
    Thread tMoitaBonita;
    Thread tCampoBrito;

    public void ativarFreiPaulo() {
        tFreiPaulo = new Thread() {
            public void run() {
                int x = 0;
                while (ativado) {
                    x++;
                    if (x % 2 == 0) {
                        add(pontoFreiPaulo).setBounds(538, 340, 30, 26);
                        pontoFreiPaulo.setVisible(true);

                    } else {
                        pontoFreiPaulo.setVisible(false);
                    }

                    try {
                        Thread.sleep(800);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            }
        };
        tFreiPaulo.start();
    }

    public void ativarCarira() {
        tCarira = new Thread() {
            public void run() {
                int x = 0;
                while (true) {

                    x++;
                    if (x % 2 == 0) {
                        add(pontoCarira).setBounds(378, 176, 30, 26);
                        pontoCarira.setVisible(true);
                    } else {
                        pontoCarira.setVisible(false);
                    }

                    try {
                        Thread.sleep(800);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            }
        };
        tCarira.start();
    }

    public void ativarAparecida() {
        tAparecida = new Thread() {
            public void run() {
                int x = 0;
                while (true) {

                    x++;
                    if (x % 2 == 0) {
                        add(pontoAparecida).setBounds(615, 184, 30, 26);
                        pontoAparecida.setVisible(true);
                    } else {
                        pontoAparecida.setVisible(false);
                    }

                    try {
                        Thread.sleep(800);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            }
        };
        tAparecida.start();
    }

    public void ativarAleixo() {
        tAleixo = new Thread() {
            public void run() {
                int x = 0;
                while (true) {

                    x++;
                    if (x % 2 == 0) {
                        add(pontoAleixo).setBounds(701, 157, 30, 26);
                        pontoAleixo.setVisible(true);
                    } else {
                        pontoAleixo.setVisible(false);
                    }

                    try {
                        Thread.sleep(800);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            }
        };
        tAleixo.start();
    }

    public void ativarAreiaBranca() {
        tAreiaBranca = new Thread() {
            public void run() {
                int x = 0;
                while (true) {

                    x++;
                    if (x % 2 == 0) {
                        add(pontoAreiaBranca).setBounds(763, 537, 30, 26);
                        pontoAreiaBranca.setVisible(true);
                    } else {
                        pontoAreiaBranca.setVisible(false);
                    }

                    try {
                        Thread.sleep(800);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            }
        };
        tAreiaBranca.start();
    }

    public void ativarRibeiropolis() {
        tRibeiropolis = new Thread() {
            public void run() {
                int x = 0;
                while (true) {

                    x++;
                    if (x % 2 == 0) {
                        add(pontoRibeiropolis).setBounds(633, 309, 30, 26);
                        pontoRibeiropolis.setVisible(true);
                    } else {
                        pontoRibeiropolis.setVisible(false);
                    }

                    try {
                        Thread.sleep(800);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            }
        };
        tRibeiropolis.start();
    }

    public void ativarPinhao() {
        tPinhao = new Thread() {
            public void run() {
                int x = 0;
                while (true) {

                    x++;
                    if (x % 2 == 0) {
                        add(pontoPinhao).setBounds(331, 357, 30, 26);
                        pontoPinhao.setVisible(true);
                    } else {
                        pontoPinhao.setVisible(false);
                    }

                    try {
                        Thread.sleep(800);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            }
        };
        tPinhao.start();
    }

    public void ativarPedraMole() {
        tPedraMole = new Thread() {
            public void run() {
                int x = 0;
                while (true) {

                    x++;
                    if (x % 2 == 0) {
                        add(pontoPedraMole).setBounds(402, 418, 30, 26);
                        pontoPedraMole.setVisible(true);
                    } else {
                        pontoPedraMole.setVisible(false);
                    }

                    try {
                        Thread.sleep(800);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            }
        };
        tPedraMole.start();
    }

    public void ativarMacambira() {
        tMacambira = new Thread() {
            public void run() {
                int x = 0;
                while (true) {

                    x++;
                    if (x % 2 == 0) {
                        add(pontoMacambira).setBounds(543, 460, 30, 26);
                        pontoMacambira.setVisible(true);
                    } else {
                        pontoMacambira.setVisible(false);
                    }

                    try {
                        Thread.sleep(800);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            }
        };
        tMacambira.start();
    }

    public void ativarItabaiana() {
        tItabaiana = new Thread() {
            public void run() {
                int x = 0;
                while (true) {

                    x++;
                    if (x % 2 == 0) {
                        add(pontoItabaiana).setBounds(650, 494, 30, 26);
                        pontoItabaiana.setVisible(true);
                    } else {
                        pontoItabaiana.setVisible(false);
                    }

                    try {
                        Thread.sleep(800);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            }
        };
        tItabaiana.start();
    }

    public void ativarMalhador() {
        tMalhador = new Thread() {
            public void run() {
                int x = 0;
                while (true) {

                    x++;
                    if (x % 2 == 0) {
                        add(pontoMalhador).setBounds(770, 432, 30, 26);
                        pontoMalhador.setVisible(true);
                    } else {
                        pontoMalhador.setVisible(false);
                    }

                    try {
                        Thread.sleep(800);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            }
        };
        tMalhador.start();
    }

    public void ativarSaoDomingos() {
        tSaoDomingos = new Thread() {
            public void run() {
                int x = 0;
                while (true) {

                    x++;
                    if (x % 2 == 0) {
                        add(pontoSaoDomingos).setBounds(505, 541, 30, 26);
                        pontoSaoDomingos.setVisible(true);
                    } else {
                        pontoSaoDomingos.setVisible(false);
                    }

                    try {
                        Thread.sleep(800);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            }
        };
        tSaoDomingos.start();
    }

    public void ativarMoitaBonita() {
        tMoitaBonita = new Thread() {
            public void run() {
                int x = 0;
                while (true) {

                    x++;
                    if (x % 2 == 0) {
                        add(pontoMoitaBonita).setBounds(710, 401, 30, 26);
                        pontoMoitaBonita.setVisible(true);
                    } else {
                        pontoMoitaBonita.setVisible(false);
                    }

                    try {
                        Thread.sleep(800);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            }
        };
        tMoitaBonita.start();
    }

    public void ativarBrito() {
        tCampoBrito = new Thread() {
            public void run() {
                int x = 0;
                while (true) {

                    x++;
                    if (x % 2 == 0) {
                        add(pontoBrito).setBounds(589, 550, 30, 26);
                        pontoBrito.setVisible(true);
                    } else {
                        pontoBrito.setVisible(false);
                    }

                    try {
                        Thread.sleep(800);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            }
        };
        tCampoBrito.start();
    }

    public Tela() {
        setTitle("Agreste Tour");
        setSize(900, 720);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        URL url = this.getClass().getResource("/imagens/Icone.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(iconeTitulo);

        setVisible(true);

        setContentPane(new JLabel(new ImageIcon(ClassLoader.getSystemResource("imagens/Fundo.png"))));
        setLayout(null);

        add(combo_1).setBounds(5, 180, 150, 30);
        add(combo_2).setBounds(5, 260, 150, 30);

        pontoFreiPaulo = new JLabel(new ImageIcon(ClassLoader.getSystemResource("imagens/bolavermelha20.png")));

        pontoRibeiropolis = new JLabel(new ImageIcon(ClassLoader.getSystemResource("imagens/bolavermelha20.png")));

        pontoCarira = new JLabel(new ImageIcon(ClassLoader.getSystemResource("imagens/bolavermelha20.png")));

        pontoAleixo = new JLabel(new ImageIcon(ClassLoader.getSystemResource("imagens/bolavermelha20.png")));

        pontoAparecida = new JLabel(new ImageIcon(ClassLoader.getSystemResource("imagens/bolavermelha20.png")));

        pontoAreiaBranca = new JLabel(new ImageIcon(ClassLoader.getSystemResource("imagens/bolavermelha20.png")));

        pontoItabaiana = new JLabel(new ImageIcon(ClassLoader.getSystemResource("imagens/bolavermelha20.png")));

        pontoMacambira = new JLabel(new ImageIcon(ClassLoader.getSystemResource("imagens/bolavermelha20.png")));

        pontoMalhador = new JLabel(new ImageIcon(ClassLoader.getSystemResource("imagens/bolavermelha20.png")));

        pontoMoitaBonita = new JLabel(new ImageIcon(ClassLoader.getSystemResource("imagens/bolavermelha20.png")));

        pontoPedraMole = new JLabel(new ImageIcon(ClassLoader.getSystemResource("imagens/bolavermelha20.png")));

        pontoPinhao = new JLabel(new ImageIcon(ClassLoader.getSystemResource("imagens/bolavermelha20.png")));

        pontoSaoDomingos = new JLabel(new ImageIcon(ClassLoader.getSystemResource("imagens/bolavermelha20.png")));

        pontoBrito = new JLabel(new ImageIcon(ClassLoader.getSystemResource("imagens/bolavermelha20.png")));

        //Dados do combo box 1:
        combo_1.addItem("AreiaBranca");
        combo_1.addItem("CampoDoBrito");
        combo_1.addItem("Carira");
        combo_1.addItem("FreiPaulo");
        combo_1.addItem("Itabaiana");
        combo_1.addItem("Macambira");
        combo_1.addItem("Malhador");
        combo_1.addItem("MoitaBonita");
        combo_1.addItem("NossaSenhoraAparecida");
        combo_1.addItem("PedraMole");
        combo_1.addItem("Pinhao");
        combo_1.addItem("Ribeiropolis");
        combo_1.addItem("SaoDomingos");
        combo_1.addItem("SaoMiguelDoAleixo");

        //Dados do combo box 2: 
        combo_2.addItem("AreiaBranca");
        combo_2.addItem("CampoDoBrito");
        combo_2.addItem("Carira");
        combo_2.addItem("FreiPaulo");
        combo_2.addItem("Itabaiana");
        combo_2.addItem("Macambira");
        combo_2.addItem("Malhador");
        combo_2.addItem("MoitaBonita");
        combo_2.addItem("NossaSenhoraAparecida");
        combo_2.addItem("PedraMole");
        combo_2.addItem("Pinhao");
        combo_2.addItem("Ribeiropolis");
        combo_2.addItem("SaoDomingos");
        combo_2.addItem("SaoMiguelDoAleixo");

        getContentPane().add(Okay).setBounds(5, 300, 79, 30);
        Okay.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Comando para pegar os valores do comboBox
                String Origem = String.valueOf(combo_1.getSelectedItem());
                String Destino = String.valueOf(combo_2.getSelectedItem());
                if (Origem.equals(Destino)) {
                    JOptionPane.showMessageDialog(null, "Cidades iguais");
                }

                //Chamado do Metodo
                GerarGrafo G = new GerarGrafo();
                BuscaAestrela busca = new BuscaAestrela();
                G.gerar_Grafo();

                Vertice cidadeInicial = new Vertice();
                Vertice cidadeDestino = new Vertice();

                for (Vertice vertice : G.grafo) {
                    if (vertice.getNomeCidade().equalsIgnoreCase(Origem)) {
                        cidadeInicial = vertice;
                    }
                    if (vertice.getNomeCidade().equalsIgnoreCase(Destino)) {
                        cidadeDestino = vertice;
                    }
                }

                Vertice verticeFinal = busca.aestrela(G.grafo, cidadeInicial, cidadeDestino);
                String percurso = "";
                while (verticeFinal != null) {
                    percurso = verticeFinal.getNomeCidade() + (percurso.isEmpty() ? "" : ">" + percurso);
                    verticeFinal = verticeFinal.getVerticePai();
                }
                //System.out.println(percurso);

                String array[];
                array = percurso.split(">");
                Caminho.setText(percurso);
                Caminho.setLineWrap(true);
                ativarCaminho(array);
            }
        });

        getContentPane().add(limpar).setBounds(85, 300, 75, 30);
        limpar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                desativarThread();
                Caminho.setText("");
                combo_1.setSelectedIndex(0);
                combo_2.setSelectedIndex(0);
            }
        });

        getContentPane().add(Sair).setBounds(815, 650, 75, 30);
        Sair.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        getContentPane().add(Sobre).setBounds(735, 650, 75, 30);
        Sobre.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,
                        "                           Universidade Federal de Sergipe\n                     "
                        + "          Sistemas de Informação\n"
                        + "                          Disciplina: Inteligência Artificial\n"
                        + "                      Doscente: Dr. Alcides Xavier Benicasa\n"
                        + "  Discentes: Kaic de Oliveira, Layla Joana, Marcos Neto e Paulo Vitor\n"
                        + "                                                    2017.1");
            }
        });

        add(Caminho);
        Caminho.setBounds(227, 595, 235, 30);
    }

    //Acao do Botao
    public void actionPerformed(ActionEvent e) {
        //Comando para pegar os valores do comboBox

    }

    public void ativarCaminho(String[] cidades) {
        desativarThread();
        for (String cidade : cidades) {
            switch (cidade) {
                case "AreiaBranca":
                    ativarAreiaBranca();
                    break;
                case "CampodoBrito":
                    ativarBrito();
                    break;
                case "Carira":
                    ativarCarira();
                    break;
                case "FreiPaulo":
                    ativarFreiPaulo();
                    break;
                case "Itabaiana":
                    ativarItabaiana();
                    break;
                case "Macambira":
                    ativarMacambira();
                    break;
                case "Malhador":
                    ativarMalhador();
                    break;
                case "MoitaBonita":
                    ativarMoitaBonita();
                    break;
                case "NossaSenhoraAparecida":
                    ativarAparecida();
                    break;
                case "PedraMole":
                    ativarPedraMole();
                    break;
                case "Pinhao":
                    ativarPinhao();
                    break;
                case "Ribeiropolis":
                    ativarRibeiropolis();
                    break;
                case "SaoDomingos":
                    ativarSaoDomingos();
                    break;
                case "SaoMigueldoAleixo":
                    ativarAleixo();
                    break;
                default:
                    System.out.println("Nenhuma das cidades");
            }
        }
    }

    private void desativarThread() {
        if (tFreiPaulo != null) {
            tFreiPaulo.stop();
            pontoFreiPaulo.setVisible(false);
        }
        if (tCarira != null) {
            tCarira.stop();
            pontoCarira.setVisible(false);
        }
        if (tAparecida != null) {
            tAparecida.stop();
            pontoAparecida.setVisible(false);
        }
        if (tAleixo != null) {
            tAleixo.stop();
            pontoAleixo.setVisible(false);
        }
        if (tAreiaBranca != null) {
            tAreiaBranca.stop();
            pontoAreiaBranca.setVisible(false);
        }
        if (tRibeiropolis != null) {
            tRibeiropolis.stop();
            pontoRibeiropolis.setVisible(false);
        }
        if (tPinhao != null) {
            tPinhao.stop();
            pontoPinhao.setVisible(false);
        }
        if (tPedraMole != null) {
            tPedraMole.stop();
            pontoPedraMole.setVisible(false);
        }
        if (tMacambira != null) {
            tMacambira.stop();
            pontoMacambira.setVisible(false);
        }
        if (tItabaiana != null) {
            tItabaiana.stop();
            pontoItabaiana.setVisible(false);
        }
        if (tMalhador != null) {
            tMalhador.stop();
            pontoMalhador.setVisible(false);
        }
        if (tSaoDomingos != null) {
            tSaoDomingos.stop();
            pontoSaoDomingos.setVisible(false);
        }
        if (tMoitaBonita != null) {
            tMoitaBonita.stop();
            pontoMoitaBonita.setVisible(false);
        }
        if (tCampoBrito != null) {
            tCampoBrito.stop();
            pontoBrito.setVisible(false);
        }
    }

    public static void main(String[] args) {
        Tela tela = new Tela();
    }

}
