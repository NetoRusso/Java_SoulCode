import javax.swing.*;
import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Solicita a idade do usuário
//        System.out.print("Digite sua idade: ");
//        int idade = scanner.nextInt();
//        scanner.nextLine(); // Consumir a nova linha deixada pelo nextInt
//
//        // Solicita se o usuário é amigo do dono
//        System.out.print("Você é amigo do dono? (sim/nao): ");
//        String amigoDoDonoResposta = scanner.nextLine();
//        boolean amigoDoDono = amigoDoDonoResposta.equalsIgnoreCase("sim");
//
//        // Solicita se o usuário possui voucher
//        System.out.print("Você possui um voucher? (sim/nao): ");
//        String voucherResposta = scanner.nextLine();
//        boolean voucher = voucherResposta.equalsIgnoreCase("sim");



        // Verifica as condições de entrada
//        if (idade >= 18) {
//            System.out.println("Pode entrar na festa.");
//        } else if (amigoDoDono) {
//            System.out.println("Pode entrar na festa.");
//        } else if (voucher) {
//            System.out.println("Pode entrar na festa.");
//        } else {
//            System.out.println("Acesso não autorizado.");
//        }

//        String resultado = (idade >= 18 && (amigoDoDono || voucher)) || (amigoDoDono && voucher) ?
//                "Pode entrar na festa." : "Acesso não autorizado.";
        // Fecha o Scanner


        // Contador de condições satisfeitas
//        int condicoesSatisfeitas = 0;

        // Verifica cada condição e incrementa o contador
//        if (idade >= 18) {
//            condicoesSatisfeitas++;
//        }
//        if (amigoDoDono) {
//            condicoesSatisfeitas++;
//        }
//        if (voucher) {
//            condicoesSatisfeitas++;
//        }

        // Verifica as condições de entrada usando switch
//        String resultado;

        String idadeStr = JOptionPane.showInputDialog("Digite sua idade:");
        int idade = Integer.parseInt(idadeStr);

        // Solicita se o usuário é amigo do dono
        int amigoDoDonoOpcao = JOptionPane.showConfirmDialog(null, "Você é amigo do dono?", "Amigo do Dono", JOptionPane.YES_NO_OPTION);
        boolean amigoDoDono = (amigoDoDonoOpcao == JOptionPane.YES_OPTION);

        // Solicita se o usuário possui um voucher
        int voucherOpcao = JOptionPane.showConfirmDialog(null, "Você possui um voucher?", "Voucher", JOptionPane.YES_NO_OPTION);
        boolean voucher = (voucherOpcao == JOptionPane.YES_OPTION);

        // Verifica as condições de entrada
        String resultado;
        if (idade >= 18 || amigoDoDono || voucher) {
            resultado = "Pode entrar na festa.";
        } else {
            resultado = "Acesso não autorizado.";
        }


    int condicoesSatisfeitas = (idade > 18 ? 1 : 0) + (amigoDoDono ? 1 : 0) + (voucher ? 1 : 0);

//    String resultado = switch (condicoesSatisfeitas) {
//        case 2, 3 -> "Pode entrar na festa.";
//        default -> "Acesso não autorizado.";
//    };



//        switch (condicoesSatisfeitas) {
//            case 2:
//            case 3:
//                resultado = "Pode entrar na festa.";
//                break;
//            default:
//                resultado = "Acesso não autorizado.";
//                break;
//        }

//        scanner.close();

        //resultado
        System.out.println(resultado);
        JOptionPane.showMessageDialog(null, resultado);
    }
}
