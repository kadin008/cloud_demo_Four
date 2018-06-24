package cn.net.aipic.spring.clond.weather.service.Impl;

import cn.net.aipic.spring.clond.weather.service.WeatherDataCollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class WeatherDataCollectionServiceImpl implements WeatherDataCollectionService {

    private static final String WEATHER_URI = "http://wthrcdn.etouch.cn/weather_mini?";

    private static final long TIME_OUT = 1800L; // 1800s

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public void syncDateByCityId(String cityId) {

    }
}
