package com.example.myapplication;

public class Stackchar {

    int top =-1;
    char [] Myarray;

    //Constructor
    public Stackchar (int size){
        Myarray = new char[size];
    }
    //push onto the stack
    public void push (char a)
    {
        top++;
        if (top == Myarray.length)
            resize();
        Myarray[top]= a;
    }

    //pop the stack
    public char pop()
    {
        char c = Myarray[top];
        top--;
        return c;
    }

    //Find what is on top of the stack
    public  char top ()
    {
        return Myarray[top];
    }

    //check if the stack is empty
    public boolean IsEmpty ()
    {
        return top == -1;
    }
    //change size to accommodate
    private void resize(){
        char [] ArrayResize = new char[top*2];
        for (int i = 0; i < top; i++)
            ArrayResize [i] = Myarray[i];
        Myarray = ArrayResize;

    }

}
