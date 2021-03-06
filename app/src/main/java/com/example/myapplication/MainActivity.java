package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String str = "({})[]";
        ParenthesesChecker (str);


        strCopies("catcowcat", "cat", 2);
        strCopies("catcowcat", "cow", 2);
        strCopies("catcowcat", "cow", 1);
        strCopies("catcowcatcatcowcatcatcowcat", "cat", 1);


    }

    public static void ParenthesesChecker(String str){

        //Declare a stack
        Stackchar st = new Stackchar(str.length());

        //Traverse a string
        for(int i = 0; i < str.length(); i++) {

           /* If the current character is starting bracket,
              then push them in a stack
            */
            if(str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '(') {
                st.push(str.charAt(i));

           /*
              Else, If the stack is not empty,
              And current character is a closing bracket
              and top character of a stack is matching open bracket
              then pop it.
            */
            } else if ( !st.IsEmpty() && ((str.charAt(i) == ']' && st.top() == '[') ||
                    (str.charAt(i) == '}' && st.top() == '{') ||
                    (str.charAt(i) == ')' && st.top() == '('))) {

                st.pop();

            } else {
                st.push(str.charAt(i));
            }
        }

        if(st.IsEmpty()) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not balanced");
        }
    }

    private static void strCopies(String st, String sub, int num) {
        boolean found = false;
        int numcheck = 0;
        for (int i = 0; i<st.length()- sub.length()+1;i++) {
            String temp = st.substring(i, i+sub.length());
            //System.out.println(temp);
            if(temp.equals(sub)) numcheck++;

        }
        if(numcheck == num) {
            found = true;
            System.out.println(found);
        }
        else System.out.println(found);


    }

}
