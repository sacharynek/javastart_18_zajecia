import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DivisionTest {

    @DataProvider(name = "Authentication")
    public static Object[][] credentials() {
        return new Object[][]{{10, 23}, {11, 33}, {12, 33}, {13, 45}, {16, 60}};
    }

    @Test(dataProvider = "Authentication")
    public void testThreeFiveDivision(int a, int b) {

        assertThat(Division.threeFiveSum(a)).isEqualTo(b);

    }
}
