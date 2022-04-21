// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.servicediscovery.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class ServiceDnsConfigDnsRecordArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceDnsConfigDnsRecordArgs Empty = new ServiceDnsConfigDnsRecordArgs();

    /**
     * The amount of time, in seconds, that you want DNS resolvers to cache the settings for this resource record set.
     * 
     */
    @Import(name="ttl", required=true)
    private Output<Integer> ttl;

    public Output<Integer> ttl() {
        return this.ttl;
    }

    /**
     * The type of health check that you want to create, which indicates how Route 53 determines whether an endpoint is healthy. Valid Values: HTTP, HTTPS, TCP
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private ServiceDnsConfigDnsRecordArgs() {}

    private ServiceDnsConfigDnsRecordArgs(ServiceDnsConfigDnsRecordArgs $) {
        this.ttl = $.ttl;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceDnsConfigDnsRecordArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceDnsConfigDnsRecordArgs $;

        public Builder() {
            $ = new ServiceDnsConfigDnsRecordArgs();
        }

        public Builder(ServiceDnsConfigDnsRecordArgs defaults) {
            $ = new ServiceDnsConfigDnsRecordArgs(Objects.requireNonNull(defaults));
        }

        public Builder ttl(Output<Integer> ttl) {
            $.ttl = ttl;
            return this;
        }

        public Builder ttl(Integer ttl) {
            return ttl(Output.of(ttl));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ServiceDnsConfigDnsRecordArgs build() {
            $.ttl = Objects.requireNonNull($.ttl, "expected parameter 'ttl' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
