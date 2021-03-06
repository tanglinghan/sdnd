
package top.b0x0.admin.common.util.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * <p>
 * 验证码业务场景对应的 Redis 中的 key
 * </p>
 * @author TANG
 * @date 2020-05-02
 */
@Getter
@AllArgsConstructor
public enum CodeEnum {

    /* 通过手机号码重置邮箱 */
    PHONE_RESET_EMAIL_CODE("reset:email:byPhone:code:", "通过手机号码重置邮箱"),

    /* 通过旧邮箱重置邮箱 */
    EMAIL_RESET_EMAIL_CODE("reset:email:byEmail:code:", "通过旧邮箱重置邮箱"),

    /* 通过手机号码重置密码 */
    PHONE_RESET_PWD_CODE("reset:pwd:byPhone:code:", "通过手机号码重置密码"),

    /* 通过邮箱重置密码 */
    EMAIL_RESET_PWD_CODE("reset:pwd:byEmail:code:", "通过邮箱重置密码");

    private final String key;
    private final String description;
}
