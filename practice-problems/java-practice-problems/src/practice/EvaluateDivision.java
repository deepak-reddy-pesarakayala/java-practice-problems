package practice;
import java.util.*;
public class EvaluateDivision {
    public double[] calcEquation(
            List<List<String>> equations,
            double[] values,
            List<List<String>> queries) {
        Map<String, Map<String, Double>> graph = new HashMap<>();
        for (int i = 0; i < equations.size(); i++) {
            String a = equations.get(i).get(0);
            String b = equations.get(i).get(1);
            graph.putIfAbsent(a, new HashMap<>());
            graph.putIfAbsent(b, new HashMap<>());
            graph.get(a).put(b, values[i]);
            graph.get(b).put(a, 1 / values[i]);
        }
        double[] answer = new double[queries.size()];
        for (int i = 0; i < queries.size(); i++) {
            String start = queries.get(i).get(0);
            String end = queries.get(i).get(1);
            answer[i] = dfs(start, end, graph, new HashSet<>());
        }
        return answer;
    }
    static double dfs(
            String start,
            String end,
            Map<String, Map<String, Double>> graph,
            Set<String> visited) {
        if (!graph.containsKey(start) ||
                !graph.containsKey(end)) {
            return -1.0;
        }
        if (start.equals(end)) {
            return 1.0;
        }
        visited.add(start);
        for (String next : graph.get(start).keySet()) {
            if (!visited.contains(next)) {
                double result = dfs(next, end, graph, visited);
                if (result != -1.0) {
                    return graph.get(start).get(next) * result;
                }
            }
        }
        return -1.0;
    }
    public static void main(String[] args) {
        EvaluateDivision obj = new EvaluateDivision();
        List<List<String>> equations = Arrays.asList(
                Arrays.asList("a", "b"),
                Arrays.asList("b", "c")
        );
        double[] values = {2.0, 3.0};
        List<List<String>> queries = Arrays.asList(
                Arrays.asList("a", "c"),
                Arrays.asList("b", "a"),
                Arrays.asList("a", "e"),
                Arrays.asList("a", "a")
        );
        System.out.println(
                Arrays.toString(
                        obj.calcEquation(
                                equations,
                                values,
                                queries
                        )
                )
        );
    }
}