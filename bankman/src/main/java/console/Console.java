package console;

import atm.Atm;
import bank.Bank;
import java.util.Scanner;

public class Console {

  private final Scanner scanner;

  public Console() {
    scanner = new Scanner(System.in);
  }

  private int menu() {
    System.out.println("Choose operation");
    System.out.println("1. Visit Atm");
    System.out.println("2. Visit Bank");
    System.out.println("0. Exit program");

    return readInput();
  }

  /**
   * Display menu.
   */
  public void start() {
    int choice = menu();

    switch (choice) {
      case 1:
        new Atm();
        break;
      case 2:
        new Bank();
        break;
      case 0:
        System.out.println("Terminating program");
        scanner.close();
        break;
      default:
        System.out.println("Option not available!");
    }
  }

  private int readInput() {
    int choice;

    do {
      choice = scanner.nextInt();
    } while ((choice < 0) || (choice > 2));
    {
      return choice;
    }
  }
}
