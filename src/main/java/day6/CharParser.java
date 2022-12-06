package day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CharParser {
    private Reader reader;

    public CharParser(Reader reader) {
        this.reader = reader;
    }

    public int findMarker(int length) throws IOException {
        int result = 0;
        List<Character> buffer = new ArrayList<>();
        int readerInput;
        while ((readerInput=reader.read())!=-1){
            char c = (char) readerInput;
            result++;
            buffer.add(c);
            if(buffer.size() == length){
                boolean duplicatesInBuffer = false;
                for(int i = length-1; i >=1 && !duplicatesInBuffer;i--){
                    for(int j = i-1; j>=0 && !duplicatesInBuffer;j--){
                        if(buffer.get(i) == buffer.get(j)){
                            duplicatesInBuffer = true;
                            removeDuplicateAndCharactersBefore(buffer, j);
                        }
                    }
                }
                if(!duplicatesInBuffer){
                    return result;
                }
            }
        }
        return -1;
    }

    private void removeDuplicateAndCharactersBefore(List<Character> buffer, int j) {
        for (int k=0; k<=j;k++){
            buffer.remove(0);
        }
    }

}
