package com.xiaoyu.simpleweather.db;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.xiaoyu.simpleweather.db.Province;
import com.xiaoyu.simpleweather.db.County;
import com.xiaoyu.simpleweather.db.City;

import com.xiaoyu.simpleweather.db.ProvinceDao;
import com.xiaoyu.simpleweather.db.CountyDao;
import com.xiaoyu.simpleweather.db.CityDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig provinceDaoConfig;
    private final DaoConfig countyDaoConfig;
    private final DaoConfig cityDaoConfig;

    private final ProvinceDao provinceDao;
    private final CountyDao countyDao;
    private final CityDao cityDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        provinceDaoConfig = daoConfigMap.get(ProvinceDao.class).clone();
        provinceDaoConfig.initIdentityScope(type);

        countyDaoConfig = daoConfigMap.get(CountyDao.class).clone();
        countyDaoConfig.initIdentityScope(type);

        cityDaoConfig = daoConfigMap.get(CityDao.class).clone();
        cityDaoConfig.initIdentityScope(type);

        provinceDao = new ProvinceDao(provinceDaoConfig, this);
        countyDao = new CountyDao(countyDaoConfig, this);
        cityDao = new CityDao(cityDaoConfig, this);

        registerDao(Province.class, provinceDao);
        registerDao(County.class, countyDao);
        registerDao(City.class, cityDao);
    }
    
    public void clear() {
        provinceDaoConfig.clearIdentityScope();
        countyDaoConfig.clearIdentityScope();
        cityDaoConfig.clearIdentityScope();
    }

    public ProvinceDao getProvinceDao() {
        return provinceDao;
    }

    public CountyDao getCountyDao() {
        return countyDao;
    }

    public CityDao getCityDao() {
        return cityDao;
    }

}
