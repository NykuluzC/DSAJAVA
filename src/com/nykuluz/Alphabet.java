package com.nykuluz;

public class Alphabet {
    public static void main(String[] args) {
    for(int i = 0; i < 26; i++){
        System.out.print(
                (char)('a' + ((i+('k' - 'a'))%26)));
    }
    }
}
