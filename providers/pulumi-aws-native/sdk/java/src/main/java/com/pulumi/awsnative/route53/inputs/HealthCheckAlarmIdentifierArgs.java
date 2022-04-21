// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.route53.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A complex type that identifies the CloudWatch alarm that you want Amazon Route 53 health checkers to use to determine whether the specified health check is healthy.
 * 
 */
public final class HealthCheckAlarmIdentifierArgs extends com.pulumi.resources.ResourceArgs {

    public static final HealthCheckAlarmIdentifierArgs Empty = new HealthCheckAlarmIdentifierArgs();

    /**
     * The name of the CloudWatch alarm that you want Amazon Route 53 health checkers to use to determine whether this health check is healthy.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * For the CloudWatch alarm that you want Route 53 health checkers to use to determine whether this health check is healthy, the region that the alarm was created in.
     * 
     */
    @Import(name="region", required=true)
    private Output<String> region;

    public Output<String> region() {
        return this.region;
    }

    private HealthCheckAlarmIdentifierArgs() {}

    private HealthCheckAlarmIdentifierArgs(HealthCheckAlarmIdentifierArgs $) {
        this.name = $.name;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HealthCheckAlarmIdentifierArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HealthCheckAlarmIdentifierArgs $;

        public Builder() {
            $ = new HealthCheckAlarmIdentifierArgs();
        }

        public Builder(HealthCheckAlarmIdentifierArgs defaults) {
            $ = new HealthCheckAlarmIdentifierArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
        }

        public HealthCheckAlarmIdentifierArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            return $;
        }
    }

}
