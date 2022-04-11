package id.codefun.common.service;

import id.codefun.common.model.request.BaseRequest;
import id.codefun.common.model.response.BaseResponse;

public abstract interface BaseService<I extends BaseRequest, O extends BaseResponse> {
  
    public abstract O execute(I request);

  }