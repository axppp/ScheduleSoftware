package gestaogui;


import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

import javax.swing.*;
import javax.swing.border.*;

/**
 * The purpose of this class is to show a dialog with information about the
 * application
 */
@SuppressWarnings("serial")
public class About extends JDialog {

	/**
	 * Constructor of this class
	 * 
	 * @param parent
	 *            the parent frame where this class will be shown
	 */
	@SuppressWarnings("unused")
	public About(JFrame parent) throws URISyntaxException {
		super(parent, "Acerca de Gestão Horários", true);

		final Imagens img = new Imagens();
		final Font font = new Font("Arial", Font.PLAIN, 9);
		final URI visit_url = new URI("https://code.google.com/p/lapr2-projeto/");

		// Main panel
		Painel panel_principal = new Painel(img.background2);

		// Logo button with hiperlink to the project's website
		//Botao logo = new Botao(img.logo);

		// Inner panel and customization
		JPanel inner = new JPanel();

		// Labels
		JLabel name = new JLabel("M&M - Medal Management");
		JLabel version = new JLabel("Version: Medal Management Realease 1");

		// Action listener
		//logo.addActionListener(new ActionListener() {
		//	public void actionPerformed(ActionEvent e) {
		//		open(visit_url);
		//	}
		//});

		// Customizations

		// - main panel
		panel_principal.setLayout(new BorderLayout());

		// - logo
		//logo.setContentAreaFilled(false);
		//logo.setBorderPainted(false);

		// - inner panel
		inner.setLayout(new GridLayout(2, 1, 0, 0));
		inner.setOpaque(false);
		inner.setBorder(new EmptyBorder(30, 20, 40, 20));

		// - name label
		name.setForeground(Color.white);

		// - version label
		version.setForeground(Color.white);

		// Adding panels
		inner.add(name);
		inner.add(version);
		panel_principal.add(inner, BorderLayout.EAST);
		//panel_principal.add(logo, BorderLayout.CENTER);
		panel_principal.setBorder(new EmptyBorder(30, 20, 0, 0));
		getContentPane().add(panel_principal);

		// windows properties
		setProperties(400, 200, true);

	}

	
	private void setProperties(int w, int h, boolean visible) {
		setSize(w, h);
		setVisible(visible);
		setLocationRelativeTo(null);
	}

	/**
	 * This method was implemented to let the button logo have a link when
	 * clicked, opens the site on the browser
	 */
	private void open(URI uri) {
		if (Desktop.isDesktopSupported()) {
			try {
				Desktop.getDesktop().browse(uri);
			} catch (IOException e) {
				JOptionPane.showMessageDialog(About.this, "Browser not supported!");
			}
		}

	}
}
