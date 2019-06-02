package com.clone.instagram.instafeedservice.entity;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Indexed;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;

@PrimaryKeyClass
@Builder
@Data
@ToString
public class UserFeedKey {

    @PrimaryKeyColumn(name = "user_id", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    private String userId;

    @Indexed
    @PrimaryKeyColumn(name = "username", ordinal = 1 )
    private String username;

    @PrimaryKeyColumn(name = "post_id", ordinal = 2)
    private String postId;
}