package org.example.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Medium347 {
    // Top K Frequent Elements
    public Medium347() {

    }

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        // Step 1: Create a map that counts the frequency
        // The output of the map will be:
        // {
        // 1: 3,
        // 2: 2,
        // 3: 1
        // }
        for (int i : nums) {
            hm.putIfAbsent(i, 0);
            hm.put(i, hm.get(i) + 1);
        }

        // Step 2: Storing the results from hashmap in a list of array.
        // the index is the counts of the number

        // Populate the List with empty List
        List<List<Integer>> buckets = new ArrayList<>(nums.length + 1);
        for (int i = 0; i <= nums.length; i++) {
            buckets.add(new ArrayList<>());
        }

        // Push the value into the list
        hm.forEach((key, value) -> {
            buckets.get(value).add(key);
        });

        // Step 3: iterate the bucket from the back to find the most frequent elements
        List<Integer> ans = new ArrayList<>();
        for (int i = buckets.size() - 1; i > 0 && ans.size() < k; i--) {
            if (buckets.get(i).size() != 0) {
                ans.addAll(buckets.get(i));
            }
        }

        return ans.stream().mapToInt(i -> i).toArray();
    }

}
