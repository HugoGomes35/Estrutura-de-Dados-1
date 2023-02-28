import java.util.Locale;
import java.util.Scanner;
import java.math.*;

class Main{
private static Scanner cin = new Scanner(System.in);


public static void main(final String[] args) {
    cin.useLocale(Locale.US);

  
  //-----------------Questão 16-----------------//

  //System.out.println("Digite um numero incial: ");
  //float num_inicial = cin.nextFloat();

 // System.out.println("Digite um numero final: ");
  //float num_final = cin.nextFloat();

  // a) ---

  //while(num_inicial <= num_final){
     // System.out.println(++num_inicial - 1);
  //}

  // b) ---
  
  //do{
   // System.out.println(num_inicial);
    //++num_inicial;
 // }while(num_inicial <= num_final);

  // c) ---
  //for( int i = 1; num_inicial <= num_final; ++num_inicial){
      //System.out.println(num_inicial * i);
  //}

  //-----------------Questão 17-----------------//
  //System.out.println("Digite o numero inicial: ");
  //int num_inicial = cin.nextInt();
  
  //System.out.println("Digite o numero final: ");
  //int num_final = cin.nextInt();
  
  // a) -- 
  //while(num_inicial <= num_final){
   // if(num_inicial % 2 == 1){
      //System.out.println(++num_inicial);
    //}
  //}

  //-----------------Questão 18-----------------//
  //System.out.println("Digite uma senha: ");
  //float senha = cin.nextFloat();
  
  // a) -- 
  //while (senha == 123) {
    //if(senha == 123){
      //System.out.println("Senha correta.");
      
    //} else {
      //System.out.println("Senha incorreta.");
    //} break;
//}
  //b) -- 
   
 // do {
     // break;
//} while (senha == 123);
      //if (senha == 123) {
      //System.out.println("Senha correta.");
//} else {
      //System.out.println("Senha incorreta.");
//} 

//-----------------Questão 19-----------------//
  //System.out.println("Digite o numero:");
  //int num = cin.nextInt();

  //for(int contador; num <= 10; ++contador){
      //System.out.println(num + "+" + contador + "=" + (num * contador));
  //}

  //-----------------Questão 20-----------------//
  // Feito em sala - Hugo Gomes
  //-----------------Questão 21-----------------//
  // Feito em sala - Levino.
  
  //-----------------Questão 22-----------------//
  //System.out.println("Digite um numero inicial: ");
		  //int num1 = cin.nextInt();

		 // System.out.println("Digite um numero final: ");
		  //int num2 = cin.nextInt();

		 // int total;
		  
		 // for(int i = 0; num1 < num2; ++i){
			//total = num1 + num2;
		    //System.out.println(total);
		   // num1 = num1 + i;
		 // }
  
  //-----------------Questão 24-----------------//
  //System.out.println("Digite um numero 1 para potencia: ");
		//System.out.println("Digite um numero 2 para raiz quadrada: ");
		//System.out.println("Digite um numero 3 para fatorial: ");
		//System.out.println("Digite um numero 0 para sair: ");
		  //int num_menu = cin.nextInt();
		  
		  //do {
				
			  	//System.out.println("Digite um numero 1 para potencia: ");
				//System.out.println("Digite um numero 2 para raiz quadrada: ");
				//System.out.println("Digite um numero 3 para fatorial: ");
				//System.out.println("Digite um numero 0 para sair: ");
				//int num_menu2 = cin.nextInt();

			  //switch(num_menu2){
			  
			  //case 1:
				  //System.out.println("Digite o numero: ");
				  //float num1 = cin.nextFloat();
				  
				 // System.out.println("Digite a potencia: ");
				 // float potencia = cin.nextFloat();
				  
				 // System.out.println("Resultado: " + Math.pow(num1, potencia));
				  
				 // break;
				  
			 // case 2:
				  //System.out.println("Digite o valor que deseja a raiz quadrada do mesmo: ");
				  //float num2 = cin.nextFloat();
				  
				 // System.out.println("Resultado: " + Math.sqrt(num2));
				  //break;
			  //}
			  
			  
		  //} while(num_menu == 0);
		  
		  //System.out.println("Você saiu do MENU. ");
  }
}