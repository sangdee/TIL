package temp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practice1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("/Users/sangji/Downloads/test.txt"));
        //이름, 취미, 소개
        List<List<String>> list = new ArrayList<>();
        reader.lines().forEach(e -> {
            String[] split = e.split(",");
            List<String> innerList = new ArrayList<>();
            for (String s : split) {
                innerList.add(s.trim());
            }
            list.add(innerList);
        });
        list.remove(0);
        reader.close();

        //        printHobbyCount(list);
        //        printHobbyCountByJeong(list);
        printLikeCountByPerson(list);
    }

    private static void printHobbyCount(List<List<String>> list) {
        Map<String, Integer> hobbyCountMap = new HashMap<>();
        for (List<String> personInfos : list) {
            String s = personInfos.get(1);
            String[] hobbies = s.split(":");
            for (String hobby : hobbies) {
                hobbyCountMap.put(hobby, hobbyCountMap.getOrDefault(hobby, 0) + 1);
            }
        }
        hobbyCountMap.forEach((key, value) -> System.out.println(key + " " + value));
    }

    private static void printHobbyCountByJeong(List<List<String>> list) {
        Map<String, Integer> hobbyCountMap = new HashMap<>();
        for (List<String> personInfos : list) {
            if (personInfos.get(0).startsWith("정")) {
                String s = personInfos.get(1);
                String[] hobbies = s.split(":");
                for (String hobby : hobbies) {
                    hobbyCountMap.put(hobby, hobbyCountMap.getOrDefault(hobby, 0) + 1);
                }
            }
        }
        hobbyCountMap.forEach((key, value) -> System.out.println(key + " " + value));
    }

    private static void printLikeCountByPerson(List<List<String>> list) {
        Map<String, Integer> likeCountMap = new HashMap<>();
        for (List<String> personInfos : list) {
            String name = personInfos.get(0);
            String infomation = personInfos.get(2);
            String replaceInfomation = infomation.replaceAll("좋아", "");
            likeCountMap.put(name, (infomation.length() - replaceInfomation.length()) / 2);
        }
        likeCountMap.forEach((key, value) -> System.out.println(key + " " + value));
    }
}
