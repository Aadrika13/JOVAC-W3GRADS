import java.util.*;

public class Graph {

    private HashMap<Integer, HashMap<Integer, Integer>> graph;

    public Graph(int vertex) {
        this.graph = new HashMap<>();
        for (int i = 1; i <= vertex; i++) {
            this.graph.put(i, new HashMap<>());
        }
    }

    public void addEdge(int v1, int v2) {
        this.graph.get(v1).put(v2, -1);
        this.graph.get(v2).put(v1, -1);
    }

    public void removeEdge(int v1, int v2) {
        if (this.graph.get(v1).containsKey(v2)) {
            this.graph.get(v1).remove(v2);
        }
        if (this.graph.get(v2).containsKey(v1)) {
            this.graph.get(v2).remove(v1);
        }
    }

    public boolean isNeighbour(int v1, int v2) {
        return this.graph.get(v1).containsKey(v2);
    }

    public boolean hasPath(int v1, int v2) {
        HashSet<Integer> visited = new HashSet<>();
        return hasPath(v1, v2, visited);
    }

    private boolean hasPath(int curr, int des, HashSet<Integer> visited) {
        if (curr == des) {
            return true;
        }

        visited.add(curr);
        HashMap<Integer, Integer> neighbours = this.graph.get(curr);
        boolean doesPathExist = false;
        for (int neighbour : neighbours.keySet()) {
            if (!visited.contains(neighbour)) {
                doesPathExist = hasPath(neighbour, des, visited);
                if (doesPathExist) {
                    break;
                }
            }
        }
        // backtracking
        visited.remove(curr);

        return doesPathExist;
    }

    public boolean hasPathBFS(int src, int des) {
        Queue<Integer> queue = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        queue.add(src);// queue.add(src);
        while (!queue.isEmpty()) {
            // remove
            int curr = queue.remove();

            // skip
            if (visited.contains(curr)) {
                continue;
            }

            // System.out.print(curr+" ");
            // check whether the src==des
            if (curr == des) {
                return true;
            }

            // mark visited
            visited.add(curr);

            HashMap<Integer, Integer> neighbours = this.graph.get(curr);
            for (int neighbour : neighbours.keySet()) {
                if (!visited.contains(neighbour))
                    queue.add(neighbour);
            }
        }
        return false;
    }

    public void BFS() {
        Queue<Integer> queue = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        queue.add(1);// queue.add(src);
        while (!queue.isEmpty()) {
            // remove
            int curr = queue.remove();

            // skip
            if (visited.contains(curr)) {
                continue;
            }

            System.out.print(curr + " ");// check whether the src==des

            // mark visited
            visited.add(curr);

            HashMap<Integer, Integer> neighbours = this.graph.get(curr);
            for (int neighbour : neighbours.keySet()) {
                if (!visited.contains(neighbour))
                    queue.add(neighbour);
            }
        }
    }

    public int cycleByBFS() {
        int cycle = 0;
        Queue<Integer> queue = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        queue.add(1);// queue.add(src);
        while (!queue.isEmpty()) {
            // remove
            int curr = queue.remove();

            // skip
            if (visited.contains(curr)) {
                cycle++;
                continue;
            }

            // System.out.print(curr+" ");//check whether the src==des

            // mark visited
            visited.add(curr);

            HashMap<Integer, Integer> neighbours = this.graph.get(curr);
            for (int neighbour : neighbours.keySet()) {
                if (!visited.contains(neighbour))
                    queue.add(neighbour);
            }
        }
        return cycle;
    }

    public void BFT() {

        HashSet<Integer> visited = new HashSet<>();

        for (int src : this.graph.keySet()) {
            if (visited.contains(src)) {
                continue;
            }
            Queue<Integer> queue = new LinkedList<>();
            queue.add(src);// queue.add(src);
            while (!queue.isEmpty()) {
                // remove
                int curr = queue.remove();

                // skip
                if (visited.contains(curr)) {
                    continue;
                }

                System.out.print(curr + " ");// check whether the src==des

                // mark visited
                visited.add(curr);

                HashMap<Integer, Integer> neighbours = this.graph.get(curr);
                for (int neighbour : neighbours.keySet()) {
                    if (!visited.contains(neighbour))
                        queue.add(neighbour);
                }
            }
        }
    }

    public int cycleByBFT() {
        int cycle = 0;
        HashSet<Integer> visited = new HashSet<>();

        for (int src : this.graph.keySet()) {
            if (visited.contains(src)) {
                continue;
            }
            Queue<Integer> queue = new LinkedList<>();
            queue.add(src);// queue.add(src);
            while (!queue.isEmpty()) {
                // remove
                int curr = queue.remove();

                // skip
                if (visited.contains(curr)) {
                    cycle++;
                    continue;
                }

                // System.out.print(curr + " ");// check whether the src==des

                // mark visited
                visited.add(curr);

                HashMap<Integer, Integer> neighbours = this.graph.get(curr);
                for (int neighbour : neighbours.keySet()) {
                    if (!visited.contains(neighbour))
                        queue.add(neighbour);
                }
            }
        }
        return cycle;
    }

    public int num_of_components_BFT() {
        int c = 0;
        HashSet<Integer> visited = new HashSet<>();

        for (int src : this.graph.keySet()) {
            if (visited.contains(src)) {
                continue;
            }
            c++;
            //if c > 1 then it has more than one component that is not a valid graph
            Queue<Integer> queue = new LinkedList<>();
            queue.add(src);// queue.add(src);
            while (!queue.isEmpty()) {
                // remove
                int curr = queue.remove();

                // skip
                if (visited.contains(curr)) {
                    //cycle is more than 1 than it is not a valid graph
                    continue;
                }

                // System.out.print(curr + " ");// check whether the src==des

                // mark visited
                visited.add(curr);

                HashMap<Integer, Integer> neighbours = this.graph.get(curr);
                for (int neighbour : neighbours.keySet()) {
                    if (!visited.contains(neighbour))
                        queue.add(neighbour);
                }
            }
        }
        return c;
    }

    public void print() {
        for (int vertex : this.graph.keySet()) {
            HashMap<Integer, Integer> neighbours = this.graph.get(vertex);
            for (int i : neighbours.keySet()) {
                System.out.println(vertex + " -> " + i + " | cost -> " + this.graph.get(vertex).get(i));
            }
        }
    }
}
