/*
 * Copyright (c) Lab317, Inc All Rights Reserved.
 */
package com.lab317.project.conf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.social.connect.ConnectionFactoryLocator;
import org.springframework.social.connect.support.ConnectionFactoryRegistry;
import org.springframework.social.facebook.connect.FacebookConnectionFactory;

/**
 * Created by Redick.Yao on 2015/7/8.
 */
@Configuration
@EnableAutoConfiguration
public class SocialConfig {

    @Value("${facebook.app.id}")
    public String facebookId;

    @Value("${facebook.app.secret}")
    public String facebookSecret;

    @Bean
    public ConnectionFactoryLocator connectionFactoryLocator() {
        ConnectionFactoryRegistry registry = new ConnectionFactoryRegistry();
        registry.addConnectionFactory(
                new FacebookConnectionFactory(facebookId, facebookSecret));
        return registry;
    }
}