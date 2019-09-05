import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pareto {
    public static void main(String[] args) throws IOException {
        String row;
        List<String> articles = new ArrayList<String>();
        List<Integer> sums = new ArrayList<Integer>();
        List<String> starArticles = new ArrayList<String>();
        String[] data;
        String clean;


        try (BufferedReader csvReader = new BufferedReader(new FileReader("export.csv"))) {
            row = csvReader.readLine();
            data = row.split(",");
            clean = data[0];
            articles.add(data[1]);
            sums.add(Integer.parseInt(data[2]));

            while ((row = csvReader.readLine()) != null) {
                data = row.split(",");
                if (data[0].compareTo(clean) != 0) {
                    int sum = sums.stream().mapToInt(Integer::intValue).sum();
                    int accumulatedSum = 0;
                    for (int i = 0; i < articles.size(); i++) {
                        starArticles.add(articles.get(i));
                        accumulatedSum += sums.get(i);
                        if (accumulatedSum >= sum * 0.8) break;
                    }

                    clean = data[0];
                    articles.clear();
                    sums.clear();

                }

                articles.add(data[1]);
                sums.add(Integer.parseInt(data[2]));

                // do something with the data
            }

            int sum = sums.stream().mapToInt(Integer::intValue).sum();
            int accumulatedSum = 0;
            for (int i = 0; i < articles.size(); i++) {
                starArticles.add(articles.get(i));
                accumulatedSum += sums.get(i);
                if (accumulatedSum >= sum * 0.8) break;
            }
            for (var a : starArticles) {
                System.out.println(a);
            }
        }
    }


}
