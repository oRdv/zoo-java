package br.senai.jandira.sp.model;

public class Menu {

    public static void menuCadastro() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("______________________________________________________");
            System.out.println("                BEM VINDO AO ZOOLÓGICO                ") 
            System.out.println("______________________________________________________");
            System.out.println("Escolha uma opção.....................................")
            System.out.println("1 - Cadastrar Mamífero");
            System.out.println("2 - Cadastrar Ave");
            System.out.println("3 - Cadastrar Réptil");
            System.out.println("4 - Cadastrar Peixe");
            System.out.println("5 - Cadastrar Outras espécies");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma das opções acima: ");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    cadastroMamifero(scanner);
                    break;
                case 2:
                    cadastoAve(scanner);
                    break;
                case 3:
                    cadastroReptil(scanner);
                    break;
                 case 4:
                    cadastroPeixe(scanner);
                    break;
                case 5:
                    cadastroEspecies(scanner);   
                case 6:
                    System.exit(0);
                default:
                    System.out.println("ERRO: É obrigatorio escolher uma opção acima!!");
            }
        }
    }

     public static void cadastroMamifero(Scanner scanner) {
        System.out.println("______________________________________________________");
        System.out.println("                  CADASTRAR MAMÍFERO                  ") 
        System.out.println("______________________________________________________");
        System.out.print("Informe o nome do mamífero: ");
        scanner.nextLine();
        System.out.print("Informe a idade do mamífero: ");
        scanner.nextLine();
        System.out.print("Informe o sexo do mamífero: ");
        scanner.nextLine();
        System.out.print("Informe o número de identificação: ");
        scanner.nextLine();

        System.out.println("───────────────>  O Mamífero cadastrado com sucesso!! <─────────────── ");
        System.out.println("_______________________________________________________________________");
    }

    public static void cadastroAve(Scanner scanner) {
        System.out.println("______________________________________________________");
        System.out.println("                    CADASTRAR AVE                     ") 
        System.out.println("______________________________________________________");
        System.out.print("Informe o nome da ave: ");
        scanner.nextLine();
        System.out.print("Informe a idade da ave: ");
        scanner.nextLine();
        System.out.print("Infome o sexo da ave: ");
        scanner.nextLine();
        System.out.print("Infome o número de identificação da ave: ");
        scanner.nextLine();

        SystSystem.out.println("───────────────>  A Ave foi cadastrada com sucesso!! <─────────────── ");
        System.out.println("_______________________________________________________________________");
    }

    public static void cadastroReptil(Scanner scanner) {
        System.out.println("______________________________________________________");
        System.out.println("                    CADASTRAR RÉPTIL                     ") 
        System.out.println("______________________________________________________");
        System.out.print("Informe o nome do réptil: ");
        scanner.nextLine();
        System.out.print("Informe a idade do réptil: ");
        scanner.nextLine();
        System.out.print("Informe o sexo do réptil: ");
        scanner.nextLine();
        System.out.print("Informe o número de identificação do réptil: ");
        scanner.nextLine();

        SystSystem.out.println("───────────────>  O Réptil foi cadastrado com sucesso!! <─────────────── ");
        System.out.println("_______________________________________________________________________");
    }

    public static void cadastroPeixe(Scanner scanner) {
        System.out.println("______________________________________________________");
        System.out.println("                    CADASTRAR PEIXE                     ") 
        System.out.println("______________________________________________________");
        System.out.print("Informe o nome do peixe: ");
        scanner.nextLine();
        System.out.print("Informe a idade do peixe: ");
        scanner.nextLine();
        System.out.print("Informe o sexo do peixe: ");
        scanner.nextLine();
        System.out.print("Informe o número de identificação do peixe: ");
        scanner.nextLine();

        SystSystem.out.println("───────────────>  O Peixe foi cadastrado com sucesso!! <─────────────── ");
        System.out.println("_______________________________________________________________________");
    }

    public static void cadastroEspecies(Scanner scanner) {
        System.out.println("______________________________________________________");
        System.out.println("                    CADASTRAR ESPÉCIE                     ") 
        System.out.println("______________________________________________________");
        System.out.print("Informe qual é a espécie do animal: ");
        scanner.nextLine();
        System.out.print("Informe o nome do animal: ");
        scanner.nextLine();
        System.out.print("Informe a idade do animal: ");
        scanner.nextLine();
        System.out.print("Informe o sexo do animal: ");
        scanner.nextLine();
        System.out.print("Informe o número de identificação do animal: ");
        scanner.nextLine();

        SystSystem.out.println("───────────────>  O Animal foi cadastrado com sucesso!! <─────────────── ");
        System.out.println("_______________________________________________________________________");
    }

}
