import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

class Alg {
    void search(int[] array, int cows){
        List<Integer> list = new ArrayList<>();
        for(int i : array){
            list.add(i);
        }
        System.out.println(list + "- free places");
        list.sort(Integer::compareTo);
        int maxStep = list.get(list.size()-1) - list.get(0);
        int step = maxStep/cows;
        System.out.println(list + "- sort list of places");
        if(cows == 2){
            System.out.println(maxStep);
        }
        else {
            distribution(list, step, cows);
        }
    }

    private void distribution(List<Integer> list, int  step, int cows) {
        List<Integer> newList = new ArrayList<>();
        newList.add(list.get(0));
        for (int i = 1; i <= list.size() - 1; i++) {
            if ((newList.get(newList.size() - 1) + step) < list.get(i)) {
                newList.add(list.get(i));
            }
        }
        if (newList.size() != cows) {
            distribution(list, step - 1, cows);
        } else {
            System.out.println(newList + " cows distribution");
            List<Integer> result = new ArrayList<>();
            for (int i = 0; i < newList.size() - 1; i++) {
                result.add(newList.get(i + 1) - newList.get(i));
            }
            System.out.println(result + " the distance between cows");
            System.out.println(Collections.min(result));
        }
    }
}