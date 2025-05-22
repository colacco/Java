import javax.swing.JFrame;

class MostreUmFrame {
    public static void main(String args[]){
        JFrame meuFrame = new JFrame();
        String meuTitulo = "Minha expansão de Domínio";
        
        meuFrame.setTitle(meuTitulo);
        meuFrame.setSize(300, 200);
        meuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        meuFrame.setVisible(true);
    }
}
