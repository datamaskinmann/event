# event

## Example of usage

    public static void main(String[] args) {
        Event<TestEventArgs> testEvent = new Event<>();

        Observer<TestEventArgs> testHandler1 = (x) -> {
            System.out.println(x.getName());
            System.out.println(x.getAge());
        };

        Observer<TestEventArgs> testHandler2 = (x) -> {
            System.out.println(x.getName() + " is " +
                    (x.getAge() > 18 ? "over eighteen" : "under eighteen"));
        };

        testEvent.add(testHandler1);
        testEvent.add(testHandler2);

        testEvent.raise(new TestEventArgs("John", 32));
        testEvent.raise(new TestEventArgs("Mary", 12));

    }
Output:
    John
    32
    John is over eighteen
    Mary
    12
    Mary is under eighteen