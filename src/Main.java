public class Main {
    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        WordsChecker designExample = new WordsChecker(text);
        System.out.println("Проверим работу класса WordsChecker");
        System.out.println("1) " + Boolean.TRUE.equals(designExample.hasWord("ipsum")));
        System.out.println("2) " + Boolean.TRUE.equals(designExample.hasWord("IPsUm")));
        System.out.println("3) " + Boolean.FALSE.equals(designExample.hasWord("ghjh")));
        System.out.println("3) " + Boolean.FALSE.equals(designExample.hasWord("hello")));
    }
}