package com.smartcommunity.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DecoratefeeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table decoratefee
     *
     * @mbggenerated Tue Jan 20 13:50:49 CST 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table decoratefee
     *
     * @mbggenerated Tue Jan 20 13:50:49 CST 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table decoratefee
     *
     * @mbggenerated Tue Jan 20 13:50:49 CST 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoratefee
     *
     * @mbggenerated Tue Jan 20 13:50:49 CST 2015
     */
    public DecoratefeeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoratefee
     *
     * @mbggenerated Tue Jan 20 13:50:49 CST 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoratefee
     *
     * @mbggenerated Tue Jan 20 13:50:49 CST 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoratefee
     *
     * @mbggenerated Tue Jan 20 13:50:49 CST 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoratefee
     *
     * @mbggenerated Tue Jan 20 13:50:49 CST 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoratefee
     *
     * @mbggenerated Tue Jan 20 13:50:49 CST 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoratefee
     *
     * @mbggenerated Tue Jan 20 13:50:49 CST 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoratefee
     *
     * @mbggenerated Tue Jan 20 13:50:49 CST 2015
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoratefee
     *
     * @mbggenerated Tue Jan 20 13:50:49 CST 2015
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoratefee
     *
     * @mbggenerated Tue Jan 20 13:50:49 CST 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoratefee
     *
     * @mbggenerated Tue Jan 20 13:50:49 CST 2015
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table decoratefee
     *
     * @mbggenerated Tue Jan 20 13:50:49 CST 2015
     */
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRoomnumberIsNull() {
            addCriterion("roomnumber is null");
            return (Criteria) this;
        }

        public Criteria andRoomnumberIsNotNull() {
            addCriterion("roomnumber is not null");
            return (Criteria) this;
        }

        public Criteria andRoomnumberEqualTo(String value) {
            addCriterion("roomnumber =", value, "roomnumber");
            return (Criteria) this;
        }

        public Criteria andRoomnumberNotEqualTo(String value) {
            addCriterion("roomnumber <>", value, "roomnumber");
            return (Criteria) this;
        }

        public Criteria andRoomnumberGreaterThan(String value) {
            addCriterion("roomnumber >", value, "roomnumber");
            return (Criteria) this;
        }

        public Criteria andRoomnumberGreaterThanOrEqualTo(String value) {
            addCriterion("roomnumber >=", value, "roomnumber");
            return (Criteria) this;
        }

        public Criteria andRoomnumberLessThan(String value) {
            addCriterion("roomnumber <", value, "roomnumber");
            return (Criteria) this;
        }

        public Criteria andRoomnumberLessThanOrEqualTo(String value) {
            addCriterion("roomnumber <=", value, "roomnumber");
            return (Criteria) this;
        }

        public Criteria andRoomnumberLike(String value) {
            addCriterion("roomnumber like", value, "roomnumber");
            return (Criteria) this;
        }

        public Criteria andRoomnumberNotLike(String value) {
            addCriterion("roomnumber not like", value, "roomnumber");
            return (Criteria) this;
        }

        public Criteria andRoomnumberIn(List<String> values) {
            addCriterion("roomnumber in", values, "roomnumber");
            return (Criteria) this;
        }

        public Criteria andRoomnumberNotIn(List<String> values) {
            addCriterion("roomnumber not in", values, "roomnumber");
            return (Criteria) this;
        }

        public Criteria andRoomnumberBetween(String value1, String value2) {
            addCriterion("roomnumber between", value1, value2, "roomnumber");
            return (Criteria) this;
        }

        public Criteria andRoomnumberNotBetween(String value1, String value2) {
            addCriterion("roomnumber not between", value1, value2, "roomnumber");
            return (Criteria) this;
        }

        public Criteria andOwnernameIsNull() {
            addCriterion("ownername is null");
            return (Criteria) this;
        }

        public Criteria andOwnernameIsNotNull() {
            addCriterion("ownername is not null");
            return (Criteria) this;
        }

        public Criteria andOwnernameEqualTo(String value) {
            addCriterion("ownername =", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameNotEqualTo(String value) {
            addCriterion("ownername <>", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameGreaterThan(String value) {
            addCriterion("ownername >", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameGreaterThanOrEqualTo(String value) {
            addCriterion("ownername >=", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameLessThan(String value) {
            addCriterion("ownername <", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameLessThanOrEqualTo(String value) {
            addCriterion("ownername <=", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameLike(String value) {
            addCriterion("ownername like", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameNotLike(String value) {
            addCriterion("ownername not like", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameIn(List<String> values) {
            addCriterion("ownername in", values, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameNotIn(List<String> values) {
            addCriterion("ownername not in", values, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameBetween(String value1, String value2) {
            addCriterion("ownername between", value1, value2, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameNotBetween(String value1, String value2) {
            addCriterion("ownername not between", value1, value2, "ownername");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterionForJDBCDate("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterionForJDBCDate("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterionForJDBCDate("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterionForJDBCDate("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDepositIsNull() {
            addCriterion("deposit is null");
            return (Criteria) this;
        }

        public Criteria andDepositIsNotNull() {
            addCriterion("deposit is not null");
            return (Criteria) this;
        }

        public Criteria andDepositEqualTo(Float value) {
            addCriterion("deposit =", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotEqualTo(Float value) {
            addCriterion("deposit <>", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositGreaterThan(Float value) {
            addCriterion("deposit >", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositGreaterThanOrEqualTo(Float value) {
            addCriterion("deposit >=", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLessThan(Float value) {
            addCriterion("deposit <", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLessThanOrEqualTo(Float value) {
            addCriterion("deposit <=", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositIn(List<Float> values) {
            addCriterion("deposit in", values, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotIn(List<Float> values) {
            addCriterion("deposit not in", values, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositBetween(Float value1, Float value2) {
            addCriterion("deposit between", value1, value2, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotBetween(Float value1, Float value2) {
            addCriterion("deposit not between", value1, value2, "deposit");
            return (Criteria) this;
        }

        public Criteria andRabishfeeIsNull() {
            addCriterion("rabishfee is null");
            return (Criteria) this;
        }

        public Criteria andRabishfeeIsNotNull() {
            addCriterion("rabishfee is not null");
            return (Criteria) this;
        }

        public Criteria andRabishfeeEqualTo(Float value) {
            addCriterion("rabishfee =", value, "rabishfee");
            return (Criteria) this;
        }

        public Criteria andRabishfeeNotEqualTo(Float value) {
            addCriterion("rabishfee <>", value, "rabishfee");
            return (Criteria) this;
        }

        public Criteria andRabishfeeGreaterThan(Float value) {
            addCriterion("rabishfee >", value, "rabishfee");
            return (Criteria) this;
        }

        public Criteria andRabishfeeGreaterThanOrEqualTo(Float value) {
            addCriterion("rabishfee >=", value, "rabishfee");
            return (Criteria) this;
        }

        public Criteria andRabishfeeLessThan(Float value) {
            addCriterion("rabishfee <", value, "rabishfee");
            return (Criteria) this;
        }

        public Criteria andRabishfeeLessThanOrEqualTo(Float value) {
            addCriterion("rabishfee <=", value, "rabishfee");
            return (Criteria) this;
        }

        public Criteria andRabishfeeIn(List<Float> values) {
            addCriterion("rabishfee in", values, "rabishfee");
            return (Criteria) this;
        }

        public Criteria andRabishfeeNotIn(List<Float> values) {
            addCriterion("rabishfee not in", values, "rabishfee");
            return (Criteria) this;
        }

        public Criteria andRabishfeeBetween(Float value1, Float value2) {
            addCriterion("rabishfee between", value1, value2, "rabishfee");
            return (Criteria) this;
        }

        public Criteria andRabishfeeNotBetween(Float value1, Float value2) {
            addCriterion("rabishfee not between", value1, value2, "rabishfee");
            return (Criteria) this;
        }

        public Criteria andElecfeeIsNull() {
            addCriterion("elecfee is null");
            return (Criteria) this;
        }

        public Criteria andElecfeeIsNotNull() {
            addCriterion("elecfee is not null");
            return (Criteria) this;
        }

        public Criteria andElecfeeEqualTo(Float value) {
            addCriterion("elecfee =", value, "elecfee");
            return (Criteria) this;
        }

        public Criteria andElecfeeNotEqualTo(Float value) {
            addCriterion("elecfee <>", value, "elecfee");
            return (Criteria) this;
        }

        public Criteria andElecfeeGreaterThan(Float value) {
            addCriterion("elecfee >", value, "elecfee");
            return (Criteria) this;
        }

        public Criteria andElecfeeGreaterThanOrEqualTo(Float value) {
            addCriterion("elecfee >=", value, "elecfee");
            return (Criteria) this;
        }

        public Criteria andElecfeeLessThan(Float value) {
            addCriterion("elecfee <", value, "elecfee");
            return (Criteria) this;
        }

        public Criteria andElecfeeLessThanOrEqualTo(Float value) {
            addCriterion("elecfee <=", value, "elecfee");
            return (Criteria) this;
        }

        public Criteria andElecfeeIn(List<Float> values) {
            addCriterion("elecfee in", values, "elecfee");
            return (Criteria) this;
        }

        public Criteria andElecfeeNotIn(List<Float> values) {
            addCriterion("elecfee not in", values, "elecfee");
            return (Criteria) this;
        }

        public Criteria andElecfeeBetween(Float value1, Float value2) {
            addCriterion("elecfee between", value1, value2, "elecfee");
            return (Criteria) this;
        }

        public Criteria andElecfeeNotBetween(Float value1, Float value2) {
            addCriterion("elecfee not between", value1, value2, "elecfee");
            return (Criteria) this;
        }

        public Criteria andWaterfeeIsNull() {
            addCriterion("waterfee is null");
            return (Criteria) this;
        }

        public Criteria andWaterfeeIsNotNull() {
            addCriterion("waterfee is not null");
            return (Criteria) this;
        }

        public Criteria andWaterfeeEqualTo(Float value) {
            addCriterion("waterfee =", value, "waterfee");
            return (Criteria) this;
        }

        public Criteria andWaterfeeNotEqualTo(Float value) {
            addCriterion("waterfee <>", value, "waterfee");
            return (Criteria) this;
        }

        public Criteria andWaterfeeGreaterThan(Float value) {
            addCriterion("waterfee >", value, "waterfee");
            return (Criteria) this;
        }

        public Criteria andWaterfeeGreaterThanOrEqualTo(Float value) {
            addCriterion("waterfee >=", value, "waterfee");
            return (Criteria) this;
        }

        public Criteria andWaterfeeLessThan(Float value) {
            addCriterion("waterfee <", value, "waterfee");
            return (Criteria) this;
        }

        public Criteria andWaterfeeLessThanOrEqualTo(Float value) {
            addCriterion("waterfee <=", value, "waterfee");
            return (Criteria) this;
        }

        public Criteria andWaterfeeIn(List<Float> values) {
            addCriterion("waterfee in", values, "waterfee");
            return (Criteria) this;
        }

        public Criteria andWaterfeeNotIn(List<Float> values) {
            addCriterion("waterfee not in", values, "waterfee");
            return (Criteria) this;
        }

        public Criteria andWaterfeeBetween(Float value1, Float value2) {
            addCriterion("waterfee between", value1, value2, "waterfee");
            return (Criteria) this;
        }

        public Criteria andWaterfeeNotBetween(Float value1, Float value2) {
            addCriterion("waterfee not between", value1, value2, "waterfee");
            return (Criteria) this;
        }

        public Criteria andPassfeeIsNull() {
            addCriterion("passfee is null");
            return (Criteria) this;
        }

        public Criteria andPassfeeIsNotNull() {
            addCriterion("passfee is not null");
            return (Criteria) this;
        }

        public Criteria andPassfeeEqualTo(Float value) {
            addCriterion("passfee =", value, "passfee");
            return (Criteria) this;
        }

        public Criteria andPassfeeNotEqualTo(Float value) {
            addCriterion("passfee <>", value, "passfee");
            return (Criteria) this;
        }

        public Criteria andPassfeeGreaterThan(Float value) {
            addCriterion("passfee >", value, "passfee");
            return (Criteria) this;
        }

        public Criteria andPassfeeGreaterThanOrEqualTo(Float value) {
            addCriterion("passfee >=", value, "passfee");
            return (Criteria) this;
        }

        public Criteria andPassfeeLessThan(Float value) {
            addCriterion("passfee <", value, "passfee");
            return (Criteria) this;
        }

        public Criteria andPassfeeLessThanOrEqualTo(Float value) {
            addCriterion("passfee <=", value, "passfee");
            return (Criteria) this;
        }

        public Criteria andPassfeeIn(List<Float> values) {
            addCriterion("passfee in", values, "passfee");
            return (Criteria) this;
        }

        public Criteria andPassfeeNotIn(List<Float> values) {
            addCriterion("passfee not in", values, "passfee");
            return (Criteria) this;
        }

        public Criteria andPassfeeBetween(Float value1, Float value2) {
            addCriterion("passfee between", value1, value2, "passfee");
            return (Criteria) this;
        }

        public Criteria andPassfeeNotBetween(Float value1, Float value2) {
            addCriterion("passfee not between", value1, value2, "passfee");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table decoratefee
     *
     * @mbggenerated do_not_delete_during_merge Tue Jan 20 13:50:49 CST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table decoratefee
     *
     * @mbggenerated Tue Jan 20 13:50:49 CST 2015
     */
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