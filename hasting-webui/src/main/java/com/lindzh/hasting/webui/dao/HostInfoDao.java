package com.lindzh.hasting.webui.dao;

import java.util.List;

import com.lindzh.hasting.webui.pojo.HostInfo;
import org.apache.ibatis.annotations.Param;

/**
 * @author AutoGenerated by lindzh
 * 2016年12月15日 16:54
 */
public interface HostInfoDao {

	public int addHostInfo(HostInfo obj);

	public HostInfo getById(@Param("id")long id);
	
	public int updateById(@Param("obj")HostInfo obj);
	
	public int deleteById(@Param("id")long id);
	
	
	public List<HostInfo> getListByHost(@Param("host")String host,@Param("limit")int limit,@Param("offset") int offset);
	
	public long getCountByHost(@Param("host")String host);
	
	
	public List<HostInfo> getListByAppIdAndStatus(@Param("appId")long appId,@Param("status")int status,@Param("limit")int limit,@Param("offset") int offset);
	
	public long getCountByAppIdAndStatus(@Param("appId")long appId,@Param("status")int status);


	public HostInfo getAppHost(@Param("appId")long appId,@Param("host")String host,@Param("port") int port);

	public int updateStatus(@Param("status")int status);

	public List<HostInfo> getListByStatus(@Param("status")int status);

	public List<HostInfo> getProviderListByStatus(@Param("status")int status);


	public List<HostInfo> getListByHostAndPort(@Param("host")String host,@Param("port")int port);

	public HostInfo getByAppAndIp(@Param("appId")long appid,@Param("host")String ip);

	public List<HostInfo> getNeedSyncList();

	public List<HostInfo> getProviderListByServiceId(@Param("serviceId")long serviceId);

	public List<HostInfo> getConsumerListByServiceId(@Param("serviceId")long serviceId);

	public List<HostInfo> getProviderListByAppId(@Param("appId")long appId);

	public List<HostInfo> getConsumerListByAppId(@Param("appId")long appId);

	public List<HostInfo> getListByAppIdWithPage(@Param("appId")long appId,@Param("limit")int limit,@Param("offset")int offset);

	public long getCountByAppId(@Param("appId")long appId);
}
