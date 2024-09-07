package id.co.digipos.common.base;

public interface BaseService<T extends BaseRequest, V extends BaseResponse> {
    T execute(T input);
}
