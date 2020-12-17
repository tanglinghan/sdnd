package cn.tlh.common.pojo;


import java.io.Serializable;

/**
 * @author TANG
 * @description rabbit 死信消息载体
 */
public class DlxMessage implements Serializable {

    private static final long serialVersionUID = 9956432152000L;

    private String exchange;

    private String queueName;

    private String content;

    private long times;

    public DlxMessage() {
        super();
    }

    public DlxMessage(String queueName, String content, long times) {
        super();
        this.queueName = queueName;
        this.content = content;
        this.times = times;
    }

    public DlxMessage(String exchange, String queueName, String content, long times) {
        super();
        this.exchange = exchange;
        this.queueName = queueName;
        this.content = content;
        this.times = times;
    }


    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getTimes() {
        return times;
    }

    public void setTimes(long times) {
        this.times = times;
    }
}