package com.sihai.utils;

public class AlipayConfig {

	public static String app_id = "2016101400686599";//�ں�̨��ȡ���������ã�
	
	public static String merchant_private_key = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCiz4AHn1NUxdInQqlANPtZ4HiYcf+S4EpJ/6qX8r2N0HNxzRrpaF+QCDnU4Mb5Pq9hjAZ4JxhAmZrsn5bWLkM8XlIxSEj7PP3VWxpz7VA5Rpwmgh8MtOFC25fDcpx7QiTQVOlzLAnKfk9QMRyfOf28p1lhKGZgXHlFfSt4USjqsKnUxXPAxRgssCc4QV8+CaqtgdcFvZ42g9fCoyH3StH68Pb4drrHKUbQPliEXtN8s2G3cz6ZAgOjsWlLzQ56uQY3BZccFDQ1VhmiUTYsKTnqm0LnEn8y0/KkmtKKE9PbLm8FToh9kdJc6+B2Dz7rxtVkoQZolImpvOAAEncgBIJVAgMBAAECggEAUzSCdOLK/pb+uMvLnaG2Fw+t8hLIj3KK5NiBgZgvoYs3hKBSsZiCxiQ+EfoyFe0gSlT6dWtdbJ5T27wPpTQNbouxq7gKfEOGYgRmN3q/thXM9a0oWyERwk5heCRZrnB2SfYrPI30DwWQWSZQP1uuvjw0ZH/2GicIXygCEEJCC/YdgX38YZKTqstZvM2LMhlfI87HWlPXGOlWCbTjFIkAktlV7y3omIbFhPDM6vnTKwjrbLJ0mHiQ+C2ZrtPpIlQM284FtmIMCnPpxqrfw0IT/nazHQG7zPXLs19H5PVrDvUC/rix2TXl4H1NyOWHOqmGKfeqx/KVPJAAfFao++iHPQKBgQDiI0sHaO7aex9A/rvwvpV4LCuvJMbyRxxMCAn702bW3npNmIlsfecnyhkvmpDlu+qG+F7oGgk+iWU1gxrOhxgpu9RkpI2Ev6JBwPVtQi0zOkGFd7+HazHztfjNF+9dY6wfNa2CRnuq2aHa7CY//D/eOIj/9GbJgxydWaOq2Un5UwKBgQC4T2T9+82cGhbWhiTfapc7lY3OWdee9Wa2i/1LVlv1VXvgRfLD0LJBydA+K9hiPzxzFvbLP9IjCrs7L+h286CAJnNqXhc74VozKyKb5q0VUmKUN2ArY+uU0VX/g0TVFs/enVCgc6uDXEiXGQ2ZXHhmBzc+I4u7duE4nJwkyj6YtwKBgAO7xW9X4imlQrzV99BftSQIxqfbmZVCa0suDswjj10YyzggvpQV+A0GHyhUCvRgB902mIqIc4Kezhb2FSk3vcRin30R4mxApbMkNmkZYJmp6o8DjRv1Pxvg8zyfmooWLS9OuZCfDUei1DNDFtaTmZJXqJthM5k8GurWIgeeEsSVAoGAWFILdj4s6CoEWaaMktc0Q2RGQOUCk3TLVJy+s1Rd2rGtG+rJC5a9ZRM9jB1coq/k2s3dU8Zwf0RMNm+duSrD9cT3N7iA77vsimqYOhcPSBFjldz3Y7ONF5I84KVZ3bcBw46lLU5gmSEm0+k4gA40z8eTbF6CPkIYaRV7KZIU7v8CgYBPbsS4jwb+W1EFanZoMbXtABwDB9NYwisppUvVSXICW86KYu0zU8NF3VY6wQUgB02vlVHHeUnEekoXynd2PpC9PquMkrSq6VxzktNtLaxockE4xrK9j7ivoCP++S4yZYQoGhp82W+0wfgupA81ndlDcTmtmZZRuerHGCEtX2+SgA==";//�̳̲鿴��ȡ��ʽ���������ã�

	public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAnaywZG0kHL3t12Dp4gcwU0b6ItniWnMuD9UAXlQRWLltI8IqlduEzNALAAlXXxeHeJWAmuGiDjPHbGXWLwjDLTO/ikQ1SAjUSDLVqVVxPENdGrlTsLDXfpTtGp4lTmy7JDKU9yXpADgoG6I7fvaYGPnXUexoeiYFIgjD8wHp0KOeJmgke0aAZOVG6ekW0RDXbiilvyq+H7FvwhTi1S8PCoBMl0+v0Xne5FcXj+buYDwmzxYP2G8df8HTuecdk4H0bHNgb+s30UFMLL18PW6A5gijnF/NJIs+RLCOQTn54Pwl2ZTUqD+1ACVsfCTaArhaZ7CsvJvmu7Q9zSxYcscMQwIDAQAB";//�̳̲鿴��ȡ��ʽ���������ã�
	
	public static String notify_url = "http://localhost:8080/alipay/alipayNotifyNotice.action";
	
	public static String return_url = "http://localhost:8080/alipay/alipayReturnNotice.action";
	
	public static String sign_type = "RSA2";
	
	public static String charset = "utf-8";
	
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";//ע�⣺ɳ����Ի�������ʽ����Ϊ��https://openapi.alipay.com/gateway.do
}
