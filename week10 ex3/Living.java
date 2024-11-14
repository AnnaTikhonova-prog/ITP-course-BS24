public interface Living {

    default void live() {
        System.out.println(this.getClass().getSimpleName() + " lives");
    }

}
