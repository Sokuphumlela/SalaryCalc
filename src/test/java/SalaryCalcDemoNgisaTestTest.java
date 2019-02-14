
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SalaryCalcDemoNgisaTestTest {

    @Test
    public void SalTest(){
        int intExpected=100;
        CalcSal ObjSalary = new CalcSal();
        Assert.assertEquals(intExpected,ObjSalary.Salary(5,20));

    }

}
