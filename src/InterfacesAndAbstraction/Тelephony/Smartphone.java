package InterfacesAndAbstraction.Тelephony;

import java.util.List;

public class Smartphone implements Callable, Browsable {
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String call() {
        String allCalls = "";
        for (String number : numbers) {
            if (!number.matches("[0-9]+")) {
                allCalls += "Invalid number!\n";
            } else {
                allCalls += "Calling... " + number + "\n";
            }
        }
        return allCalls;
    }

    @Override
    public String browse() {
        String allBrowses = "";
        for (String url : urls) {
            if (!url.matches("[a-zA-Z:\\/.]+")) {
              allBrowses += "Invalid URL!\n";
            } else {
                allBrowses += "Browsing: " + url + "!\n";
            }
        }
        return allBrowses;
    }
}
