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
import vues.seeDiv;

import java.util.List;

public class GUI extends JFrame {

	public JPanel contentPane;
	public ControleurPrincipal leControleur = new ControleurPrincipal(null, null);
	public JMenuItem mntmQuitter = new JMenuItem("Quitter");
	public JMenuItem mntmVoir = new JMenuItem("Voir");
	public seeDiv panelVoirDiv;
	public voirEleve panelEleve;

	/**
	 * Create the frame.
	 */
	public GUI(ControleurPrincipal leControleur) {
		this.leControleur=leControleur;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		setTitle("Ecole");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("Division");
		menuBar.add(mnNewMenu);

		mntmVoir.addActionListener(leControleur);
		mnNewMenu.add(mntmVoir);

		JMenuItem mntmAjouter = new JMenuItem("Ajouter");
		mntmAjouter.addActionListener(leControleur);
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
		mntmQuitter.addActionListener(leControleur);
		menuBar.add(mntmQuitter);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		panelVoirDiv = new seeDiv(leControleur);
		contentPane.add(panelVoirDiv);
		panelVoirDiv.setVisible(false);

		panelEleve = new voirEleve(leControleur);
		contentPane.add(panelEleve);
		panelEleve.setVisible(false);

		setVisible(true);
	}

}
