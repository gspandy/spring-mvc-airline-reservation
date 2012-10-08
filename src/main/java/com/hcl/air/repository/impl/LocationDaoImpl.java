package com.hcl.air.repository.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.hcl.air.controller.LocationController;
import com.hcl.air.domain.Deal;
import com.hcl.air.domain.Flight;
import com.hcl.air.domain.Location;
import com.hcl.air.forms.Form;
import com.hcl.air.repository.LocationDao;

@Repository
public class LocationDaoImpl extends SqlMapClientDaoSupport implements LocationDao {
  
  private Logger logger = LoggerFactory.getLogger(LocationDaoImpl.class);	
  private static final String NAMESPACE = "location.";

  @Autowired
  @Qualifier("sqlMapClient1")
  public void injectSqlMapClient(SqlMapClient sqlMapClient) {
    setSqlMapClient(sqlMapClient);
  }

  @SuppressWarnings("unchecked")
  public List<Location> selectAll() {
    return getSqlMapClientTemplate().queryForList(NAMESPACE + "selectAll");
  }

  public Long insert(Location location) {
    return (Long) getSqlMapClientTemplate().insert(NAMESPACE + "insert", location);
  }

  public void update(Location location) {
    getSqlMapClientTemplate().update(NAMESPACE + "update", location);
  }

  public void delete(Location location) {
    getSqlMapClientTemplate().delete(NAMESPACE + "delete", location);
  }

  public Location selectById(long id) {
    return (Location) getSqlMapClientTemplate().queryForObject(NAMESPACE + "selectById", id);
  }
  
  public List<Flight> selectFlights(Form form) {
	return getSqlMapClientTemplate().queryForList(NAMESPACE + "selectFlights", form);
  }
  
  public Flight selectFlightById(Integer id) {
	return (Flight) getSqlMapClientTemplate().queryForList(NAMESPACE + "selectFlightById", id).get(0);
  }

  public List<Deal> selectDeals(String code) {
	return getSqlMapClientTemplate().queryForList(NAMESPACE + "selectDeals", code);
  }
  
  public List<Deal> selectDealById(List ids) {
    return getSqlMapClientTemplate().queryForList(NAMESPACE + "selectDealById", ids); 	
  }
}
