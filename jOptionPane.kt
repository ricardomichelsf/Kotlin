import javax.swing.JOptionPane

fun main(args: Array<String>){
    // Pede o nome do iusuario
    val nome = JOptionPane.showInputDialog("Digite seu nome: ")

    //format a mensagem de saida
    val saida = String.format("%s %s", "Bemv-Vindo", nome)

    //Apresenta o texto em uma interface grafica
    JOptionPane.showMessageDialog(null, saida)

    //println("Bem-Vindo $nome")
}