package top.doitcore.admin.relationship.service.impl;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import top.continew.starter.extension.crud.service.BaseServiceImpl;
import top.doitcore.admin.relationship.mapper.CustomerMapper;
import top.doitcore.admin.relationship.model.entity.CustomerDO;
import top.doitcore.admin.relationship.model.query.CustomerQuery;
import top.doitcore.admin.relationship.model.req.CustomerReq;
import top.doitcore.admin.relationship.model.resp.CustomerDetailResp;
import top.doitcore.admin.relationship.model.resp.CustomerResp;
import top.doitcore.admin.relationship.service.CustomerService;

/**
 * 客户信息业务实现
 *
 * @author xqsapper
 * @since 2025/02/25 17:34
 */
@Service
@RequiredArgsConstructor
public class CustomerServiceImpl extends BaseServiceImpl<CustomerMapper, CustomerDO, CustomerResp, CustomerDetailResp, CustomerQuery, CustomerReq> implements CustomerService {}