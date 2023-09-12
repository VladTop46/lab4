package test123;

import java.io.IOException;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		 /*task1();
		task2();
		task3(); 
		task4();
		task6();
		task7();
		task8();
		try {
			task9();
		} catch (IOException e) {
			e.printStackTrace();
		}
		task10();
		task11(); */
		//task12();
		//task13();
		//task14();
		//task15();
		task16();
	}
	
	public static void task1() {
		System.out.println("Задача 1");
		Scanner in = new Scanner(System.in);
        System.out.print("Введите число, 1, 2 или 3: ");
        int num = in.nextInt();
        
        switch (num) {
        	case 1:
        		System.out.println("Пользователь ввёл 1");
        		break;
        	case 2:
        		System.out.println("Пользователь ввёл 2");
        		break;
        	case 3:
        		System.out.println("Пользователь ввёл 3");
        		break;
        	default:
        		System.out.println("Пользователь ввёл что-то другое");
        		break;
        		
        }
	}
	
	public static void task2() {
		System.out.println("Задача 2");
		Scanner in = new Scanner(System.in);
        System.out.print("Введите число 1: ");
        int num = in.nextInt();
        
        String msg = (num == 1) ? "Вы ввели число 1" : "Вы ввели число не равное 1";
        System.out.println(msg);
	}
	
	public static void task3() {
		System.out.println("Задача 3");
		Scanner in = new Scanner(System.in);
        System.out.print("Введите число 1: ");
        int num = in.nextInt();
        
        if (num == 1) {
        	System.out.println("Вы ввели число 1");
        }
	}
	
	public static void task4() {
		System.out.println("Задача 4");
		Scanner in = new Scanner(System.in);
        System.out.print("Введите 10: ");
        int a = in.nextInt();
        
        String msg = (a == 10) ? "Верно" : "Неверно";
        System.out.println(msg);
	}
	
	public static void task5() {
        String lang = "";
        
        String[] days = new String[7];
        
        // решение через if
        if (lang == "ru") {
        	days[0] = "Пн";
        	days[1] = "Вт";
        	days[2] = "Ср";
        	days[3] = "Чт";
        	days[4] = "Пт";
        	days[5] = "Сб";
        	days[6] = "Вс";
        } else if (lang == "en") {
        	days[0] = "Sun";
        	days[1] = "Mon";
        	days[2] = "Tue";
        	days[3] = "Wed";
        	days[4] = "Thu";
        	days[5] = "Fri";
        	days[6] = "Sat";
        }
        
        // решение через switch
        switch (lang) {
            case "ru":
            	days[0] = "Пн";
            	days[1] = "Вт";
            	days[2] = "Ср";
            	days[3] = "Чт";
            	days[4] = "Пт";
            	days[5] = "Сб";
            	days[6] = "Вс";
            	break;
            case "en":
            	days[0] = "Sun";
            	days[1] = "Mon";
            	days[2] = "Tue";
            	days[3] = "Wed";
            	days[4] = "Thu";
            	days[5] = "Fri";
            	days[6] = "Sat";
            	break;
        }
        
	}
	
	public static void task6() {
		System.out.println("Задача 6");
		System.out.println("Привет!");
		System.out.println("Сколько будет 2*2?");
		Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        
        if (x == 4) {
        	System.out.println("Умён!");
        } else {
        	System.out.println("Бывает...");
        }
	}
	
	public static void task7() { // программа складывает два числа и выводит их сумму
		Scanner myscan = new Scanner (System.in);
        
        System.out.println ("Привет!");
        System.out.println ("Введи первое число");

         double x = 0;
         x = myscan.nextDouble (); 

         System.out.println ("Введи второе число");
         double y = 0;
         y = myscan.nextDouble ();

         System.out.println (x + y);
	}
	
	public static void task8() {
		Scanner myscan = new Scanner (System.in);
        
        System.out.println ("Привет!");
        System.out.println ("Сколько будет 25*5 ?");

         int x = 0;
         x = myscan.nextInt (); //
        
        if (x == 125){
               System.out.println ("Да, это круто!");
        } else {
        	System.out.println ("Абсолютная ложь!"); 
		} 
        
        System.out.println("Сколько будет 5*5?");
        x = myscan.nextInt();
        
        if (x == 25){
            System.out.println ("Да, это круто!");
	    } else {
	    	System.out.println ("Абсолютная ложь!"); 
		}
        
        System.out.println("Сколько будет 9*5?");
        x = myscan.nextInt();
        
        if (x == 45){
            System.out.println ("Да, это круто!");
	    } else {
	    	System.out.println ("Абсолютная ложь!"); 
		} 
	}
	
	public static void task9() throws IOException { // если ввести abc - выведется c b a (буква на новой строке)
		  System.out.println("Задача 9");
		  char c0 = (char) System.in.read ();
		  char c1 = (char) System.in.read ();
		  char c2 = (char) System.in.read ();

		  System.out.println (c2);
		  System.out.println (c1);
		  System.out.println (c0);
	}
	
	public static void task10() {
		System.out.println("Задача 10");
		System.out.println("Поучаствуйте в лотерее!");
		System.out.println("Введите целое число от 0 до 100");
		Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        
        if (x == 4 || x == 10 || x == 40 || x == 89) {
        	System.out.println("Да, ДЖЭКПОТ, 1000000 долларов!..");
        } else {
        	System.out.println("Попробуйте ещё в следующий раз!");
        }
	}
	
	public static void task11() {
        Scanner myscan = new Scanner (System.in);
        
        int x = myscan.nextInt ();
        
        if (x>100)
            System.out.println ("x > 100");
        else if (x > 1000)
            System.out.println ("x > 1000"); // не сработает, т.к предыдущее условие срабатывает раньше в случае если x > 100
        else
            System.out.println ("x <= 100");
	}
	
	public static void task12() {
		Scanner scanner = new Scanner(System.in);

        double result = 0;

        for (int i = 1; i <= 4; i++) {
            System.out.print("Введите символ операции (+, -, *, /) или 'q' для выхода: ");
            char operator = scanner.next().charAt(0);

            if (operator == 'q') {
                System.out.println("Программа завершена.");
                return;
            }

            if (i == 1) {
                System.out.print("Введите число: ");
                result = scanner.nextDouble();
            }
                System.out.print("Введите число: ");
                double num = scanner.nextDouble();

                switch (operator) {
                    case '+':
                        result += num;
                        break;
                    case '-':
                        result -= num;
                        break;
                    case '*':
                        result *= num;
                        break;
                    case '/':
                        result /= num;
                        break;
                    default:
                        System.out.println("Неверный символ операции!");
                        return;
                }

            System.out.println("Промежуточный результат: " + result);
        }

        System.out.println("Итоговый результат: " + result);
    
	}
	
	public static void task13() {
		System.out.println("Задача 13");
	
		System.out.println("Введите целое число");
		Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        
        if (x == 6 || x == 9) {
        	System.out.println("x = 6 или x = 9");
        } else if (x > -20 && x < 100) {
        	System.out.println("x больше -20 и меньше 100");
        } else if (x < 100 || x > 1000) {
        	System.out.println("x меньше 100 или больше 1000");
        }
	}
	
	public static void task14() {
		System.out.println("Задача 14");
		
		System.out.println("Введите первое число");
		Scanner in = new Scanner(System.in);
        Double a = in.nextDouble();
        
        System.out.println("Введите второе число");
        Double b = in.nextDouble();
        
        System.out.println("Введите третье число");
        Double c = in.nextDouble();
        System.out.println(c.intValue() + " " + b.intValue() + " " + a.intValue());
	}
	
	public static void task15() {
		System.out.println("Задача 15");
		System.out.println("Введите строчку");
		Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        
        String stra = str.replace("a", "A");
        System.out.println(stra);
	}
	
	public static void task16() {
		System.out.println("Задача 16");
		
		double[] rand = {Math.random(), Math.random(), Math.random()};
		
		System.out.println(rand[0] + " " + rand[1] + " " + rand[2]);
		
		double max = rand[0];
		
		for (int counter = 1; counter < rand.length; counter++)
		{
		     if (rand[counter] > max)
		     {
		           max = rand[counter];
		     }
		}
		
		System.out.println("Наибольшее число: " + max);
	}
}
