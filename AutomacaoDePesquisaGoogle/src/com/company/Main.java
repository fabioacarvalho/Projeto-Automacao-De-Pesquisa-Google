package com.company;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Scanner;


public class Main {

    public Main(){
        super();
    }

    /**
     * Nesta estapa ele faz um switch para as letras digitadas e retorna o código (KeyEvent) dela:
     * @Autor:FabioCarvalho
     */

    public int returnIndex(char toIndex, char... args) {
        for (int i=0; i < args.length; i++) {
            if (toIndex == (args[i]) )
                return i;
        }
        return -1;
    }



    public int getKeyEvt(char caracter){
        int keyInput = -1;

        switch (returnIndex(caracter,
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
                'i', 'j', 'l', 'm', 'n', 'o', 'p', 'q',
                'r', 's', 't', 'u', 'v', 'x', 'z', ' ')) {
            case 0 :
                keyInput = KeyEvent.VK_A;
                break;
            case 1 :
                keyInput = KeyEvent.VK_B;
                break;
            case 2 :
                keyInput = KeyEvent.VK_C;
                break;
            case 3 :
                keyInput = KeyEvent.VK_D;
                break;
            case 4 :
                keyInput = KeyEvent.VK_E;
                break;
            case 5 :
                keyInput = KeyEvent.VK_F;
                break;
            case 6 :
                keyInput = KeyEvent.VK_G;
                break;
            case 7 :
                keyInput = KeyEvent.VK_H;
                break;
            case 8 :
                keyInput = KeyEvent.VK_I;
                break;
            case 9 :
                keyInput = KeyEvent.VK_J;
                break;
            case 10 :
                keyInput = KeyEvent.VK_L;
                break;
            case 11 :
                keyInput = KeyEvent.VK_M;
                break;
            case 12 :
                keyInput = KeyEvent.VK_N;
                break;
            case 13 :
                keyInput = KeyEvent.VK_O;
                break;
            case 14 :
                keyInput = KeyEvent.VK_P;
                break;
            case 15 :
                keyInput = KeyEvent.VK_Q;
                break;
            case 16 :
                keyInput = KeyEvent.VK_R;
                break;
            case 17 :
                keyInput = KeyEvent.VK_S;
                break;
            case 18 :
                keyInput = KeyEvent.VK_T;
                break;
            case 19 :
                keyInput = KeyEvent.VK_U;
                break;
            case 20 :
                keyInput = KeyEvent.VK_V;
                break;
            case 21 :
                keyInput = KeyEvent.VK_X;
                break;
            case 22 :
                keyInput = KeyEvent.VK_Z;
                break;
            case 23:
                keyInput = KeyEvent.VK_SPACE;
                break;
            default :
                keyInput = KeyEvent.VK_ENTER;
        }
        return keyInput;
    }


    public static void main(String[] args) throws AWTException, IOException {

        Robot robo = new Robot();

        Scanner leitor = new Scanner(System.in);


        /**
         * Você digita o que deseja pesquisar e ele
         * entra no google e pesquisa a informação adicionada:
         */

        int keyEvt;

        String msg = leitor.nextLine();

        Main teste = new Main();

        //Caso queira digitir em um arquivo txt ele vai abrir e digitar no notepad:
        //Runtime.getRuntime().exec("notepad.exe");


        /**
         * Nesta etapa ele vai movimentar o mouse e fazer o clicks necessário:
         */
        robo.mouseMove(618, 745);

        robo.delay(2000);

        robo.mousePress(KeyEvent.BUTTON1_DOWN_MASK);
        robo.mouseRelease(KeyEvent.BUTTON1_DOWN_MASK);

        robo.delay(2000);

        robo.mouseMove(519, 414);

        robo.delay(2000);

        robo.mousePress(KeyEvent.BUTTON1_DOWN_MASK);
        robo.mouseRelease(KeyEvent.BUTTON1_DOWN_MASK);

        robo.delay(2000);

        robo.mouseMove(537, 51);

        robo.delay(1000);

        robo.mousePress(KeyEvent.BUTTON1_DOWN_MASK);
        robo.mouseRelease(KeyEvent.BUTTON1_DOWN_MASK);

        robo.delay(2000);

        /**
         * Agora ele vai pegar tudo o que você digitou e escrever na barra do navegador
         * e pressionar enter:
         */

        for(int i = 0; i < msg.length(); i++){

            keyEvt = teste.getKeyEvt(msg.charAt(i));

            robo.keyPress(keyEvt);
            robo.keyRelease(keyEvt);
            robo.delay(200);
        }

        robo.keyPress(KeyEvent.VK_ENTER);

        /**
         * Após isso na etapa final ele entra no icone de noticias do google:
         */

        robo.delay(1000);

        robo.mouseMove(389, 181);

        robo.delay(500);

        robo.mousePress(KeyEvent.BUTTON1_DOWN_MASK);
        robo.mouseRelease(KeyEvent.BUTTON1_DOWN_MASK);


    }
}
