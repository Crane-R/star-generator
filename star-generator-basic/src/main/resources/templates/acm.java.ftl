import java.util.Scanner;

/**
 * ACM代码模板
 *
 * @Author ${author}
 * @Date 2024/1/18 17:18:26
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        <#if loop>
        while (scanner.hasNext()) {
        </#if>
            int n = scanner.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            int sum = 0;
            for (int num : arr) {
                sum += num;
            }

            System.out.println("${outputText}" + sum);
        <#if loop>
        }
        </#if>

        scanner.close();
    }
}