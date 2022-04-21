// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databoxedge.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Load balancer configuration
 * 
 */
public final class LoadBalancerConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final LoadBalancerConfigResponse Empty = new LoadBalancerConfigResponse();

    /**
     * Load balancer type
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    /**
     * Load balancer version
     * 
     */
    @Import(name="version", required=true)
    private String version;

    public String version() {
        return this.version;
    }

    private LoadBalancerConfigResponse() {}

    private LoadBalancerConfigResponse(LoadBalancerConfigResponse $) {
        this.type = $.type;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancerConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancerConfigResponse $;

        public Builder() {
            $ = new LoadBalancerConfigResponse();
        }

        public Builder(LoadBalancerConfigResponse defaults) {
            $ = new LoadBalancerConfigResponse(Objects.requireNonNull(defaults));
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public Builder version(String version) {
            $.version = version;
            return this;
        }

        public LoadBalancerConfigResponse build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            $.version = Objects.requireNonNull($.version, "expected parameter 'version' to be non-null");
            return $;
        }
    }

}
