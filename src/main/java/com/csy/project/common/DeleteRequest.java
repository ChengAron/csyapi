package com.csy.project.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 删除请求
 *
 * @author csy
 */
@Data
public class DeleteRequest implements Serializable {
    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}