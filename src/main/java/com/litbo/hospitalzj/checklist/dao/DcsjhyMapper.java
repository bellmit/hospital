package com.litbo.hospitalzj.checklist.dao;

import com.litbo.hospitalzj.checklist.domain.Dcsjhy;
import com.litbo.hospitalzj.checklist.domain.DcsjhyTemplate;
import org.apache.ibatis.annotations.*;

import java.util.Date;
import java.util.List;

/**
 * 多参数监护仪dao层
 *
 * @author bigStone
 */
@Mapper
public interface DcsjhyMapper {

    //查询多参数监护仪模板表（成人）
    @Select("select * from dcsjhy_template_m order by dc_templateid desc limit 1")
    public DcsjhyTemplate findTemplate_m();

    //查询多参数监护仪模板表(儿童)
    @Select("select * from dcsjhy_template_c order by dc_templateid desc limit 1")
    public DcsjhyTemplate findTemplate_c();

    //查询多参数监护仪模板表(儿童)
    @Select("select * from ${tableName} wehere dc_templateid=#{dcTemplateid}")
    public DcsjhyTemplate findTemplateById(@Param("dcTemplateid") Integer dcTemplateid, @Param("tableName") String tableName);

    //修改模板表数据
//    @Update("update dcsjhy_template_m\n" +
//            "    set xl_test1 = #{xlTest1},\n" +
//            "      xl_test2 = #{xlTest2},\n" +
//            "      xl_test3 = #{xlTest3},\n" +
//            "      xl_test4 = #{xlTest4},\n" +
//            "      xl_test5 = #{xlTest5},\n" +
//            "      xl_test6 = #{xlTest6},\n" +
//            "      xl_wc = #{xlWc},\n" +
//            "      hxl_test1 = #{hxlTest1},\n" +
//            "      hxl_test2 = #{hxlTest2},\n" +
//            "      hxl_test3 = #{hxlTest3},\n" +
//            "      hxl_test4 = #{hxlTest4},\n" +
//            "      hxl_test5 = #{hxlTest5},\n" +
//            "      hxl_test6 = #{hxlTest6},\n" +
//            "      hxl_wc = #{hxlWc},\n" +
//            "      xybhd_test1 = #{xybhdTest1},\n" +
//            "      xybhd_test2 = #{xybhdTest2},\n" +
//            "      xybhd_test3 = #{xybhdTest3},\n" +
//            "      xybhd_test4 = #{xybhdTest4},\n" +
//            "      xybhd_test5 = #{xybhdTest5},\n" +
//            "      xybhd_wc = #{xybhdWc},\n" +
//            "      wcxy_h_test1 = #{wcxyHTest1},\n" +
//            "      wcxy_l_test1 = #{wcxyLTest1},\n" +
//            "      wcxy_m_test1 = #{wcxyMTest1},\n" +
//            "      wcxy_h_test2 = #{wcxyHTest2},\n" +
//            "      wcxy_l_test2 = #{wcxyLTest2},\n" +
//            "      wcxy_m_test2 = #{wcxyMTest2},\n" +
//            "      wcxy_h_test3 = #{wcxyHTest3},\n" +
//            "      wcxy_l_test3 = #{wcxyLTest3},\n" +
//            "      wcxy_m_test3 = #{wcxyMTest3},\n" +
//            "      wcxy_h_test4 = #{wcxyHTest4},\n" +
//            "      wcxy_l_test4 = #{wcxyLTest4},\n" +
//            "      wcxy_m_test4 = #{wcxyMTest4},\n" +
//            "      wcxy_h_test5 = #{wcxyHTest5},\n" +
//            "      wcxy_l_test5 = #{wcxyLTest5},\n" +
//            "      wcxy_m_test5 = #{wcxyMTest5},\n" +
//            "      wcxy_wc = #{wcxyWc},\n" +
//            "      wcxyjt_sd = #{wcxyjtSd},\n" +
//            "      wcxyjt_wc = #{wcxyjtWc},\n" +
//            "      wcxyqm_sd = #{wcxyqmSd},\n" +
//            "      wcxyqm_xll_wc = #{wcxyqmXllWc}\n" +
//            "    where dc_templateid = #{dcTemplateid}")
    @Update("update dcsjhy_template_m\n set" +
            "      xl_test1 = #{xlTest1,jdbcType=INTEGER},\n" +
            "      xl_test2 = #{xlTest2,jdbcType=INTEGER},\n" +
            "      xl_test3 = #{xlTest3,jdbcType=INTEGER},\n" +
            "      xl_test4 = #{xlTest4,jdbcType=INTEGER},\n" +
            "      xl_test5 = #{xlTest5,jdbcType=INTEGER},\n" +
            "      xl_test6 = #{xlTest6,jdbcType=INTEGER},\n" +
            "      xl_wc = #{xlWc,jdbcType=VARCHAR},\n" +
            "      hxl_test1 = #{hxlTest1,jdbcType=INTEGER},\n" +
            "      hxl_test2 = #{hxlTest2,jdbcType=INTEGER},\n" +
            "      hxl_test3 = #{hxlTest3,jdbcType=INTEGER},\n" +
            "      hxl_test4 = #{hxlTest4,jdbcType=INTEGER},\n" +
            "      hxl_test5 = #{hxlTest5,jdbcType=INTEGER},\n" +
            "      hxl_test6 = #{hxlTest6,jdbcType=INTEGER},\n" +
            "      hxl_wc = #{hxlWc,jdbcType=VARCHAR},\n" +
            "      xybhd_test1 = #{xybhdTest1,jdbcType=INTEGER},\n" +
            "      xybhd_test2 = #{xybhdTest2,jdbcType=INTEGER},\n" +
            "      xybhd_test3 = #{xybhdTest3,jdbcType=INTEGER},\n" +
            "      xybhd_test4 = #{xybhdTest4,jdbcType=INTEGER},\n" +
            "      xybhd_test5 = #{xybhdTest5,jdbcType=INTEGER},\n" +
            "      xybhd_wc = #{xybhdWc,jdbcType=VARCHAR},\n" +
            "      wcxy_jt_test1 = #{wcxyJtTest1,jdbcType=INTEGER},\n" +
            "      wcxy_jt_test2 = #{wcxyJtTest2,jdbcType=INTEGER},\n" +
            "      wcxy_jt_test3 = #{wcxyJtTest3,jdbcType=INTEGER},\n" +
            "      wcxy_jt_test4 = #{wcxyJtTest4,jdbcType=INTEGER},\n" +
            "      wcxy_jt_test5 = #{wcxyJtTest5,jdbcType=INTEGER},\n" +
            "      wcxy_syz_wc = #{wcxySyzWc,jdbcType=VARCHAR},\n" +
            "      wcxy_sc_wc = #{wcxyScWc,jdbcType=VARCHAR},\n" +
            "      wcdtxy_sdz_test1 = #{wcdtxySdzTest1,jdbcType=INTEGER},\n" +
            "      wcdtxy_sdz_test2 = #{wcdtxySdzTest2,jdbcType=INTEGER},\n" +
            "      wcdtxy_xl = #{wcdtxyXl,jdbcType=INTEGER},\n" +
            "      wcdtxy_wc = #{wcdtxyWc,jdbcType=VARCHAR},\n" +
            "      qmxjc_wc = #{qmxjcWc,jdbcType=VARCHAR},\n" +
            "      qmxjc_yld_test1 = #{qmxjcYldTest1,jdbcType=INTEGER},\n" +
            "      qmxjc_yld_test2 = #{qmxjcYldTest2,jdbcType=INTEGER}   " +
            "    where dc_templateid = #{dcTemplateid}")
    int updateM(DcsjhyTemplate dcsjhyTemplate);

    //成人
    @Update("update dcsjhy_template_c\n set" +
            "      xl_test1 = #{xlTest1,jdbcType=INTEGER},\n" +
            "      xl_test2 = #{xlTest2,jdbcType=INTEGER},\n" +
            "      xl_test3 = #{xlTest3,jdbcType=INTEGER},\n" +
            "      xl_test4 = #{xlTest4,jdbcType=INTEGER},\n" +
            "      xl_test5 = #{xlTest5,jdbcType=INTEGER},\n" +
            "      xl_test6 = #{xlTest6,jdbcType=INTEGER},\n" +
            "      xl_wc = #{xlWc,jdbcType=VARCHAR},\n" +
            "      hxl_test1 = #{hxlTest1,jdbcType=INTEGER},\n" +
            "      hxl_test2 = #{hxlTest2,jdbcType=INTEGER},\n" +
            "      hxl_test3 = #{hxlTest3,jdbcType=INTEGER},\n" +
            "      hxl_test4 = #{hxlTest4,jdbcType=INTEGER},\n" +
            "      hxl_test5 = #{hxlTest5,jdbcType=INTEGER},\n" +
            "      hxl_test6 = #{hxlTest6,jdbcType=INTEGER},\n" +
            "      hxl_wc = #{hxlWc,jdbcType=VARCHAR},\n" +
            "      xybhd_test1 = #{xybhdTest1,jdbcType=INTEGER},\n" +
            "      xybhd_test2 = #{xybhdTest2,jdbcType=INTEGER},\n" +
            "      xybhd_test3 = #{xybhdTest3,jdbcType=INTEGER},\n" +
            "      xybhd_test4 = #{xybhdTest4,jdbcType=INTEGER},\n" +
            "      xybhd_test5 = #{xybhdTest5,jdbcType=INTEGER},\n" +
            "      xybhd_wc = #{xybhdWc,jdbcType=VARCHAR},\n" +
            "      wcxy_jt_test1 = #{wcxyJtTest1,jdbcType=INTEGER},\n" +
            "      wcxy_jt_test2 = #{wcxyJtTest2,jdbcType=INTEGER},\n" +
            "      wcxy_jt_test3 = #{wcxyJtTest3,jdbcType=INTEGER},\n" +
            "      wcxy_jt_test4 = #{wcxyJtTest4,jdbcType=INTEGER},\n" +
            "      wcxy_jt_test5 = #{wcxyJtTest5,jdbcType=INTEGER},\n" +
            "      wcxy_syz_wc = #{wcxySyzWc,jdbcType=VARCHAR},\n" +
            "      wcxy_sc_wc = #{wcxyScWc,jdbcType=VARCHAR},\n" +
            "      wcdtxy_sdz_test1 = #{wcdtxySdzTest1,jdbcType=INTEGER},\n" +
            "      wcdtxy_sdz_test2 = #{wcdtxySdzTest2,jdbcType=INTEGER},\n" +
            "      wcdtxy_xl = #{wcdtxyXl,jdbcType=INTEGER},\n" +
            "      wcdtxy_wc = #{wcdtxyWc,jdbcType=VARCHAR},\n" +
            "      qmxjc_wc = #{qmxjcWc,jdbcType=VARCHAR},\n" +
            "      qmxjc_yld_test1 = #{qmxjcYldTest1,jdbcType=INTEGER},\n" +
            "      qmxjc_yld_test2 = #{qmxjcYldTest2,jdbcType=INTEGER}   " +
            "    where dc_templateid = #{dcTemplateid}")
    int updateC(DcsjhyTemplate dcsjhyTemplate);

    //插入模板表数据
    @Insert(" insert into dcsjhy_template_m (xl_test1, xl_test2, \n" +
            "      xl_test3, xl_test4, xl_test5, \n" +
            "      xl_test6, xl_wc, hxl_test1, \n" +
            "      hxl_test2, hxl_test3, hxl_test4, \n" +
            "      hxl_test5, hxl_test6, hxl_wc, \n" +
            "      xybhd_test1, xybhd_test2, xybhd_test3, \n" +
            "      xybhd_test4, xybhd_test5, xybhd_wc, \n" +
            "      wcxy_jt_test1, wcxy_jt_test2, wcxy_jt_test3, \n" +
            "      wcxy_jt_test4, wcxy_jt_test5, wcxy_syz_wc, \n" +
            "      wcxy_sc_wc, wcdtxy_sdz_test1, wcdtxy_sdz_test2, \n" +
            "      wcdtxy_xl, wcdtxy_wc, qmxjc_wc, \n" +
            "      qmxjc_yld_test1, qmxjc_yld_test2" +
            "      )\n" +
            "    values ( #{xlTest1,jdbcType=INTEGER}, #{xlTest2,jdbcType=INTEGER}, \n" +
            "      #{xlTest3,jdbcType=INTEGER}, #{xlTest4,jdbcType=INTEGER}, #{xlTest5,jdbcType=INTEGER}, \n" +
            "      #{xlTest6,jdbcType=INTEGER}, #{xlWc,jdbcType=VARCHAR}, #{hxlTest1,jdbcType=INTEGER}, \n" +
            "      #{hxlTest2,jdbcType=INTEGER}, #{hxlTest3,jdbcType=INTEGER}, #{hxlTest4,jdbcType=INTEGER}, \n" +
            "      #{hxlTest5,jdbcType=INTEGER}, #{hxlTest6,jdbcType=INTEGER}, #{hxlWc,jdbcType=VARCHAR}, \n" +
            "      #{xybhdTest1,jdbcType=INTEGER}, #{xybhdTest2,jdbcType=INTEGER}, #{xybhdTest3,jdbcType=INTEGER}, \n" +
            "      #{xybhdTest4,jdbcType=INTEGER}, #{xybhdTest5,jdbcType=INTEGER}, #{xybhdWc,jdbcType=VARCHAR}, \n" +
            "      #{wcxyJtTest1,jdbcType=INTEGER}, #{wcxyJtTest2,jdbcType=INTEGER}, #{wcxyJtTest3,jdbcType=INTEGER}, \n" +
            "      #{wcxyJtTest4,jdbcType=INTEGER}, #{wcxyJtTest5,jdbcType=INTEGER}, #{wcxySyzWc,jdbcType=VARCHAR}, \n" +
            "      #{wcxyScWc,jdbcType=VARCHAR}, #{wcdtxySdzTest1,jdbcType=INTEGER}, #{wcdtxySdzTest2,jdbcType=INTEGER}, \n" +
            "      #{wcdtxyXl,jdbcType=INTEGER}, #{wcdtxyWc,jdbcType=VARCHAR}, #{qmxjcWc,jdbcType=VARCHAR}, \n" +
            "      #{qmxjcYldTest1,jdbcType=INTEGER}, #{qmxjcYldTest2,jdbcType=INTEGER}" +
            "      )")
    @Options(useGeneratedKeys = true, keyProperty = "dcTemplateid", keyColumn = "dc_templateid")
    int insertM(DcsjhyTemplate dcsjhyTemplate);

    @Insert(" insert into dcsjhy_template_c ( xl_test1, xl_test2, \n" +
            "      xl_test3, xl_test4, xl_test5, \n" +
            "      xl_test6, xl_wc, hxl_test1, \n" +
            "      hxl_test2, hxl_test3, hxl_test4, \n" +
            "      hxl_test5, hxl_test6, hxl_wc, \n" +
            "      xybhd_test1, xybhd_test2, xybhd_test3, \n" +
            "      xybhd_test4, xybhd_test5, xybhd_wc, \n" +
            "      wcxy_jt_test1, wcxy_jt_test2, wcxy_jt_test3, \n" +
            "      wcxy_jt_test4, wcxy_jt_test5, wcxy_syz_wc, \n" +
            "      wcxy_sc_wc, wcdtxy_sdz_test1, wcdtxy_sdz_test2, \n" +
            "      wcdtxy_xl, wcdtxy_wc, qmxjc_wc, \n" +
            "      qmxjc_yld_test1, qmxjc_yld_test2" +
            "      )\n" +
            "    values ( #{xlTest1,jdbcType=INTEGER}, #{xlTest2,jdbcType=INTEGER}, \n" +
            "      #{xlTest3,jdbcType=INTEGER}, #{xlTest4,jdbcType=INTEGER}, #{xlTest5,jdbcType=INTEGER}, \n" +
            "      #{xlTest6,jdbcType=INTEGER}, #{xlWc,jdbcType=VARCHAR}, #{hxlTest1,jdbcType=INTEGER}, \n" +
            "      #{hxlTest2,jdbcType=INTEGER}, #{hxlTest3,jdbcType=INTEGER}, #{hxlTest4,jdbcType=INTEGER}, \n" +
            "      #{hxlTest5,jdbcType=INTEGER}, #{hxlTest6,jdbcType=INTEGER}, #{hxlWc,jdbcType=VARCHAR}, \n" +
            "      #{xybhdTest1,jdbcType=INTEGER}, #{xybhdTest2,jdbcType=INTEGER}, #{xybhdTest3,jdbcType=INTEGER}, \n" +
            "      #{xybhdTest4,jdbcType=INTEGER}, #{xybhdTest5,jdbcType=INTEGER}, #{xybhdWc,jdbcType=VARCHAR}, \n" +
            "      #{wcxyJtTest1,jdbcType=INTEGER}, #{wcxyJtTest2,jdbcType=INTEGER}, #{wcxyJtTest3,jdbcType=INTEGER}, \n" +
            "      #{wcxyJtTest4,jdbcType=INTEGER}, #{wcxyJtTest5,jdbcType=INTEGER}, #{wcxySyzWc,jdbcType=VARCHAR}, \n" +
            "      #{wcxyScWc,jdbcType=VARCHAR}, #{wcdtxySdzTest1,jdbcType=INTEGER}, #{wcdtxySdzTest2,jdbcType=INTEGER}, \n" +
            "      #{wcdtxyXl,jdbcType=INTEGER}, #{wcdtxyWc,jdbcType=VARCHAR}, #{qmxjcWc,jdbcType=VARCHAR}, \n" +
            "      #{qmxjcYldTest1,jdbcType=INTEGER}, #{qmxjcYldTest2,jdbcType=INTEGER}" +
            "      )")
    @Options(useGeneratedKeys = true, keyProperty = "dcTemplateid", keyColumn = "dc_templateid")
    int insertC(DcsjhyTemplate dcsjhyTemplate);

    //保存多参数监护仪检测表(成人)
    @Insert("insert into dcsjhy_m (jcyq_id, eq_id, \n" +
            "      tester, test_time, auditor, \n" +
            "      shr_jcjl, shsj_time, jcjl, \n" +
            "      jcsm, xl_test1, xl_test2, \n" +
            "      xl_test3, xl_test4, xl_test5, \n" +
            "      xl_test6, xl_value1, xl_value2, \n" +
            "      xl_value3, xl_value4, xl_value5, \n" +
            "      xl_value6, xl_wc, xl_result, \n" +
            "      hxl_test1, hxl_test2, hxl_test3, \n" +
            "      hxl_test4, hxl_test5, hxl_test6, \n" +
            "      hxl_value1, hxl_value2, hxl_value3, \n" +
            "      hxl_value4, hxl_value5, hxl_value6, \n" +
            "      hxl_wc, hxl_result, xybhd_test1, \n" +
            "      xybhd_test2, xybhd_test3, xybhd_test4, \n" +
            "      xybhd_test5, xybhd_value1, xybhd_value2, \n" +
            "      xybhd_value3, xybhd_value4, xybhd_value5, \n" +
            "      xybhd_wc, xybhd_result, wcxy_jt_test1, \n" +
            "      wcxy_jt_test2, wcxy_jt_test3, wcxy_jt_test4, \n" +
            "      wcxy_jt_test5, wcxy_jt_xsz1_value1, wcxy_jt_xsz1_value2, \n" +
            "      wcxy_jt_xsz1_value3, wcxy_jt_xsz1_value4, wcxy_jt_xsz1_value5, \n" +
            "      wcxy_jt_xsz2_value1, wcxy_jt_xsz2_value2, wcxy_jt_xsz2_value3, \n" +
            "      wcxy_jt_xsz2_value4, wcxy_jt_xsz2_value5, wcxy_jt_pjz_value1, \n" +
            "      wcxy_jt_pjz_value2, wcxy_jt_pjz_value3, wcxy_jt_pjz_value4, \n" +
            "      wcxy_jt_pjz_value5, wcxy_syz_wc, wcxy_sc_wc, \n" +
            "      wcxy_jt_result, wcdtxy_sdz_test1, wcdtxy_sdz_test2, \n" +
            "      wcdtxy_xl, wcdtxy_wc, wcdtxy_value1, \n" +
            "      wcdtxy_value2, wcdtxy_value3, wcdtxy_value4, \n" +
            "      wcdtxy_value5, wcdtxy_ssy_value, wcdtxy_szy_value, \n" +
            "      wcdtxy_result, qmxjc_yld_test1, qmxjc_yld_test2, \n" +
            "      qmxjc_wc, qmxjc_ylsz_value1, qmxjc_ylsz_value2, \n" +
            "      qmxjc_ylsz_value3, qmxjc_ylsz_value4, qmxjc_qmxsz_value1, \n" +
            "      qmxjc_qmxsz_value2, qmxjc_result, sgbj_result, \n" +
            "      bjxjc_result, jyjc_result, state, \n" +
            "      spare2, spare3)\n" +
            "    values ( #{jcyqId,jdbcType=INTEGER}, #{eqId,jdbcType=INTEGER}, \n" +
            "      #{tester,jdbcType=VARCHAR}, #{testTime,jdbcType=TIMESTAMP}, #{auditor,jdbcType=VARCHAR}, \n" +
            "      #{shrJcjl,jdbcType=VARCHAR}, #{shsjTime,jdbcType=TIMESTAMP}, #{jcjl,jdbcType=VARCHAR}, \n" +
            "      #{jcsm,jdbcType=VARCHAR}, #{xlTest1,jdbcType=INTEGER}, #{xlTest2,jdbcType=INTEGER}, \n" +
            "      #{xlTest3,jdbcType=INTEGER}, #{xlTest4,jdbcType=INTEGER}, #{xlTest5,jdbcType=INTEGER}, \n" +
            "      #{xlTest6,jdbcType=INTEGER}, #{xlValue1,jdbcType=INTEGER}, #{xlValue2,jdbcType=INTEGER}, \n" +
            "      #{xlValue3,jdbcType=INTEGER}, #{xlValue4,jdbcType=INTEGER}, #{xlValue5,jdbcType=INTEGER}, \n" +
            "      #{xlValue6,jdbcType=INTEGER}, #{xlWc,jdbcType=VARCHAR}, #{xlResult,jdbcType=TINYINT}, \n" +
            "      #{hxlTest1,jdbcType=INTEGER}, #{hxlTest2,jdbcType=INTEGER}, #{hxlTest3,jdbcType=INTEGER}, \n" +
            "      #{hxlTest4,jdbcType=INTEGER}, #{hxlTest5,jdbcType=INTEGER}, #{hxlTest6,jdbcType=INTEGER}, \n" +
            "      #{hxlValue1,jdbcType=INTEGER}, #{hxlValue2,jdbcType=INTEGER}, #{hxlValue3,jdbcType=INTEGER}, \n" +
            "      #{hxlValue4,jdbcType=INTEGER}, #{hxlValue5,jdbcType=INTEGER}, #{hxlValue6,jdbcType=INTEGER}, \n" +
            "      #{hxlWc,jdbcType=VARCHAR}, #{hxlResult,jdbcType=TINYINT}, #{xybhdTest1,jdbcType=INTEGER}, \n" +
            "      #{xybhdTest2,jdbcType=INTEGER}, #{xybhdTest3,jdbcType=INTEGER}, #{xybhdTest4,jdbcType=INTEGER}, \n" +
            "      #{xybhdTest5,jdbcType=INTEGER}, #{xybhdValue1,jdbcType=INTEGER}, #{xybhdValue2,jdbcType=INTEGER}, \n" +
            "      #{xybhdValue3,jdbcType=INTEGER}, #{xybhdValue4,jdbcType=INTEGER}, #{xybhdValue5,jdbcType=INTEGER}, \n" +
            "      #{xybhdWc,jdbcType=VARCHAR}, #{xybhdResult,jdbcType=TINYINT}, #{wcxyJtTest1,jdbcType=INTEGER}, \n" +
            "      #{wcxyJtTest2,jdbcType=INTEGER}, #{wcxyJtTest3,jdbcType=INTEGER}, #{wcxyJtTest4,jdbcType=INTEGER}, \n" +
            "      #{wcxyJtTest5,jdbcType=INTEGER}, #{wcxyJtXsz1Value1,jdbcType=INTEGER}, #{wcxyJtXsz1Value2,jdbcType=INTEGER}, \n" +
            "      #{wcxyJtXsz1Value3,jdbcType=INTEGER}, #{wcxyJtXsz1Value4,jdbcType=INTEGER}, #{wcxyJtXsz1Value5,jdbcType=INTEGER}, \n" +
            "      #{wcxyJtXsz2Value1,jdbcType=INTEGER}, #{wcxyJtXsz2Value2,jdbcType=INTEGER}, #{wcxyJtXsz2Value3,jdbcType=INTEGER}, \n" +
            "      #{wcxyJtXsz2Value4,jdbcType=INTEGER}, #{wcxyJtXsz2Value5,jdbcType=INTEGER}, #{wcxyJtPjzValue1,jdbcType=INTEGER}, \n" +
            "      #{wcxyJtPjzValue2,jdbcType=INTEGER}, #{wcxyJtPjzValue3,jdbcType=INTEGER}, #{wcxyJtPjzValue4,jdbcType=INTEGER}, \n" +
            "      #{wcxyJtPjzValue5,jdbcType=INTEGER}, #{wcxySyzWc,jdbcType=VARCHAR}, #{wcxyScWc,jdbcType=VARCHAR}, \n" +
            "      #{wcxyJtResult,jdbcType=INTEGER}, #{wcdtxySdzTest1,jdbcType=INTEGER}, #{wcdtxySdzTest2,jdbcType=INTEGER}, \n" +
            "      #{wcdtxyXl,jdbcType=INTEGER}, #{wcdtxyWc,jdbcType=INTEGER}, #{wcdtxyValue1,jdbcType=INTEGER}, \n" +
            "      #{wcdtxyValue2,jdbcType=INTEGER}, #{wcdtxyValue3,jdbcType=INTEGER}, #{wcdtxyValue4,jdbcType=INTEGER}, \n" +
            "      #{wcdtxyValue5,jdbcType=INTEGER}, #{wcdtxySsyValue,jdbcType=INTEGER}, #{wcdtxySzyValue,jdbcType=INTEGER}, \n" +
            "      #{wcdtxyResult,jdbcType=INTEGER}, #{qmxjcYldTest1,jdbcType=INTEGER}, #{qmxjcYldTest2,jdbcType=INTEGER}, \n" +
            "      #{qmxjcWc,jdbcType=VARCHAR}, #{qmxjcYlszValue1,jdbcType=INTEGER}, #{qmxjcYlszValue2,jdbcType=INTEGER}, \n" +
            "      #{qmxjcYlszValue3,jdbcType=INTEGER}, #{qmxjcYlszValue4,jdbcType=INTEGER}, #{qmxjcQmxszValue1,jdbcType=INTEGER}, \n" +
            "      #{qmxjcQmxszValue2,jdbcType=INTEGER}, #{qmxjcResult,jdbcType=INTEGER}, #{sgbjResult,jdbcType=INTEGER}, \n" +
            "      #{bjxjcResult,jdbcType=INTEGER}, #{jyjcResult,jdbcType=INTEGER}, #{state,jdbcType=VARCHAR}, \n" +
            "      #{spare2,jdbcType=VARCHAR}, #{spare3,jdbcType=VARCHAR})")
    @Options(useGeneratedKeys = true, keyProperty = "dcid", keyColumn = "dcid")
    public void saveMan(Dcsjhy dcsjhy);

    @Update("update dcsjhy_m\n" +
            "    set jcyq_id = #{jcyqId,jdbcType=INTEGER},\n" +
            "      eq_id = #{eqId,jdbcType=INTEGER},\n" +
            "      tester = #{tester,jdbcType=VARCHAR},\n" +
            "      test_time = #{testTime,jdbcType=TIMESTAMP},\n" +
            "      auditor = #{auditor,jdbcType=VARCHAR},\n" +
            "      shr_jcjl = #{shrJcjl,jdbcType=VARCHAR},\n" +
            "      shsj_time = #{shsjTime,jdbcType=TIMESTAMP},\n" +
            "      jcjl = #{jcjl,jdbcType=VARCHAR},\n" +
            "      jcsm = #{jcsm,jdbcType=VARCHAR},\n" +
            "      xl_test1 = #{xlTest1,jdbcType=INTEGER},\n" +
            "      xl_test2 = #{xlTest2,jdbcType=INTEGER},\n" +
            "      xl_test3 = #{xlTest3,jdbcType=INTEGER},\n" +
            "      xl_test4 = #{xlTest4,jdbcType=INTEGER},\n" +
            "      xl_test5 = #{xlTest5,jdbcType=INTEGER},\n" +
            "      xl_test6 = #{xlTest6,jdbcType=INTEGER},\n" +
            "      xl_value1 = #{xlValue1,jdbcType=INTEGER},\n" +
            "      xl_value2 = #{xlValue2,jdbcType=INTEGER},\n" +
            "      xl_value3 = #{xlValue3,jdbcType=INTEGER},\n" +
            "      xl_value4 = #{xlValue4,jdbcType=INTEGER},\n" +
            "      xl_value5 = #{xlValue5,jdbcType=INTEGER},\n" +
            "      xl_value6 = #{xlValue6,jdbcType=INTEGER},\n" +
            "      xl_wc = #{xlWc,jdbcType=VARCHAR},\n" +
            "      xl_result = #{xlResult,jdbcType=TINYINT},\n" +
            "      hxl_test1 = #{hxlTest1,jdbcType=INTEGER},\n" +
            "      hxl_test2 = #{hxlTest2,jdbcType=INTEGER},\n" +
            "      hxl_test3 = #{hxlTest3,jdbcType=INTEGER},\n" +
            "      hxl_test4 = #{hxlTest4,jdbcType=INTEGER},\n" +
            "      hxl_test5 = #{hxlTest5,jdbcType=INTEGER},\n" +
            "      hxl_test6 = #{hxlTest6,jdbcType=INTEGER},\n" +
            "      hxl_value1 = #{hxlValue1,jdbcType=INTEGER},\n" +
            "      hxl_value2 = #{hxlValue2,jdbcType=INTEGER},\n" +
            "      hxl_value3 = #{hxlValue3,jdbcType=INTEGER},\n" +
            "      hxl_value4 = #{hxlValue4,jdbcType=INTEGER},\n" +
            "      hxl_value5 = #{hxlValue5,jdbcType=INTEGER},\n" +
            "      hxl_value6 = #{hxlValue6,jdbcType=INTEGER},\n" +
            "      hxl_wc = #{hxlWc,jdbcType=VARCHAR},\n" +
            "      hxl_result = #{hxlResult,jdbcType=TINYINT},\n" +
            "      xybhd_test1 = #{xybhdTest1,jdbcType=INTEGER},\n" +
            "      xybhd_test2 = #{xybhdTest2,jdbcType=INTEGER},\n" +
            "      xybhd_test3 = #{xybhdTest3,jdbcType=INTEGER},\n" +
            "      xybhd_test4 = #{xybhdTest4,jdbcType=INTEGER},\n" +
            "      xybhd_test5 = #{xybhdTest5,jdbcType=INTEGER},\n" +
            "      xybhd_value1 = #{xybhdValue1,jdbcType=INTEGER},\n" +
            "      xybhd_value2 = #{xybhdValue2,jdbcType=INTEGER},\n" +
            "      xybhd_value3 = #{xybhdValue3,jdbcType=INTEGER},\n" +
            "      xybhd_value4 = #{xybhdValue4,jdbcType=INTEGER},\n" +
            "      xybhd_value5 = #{xybhdValue5,jdbcType=INTEGER},\n" +
            "      xybhd_wc = #{xybhdWc,jdbcType=VARCHAR},\n" +
            "      xybhd_result = #{xybhdResult,jdbcType=TINYINT},\n" +
            "      wcxy_jt_test1 = #{wcxyJtTest1,jdbcType=INTEGER},\n" +
            "      wcxy_jt_test2 = #{wcxyJtTest2,jdbcType=INTEGER},\n" +
            "      wcxy_jt_test3 = #{wcxyJtTest3,jdbcType=INTEGER},\n" +
            "      wcxy_jt_test4 = #{wcxyJtTest4,jdbcType=INTEGER},\n" +
            "      wcxy_jt_test5 = #{wcxyJtTest5,jdbcType=INTEGER},\n" +
            "      wcxy_jt_xsz1_value1 = #{wcxyJtXsz1Value1,jdbcType=INTEGER},\n" +
            "      wcxy_jt_xsz1_value2 = #{wcxyJtXsz1Value2,jdbcType=INTEGER},\n" +
            "      wcxy_jt_xsz1_value3 = #{wcxyJtXsz1Value3,jdbcType=INTEGER},\n" +
            "      wcxy_jt_xsz1_value4 = #{wcxyJtXsz1Value4,jdbcType=INTEGER},\n" +
            "      wcxy_jt_xsz1_value5 = #{wcxyJtXsz1Value5,jdbcType=INTEGER},\n" +
            "      wcxy_jt_xsz2_value1 = #{wcxyJtXsz2Value1,jdbcType=INTEGER},\n" +
            "      wcxy_jt_xsz2_value2 = #{wcxyJtXsz2Value2,jdbcType=INTEGER},\n" +
            "      wcxy_jt_xsz2_value3 = #{wcxyJtXsz2Value3,jdbcType=INTEGER},\n" +
            "      wcxy_jt_xsz2_value4 = #{wcxyJtXsz2Value4,jdbcType=INTEGER},\n" +
            "      wcxy_jt_xsz2_value5 = #{wcxyJtXsz2Value5,jdbcType=INTEGER},\n" +
            "      wcxy_jt_pjz_value1 = #{wcxyJtPjzValue1,jdbcType=INTEGER},\n" +
            "      wcxy_jt_pjz_value2 = #{wcxyJtPjzValue2,jdbcType=INTEGER},\n" +
            "      wcxy_jt_pjz_value3 = #{wcxyJtPjzValue3,jdbcType=INTEGER},\n" +
            "      wcxy_jt_pjz_value4 = #{wcxyJtPjzValue4,jdbcType=INTEGER},\n" +
            "      wcxy_jt_pjz_value5 = #{wcxyJtPjzValue5,jdbcType=INTEGER},\n" +
            "      wcxy_syz_wc = #{wcxySyzWc,jdbcType=VARCHAR},\n" +
            "      wcxy_sc_wc = #{wcxyScWc,jdbcType=VARCHAR},\n" +
            "      wcxy_jt_result = #{wcxyJtResult,jdbcType=INTEGER},\n" +
            "      wcdtxy_sdz_test1 = #{wcdtxySdzTest1,jdbcType=INTEGER},\n" +
            "      wcdtxy_sdz_test2 = #{wcdtxySdzTest2,jdbcType=INTEGER},\n" +
            "      wcdtxy_xl = #{wcdtxyXl,jdbcType=INTEGER},\n" +
            "      wcdtxy_wc = #{wcdtxyWc,jdbcType=INTEGER},\n" +
            "      wcdtxy_value1 = #{wcdtxyValue1,jdbcType=INTEGER},\n" +
            "      wcdtxy_value2 = #{wcdtxyValue2,jdbcType=INTEGER},\n" +
            "      wcdtxy_value3 = #{wcdtxyValue3,jdbcType=INTEGER},\n" +
            "      wcdtxy_value4 = #{wcdtxyValue4,jdbcType=INTEGER},\n" +
            "      wcdtxy_value5 = #{wcdtxyValue5,jdbcType=INTEGER},\n" +
            "      wcdtxy_ssy_value = #{wcdtxySsyValue,jdbcType=INTEGER},\n" +
            "      wcdtxy_szy_value = #{wcdtxySzyValue,jdbcType=INTEGER},\n" +
            "      wcdtxy_result = #{wcdtxyResult,jdbcType=INTEGER},\n" +
            "      qmxjc_yld_test1 = #{qmxjcYldTest1,jdbcType=INTEGER},\n" +
            "      qmxjc_yld_test2 = #{qmxjcYldTest2,jdbcType=INTEGER},\n" +
            "      qmxjc_wc = #{qmxjcWc,jdbcType=VARCHAR},\n" +
            "      qmxjc_ylsz_value1 = #{qmxjcYlszValue1,jdbcType=INTEGER},\n" +
            "      qmxjc_ylsz_value2 = #{qmxjcYlszValue2,jdbcType=INTEGER},\n" +
            "      qmxjc_ylsz_value3 = #{qmxjcYlszValue3,jdbcType=INTEGER},\n" +
            "      qmxjc_ylsz_value4 = #{qmxjcYlszValue4,jdbcType=INTEGER},\n" +
            "      qmxjc_qmxsz_value1 = #{qmxjcQmxszValue1,jdbcType=INTEGER},\n" +
            "      qmxjc_qmxsz_value2 = #{qmxjcQmxszValue2,jdbcType=INTEGER},\n" +
            "      qmxjc_result = #{qmxjcResult,jdbcType=INTEGER},\n" +
            "      sgbj_result = #{sgbjResult,jdbcType=INTEGER},\n" +
            "      bjxjc_result = #{bjxjcResult,jdbcType=INTEGER},\n" +
            "      jyjc_result = #{jyjcResult,jdbcType=INTEGER},\n" +
            "      state = #{state,jdbcType=VARCHAR},\n" +
            "      spare2 = #{spare2,jdbcType=VARCHAR},\n" +
            "      spare3 = #{spare3,jdbcType=VARCHAR}" +
            "    where dcid = #{dcid}")
    public void updateMen(Dcsjhy dcsjhy);

    //保存多参数监护仪检测表(幼儿)
    @Insert("insert into dcsjhy_c( jcyq_id, eq_id, \n" +
            "      tester, test_time, auditor, \n" +
            "      shr_jcjl, shsj_time, jcjl, \n" +
            "      jcsm, xl_test1, xl_test2, \n" +
            "      xl_test3, xl_test4, xl_test5, \n" +
            "      xl_test6, xl_value1, xl_value2, \n" +
            "      xl_value3, xl_value4, xl_value5, \n" +
            "      xl_value6, xl_wc, xl_result, \n" +
            "      hxl_test1, hxl_test2, hxl_test3, \n" +
            "      hxl_test4, hxl_test5, hxl_test6, \n" +
            "      hxl_value1, hxl_value2, hxl_value3, \n" +
            "      hxl_value4, hxl_value5, hxl_value6, \n" +
            "      hxl_wc, hxl_result, xybhd_test1, \n" +
            "      xybhd_test2, xybhd_test3, xybhd_test4, \n" +
            "      xybhd_test5, xybhd_value1, xybhd_value2, \n" +
            "      xybhd_value3, xybhd_value4, xybhd_value5, \n" +
            "      xybhd_wc, xybhd_result, wcxy_jt_test1, \n" +
            "      wcxy_jt_test2, wcxy_jt_test3, wcxy_jt_test4, \n" +
            "      wcxy_jt_test5, wcxy_jt_xsz1_value1, wcxy_jt_xsz1_value2, \n" +
            "      wcxy_jt_xsz1_value3, wcxy_jt_xsz1_value4, wcxy_jt_xsz1_value5, \n" +
            "      wcxy_jt_xsz2_value1, wcxy_jt_xsz2_value2, wcxy_jt_xsz2_value3, \n" +
            "      wcxy_jt_xsz2_value4, wcxy_jt_xsz2_value5, wcxy_jt_pjz_value1, \n" +
            "      wcxy_jt_pjz_value2, wcxy_jt_pjz_value3, wcxy_jt_pjz_value4, \n" +
            "      wcxy_jt_pjz_value5, wcxy_syz_wc, wcxy_sc_wc, \n" +
            "      wcxy_jt_result, wcdtxy_sdz_test1, wcdtxy_sdz_test2, \n" +
            "      wcdtxy_xl, wcdtxy_wc, wcdtxy_value1, \n" +
            "      wcdtxy_value2, wcdtxy_value3, wcdtxy_value4, \n" +
            "      wcdtxy_value5, wcdtxy_ssy_value, wcdtxy_szy_value, \n" +
            "      wcdtxy_result, qmxjc_yld_test1, qmxjc_yld_test2, \n" +
            "      qmxjc_wc, qmxjc_ylsz_value1, qmxjc_ylsz_value2, \n" +
            "      qmxjc_ylsz_value3, qmxjc_ylsz_value4, qmxjc_qmxsz_value1, \n" +
            "      qmxjc_qmxsz_value2, qmxjc_result, sgbj_result, \n" +
            "      bjxjc_result, jyjc_result, state, \n" +
            "      spare2, spare3)\n" +
            "    values ( #{jcyqId,jdbcType=INTEGER}, #{eqId,jdbcType=INTEGER}, \n" +
            "      #{tester,jdbcType=VARCHAR}, #{testTime,jdbcType=TIMESTAMP}, #{auditor,jdbcType=VARCHAR}, \n" +
            "      #{shrJcjl,jdbcType=VARCHAR}, #{shsjTime,jdbcType=TIMESTAMP}, #{jcjl,jdbcType=VARCHAR}, \n" +
            "      #{jcsm,jdbcType=VARCHAR}, #{xlTest1,jdbcType=INTEGER}, #{xlTest2,jdbcType=INTEGER}, \n" +
            "      #{xlTest3,jdbcType=INTEGER}, #{xlTest4,jdbcType=INTEGER}, #{xlTest5,jdbcType=INTEGER}, \n" +
            "      #{xlTest6,jdbcType=INTEGER}, #{xlValue1,jdbcType=INTEGER}, #{xlValue2,jdbcType=INTEGER}, \n" +
            "      #{xlValue3,jdbcType=INTEGER}, #{xlValue4,jdbcType=INTEGER}, #{xlValue5,jdbcType=INTEGER}, \n" +
            "      #{xlValue6,jdbcType=INTEGER}, #{xlWc,jdbcType=VARCHAR}, #{xlResult,jdbcType=TINYINT}, \n" +
            "      #{hxlTest1,jdbcType=INTEGER}, #{hxlTest2,jdbcType=INTEGER}, #{hxlTest3,jdbcType=INTEGER}, \n" +
            "      #{hxlTest4,jdbcType=INTEGER}, #{hxlTest5,jdbcType=INTEGER}, #{hxlTest6,jdbcType=INTEGER}, \n" +
            "      #{hxlValue1,jdbcType=INTEGER}, #{hxlValue2,jdbcType=INTEGER}, #{hxlValue3,jdbcType=INTEGER}, \n" +
            "      #{hxlValue4,jdbcType=INTEGER}, #{hxlValue5,jdbcType=INTEGER}, #{hxlValue6,jdbcType=INTEGER}, \n" +
            "      #{hxlWc,jdbcType=VARCHAR}, #{hxlResult,jdbcType=TINYINT}, #{xybhdTest1,jdbcType=INTEGER}, \n" +
            "      #{xybhdTest2,jdbcType=INTEGER}, #{xybhdTest3,jdbcType=INTEGER}, #{xybhdTest4,jdbcType=INTEGER}, \n" +
            "      #{xybhdTest5,jdbcType=INTEGER}, #{xybhdValue1,jdbcType=INTEGER}, #{xybhdValue2,jdbcType=INTEGER}, \n" +
            "      #{xybhdValue3,jdbcType=INTEGER}, #{xybhdValue4,jdbcType=INTEGER}, #{xybhdValue5,jdbcType=INTEGER}, \n" +
            "      #{xybhdWc,jdbcType=VARCHAR}, #{xybhdResult,jdbcType=TINYINT}, #{wcxyJtTest1,jdbcType=INTEGER}, \n" +
            "      #{wcxyJtTest2,jdbcType=INTEGER}, #{wcxyJtTest3,jdbcType=INTEGER}, #{wcxyJtTest4,jdbcType=INTEGER}, \n" +
            "      #{wcxyJtTest5,jdbcType=INTEGER}, #{wcxyJtXsz1Value1,jdbcType=INTEGER}, #{wcxyJtXsz1Value2,jdbcType=INTEGER}, \n" +
            "      #{wcxyJtXsz1Value3,jdbcType=INTEGER}, #{wcxyJtXsz1Value4,jdbcType=INTEGER}, #{wcxyJtXsz1Value5,jdbcType=INTEGER}, \n" +
            "      #{wcxyJtXsz2Value1,jdbcType=INTEGER}, #{wcxyJtXsz2Value2,jdbcType=INTEGER}, #{wcxyJtXsz2Value3,jdbcType=INTEGER}, \n" +
            "      #{wcxyJtXsz2Value4,jdbcType=INTEGER}, #{wcxyJtXsz2Value5,jdbcType=INTEGER}, #{wcxyJtPjzValue1,jdbcType=INTEGER}, \n" +
            "      #{wcxyJtPjzValue2,jdbcType=INTEGER}, #{wcxyJtPjzValue3,jdbcType=INTEGER}, #{wcxyJtPjzValue4,jdbcType=INTEGER}, \n" +
            "      #{wcxyJtPjzValue5,jdbcType=INTEGER}, #{wcxySyzWc,jdbcType=VARCHAR}, #{wcxyScWc,jdbcType=VARCHAR}, \n" +
            "      #{wcxyJtResult,jdbcType=INTEGER}, #{wcdtxySdzTest1,jdbcType=INTEGER}, #{wcdtxySdzTest2,jdbcType=INTEGER}, \n" +
            "      #{wcdtxyXl,jdbcType=INTEGER}, #{wcdtxyWc,jdbcType=INTEGER}, #{wcdtxyValue1,jdbcType=INTEGER}, \n" +
            "      #{wcdtxyValue2,jdbcType=INTEGER}, #{wcdtxyValue3,jdbcType=INTEGER}, #{wcdtxyValue4,jdbcType=INTEGER}, \n" +
            "      #{wcdtxyValue5,jdbcType=INTEGER}, #{wcdtxySsyValue,jdbcType=INTEGER}, #{wcdtxySzyValue,jdbcType=INTEGER}, \n" +
            "      #{wcdtxyResult,jdbcType=INTEGER}, #{qmxjcYldTest1,jdbcType=INTEGER}, #{qmxjcYldTest2,jdbcType=INTEGER}, \n" +
            "      #{qmxjcWc,jdbcType=VARCHAR}, #{qmxjcYlszValue1,jdbcType=INTEGER}, #{qmxjcYlszValue2,jdbcType=INTEGER}, \n" +
            "      #{qmxjcYlszValue3,jdbcType=INTEGER}, #{qmxjcYlszValue4,jdbcType=INTEGER}, #{qmxjcQmxszValue1,jdbcType=INTEGER}, \n" +
            "      #{qmxjcQmxszValue2,jdbcType=INTEGER}, #{qmxjcResult,jdbcType=INTEGER}, #{sgbjResult,jdbcType=INTEGER}, \n" +
            "      #{bjxjcResult,jdbcType=INTEGER}, #{jyjcResult,jdbcType=INTEGER}, #{state,jdbcType=VARCHAR}, \n" +
            "      #{spare2,jdbcType=VARCHAR}, #{spare3,jdbcType=VARCHAR})")
    @Options(useGeneratedKeys = true, keyProperty = "dcid", keyColumn = "dcid")
    void saveChild(Dcsjhy dcsjhy);

    @Update("update dcsjhy_c\n" +
            "    set jcyq_id = #{jcyqId,jdbcType=INTEGER},\n" +
            "      eq_id = #{eqId,jdbcType=INTEGER},\n" +
            "      tester = #{tester,jdbcType=VARCHAR},\n" +
            "      test_time = #{testTime,jdbcType=TIMESTAMP},\n" +
            "      auditor = #{auditor,jdbcType=VARCHAR},\n" +
            "      shr_jcjl = #{shrJcjl,jdbcType=VARCHAR},\n" +
            "      shsj_time = #{shsjTime,jdbcType=TIMESTAMP},\n" +
            "      jcjl = #{jcjl,jdbcType=VARCHAR},\n" +
            "      jcsm = #{jcsm,jdbcType=VARCHAR},\n" +
            "      xl_test1 = #{xlTest1,jdbcType=INTEGER},\n" +
            "      xl_test2 = #{xlTest2,jdbcType=INTEGER},\n" +
            "      xl_test3 = #{xlTest3,jdbcType=INTEGER},\n" +
            "      xl_test4 = #{xlTest4,jdbcType=INTEGER},\n" +
            "      xl_test5 = #{xlTest5,jdbcType=INTEGER},\n" +
            "      xl_test6 = #{xlTest6,jdbcType=INTEGER},\n" +
            "      xl_value1 = #{xlValue1,jdbcType=INTEGER},\n" +
            "      xl_value2 = #{xlValue2,jdbcType=INTEGER},\n" +
            "      xl_value3 = #{xlValue3,jdbcType=INTEGER},\n" +
            "      xl_value4 = #{xlValue4,jdbcType=INTEGER},\n" +
            "      xl_value5 = #{xlValue5,jdbcType=INTEGER},\n" +
            "      xl_value6 = #{xlValue6,jdbcType=INTEGER},\n" +
            "      xl_wc = #{xlWc,jdbcType=VARCHAR},\n" +
            "      xl_result = #{xlResult,jdbcType=TINYINT},\n" +
            "      hxl_test1 = #{hxlTest1,jdbcType=INTEGER},\n" +
            "      hxl_test2 = #{hxlTest2,jdbcType=INTEGER},\n" +
            "      hxl_test3 = #{hxlTest3,jdbcType=INTEGER},\n" +
            "      hxl_test4 = #{hxlTest4,jdbcType=INTEGER},\n" +
            "      hxl_test5 = #{hxlTest5,jdbcType=INTEGER},\n" +
            "      hxl_test6 = #{hxlTest6,jdbcType=INTEGER},\n" +
            "      hxl_value1 = #{hxlValue1,jdbcType=INTEGER},\n" +
            "      hxl_value2 = #{hxlValue2,jdbcType=INTEGER},\n" +
            "      hxl_value3 = #{hxlValue3,jdbcType=INTEGER},\n" +
            "      hxl_value4 = #{hxlValue4,jdbcType=INTEGER},\n" +
            "      hxl_value5 = #{hxlValue5,jdbcType=INTEGER},\n" +
            "      hxl_value6 = #{hxlValue6,jdbcType=INTEGER},\n" +
            "      hxl_wc = #{hxlWc,jdbcType=VARCHAR},\n" +
            "      hxl_result = #{hxlResult,jdbcType=TINYINT},\n" +
            "      xybhd_test1 = #{xybhdTest1,jdbcType=INTEGER},\n" +
            "      xybhd_test2 = #{xybhdTest2,jdbcType=INTEGER},\n" +
            "      xybhd_test3 = #{xybhdTest3,jdbcType=INTEGER},\n" +
            "      xybhd_test4 = #{xybhdTest4,jdbcType=INTEGER},\n" +
            "      xybhd_test5 = #{xybhdTest5,jdbcType=INTEGER},\n" +
            "      xybhd_value1 = #{xybhdValue1,jdbcType=INTEGER},\n" +
            "      xybhd_value2 = #{xybhdValue2,jdbcType=INTEGER},\n" +
            "      xybhd_value3 = #{xybhdValue3,jdbcType=INTEGER},\n" +
            "      xybhd_value4 = #{xybhdValue4,jdbcType=INTEGER},\n" +
            "      xybhd_value5 = #{xybhdValue5,jdbcType=INTEGER},\n" +
            "      xybhd_wc = #{xybhdWc,jdbcType=VARCHAR},\n" +
            "      xybhd_result = #{xybhdResult,jdbcType=TINYINT},\n" +
            "      wcxy_jt_test1 = #{wcxyJtTest1,jdbcType=INTEGER},\n" +
            "      wcxy_jt_test2 = #{wcxyJtTest2,jdbcType=INTEGER},\n" +
            "      wcxy_jt_test3 = #{wcxyJtTest3,jdbcType=INTEGER},\n" +
            "      wcxy_jt_test4 = #{wcxyJtTest4,jdbcType=INTEGER},\n" +
            "      wcxy_jt_test5 = #{wcxyJtTest5,jdbcType=INTEGER},\n" +
            "      wcxy_jt_xsz1_value1 = #{wcxyJtXsz1Value1,jdbcType=INTEGER},\n" +
            "      wcxy_jt_xsz1_value2 = #{wcxyJtXsz1Value2,jdbcType=INTEGER},\n" +
            "      wcxy_jt_xsz1_value3 = #{wcxyJtXsz1Value3,jdbcType=INTEGER},\n" +
            "      wcxy_jt_xsz1_value4 = #{wcxyJtXsz1Value4,jdbcType=INTEGER},\n" +
            "      wcxy_jt_xsz1_value5 = #{wcxyJtXsz1Value5,jdbcType=INTEGER},\n" +
            "      wcxy_jt_xsz2_value1 = #{wcxyJtXsz2Value1,jdbcType=INTEGER},\n" +
            "      wcxy_jt_xsz2_value2 = #{wcxyJtXsz2Value2,jdbcType=INTEGER},\n" +
            "      wcxy_jt_xsz2_value3 = #{wcxyJtXsz2Value3,jdbcType=INTEGER},\n" +
            "      wcxy_jt_xsz2_value4 = #{wcxyJtXsz2Value4,jdbcType=INTEGER},\n" +
            "      wcxy_jt_xsz2_value5 = #{wcxyJtXsz2Value5,jdbcType=INTEGER},\n" +
            "      wcxy_jt_pjz_value1 = #{wcxyJtPjzValue1,jdbcType=INTEGER},\n" +
            "      wcxy_jt_pjz_value2 = #{wcxyJtPjzValue2,jdbcType=INTEGER},\n" +
            "      wcxy_jt_pjz_value3 = #{wcxyJtPjzValue3,jdbcType=INTEGER},\n" +
            "      wcxy_jt_pjz_value4 = #{wcxyJtPjzValue4,jdbcType=INTEGER},\n" +
            "      wcxy_jt_pjz_value5 = #{wcxyJtPjzValue5,jdbcType=INTEGER},\n" +
            "      wcxy_syz_wc = #{wcxySyzWc,jdbcType=VARCHAR},\n" +
            "      wcxy_sc_wc = #{wcxyScWc,jdbcType=VARCHAR},\n" +
            "      wcxy_jt_result = #{wcxyJtResult,jdbcType=INTEGER},\n" +
            "      wcdtxy_sdz_test1 = #{wcdtxySdzTest1,jdbcType=INTEGER},\n" +
            "      wcdtxy_sdz_test2 = #{wcdtxySdzTest2,jdbcType=INTEGER},\n" +
            "      wcdtxy_xl = #{wcdtxyXl,jdbcType=INTEGER},\n" +
            "      wcdtxy_wc = #{wcdtxyWc,jdbcType=INTEGER},\n" +
            "      wcdtxy_value1 = #{wcdtxyValue1,jdbcType=INTEGER},\n" +
            "      wcdtxy_value2 = #{wcdtxyValue2,jdbcType=INTEGER},\n" +
            "      wcdtxy_value3 = #{wcdtxyValue3,jdbcType=INTEGER},\n" +
            "      wcdtxy_value4 = #{wcdtxyValue4,jdbcType=INTEGER},\n" +
            "      wcdtxy_value5 = #{wcdtxyValue5,jdbcType=INTEGER},\n" +
            "      wcdtxy_ssy_value = #{wcdtxySsyValue,jdbcType=INTEGER},\n" +
            "      wcdtxy_szy_value = #{wcdtxySzyValue,jdbcType=INTEGER},\n" +
            "      wcdtxy_result = #{wcdtxyResult,jdbcType=INTEGER},\n" +
            "      qmxjc_yld_test1 = #{qmxjcYldTest1,jdbcType=INTEGER},\n" +
            "      qmxjc_yld_test2 = #{qmxjcYldTest2,jdbcType=INTEGER},\n" +
            "      qmxjc_wc = #{qmxjcWc,jdbcType=VARCHAR},\n" +
            "      qmxjc_ylsz_value1 = #{qmxjcYlszValue1,jdbcType=INTEGER},\n" +
            "      qmxjc_ylsz_value2 = #{qmxjcYlszValue2,jdbcType=INTEGER},\n" +
            "      qmxjc_ylsz_value3 = #{qmxjcYlszValue3,jdbcType=INTEGER},\n" +
            "      qmxjc_ylsz_value4 = #{qmxjcYlszValue4,jdbcType=INTEGER},\n" +
            "      qmxjc_qmxsz_value1 = #{qmxjcQmxszValue1,jdbcType=INTEGER},\n" +
            "      qmxjc_qmxsz_value2 = #{qmxjcQmxszValue2,jdbcType=INTEGER},\n" +
            "      qmxjc_result = #{qmxjcResult,jdbcType=INTEGER},\n" +
            "      sgbj_result = #{sgbjResult,jdbcType=INTEGER},\n" +
            "      bjxjc_result = #{bjxjcResult,jdbcType=INTEGER},\n" +
            "      jyjc_result = #{jyjcResult,jdbcType=INTEGER},\n" +
            "      state = #{state,jdbcType=VARCHAR},\n" +
            "      spare2 = #{spare2,jdbcType=VARCHAR},\n" +
            "      spare3 = #{spare3,jdbcType=VARCHAR}" +
            "    where dcid = #{dcid}")
    public void updateChild(Dcsjhy dcsjhy);


    //根据设备Id,检测仪器Id以及状态查询最后一条记录
    @Select("select * from ${tableName} where eq_id=#{eqId} and jcyq_id=#{jcyqId} order by test_time desc, dcid desc limit 1")
    Dcsjhy findByEqIdandJcyqIdLast(@Param("tableName") String tableName, @Param("eqId") String eqId, @Param("jcyqId") String jcyqId);

    //根据设备Id,检测仪器Id以及状态查询
    @Select("select * from ${tableName} where eq_id=#{eqId} and jcyq_id=#{jcyqId}")
    List<Dcsjhy> findByEqIdandJcyqId(@Param("tableName") String tableName, @Param("eqId") String eqId, @Param("jcyqId") String jcyqId);

    /*@Select("select * from dcsjhy_m order by dcid desc limit 1")
    Dcsjhy findDcsjhyMan();
    @Select("select * from dcsjhy_m where eq_id=#{eqId} and jcyq_id=#{jcyqId}")
    List<Dcsjhy> findByEqIdandJcyqIdMan(@Param("eqId")String eqId,@Param("jcyqId")String jcyqId);
    //查询多参数监护仪检测单条数据（幼儿）
    @Select("select * from dcsjhy_c order by dcid desc limit 1")
    Dcsjhy findDcsjhyChild();
    @Select("select d.* from dcsjhy_c d where eq_id=#{eqId} and jcyq_id=#{jcyqId}")
    List<Dcsjhy>  findByEqIdandJcyqIdCh(@Param("eqId")String eqId,@Param("jcyqId")String jcyqId);*/
    //查询多参数监护仪检测单条数据（成人）
    @Select("select * from dcsjhy_m")
    List<Dcsjhy> findDcsjhyMans();

    //查询多参数监护仪检测单条数据（幼儿）
    @Select("select * from dcsjhy_c")
    List<Dcsjhy> findDcsjhyChilds();

    //删除数据
    @Delete("delete from dcsjhy_m where eq_id=#{eqId} and jcyq_id=#{jcyqId}")
    void delectMen(@Param("eqId") String eqId, @Param("jcyqId") String jcyqId);

    @Delete("delete from dcsjhy_c where eq_id=#{eqId} and jcyq_id=#{jcyqId}")
    void delectChi(@Param("eqId") String eqId, @Param("jcyqId") String jcyqId);

    //修改状态
    @Update("update dcsjhy_m set state=#{state} where dcid=#{dcid}")
    void updateStateM(@Param("dcid") Integer dcid, @Param("state") Integer state);

    @Update("update dcsjhy_c set state=#{state} where dcid=#{dcid}")
    void updateStateC(@Param("dcid") Integer dcid, @Param("state") Integer state);

    //根据id查询
    @Select("select * from dcsjhy_m where dcid=#{dcid}")
    Dcsjhy findByDcidM(@Param("dcid") Integer dcid);

    @Select("select * from dcsjhy_c where dcid=#{dcid}")
    Dcsjhy findByDcidC(@Param("dcid") Integer dcid);

    //修改审核人意见
    @Update("update dcsjhy_m set shr_jcjl=#{shrJcjl},auditor=#{auditor},shsj_time=#{shsjTime} where dcid=#{dcid}")
    void updateShrJcjyM(@Param("dcid") Integer dcid, @Param("shrJcjl") String shrJcjl, @Param("auditor") String auditor, @Param("shsjTime") Date shsjTime);

    @Update("update dcsjhy_c set shr_jcjl=#{shrJcjl},auditor=#{auditor},shsj_time=#{shsjTime} where dqjcid=#{dqjcid}")
    void updateShrJcjyC(@Param("dcid") Integer dcid, @Param("shrJcjl") String shrJcjl, @Param("auditor") String auditor, @Param("shsjTime") Date shsjTime);

    //根据设备id和检测仪器id查询出最后一条检测数据
    //现在默认查的为成人，（后续要区分成人和新生儿）
    @Select("select * from dcsjhy_m where eq_id = #{eq_id} and jcyq_id = #{jcyqId} order by test_time desc , dcid desc limit 1 ")
    Dcsjhy findByEqIdandJcyqId1(String eqId, String jcyqId);
}