import javax.swing.*;

public class JOptionpane {
    public static void main(String[] args) {
        //JOptionpane = pops up a message dialog box that informs some message or ask for prompts.
//        JOptionPane.showMessageDialog(null,"click ok to close me!!","my title",JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showMessageDialog(null,"click ok to close me!!","my title",JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null,"click ok to close me!!","my title",JOptionPane.QUESTION_MESSAGE);
//        JOptionPane.showMessageDialog(null,"click ok to close me!!","my title",JOptionPane.WARNING_MESSAGE);
//        JOptionPane.showMessageDialog(null,"click ok to close me!!","my title",JOptionPane.ERROR_MESSAGE);

        //conformation dialog box
//        JOptionPane.showConfirmDialog(null,"are you even real?","robot question",JOptionPane.YES_NO_CANCEL_OPTION);
//        JOptionPane.showConfirmDialog(null,"are you even real?","robot question", JOptionPane.YES_NO_OPTION);
        String name = JOptionPane.showInputDialog("what is your name");
        System.out.println(name);
    }
}
