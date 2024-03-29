import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Pareto {
    public static void main(String[] args) throws IOException {
        String row;
        List<String> articles = new ArrayList<String>();
        List<Integer> sums = new ArrayList<Integer>();
        List<String> starArticles = new ArrayList<String>();
        String[] data;
        String clean;

        if (args.length != 1){
            System.out.println("Please provide file name!");
            return;
        }


        try (BufferedReader csvReader = new BufferedReader(new FileReader(args [0]))) {
            row = csvReader.readLine();
            data = row.split(",");
            clean = data[0];
            articles.add(data[1]);
            sums.add(Integer.parseInt(data[2]));

            while ((row = csvReader.readLine()) != null) {
                data = row.split(",");
                if (data[0].compareTo(clean) != 0) {
                    starArticles.addAll(getStarArticles(articles, sums));
                    clean = data[0];
                    articles.clear();
                    sums.clear();
                }

                articles.add(data[1]);
                sums.add(Integer.parseInt(data[2]));

            }

            starArticles.addAll(getStarArticles(articles, sums));
            Set<String> uniqueStars = new HashSet<String>(starArticles);

            for (var a : uniqueStars) {
                System.out.println(a);
            }

            System.out.println("Total count: " + uniqueStars.size());
        }
    }


    private static List<String> getStarArticles (List<String> articles, List<Integer> sums)  {
        int sum = sums.stream().mapToInt(Integer::intValue).sum();
        int accumulatedSum = 0;
        List<String> starArticles = new ArrayList<String>();
        for (int i = 0; i < articles.size(); i++) {
            starArticles.add(articles.get(i));
            accumulatedSum += sums.get(i);
            if (accumulatedSum >= sum * 0.8) break;
        }
        return starArticles;
    }


}
