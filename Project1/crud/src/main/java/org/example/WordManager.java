package org.example;

import java.util.Scanner;

public class WordManager {
    Scanner s = new Scanner(System.in);
    WordCRUD wordCRUD;
    public WordManager() {
         wordCRUD = new WordCRUD(s);
    }

    public void start(){
       while(true){
           int menu = selectMenu();
           if(menu == 0)
               break;
          else if(menu == 4){
              wordCRUD.addWord();
           }
           else if(menu == 1){}
       }
    }
    public int selectMenu(){
        System.out.println(" **** Word Master *** \n"+
                "-------------------\n"+
                "1. 모든 단어 보기\n"+
                "2. 수준별 단어 보기\n"+
                "3. 단어 검색\n"+
                "4. 단어 추가\n"+
                "5. 단어 수정\n"+
                "6. 단어 삭제\n"+
                "7. 파일 저장\n"+
                "0. 나가기\n"+
                "-------------------\n"+
                "=> 원하는 메뉴?");

        return s.nextInt();

    }
}