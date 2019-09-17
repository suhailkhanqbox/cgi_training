package com.stackroute;


import java.util.*;

public class removeVowel {
    public List<String> remove(List<String> s){

        List<String> ans = new ArrayList<>();
        ListIterator<String> iterator = s.listIterator();
        while (iterator.hasNext()) {

            String p= iterator.next();
            String w="";
            char []c=p.toCharArray();
            StringBuilder sb = new StringBuilder();
            for( char q: c)
            {
                switch(q) {
                    case 'a':
                    case 'e':
                    case 'u':
                    case 'i':
                    case 'o':
                        continue;
                }
                sb.append(q);
            }

            w = sb.toString();
            System.out.println(w);
            ans.add(w);

        }


        return ans;

    }
}
