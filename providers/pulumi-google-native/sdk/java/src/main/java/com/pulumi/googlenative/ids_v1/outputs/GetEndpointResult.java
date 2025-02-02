// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.ids_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetEndpointResult {
    /**
     * @return The create time timestamp.
     * 
     */
    private final String createTime;
    /**
     * @return User-provided description of the endpoint
     * 
     */
    private final String description;
    /**
     * @return The fully qualified URL of the endpoint&#39;s ILB Forwarding Rule.
     * 
     */
    private final String endpointForwardingRule;
    /**
     * @return The IP address of the IDS Endpoint&#39;s ILB.
     * 
     */
    private final String endpointIp;
    /**
     * @return The labels of the endpoint.
     * 
     */
    private final Map<String,String> labels;
    /**
     * @return The name of the endpoint.
     * 
     */
    private final String name;
    /**
     * @return The fully qualified URL of the network to which the IDS Endpoint is attached.
     * 
     */
    private final String network;
    /**
     * @return Lowest threat severity that this endpoint will alert on.
     * 
     */
    private final String severity;
    /**
     * @return Current state of the endpoint.
     * 
     */
    private final String state;
    /**
     * @return Whether the endpoint should report traffic logs in addition to threat logs.
     * 
     */
    private final Boolean trafficLogs;
    /**
     * @return The update time timestamp.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private GetEndpointResult(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("endpointForwardingRule") String endpointForwardingRule,
        @CustomType.Parameter("endpointIp") String endpointIp,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("network") String network,
        @CustomType.Parameter("severity") String severity,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("trafficLogs") Boolean trafficLogs,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.createTime = createTime;
        this.description = description;
        this.endpointForwardingRule = endpointForwardingRule;
        this.endpointIp = endpointIp;
        this.labels = labels;
        this.name = name;
        this.network = network;
        this.severity = severity;
        this.state = state;
        this.trafficLogs = trafficLogs;
        this.updateTime = updateTime;
    }

    /**
     * @return The create time timestamp.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return User-provided description of the endpoint
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The fully qualified URL of the endpoint&#39;s ILB Forwarding Rule.
     * 
     */
    public String endpointForwardingRule() {
        return this.endpointForwardingRule;
    }
    /**
     * @return The IP address of the IDS Endpoint&#39;s ILB.
     * 
     */
    public String endpointIp() {
        return this.endpointIp;
    }
    /**
     * @return The labels of the endpoint.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return The name of the endpoint.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The fully qualified URL of the network to which the IDS Endpoint is attached.
     * 
     */
    public String network() {
        return this.network;
    }
    /**
     * @return Lowest threat severity that this endpoint will alert on.
     * 
     */
    public String severity() {
        return this.severity;
    }
    /**
     * @return Current state of the endpoint.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return Whether the endpoint should report traffic logs in addition to threat logs.
     * 
     */
    public Boolean trafficLogs() {
        return this.trafficLogs;
    }
    /**
     * @return The update time timestamp.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEndpointResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String description;
        private String endpointForwardingRule;
        private String endpointIp;
        private Map<String,String> labels;
        private String name;
        private String network;
        private String severity;
        private String state;
        private Boolean trafficLogs;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEndpointResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.endpointForwardingRule = defaults.endpointForwardingRule;
    	      this.endpointIp = defaults.endpointIp;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.severity = defaults.severity;
    	      this.state = defaults.state;
    	      this.trafficLogs = defaults.trafficLogs;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder endpointForwardingRule(String endpointForwardingRule) {
            this.endpointForwardingRule = Objects.requireNonNull(endpointForwardingRule);
            return this;
        }
        public Builder endpointIp(String endpointIp) {
            this.endpointIp = Objects.requireNonNull(endpointIp);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder network(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }
        public Builder severity(String severity) {
            this.severity = Objects.requireNonNull(severity);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder trafficLogs(Boolean trafficLogs) {
            this.trafficLogs = Objects.requireNonNull(trafficLogs);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }        public GetEndpointResult build() {
            return new GetEndpointResult(createTime, description, endpointForwardingRule, endpointIp, labels, name, network, severity, state, trafficLogs, updateTime);
        }
    }
}
