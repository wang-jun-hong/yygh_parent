package com.wjh.yygh.resopitory;

import com.wjh.yygh.model.hosp.Hospital;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalRepository extends MongoRepository<Hospital, String> {

    /**
     * 判断是否存在数据
     * 查询数据
     */
    Hospital getHospitalByHoscode(String hoscode);


}
