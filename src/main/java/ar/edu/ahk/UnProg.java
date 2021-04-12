package ar.edu.ahk;

public class UnProg {

    public int hacerAlgo(int unNum){
        return unNum * 2;
    }

    public static void main(String[] args){
        UnProg up = new UnProg();
        System.out.print(up.hacerAlgo(15));
    }

}
