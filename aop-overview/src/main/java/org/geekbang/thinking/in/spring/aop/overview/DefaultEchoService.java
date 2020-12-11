package org.geekbang.thinking.in.spring.aop.overview;

/**
 * 默认 {@link EchoService} 实现
 *
 * @author jay
 */
public class DefaultEchoService implements EchoService {

    @Override
    public String echo(String message) throws NullPointerException {
        return "[ECHO] " + message;
    }
}
