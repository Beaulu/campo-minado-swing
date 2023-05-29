package primeiro.projeto.cm.visao;

import javax.swing.JFrame;

import primeiro.projeto.cm.logica.Tabuleiro;

public class TelaPrincipal extends  JFrame{
	private static final long serialVersionUID = 1L;

	public TelaPrincipal() {
		Tabuleiro tabuleiro = new Tabuleiro(10, 10, 5);
		add(new PainelTabuleiro(tabuleiro));
		
		setTitle("Campo Minado");
		setSize(690, 438);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		
		new TelaPrincipal();
	}
}
