public class AddAnimalAction extends ActionBase{
    @Override
    public void execute(String[] paramsArray) {
        System.out.println("Tu juz przydaly by sie parametry: wyprintujemy je: ");
        for (String param:
                paramsArray) {
            System.out.println(param);
        }
    }
}
