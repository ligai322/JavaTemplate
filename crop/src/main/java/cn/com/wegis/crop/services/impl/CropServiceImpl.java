package cn.com.wegis.crop.services.impl;

import cn.com.wegis.crop.dao.CropDao;
import cn.com.wegis.crop.services.CropService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CropServiceImpl  implements CropService {

    private static final Logger logger = LoggerFactory.getLogger(CropServiceImpl.class);

    @Autowired
    CropDao cropDao;
    public List getRecordList() {
        logger.debug("测试");
        return cropDao.getRecord();
    }
}
