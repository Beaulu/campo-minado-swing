package primeiro.projeto.cm.visao;

import java.awt.GridLayout;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import primeiro.projeto.cm.logica.Tabuleiro;

@SuppressWarnings("serial")
public class PainelTabuleiro extends JPanel{

	public PainelTabuleiro(Tabuleiro tabuleiro){
		setLayout(new GridLayout(
				tabuleiro.getLinhas(), tabuleiro.getColunas()));
		
		tabuleiro.paraCadaCampo(b -> add(new BotaoCampo(b)));
		tabuleiro.registrarObservadores(e -> {
			
			SwingUtilities.invokeLater(()-> {
				if(e.isGanhou()) {
					JOptionPane.showMessageDialog(this, "Ganhou :)");
				}else {
					JOptionPane.showMessageDialog(this, "Perdeu :(");
				}
				
				tabuleiro.reiniciar();
			});
		});
	}
}
