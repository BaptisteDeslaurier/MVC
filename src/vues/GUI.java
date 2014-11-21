package vues;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

import controleurs.ControleurPrincipal;

import classes.Division;
import dao.DAO;
import dao.DivisionDAO;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class GUI extends JFrame {

	private JPanel contentPane;
	private ControleurPrincipal leControleur = new ControleurPrincipal();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI() {
		setTitle("Ecole");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("Division");
		menuBar.add(mnNewMenu);

		JMenuItem mntmVoir = new JMenuItem("Voir");
		//mntmVoir.addActionListener(leControleur);
		mnNewMenu.add(mntmVoir);

		JMenuItem mntmAjouter = new JMenuItem("Ajouter");
		mnNewMenu.add(mntmAjouter);

		JMenuItem mntmModifier = new JMenuItem("Modifier");
		mnNewMenu.add(mntmModifier);

		JMenuItem mntmSupprimer = new JMenuItem("Supprimer");
		mnNewMenu.add(mntmSupprimer);

		JMenu mnEleves = new JMenu("Eleves");
		menuBar.add(mnEleves);

		DAO<Division> daoDiv = new DivisionDAO();
		List<Division> lesDiv = daoDiv.readAll();
		for (Division uneDiv : lesDiv ) {
			JMenuItem mnUneDivEleve = new JMenuItem(uneDiv.getLibelle());
			mnUneDivEleve.setActionCommand(Integer.toString(uneDiv.getCode()));
			mnUneDivEleve.addActionListener(leControleur);
			mnEleves.add(mnUneDivEleve);
		}

		//Exit dans le controleur
		/*JMenuItem mntmQuitter = new JMenuItem("Quitter");
		mntmQuitter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		menuBar.add(mntmQuitter);*/
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
