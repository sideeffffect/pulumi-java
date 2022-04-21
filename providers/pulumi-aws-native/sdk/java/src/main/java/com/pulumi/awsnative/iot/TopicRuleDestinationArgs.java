// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot;

import com.pulumi.awsnative.iot.enums.TopicRuleDestinationStatus;
import com.pulumi.awsnative.iot.inputs.TopicRuleDestinationHttpUrlDestinationSummaryArgs;
import com.pulumi.awsnative.iot.inputs.TopicRuleDestinationVpcDestinationPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TopicRuleDestinationArgs extends com.pulumi.resources.ResourceArgs {

    public static final TopicRuleDestinationArgs Empty = new TopicRuleDestinationArgs();

    /**
     * HTTP URL destination properties.
     * 
     */
    @Import(name="httpUrlProperties")
    private @Nullable Output<TopicRuleDestinationHttpUrlDestinationSummaryArgs> httpUrlProperties;

    public Optional<Output<TopicRuleDestinationHttpUrlDestinationSummaryArgs>> httpUrlProperties() {
        return Optional.ofNullable(this.httpUrlProperties);
    }

    /**
     * The status of the TopicRuleDestination.
     * 
     */
    @Import(name="status")
    private @Nullable Output<TopicRuleDestinationStatus> status;

    public Optional<Output<TopicRuleDestinationStatus>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * VPC destination properties.
     * 
     */
    @Import(name="vpcProperties")
    private @Nullable Output<TopicRuleDestinationVpcDestinationPropertiesArgs> vpcProperties;

    public Optional<Output<TopicRuleDestinationVpcDestinationPropertiesArgs>> vpcProperties() {
        return Optional.ofNullable(this.vpcProperties);
    }

    private TopicRuleDestinationArgs() {}

    private TopicRuleDestinationArgs(TopicRuleDestinationArgs $) {
        this.httpUrlProperties = $.httpUrlProperties;
        this.status = $.status;
        this.vpcProperties = $.vpcProperties;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TopicRuleDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TopicRuleDestinationArgs $;

        public Builder() {
            $ = new TopicRuleDestinationArgs();
        }

        public Builder(TopicRuleDestinationArgs defaults) {
            $ = new TopicRuleDestinationArgs(Objects.requireNonNull(defaults));
        }

        public Builder httpUrlProperties(@Nullable Output<TopicRuleDestinationHttpUrlDestinationSummaryArgs> httpUrlProperties) {
            $.httpUrlProperties = httpUrlProperties;
            return this;
        }

        public Builder httpUrlProperties(TopicRuleDestinationHttpUrlDestinationSummaryArgs httpUrlProperties) {
            return httpUrlProperties(Output.of(httpUrlProperties));
        }

        public Builder status(@Nullable Output<TopicRuleDestinationStatus> status) {
            $.status = status;
            return this;
        }

        public Builder status(TopicRuleDestinationStatus status) {
            return status(Output.of(status));
        }

        public Builder vpcProperties(@Nullable Output<TopicRuleDestinationVpcDestinationPropertiesArgs> vpcProperties) {
            $.vpcProperties = vpcProperties;
            return this;
        }

        public Builder vpcProperties(TopicRuleDestinationVpcDestinationPropertiesArgs vpcProperties) {
            return vpcProperties(Output.of(vpcProperties));
        }

        public TopicRuleDestinationArgs build() {
            return $;
        }
    }

}
