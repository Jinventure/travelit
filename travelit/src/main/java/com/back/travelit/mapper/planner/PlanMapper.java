package com.back.travelit.mapper.planner;

import com.back.travelit.domain.common.PagingSearchCriteria;
import com.back.travelit.dto.request.location.SearchRequest;
import com.back.travelit.dto.request.planner.PlanCreateReq;
import com.back.travelit.dto.request.planner.ScheduleCreateReq;
import com.back.travelit.dto.request.planner.ScheduleReplaceReq;
import com.back.travelit.dto.response.planner.PlanDetail;
import com.back.travelit.dto.response.planner.PlanLocCodeRes;
import com.back.travelit.dto.response.planner.PlanLocInfo;
import com.back.travelit.dto.response.planner.PlannerList;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PlanMapper {

//planMapper.xml
    //플래너 생성 (플래너제목,여행일정 insert)
    void insertMakePlan(PlanCreateReq createReqDTO);

    //플래너 생성 (여행지 지역코드 insert)
    void insertMakePlanLoc(@Param("strArr") List<String> strArr, @Param("planId") int planId);

    //지역 코드로 지역명 값 조회 for 플래너 여행지역
    List<PlanLocCodeRes> selectAllLocCode(@Param("locCodes") List<String> strArr);

    //유저 여행 상세 스케줄 생성
    //여행 일차 저장
    void insertMakeSched(ScheduleCreateReq schedCreateReqDTO);

    //유저 스케줄 일정 저장
    void insertMakeSchedLocInfo(@Param("locInfoIds")List<Integer> locInfoIds, @Param("schedId") int schedId);

    //플래너 상세 일정 수정
    // 일정 삭제
    void deleteSched (int planId);

    //새로운 일차 생성
    void insertReschedule (ScheduleReplaceReq scheduleReplaceReq);

    //새로운 일정 생성
    void insertRescheduleLocInfo (ScheduleReplaceReq scheduleReplaceReq);

    //플래너 삭제
    void deletePlan(@Param("planId")int planId);

//planListMapper.xml
    //유저 즐겨찾기 지역 정보 조회
    List<PlanLocInfo> selectMarkLocInfo(@Param("userId") int userId);

    //전체 지역 정보 조회
    List<PlanLocInfo> selectAllLocInfo(PagingSearchCriteria pagingSearchCriteria);

    //플래너 상세 보기
    List<PlanDetail> selectPlanDetail(@Param("planId") int planId);

    //내 플래너 리스트
    List<PlannerList> selectMyPlan(@Param("userId") int userId);

    //전체 플래너 리스트
    List<PlannerList> selectAllPlan(PagingSearchCriteria pagingSearchCriteria);

    //페이징처리
    int count(SearchRequest params);


}
