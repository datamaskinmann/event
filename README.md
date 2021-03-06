# event

A package attempting to implement C#-like events.

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
Output:<br/>
    John<br/>
    32<br/>
    John is over eighteen<br/>
    Mary<br/>
    12<br/>
    Mary is under eighteen<br/>