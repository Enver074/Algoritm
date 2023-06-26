package HW_4;

import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {

//         RBTree node = new RBTree();
//         Scanner in = new Scanner(System.in);
//         char choice;

//         do{
//             System.out.print("Введите целое число: ");
//             int num = in.nextInt();

//             node.insert(num);
//             node.inorder();
//             System.out.println("\n");
//             node.inorder();
            
//             System.out.print("Хотите продолжить: ");
//             choice = in.next().charAt(0);
//         }while(choice == 'y' || choice == 'Y');
//     }
// }


public class Main {
    public static void main(String[] args) {

        RBTree node = new RBTree();
        Scanner in = new Scanner(System.in);
        char choice;

        do{
            System.out.print("Введите целое число: ");
            int num = in.nextInt();

            node.insert(num);
            node.inorder();
            System.out.println("\n");
            node.inorder();
            
            System.out.print("Хотите продолжить('Y'-да, 'N'-нет): ");
            choice = in.next().charAt(0);
            if (choice == 'n' || choice =='N')
                System.exit(0);
        }while (choice == 'y' || choice == 'Y');
    }
}