import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {
    public static List<Integer> getQueryAnswers(List<List<String>> cacheEntries, List<List<String>> queries) {
        Map<String, Integer> cache = new HashMap<>();
        for (List<String> entry : cacheEntries){
            String timestamp = entry.get(0);
            String modelId = entry.get(1);
            int prediction = Integer.parseInt(entry.get(2));

            String key = modelId + "|" + timestamp;
            cache.put(key, prediction);
        }

        List<Integer> answers = new ArrayList<>();
        for(List<String> q : queries){
            String modelId = q.get(0);
            String timestamp = q.get(1);

            String key = modelId + "|" + timestamp;
            answers.add(cache.get(key));
        }

        return answers;

    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int cacheEntriesRows = Integer.parseInt(bufferedReader.readLine().trim());
        int cacheEntriesColumns = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<String>> cacheEntries = new ArrayList<>();

        IntStream.range(0, cacheEntriesRows).forEach(i -> {
            try {
                cacheEntries.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int queriesRows = Integer.parseInt(bufferedReader.readLine().trim());
        int queriesColumns = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<String>> queries = new ArrayList<>();

        IntStream.range(0, queriesRows).forEach(i -> {
            try {
                queries.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> result = Result.getQueryAnswers(cacheEntries, queries);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
