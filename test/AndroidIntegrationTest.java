package com.dalong.elmbusiness;

import com.dalong.elmbusiness.entity.GoodsListBean;
import com.dalong.elmbusiness.utils.DataUtils;

import org.junit.Test;
import org.mockito.*;

import static org.junit.Assert.assertEquals;

public class AndroidIntegrationTest {
    @Test
    public void TestDataUtils() {
        //test data utils
        GoodsListBean dataList = DataUtils.GsonToBean(DataUtils.data, GoodsListBean.class);
        assertEquals(2, dataList.getData().size());
    }

}
