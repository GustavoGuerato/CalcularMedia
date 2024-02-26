import javax.swing.JOptionPane;

public class CalcMedia {
    public static void main(String[] args) {
        

        String nota1 =JOptionPane.showInputDialog("informe a nota 1: ");
        String nota2 =JOptionPane.showInputDialog("informe a nota 2: ");
        String nota3 =JOptionPane.showInputDialog("informe a nota 3: ");
        String nota4 =JOptionPane.showInputDialog("informe a nota 4: ");

        double dNota1 = Double.parseDouble(nota1);
        double dNota2 = Double.parseDouble(nota2);
        double dNota3 = Double.parseDouble(nota3);
        double dNota4 = Double.parseDouble(nota4);

        double media = (dNota1 + dNota2 + dNota3 + dNota4) /4;

        if (media >= 50) {
            if (media >=75) {
                JOptionPane.showMessageDialog(null, "Aluno está aprovado com a media " + media);
            }else{
                JOptionPane.showMessageDialog(null, "aluno esta de recuperação" + media);
            }
        }else{
            JOptionPane.showMessageDialog(null,"o aluno está retido com a media de: " + media);
        }


        JOptionPane.showMessageDialog(null, "a media é " + media);
        

    }
}
