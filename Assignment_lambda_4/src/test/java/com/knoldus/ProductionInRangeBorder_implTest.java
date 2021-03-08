package com.knoldus;

import org.junit.Assert;
import org.junit.Test;
public  class ProductionInRangeBorder_implTest
 {
    @Test

        public void productionInRangeBorder_Test()
        {
            ProductionInRangeBorder_impl productionInRange = new ProductionInRangeBorder_impl();
            long output1 = productionInRange.productInRangeInterface.productionInRange(0L, 1L);
            Assert.assertEquals(output1, 0L);

            long output2 = productionInRange.productInRangeInterface.productionInRange(2L, 2L);
            Assert.assertEquals(output2, 2L);

            long output3 = productionInRange.productInRangeInterface.productionInRange(5L, 15L);
            Assert.assertEquals(output3, 54486432000L);

        }

    @Test
        public void NotproductionInRangeBorder_Test()
       {
        ProductionInRangeBorder_impl productionInRange = new ProductionInRangeBorder_impl();
        long output4 = productionInRange.productInRangeInterface.productionInRange(1L, 5L);
        Assert.assertNotEquals(119L, 120);

        }
}
