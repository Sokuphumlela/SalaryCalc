
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SalaryCalcDemoNgisaTestTest {

    @Test
    public void SalTest(){

        CalcSal ObjSalary = new CalcSal();
        Assert.assertEquals(100,ObjSalary.Salary(5,20));

    }

}