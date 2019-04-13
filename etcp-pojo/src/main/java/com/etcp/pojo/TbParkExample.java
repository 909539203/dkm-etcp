package com.etcp.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TbParkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbParkExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andParkIdIsNull() {
            addCriterion("park_id is null");
            return (Criteria) this;
        }

        public Criteria andParkIdIsNotNull() {
            addCriterion("park_id is not null");
            return (Criteria) this;
        }

        public Criteria andParkIdEqualTo(Long value) {
            addCriterion("park_id =", value, "parkId");
            return (Criteria) this;
        }

        public Criteria andParkIdNotEqualTo(Long value) {
            addCriterion("park_id <>", value, "parkId");
            return (Criteria) this;
        }

        public Criteria andParkIdGreaterThan(Long value) {
            addCriterion("park_id >", value, "parkId");
            return (Criteria) this;
        }

        public Criteria andParkIdGreaterThanOrEqualTo(Long value) {
            addCriterion("park_id >=", value, "parkId");
            return (Criteria) this;
        }

        public Criteria andParkIdLessThan(Long value) {
            addCriterion("park_id <", value, "parkId");
            return (Criteria) this;
        }

        public Criteria andParkIdLessThanOrEqualTo(Long value) {
            addCriterion("park_id <=", value, "parkId");
            return (Criteria) this;
        }

        public Criteria andParkIdIn(List<Long> values) {
            addCriterion("park_id in", values, "parkId");
            return (Criteria) this;
        }

        public Criteria andParkIdNotIn(List<Long> values) {
            addCriterion("park_id not in", values, "parkId");
            return (Criteria) this;
        }

        public Criteria andParkIdBetween(Long value1, Long value2) {
            addCriterion("park_id between", value1, value2, "parkId");
            return (Criteria) this;
        }

        public Criteria andParkIdNotBetween(Long value1, Long value2) {
            addCriterion("park_id not between", value1, value2, "parkId");
            return (Criteria) this;
        }

        public Criteria andVillageIdIsNull() {
            addCriterion("village_id is null");
            return (Criteria) this;
        }

        public Criteria andVillageIdIsNotNull() {
            addCriterion("village_id is not null");
            return (Criteria) this;
        }

        public Criteria andVillageIdEqualTo(Long value) {
            addCriterion("village_id =", value, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdNotEqualTo(Long value) {
            addCriterion("village_id <>", value, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdGreaterThan(Long value) {
            addCriterion("village_id >", value, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdGreaterThanOrEqualTo(Long value) {
            addCriterion("village_id >=", value, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdLessThan(Long value) {
            addCriterion("village_id <", value, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdLessThanOrEqualTo(Long value) {
            addCriterion("village_id <=", value, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdIn(List<Long> values) {
            addCriterion("village_id in", values, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdNotIn(List<Long> values) {
            addCriterion("village_id not in", values, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdBetween(Long value1, Long value2) {
            addCriterion("village_id between", value1, value2, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdNotBetween(Long value1, Long value2) {
            addCriterion("village_id not between", value1, value2, "villageId");
            return (Criteria) this;
        }

        public Criteria andParkgroupIdIsNull() {
            addCriterion("parkGroup_id is null");
            return (Criteria) this;
        }

        public Criteria andParkgroupIdIsNotNull() {
            addCriterion("parkGroup_id is not null");
            return (Criteria) this;
        }

        public Criteria andParkgroupIdEqualTo(Integer value) {
            addCriterion("parkGroup_id =", value, "parkgroupId");
            return (Criteria) this;
        }

        public Criteria andParkgroupIdNotEqualTo(Integer value) {
            addCriterion("parkGroup_id <>", value, "parkgroupId");
            return (Criteria) this;
        }

        public Criteria andParkgroupIdGreaterThan(Integer value) {
            addCriterion("parkGroup_id >", value, "parkgroupId");
            return (Criteria) this;
        }

        public Criteria andParkgroupIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parkGroup_id >=", value, "parkgroupId");
            return (Criteria) this;
        }

        public Criteria andParkgroupIdLessThan(Integer value) {
            addCriterion("parkGroup_id <", value, "parkgroupId");
            return (Criteria) this;
        }

        public Criteria andParkgroupIdLessThanOrEqualTo(Integer value) {
            addCriterion("parkGroup_id <=", value, "parkgroupId");
            return (Criteria) this;
        }

        public Criteria andParkgroupIdIn(List<Integer> values) {
            addCriterion("parkGroup_id in", values, "parkgroupId");
            return (Criteria) this;
        }

        public Criteria andParkgroupIdNotIn(List<Integer> values) {
            addCriterion("parkGroup_id not in", values, "parkgroupId");
            return (Criteria) this;
        }

        public Criteria andParkgroupIdBetween(Integer value1, Integer value2) {
            addCriterion("parkGroup_id between", value1, value2, "parkgroupId");
            return (Criteria) this;
        }

        public Criteria andParkgroupIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parkGroup_id not between", value1, value2, "parkgroupId");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andBatterystateIsNull() {
            addCriterion("batteryState is null");
            return (Criteria) this;
        }

        public Criteria andBatterystateIsNotNull() {
            addCriterion("batteryState is not null");
            return (Criteria) this;
        }

        public Criteria andBatterystateEqualTo(Integer value) {
            addCriterion("batteryState =", value, "batterystate");
            return (Criteria) this;
        }

        public Criteria andBatterystateNotEqualTo(Integer value) {
            addCriterion("batteryState <>", value, "batterystate");
            return (Criteria) this;
        }

        public Criteria andBatterystateGreaterThan(Integer value) {
            addCriterion("batteryState >", value, "batterystate");
            return (Criteria) this;
        }

        public Criteria andBatterystateGreaterThanOrEqualTo(Integer value) {
            addCriterion("batteryState >=", value, "batterystate");
            return (Criteria) this;
        }

        public Criteria andBatterystateLessThan(Integer value) {
            addCriterion("batteryState <", value, "batterystate");
            return (Criteria) this;
        }

        public Criteria andBatterystateLessThanOrEqualTo(Integer value) {
            addCriterion("batteryState <=", value, "batterystate");
            return (Criteria) this;
        }

        public Criteria andBatterystateIn(List<Integer> values) {
            addCriterion("batteryState in", values, "batterystate");
            return (Criteria) this;
        }

        public Criteria andBatterystateNotIn(List<Integer> values) {
            addCriterion("batteryState not in", values, "batterystate");
            return (Criteria) this;
        }

        public Criteria andBatterystateBetween(Integer value1, Integer value2) {
            addCriterion("batteryState between", value1, value2, "batterystate");
            return (Criteria) this;
        }

        public Criteria andBatterystateNotBetween(Integer value1, Integer value2) {
            addCriterion("batteryState not between", value1, value2, "batterystate");
            return (Criteria) this;
        }

        public Criteria andErrorcodeIsNull() {
            addCriterion("errorCode is null");
            return (Criteria) this;
        }

        public Criteria andErrorcodeIsNotNull() {
            addCriterion("errorCode is not null");
            return (Criteria) this;
        }

        public Criteria andErrorcodeEqualTo(Integer value) {
            addCriterion("errorCode =", value, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeNotEqualTo(Integer value) {
            addCriterion("errorCode <>", value, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeGreaterThan(Integer value) {
            addCriterion("errorCode >", value, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("errorCode >=", value, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeLessThan(Integer value) {
            addCriterion("errorCode <", value, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeLessThanOrEqualTo(Integer value) {
            addCriterion("errorCode <=", value, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeIn(List<Integer> values) {
            addCriterion("errorCode in", values, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeNotIn(List<Integer> values) {
            addCriterion("errorCode not in", values, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeBetween(Integer value1, Integer value2) {
            addCriterion("errorCode between", value1, value2, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeNotBetween(Integer value1, Integer value2) {
            addCriterion("errorCode not between", value1, value2, "errorcode");
            return (Criteria) this;
        }

        public Criteria andDistanceIsNull() {
            addCriterion("distance is null");
            return (Criteria) this;
        }

        public Criteria andDistanceIsNotNull() {
            addCriterion("distance is not null");
            return (Criteria) this;
        }

        public Criteria andDistanceEqualTo(Integer value) {
            addCriterion("distance =", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceNotEqualTo(Integer value) {
            addCriterion("distance <>", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceGreaterThan(Integer value) {
            addCriterion("distance >", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("distance >=", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceLessThan(Integer value) {
            addCriterion("distance <", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceLessThanOrEqualTo(Integer value) {
            addCriterion("distance <=", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceIn(List<Integer> values) {
            addCriterion("distance in", values, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceNotIn(List<Integer> values) {
            addCriterion("distance not in", values, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceBetween(Integer value1, Integer value2) {
            addCriterion("distance between", value1, value2, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceNotBetween(Integer value1, Integer value2) {
            addCriterion("distance not between", value1, value2, "distance");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andOwerIdIsNull() {
            addCriterion("ower_id is null");
            return (Criteria) this;
        }

        public Criteria andOwerIdIsNotNull() {
            addCriterion("ower_id is not null");
            return (Criteria) this;
        }

        public Criteria andOwerIdEqualTo(Long value) {
            addCriterion("ower_id =", value, "owerId");
            return (Criteria) this;
        }

        public Criteria andOwerIdNotEqualTo(Long value) {
            addCriterion("ower_id <>", value, "owerId");
            return (Criteria) this;
        }

        public Criteria andOwerIdGreaterThan(Long value) {
            addCriterion("ower_id >", value, "owerId");
            return (Criteria) this;
        }

        public Criteria andOwerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ower_id >=", value, "owerId");
            return (Criteria) this;
        }

        public Criteria andOwerIdLessThan(Long value) {
            addCriterion("ower_id <", value, "owerId");
            return (Criteria) this;
        }

        public Criteria andOwerIdLessThanOrEqualTo(Long value) {
            addCriterion("ower_id <=", value, "owerId");
            return (Criteria) this;
        }

        public Criteria andOwerIdIn(List<Long> values) {
            addCriterion("ower_id in", values, "owerId");
            return (Criteria) this;
        }

        public Criteria andOwerIdNotIn(List<Long> values) {
            addCriterion("ower_id not in", values, "owerId");
            return (Criteria) this;
        }

        public Criteria andOwerIdBetween(Long value1, Long value2) {
            addCriterion("ower_id between", value1, value2, "owerId");
            return (Criteria) this;
        }

        public Criteria andOwerIdNotBetween(Long value1, Long value2) {
            addCriterion("ower_id not between", value1, value2, "owerId");
            return (Criteria) this;
        }

        public Criteria andRentstatusIsNull() {
            addCriterion("rentStatus is null");
            return (Criteria) this;
        }

        public Criteria andRentstatusIsNotNull() {
            addCriterion("rentStatus is not null");
            return (Criteria) this;
        }

        public Criteria andRentstatusEqualTo(Integer value) {
            addCriterion("rentStatus =", value, "rentstatus");
            return (Criteria) this;
        }

        public Criteria andRentstatusNotEqualTo(Integer value) {
            addCriterion("rentStatus <>", value, "rentstatus");
            return (Criteria) this;
        }

        public Criteria andRentstatusGreaterThan(Integer value) {
            addCriterion("rentStatus >", value, "rentstatus");
            return (Criteria) this;
        }

        public Criteria andRentstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("rentStatus >=", value, "rentstatus");
            return (Criteria) this;
        }

        public Criteria andRentstatusLessThan(Integer value) {
            addCriterion("rentStatus <", value, "rentstatus");
            return (Criteria) this;
        }

        public Criteria andRentstatusLessThanOrEqualTo(Integer value) {
            addCriterion("rentStatus <=", value, "rentstatus");
            return (Criteria) this;
        }

        public Criteria andRentstatusIn(List<Integer> values) {
            addCriterion("rentStatus in", values, "rentstatus");
            return (Criteria) this;
        }

        public Criteria andRentstatusNotIn(List<Integer> values) {
            addCriterion("rentStatus not in", values, "rentstatus");
            return (Criteria) this;
        }

        public Criteria andRentstatusBetween(Integer value1, Integer value2) {
            addCriterion("rentStatus between", value1, value2, "rentstatus");
            return (Criteria) this;
        }

        public Criteria andRentstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("rentStatus not between", value1, value2, "rentstatus");
            return (Criteria) this;
        }

        public Criteria andPicurlIsNull() {
            addCriterion("picUrl is null");
            return (Criteria) this;
        }

        public Criteria andPicurlIsNotNull() {
            addCriterion("picUrl is not null");
            return (Criteria) this;
        }

        public Criteria andPicurlEqualTo(String value) {
            addCriterion("picUrl =", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlNotEqualTo(String value) {
            addCriterion("picUrl <>", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlGreaterThan(String value) {
            addCriterion("picUrl >", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlGreaterThanOrEqualTo(String value) {
            addCriterion("picUrl >=", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlLessThan(String value) {
            addCriterion("picUrl <", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlLessThanOrEqualTo(String value) {
            addCriterion("picUrl <=", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlLike(String value) {
            addCriterion("picUrl like", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlNotLike(String value) {
            addCriterion("picUrl not like", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlIn(List<String> values) {
            addCriterion("picUrl in", values, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlNotIn(List<String> values) {
            addCriterion("picUrl not in", values, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlBetween(String value1, String value2) {
            addCriterion("picUrl between", value1, value2, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlNotBetween(String value1, String value2) {
            addCriterion("picUrl not between", value1, value2, "picurl");
            return (Criteria) this;
        }

        public Criteria andJiduIsNull() {
            addCriterion("jidu is null");
            return (Criteria) this;
        }

        public Criteria andJiduIsNotNull() {
            addCriterion("jidu is not null");
            return (Criteria) this;
        }

        public Criteria andJiduEqualTo(String value) {
            addCriterion("jidu =", value, "jidu");
            return (Criteria) this;
        }

        public Criteria andJiduNotEqualTo(String value) {
            addCriterion("jidu <>", value, "jidu");
            return (Criteria) this;
        }

        public Criteria andJiduGreaterThan(String value) {
            addCriterion("jidu >", value, "jidu");
            return (Criteria) this;
        }

        public Criteria andJiduGreaterThanOrEqualTo(String value) {
            addCriterion("jidu >=", value, "jidu");
            return (Criteria) this;
        }

        public Criteria andJiduLessThan(String value) {
            addCriterion("jidu <", value, "jidu");
            return (Criteria) this;
        }

        public Criteria andJiduLessThanOrEqualTo(String value) {
            addCriterion("jidu <=", value, "jidu");
            return (Criteria) this;
        }

        public Criteria andJiduLike(String value) {
            addCriterion("jidu like", value, "jidu");
            return (Criteria) this;
        }

        public Criteria andJiduNotLike(String value) {
            addCriterion("jidu not like", value, "jidu");
            return (Criteria) this;
        }

        public Criteria andJiduIn(List<String> values) {
            addCriterion("jidu in", values, "jidu");
            return (Criteria) this;
        }

        public Criteria andJiduNotIn(List<String> values) {
            addCriterion("jidu not in", values, "jidu");
            return (Criteria) this;
        }

        public Criteria andJiduBetween(String value1, String value2) {
            addCriterion("jidu between", value1, value2, "jidu");
            return (Criteria) this;
        }

        public Criteria andJiduNotBetween(String value1, String value2) {
            addCriterion("jidu not between", value1, value2, "jidu");
            return (Criteria) this;
        }

        public Criteria andWeiduIsNull() {
            addCriterion("weidu is null");
            return (Criteria) this;
        }

        public Criteria andWeiduIsNotNull() {
            addCriterion("weidu is not null");
            return (Criteria) this;
        }

        public Criteria andWeiduEqualTo(String value) {
            addCriterion("weidu =", value, "weidu");
            return (Criteria) this;
        }

        public Criteria andWeiduNotEqualTo(String value) {
            addCriterion("weidu <>", value, "weidu");
            return (Criteria) this;
        }

        public Criteria andWeiduGreaterThan(String value) {
            addCriterion("weidu >", value, "weidu");
            return (Criteria) this;
        }

        public Criteria andWeiduGreaterThanOrEqualTo(String value) {
            addCriterion("weidu >=", value, "weidu");
            return (Criteria) this;
        }

        public Criteria andWeiduLessThan(String value) {
            addCriterion("weidu <", value, "weidu");
            return (Criteria) this;
        }

        public Criteria andWeiduLessThanOrEqualTo(String value) {
            addCriterion("weidu <=", value, "weidu");
            return (Criteria) this;
        }

        public Criteria andWeiduLike(String value) {
            addCriterion("weidu like", value, "weidu");
            return (Criteria) this;
        }

        public Criteria andWeiduNotLike(String value) {
            addCriterion("weidu not like", value, "weidu");
            return (Criteria) this;
        }

        public Criteria andWeiduIn(List<String> values) {
            addCriterion("weidu in", values, "weidu");
            return (Criteria) this;
        }

        public Criteria andWeiduNotIn(List<String> values) {
            addCriterion("weidu not in", values, "weidu");
            return (Criteria) this;
        }

        public Criteria andWeiduBetween(String value1, String value2) {
            addCriterion("weidu between", value1, value2, "weidu");
            return (Criteria) this;
        }

        public Criteria andWeiduNotBetween(String value1, String value2) {
            addCriterion("weidu not between", value1, value2, "weidu");
            return (Criteria) this;
        }

        public Criteria andKey1IsNull() {
            addCriterion("key1 is null");
            return (Criteria) this;
        }

        public Criteria andKey1IsNotNull() {
            addCriterion("key1 is not null");
            return (Criteria) this;
        }

        public Criteria andKey1EqualTo(String value) {
            addCriterion("key1 =", value, "key1");
            return (Criteria) this;
        }

        public Criteria andKey1NotEqualTo(String value) {
            addCriterion("key1 <>", value, "key1");
            return (Criteria) this;
        }

        public Criteria andKey1GreaterThan(String value) {
            addCriterion("key1 >", value, "key1");
            return (Criteria) this;
        }

        public Criteria andKey1GreaterThanOrEqualTo(String value) {
            addCriterion("key1 >=", value, "key1");
            return (Criteria) this;
        }

        public Criteria andKey1LessThan(String value) {
            addCriterion("key1 <", value, "key1");
            return (Criteria) this;
        }

        public Criteria andKey1LessThanOrEqualTo(String value) {
            addCriterion("key1 <=", value, "key1");
            return (Criteria) this;
        }

        public Criteria andKey1Like(String value) {
            addCriterion("key1 like", value, "key1");
            return (Criteria) this;
        }

        public Criteria andKey1NotLike(String value) {
            addCriterion("key1 not like", value, "key1");
            return (Criteria) this;
        }

        public Criteria andKey1In(List<String> values) {
            addCriterion("key1 in", values, "key1");
            return (Criteria) this;
        }

        public Criteria andKey1NotIn(List<String> values) {
            addCriterion("key1 not in", values, "key1");
            return (Criteria) this;
        }

        public Criteria andKey1Between(String value1, String value2) {
            addCriterion("key1 between", value1, value2, "key1");
            return (Criteria) this;
        }

        public Criteria andKey1NotBetween(String value1, String value2) {
            addCriterion("key1 not between", value1, value2, "key1");
            return (Criteria) this;
        }

        public Criteria andKey2IsNull() {
            addCriterion("key2 is null");
            return (Criteria) this;
        }

        public Criteria andKey2IsNotNull() {
            addCriterion("key2 is not null");
            return (Criteria) this;
        }

        public Criteria andKey2EqualTo(String value) {
            addCriterion("key2 =", value, "key2");
            return (Criteria) this;
        }

        public Criteria andKey2NotEqualTo(String value) {
            addCriterion("key2 <>", value, "key2");
            return (Criteria) this;
        }

        public Criteria andKey2GreaterThan(String value) {
            addCriterion("key2 >", value, "key2");
            return (Criteria) this;
        }

        public Criteria andKey2GreaterThanOrEqualTo(String value) {
            addCriterion("key2 >=", value, "key2");
            return (Criteria) this;
        }

        public Criteria andKey2LessThan(String value) {
            addCriterion("key2 <", value, "key2");
            return (Criteria) this;
        }

        public Criteria andKey2LessThanOrEqualTo(String value) {
            addCriterion("key2 <=", value, "key2");
            return (Criteria) this;
        }

        public Criteria andKey2Like(String value) {
            addCriterion("key2 like", value, "key2");
            return (Criteria) this;
        }

        public Criteria andKey2NotLike(String value) {
            addCriterion("key2 not like", value, "key2");
            return (Criteria) this;
        }

        public Criteria andKey2In(List<String> values) {
            addCriterion("key2 in", values, "key2");
            return (Criteria) this;
        }

        public Criteria andKey2NotIn(List<String> values) {
            addCriterion("key2 not in", values, "key2");
            return (Criteria) this;
        }

        public Criteria andKey2Between(String value1, String value2) {
            addCriterion("key2 between", value1, value2, "key2");
            return (Criteria) this;
        }

        public Criteria andKey2NotBetween(String value1, String value2) {
            addCriterion("key2 not between", value1, value2, "key2");
            return (Criteria) this;
        }

        public Criteria andKey3IsNull() {
            addCriterion("key3 is null");
            return (Criteria) this;
        }

        public Criteria andKey3IsNotNull() {
            addCriterion("key3 is not null");
            return (Criteria) this;
        }

        public Criteria andKey3EqualTo(String value) {
            addCriterion("key3 =", value, "key3");
            return (Criteria) this;
        }

        public Criteria andKey3NotEqualTo(String value) {
            addCriterion("key3 <>", value, "key3");
            return (Criteria) this;
        }

        public Criteria andKey3GreaterThan(String value) {
            addCriterion("key3 >", value, "key3");
            return (Criteria) this;
        }

        public Criteria andKey3GreaterThanOrEqualTo(String value) {
            addCriterion("key3 >=", value, "key3");
            return (Criteria) this;
        }

        public Criteria andKey3LessThan(String value) {
            addCriterion("key3 <", value, "key3");
            return (Criteria) this;
        }

        public Criteria andKey3LessThanOrEqualTo(String value) {
            addCriterion("key3 <=", value, "key3");
            return (Criteria) this;
        }

        public Criteria andKey3Like(String value) {
            addCriterion("key3 like", value, "key3");
            return (Criteria) this;
        }

        public Criteria andKey3NotLike(String value) {
            addCriterion("key3 not like", value, "key3");
            return (Criteria) this;
        }

        public Criteria andKey3In(List<String> values) {
            addCriterion("key3 in", values, "key3");
            return (Criteria) this;
        }

        public Criteria andKey3NotIn(List<String> values) {
            addCriterion("key3 not in", values, "key3");
            return (Criteria) this;
        }

        public Criteria andKey3Between(String value1, String value2) {
            addCriterion("key3 between", value1, value2, "key3");
            return (Criteria) this;
        }

        public Criteria andKey3NotBetween(String value1, String value2) {
            addCriterion("key3 not between", value1, value2, "key3");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}