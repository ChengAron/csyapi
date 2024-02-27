package com.csy.csyapicommon.model.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.csy.csyapicommon.model.entity.Post;

/**
 * 帖子视图
 *
 * @author csy
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PostVO extends Post {

    /**
     * 是否已点赞
     */
    private Boolean hasThumb;

    private static final long serialVersionUID = 1L;
}