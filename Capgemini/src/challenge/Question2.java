package challenge;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question2 {
	   public static void main(String args[]) {
		    
	        boolean stateUpper = false;
	        boolean stateLower = false;
	        boolean stateNumber = false;
	        boolean stateSpecial = false;
	        boolean stateLenght = false;
	        boolean check = false;
	        
	        System.out.println("Bem vindo ao programa!");
	                
	        do { 
	            Scanner sc = new Scanner(System.in);
	            System.out.print("\nDigite a senha escolhida: ");

	            String password = sc.nextLine();
	            int size = 6 - password.length();
	            
	            if (password.length() < 6) {
	                System.out.println("A senha deve possuir no mínimo 6 dígitos, falta(m): " + size);
	            }else {
	            stateLenght = true;
	            }
	            if(!password.chars().anyMatch(Character::isUpperCase)) {
	                System.out.println("Acrescente uma letra maiúscula;");
	            }else {
	                stateUpper = true;
	            }
	            if (!password.chars().anyMatch(Character::isLowerCase)) {
	                System.out.println("Acrescente uma letra minúscula;");
	            }else {
	            stateLower = true;
	            }
	            if (!password.chars().anyMatch(Character::isDigit)) {
	                System.out.println("Acrescente um número;");
	            }else {
	            stateNumber = true;
	            }
	            Pattern pattern = Pattern.compile("[!@#$%^&*()-+]");
	            Matcher matcher = pattern.matcher(password);
	            boolean containSpecial = matcher.find();
	            if (!containSpecial) {
	                System.out.println("Acrescente um caractere especial.");
	            }else {
	            stateSpecial = true;
	            } 
	        
	            if (stateUpper && stateLower && stateNumber && stateSpecial && stateLenght == true) {
	                check = true;
	                sc.close();
	            } 
	        }while (!check);
	        	System.out.println("\nParabéns! Sua senha é forte!\n\nPrograma encerrado!");
	   }
	}
