package io.coolgc;

import java.util.*;
import java.util.concurrent.SynchronousQueue;
import java.util.stream.Stream;

public class BalancedString {
    static Map<String,String> symbols;

    static {
        symbols = new HashMap<>();
        symbols.put("]","[");
        symbols.put("}","{");
        symbols.put(")","(");
    }

    public boolean isBalanced(String expression){
        Queue<String> e = new ArrayDeque<>();
        char[] expSymbols = expression.toCharArray();

        for (char expSymbol : expSymbols) {
            e.add(String.valueOf(expSymbol));
        }

        Queue<String> q = new ArrayDeque<>(e);

        if(expression.length() % 2 == 0){
            for (String next : q) {
                if (e.remove(symbols.get(next)))
                    e.remove(next);
            }
            return (e.isEmpty());
        }
        return false;
    }

   /* public static void main(String[] args) {
    var r = new BalancedString();
        System.out.println(r.isBalanced("{[]()[()]}"));
        System.out.println(r.isBalanced("{{{]]]"));


    }*/
}
