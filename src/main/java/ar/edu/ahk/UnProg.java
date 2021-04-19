package ar.edu.ahk;

public class UnProg {

    public int hacerAlgo(int unNum){
        return unNum * 2;
    }

    public static void main(String[] args){
        UnProg up = new UnProg();
        System.out.print("xxxxxxxxxxxxxxxxxxxxxxxxxxx\n");
        System.out.print(up.hacerAlgo(Integer.parseInt(args[0])));
        System.out.print("\nxxxxxxxxxxxxxxxxxxxxxxxxxxx\n");
    }

}
