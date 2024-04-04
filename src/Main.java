import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final List<User> users = new ArrayList<>();

    // TODO: Implementar o padrão Singleton para garantir que haja apenas uma
    // instância do gerenciador de usuários

    public static void addUser(String name) {

        int id = users.size() + 1;
        User user = new User(id, name);
        users.add(user);

    }

    public static void listUsers() {
        for (User user : users) {
            System.out.println(user.getId() + " - " + user.getName());
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos usuários deseja cadastrar? ");
        int quantity = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após a leitura do número

        UserManager userManager = UserManager.getInstance();

        for (int i = 1; i <= quantity; i++) {
            System.out.print("Nome do usuário " + i + ": ");
            String name = scanner.nextLine();
            addUser(name);
        }

        listUsers();
    }
}