import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;
import java.util.stream.Stream;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String[] stringArray = input.split(";");
        int x = 0;
        int y = 0;
        for(int i = 0; i < stringArray.length - 1; i++){
            if(stringArray[i].charAt(0) == 'A'){
                if (stringArray[i].substring(1, stringArray[i].length()).matches("-?[0-9]+(\\.[0-9]+)?")){
                    x += Integer.valueOf(stringArray[i].substring(1, stringArray[i].length()));
                }
            }
            if(stringArray[i].charAt(0) == 'D'){
                if (stringArray[i].substring(1, stringArray[i].length()).matches("-?[0-9]+(\\.[0-9]+)?")){
                    x -= Integer.valueOf(stringArray[i].substring(1, stringArray[i].length()));
                }
            }
            if(stringArray[i].charAt(0) == 'W'){
                if (stringArray[i].substring(1, stringArray[i].length()).matches("-?[0-9]+(\\.[0-9]+)?")){
                    y += Integer.valueOf(stringArray[i].substring(1, stringArray[i].length()));
                }
            }
            if(stringArray[i].charAt(0) == 'S'){
                if (stringArray[i].substring(1, stringArray[i].length()).matches("-?[0-9]+(\\.[0-9]+)?")){
                    y -= Integer.valueOf(stringArray[i].substring(1, stringArray[i].length()));
                }
            }
        }

        System.out.print(x + "," + y);
    }
}