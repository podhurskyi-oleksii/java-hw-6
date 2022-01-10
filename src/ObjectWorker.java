class ObjectWorker {
    public String join(Object[] objects) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < objects.length; i++) {
            builder.append(objects[i]);

            if (i != objects.length - 1) {
                builder.append(" ");
            }
        }
        return builder.toString();
    }
}

class ObjectWorkerTest {
    public static void main(String[] args) {
        Object[] data = {"Hello", 20L, 3.14f, true};

        //Hello 20 3.14 true
        System.out.println(new ObjectWorker().join(data));
    }
}