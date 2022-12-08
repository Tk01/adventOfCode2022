package day8;



import day7.Node;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) throws IOException {

        List<List<Tree>> input = Day8InputParser.getInput();

        checkDirection1(input);
        checkDirection2(input);
        checkDirection3(input);
        checkDirection4(input);

        enrichWithScenicValue(input);

        System.out.println(input.stream().flatMap(List::stream).filter(Tree::getVisible).count());
        System.out.println(input.stream().flatMap(List::stream).map(Tree::getScenicValue).mapToInt(Integer::intValue).max().getAsInt());


    }

    private static void enrichWithScenicValue(List<List<Tree>> input) {
        for(int i=0; i<input.size();i++){
            for(int j=0; j<input.get(i).size();j++){
                input.get(i).get(j).setScenicValue(calculateScenicValue(input,i,j));
            }
        }
    }

    private static int calculateScenicValue(List<List<Tree>> input, int iInitial, int jInitial) {

        int scenicValue;
        int j;
        for(j=jInitial+1; j<input.get(iInitial).size();j++) {
            if (input.get(iInitial).get(jInitial).getHeight() <= input.get(iInitial).get(j).getHeight()) {
                break;
            }
        }
        scenicValue = Math.min(j,input.get(iInitial).size()-1)-jInitial;

        for(j=jInitial-1; j>=0;j--) {
            if (input.get(iInitial).get(jInitial).getHeight() <= input.get(iInitial).get(j).getHeight()) {
                break;
            }
        }
        scenicValue *= jInitial-Math.max(j,0);
        int i;
        for(i=iInitial+1; i<input.size();i++) {
            if (input.get(iInitial).get(jInitial).getHeight() <= input.get(i).get(jInitial).getHeight()) {
                break;
            }
        }
        scenicValue *=  Math.min(i,input.size()-1)-iInitial;
        for(i=iInitial-1; i>=0;i--) {
            if (input.get(iInitial).get(jInitial).getHeight() <= input.get(i).get(jInitial).getHeight()) {
                break;
            }
        }
        scenicValue *=  iInitial-Math.max(i,0);
        return scenicValue;
    }

    private static void checkDirection1(List<List<Tree>> input) {
        for(int i=0; i<input.size();i++){
            int max =-1;
            for(int j=0; j<input.get(i).size() && max!=9;j++){
                if(max<input.get(i).get(j).getHeight()){
                    input.get(i).get(j).setVisible(true);
                    max=input.get(i).get(j).getHeight();
                }
            }
        }
    }

    private static void checkDirection2(List<List<Tree>> input) {
        for(int i=0; i<input.size();i++){
            int max =-1;
            for(int j=input.get(i).size()-1; j>=0 && max!=9;j--){
                if(max<input.get(i).get(j).getHeight()){
                    input.get(i).get(j).setVisible(true);
                    max=input.get(i).get(j).getHeight();
                }
            }
        }
    }

    private static void checkDirection3(List<List<Tree>> input) {
            for(int j=0; j<input.get(0).size() ;j++){
                int max =-1;
                for(int i=0; i<input.size() && max!=9;i++){
                    if(max<input.get(i).get(j).getHeight()){
                    input.get(i).get(j).setVisible(true);
                    max=input.get(i).get(j).getHeight();
                }
            }
        }
    }

    private static void checkDirection4(List<List<Tree>> input) {
        for(int j=0; j<input.get(0).size() ;j++){
            int max =-1;
            for(int i=input.size()-1; i>=0 && max!=9;i--){
                if(max<input.get(i).get(j).getHeight()){
                    input.get(i).get(j).setVisible(true);
                    max=input.get(i).get(j).getHeight();
                }
            }
        }
    }
}
