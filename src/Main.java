import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        //FBABD
        String[] strs = {"SI JAVA JAVASCRIPT SQL PYTHON C#", "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++", "HARDWARE C C++ PYTHON JAVA JAVASCRIPT", "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP", "GAME C++ C# JAVASCRIPT C JAVA"};
        String[] strs1 = {"PYTHON", "C++", "SQL"};
        int[] ints = {7,5,5};
        System.out.println(solution(strs,strs1,ints));

    }
    public static String solution(String[] table, String[] languages, int[] preference) {
        String answer = "";
        for (int i=0; i<table.length; i++) {
            List<String> arrayList = Arrays.stream(table[i].split(" ")).toList();
₩₩        Collections.reverse(arrayList);
            HashMap<String,Integer> hashMap = new HashMap<>();
            for (int j =0; j<arrayList.size(); j++)  {
                hashMap.put(langStrs[0],0);
                for (int k=0; k<langStrs.length; k++) {
                    if(languages[k].equals(arrayList.get(j))) {
                        hashMap.put(langStrs[0],hashMap.getOrDefault(langStrs[0],0) + preference[k]);
                    }
                }
            }
            for (Map.Entry<String,Integer> entry : hashMap.entrySet() ){
                System.out.println(entry.getKey() + " v " + entry.getValue());
            }

//            for (int j = 1; j< langStrs.length; j++) {
//                for (int k =0; k<preference.length; k++) {
//                    if(langStrs[i].equals(languages[k])){
//                        hashMap.put(langStrs[0],hashMap.getOrDefault(langStrs[0],0) + preference[k]);
//                    }
//                }
//
//            }

        }
        return answer;
    }
}