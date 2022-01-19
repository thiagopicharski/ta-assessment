package teste;
import java.util.Scanner;
import java.text.StringCharacterIterator;
import java.text.CharacterIterator;

public class Teste {
    public static void main(String[] args) {
        int letras[][];
        int ascii;
        ascii = 97;
        letras =  new int[8][4];
        for(int num = 0; num < 8; num++){
            for(int press = 0; press < 4; press++){
                if((num == 5 && press==3) || (num==7 && press==3)){     //excessão para as linhas com mais letras
                    letras[num][press] = ascii;     //setando a matriz com os valores das letras em ascii
                    ascii++; 
		}
		else if(press==3){
                    letras[num][press] = 0;
                    //break;
		}
                else{
                    letras[num][press] = ascii++;
                }
            }
        }
        Scanner leitor = new Scanner(System.in);
        String P = leitor.next();    //leitura da palavra inserida pelo usuario
        CharacterIterator it = new StringCharacterIterator(P);
        if(P.length()<50){    //verificação do máximo de caracteres
            int number;
            char aux;
            while (it.current() != CharacterIterator.DONE){    //iteração pela palavra inserida pelo usuário      
                for(int num = 0; num < 8; num++){
                    for(int press = 0; press < 4; press++){
                        aux = it.current();    //guardando a letra a ser achada na matriz letra
                        number = (int )aux;    //transformação dela em ascii
                        if(number == letras[num][press]){
                            System.out.println("#"+(num+2)+"="+(press+1));
                        }
                    }
                }
                it.next();    //próxima letra da palavra
            }
        }
        else{System.out.print("Excesso de caracteres.");}    
    }
}