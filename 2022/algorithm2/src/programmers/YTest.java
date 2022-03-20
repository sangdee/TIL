package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/03/19
 */
public class YTest {
    public static int solution(int[][] matrix) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int[][] temp = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                temp[i][j] = matrix[i][j];
            }
        }

        for (int i = 0; i < temp.length; i++) {
            Arrays.sort(temp[i]);
            int center = temp[i][temp[i].length / 2];
            map.put(center, 1);
        }

        for (int i = 0; i < matrix[0].length; i++) {
            int[] columnArr = new int[matrix.length];
            for (int j = 0; j < matrix.length; j++) {
                columnArr[j] = matrix[j][i];
            }
            Arrays.sort(columnArr);
            int center = columnArr[columnArr.length / 2];
            map.put(center, map.getOrDefault(center, 0) + 1);
        }
        for (Integer value : map.values()) {
            if (value == 2) {
                answer++;
            }
        }
        return answer;
    }

    public static int[] solution2(int[][] numbers) {
        int[] answer = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            Arrays.sort(numbers[i]);
            int standard = numbers[i][0] + numbers[i][7] + numbers[i][5];
            if (standard == numbers[i][8] + numbers[i][3] + numbers[i][1]
                && standard == numbers[i][4] + numbers[i][2] + numbers[i][6]
                && standard == numbers[i][0] + numbers[i][8] + numbers[i][4]
                && standard == numbers[i][7] + numbers[i][3] + numbers[i][2]
                && standard == numbers[i][5] + numbers[i][1] + numbers[i][6]) {
                answer[i] = 1;
            }
        }
        return answer;
    }

    public String[] solution(String[] companies, String[] applicants) {
        String[] answer = new String[companies.length];
        List<Company> companyList = new ArrayList<>();
        List<Applicant> applicantList = new CopyOnWriteArrayList<>();
        for (String s : companies) {
            String[] split = s.split(" ");
            companyList.add(new Company(split[0], split[1], Integer.parseInt(split[2])));
        }
        for (String s : applicants) {
            String[] split = s.split(" ");
            applicantList.add(new Applicant(split[0], split[1], Integer.parseInt(split[2])));
        }

        insertApp(companyList, applicantList);

        List<Applicant> remainAppl = new CopyOnWriteArrayList<>();
        check(companyList, remainAppl);

        while (!remainAppl.isEmpty()) {
            remainApp(remainAppl);
            insertApp(companyList, remainAppl);
            check(companyList, remainAppl);
        }
        companyList.sort((c1, c2) -> c1.name.compareTo(c2.name));
        for (int i = 0; i < companyList.size(); i++) {
            Company company = companyList.get(i);
            String form = company.getName() + "_";

            StringBuilder applcations = new StringBuilder();
            for (Applicant applicant : company.getApplicants()) {
               applcations.append(applicant.name);
            }
            char[] chars = applcations.toString().toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            form += sorted;
            answer[i] = form;
        }

        return answer;
    }

    private void remainApp(List<Applicant> remainAppl) {
        for (Applicant applicant : remainAppl) {
            applicant.setLimit(applicant.getLimit() - 1);
            if (applicant.getPrefer().length() > 0)
                applicant.setPrefer(applicant.getPrefer().substring(1));
            if (applicant.getLimit() == 0) {
                remainAppl.remove(applicant);
            }
        }
    }

    private void check(List<Company> companyList, List<Applicant> remainAppl) {
        for (Company company : companyList) {
            String prefer = company.getPrefer();
            int length = prefer.length() - 1;

            while (company.getApplicants().size() > company.limit) {
                int finalLength = length;
                Optional<Applicant> first = company.getApplicants()
                    .stream()
                    .filter(a -> a.name.equals(String.valueOf(prefer.charAt(finalLength))))
                    .findFirst();
                first.ifPresent(applicant -> {
                    company.getApplicants().remove(applicant);
                    remainAppl.add(applicant);
                });
                if (length > 0)
                    length--;
            }
        }
    }

    private void insertApp(List<Company> companyList, List<Applicant> applicantList) {
        for (Company company : companyList) {
            for (Applicant applicant : applicantList) {
                if (applicant.getPrefer().length() > 0) {
                    String s = String.valueOf(applicant.getPrefer().charAt(0));
                    if (company.getName().equals(s)) {
                        company.getApplicants().add(applicant);
                        applicantList.remove(applicant);
                    }
                }
            }
        }
    }

    class Company {
        private String name;
        private String prefer;
        private Integer limit;
        private List<Applicant> applicants = new ArrayList<>();

        public Company(String name, String prefer, Integer limit) {
            this.name = name;
            this.prefer = prefer;
            this.limit = limit;
        }

        public List<Applicant> getApplicants() {
            return applicants;
        }

        public void setApplicants(List<Applicant> applicants) {
            this.applicants = applicants;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPrefer() {
            return prefer;
        }

        public void setPrefer(String prefer) {
            this.prefer = prefer;
        }

        public Integer getLimit() {
            return limit;
        }

        public void setLimit(Integer limit) {
            this.limit = limit;
        }
    }

    class Applicant {
        private String name;
        private String prefer;
        private Integer limit;

        public Applicant(String name, String prefer, Integer limit) {
            this.name = name;
            this.prefer = prefer;
            this.limit = limit;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPrefer() {
            return prefer;
        }

        public void setPrefer(String prefer) {
            this.prefer = prefer;
        }

        public Integer getLimit() {
            return limit;
        }

        public void setLimit(Integer limit) {
            this.limit = limit;
        }
    }

    public static void main(String[] args) {
        YTest yTest = new YTest();
        yTest.solution(new String[] {"A fabdec 2", "B cebdfa 2", "C ecfadb 2"},
            new String[] {"a BAC 1", "b BAC 3", "c BCA 2", "d ABC 3", "e BCA 3", "f ABC 2"});
    }
}
