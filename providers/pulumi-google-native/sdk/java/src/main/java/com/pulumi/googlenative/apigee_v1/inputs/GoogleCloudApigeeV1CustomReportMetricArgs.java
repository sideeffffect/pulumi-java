// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * This encapsulates a metric property of the form sum(message_count) where name is message_count and function is sum
 * 
 */
public final class GoogleCloudApigeeV1CustomReportMetricArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudApigeeV1CustomReportMetricArgs Empty = new GoogleCloudApigeeV1CustomReportMetricArgs();

    /**
     * aggregate function
     * 
     */
    @Import(name="function")
    private @Nullable Output<String> function;

    public Optional<Output<String>> function() {
        return Optional.ofNullable(this.function);
    }

    /**
     * name of the metric
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private GoogleCloudApigeeV1CustomReportMetricArgs() {}

    private GoogleCloudApigeeV1CustomReportMetricArgs(GoogleCloudApigeeV1CustomReportMetricArgs $) {
        this.function = $.function;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudApigeeV1CustomReportMetricArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudApigeeV1CustomReportMetricArgs $;

        public Builder() {
            $ = new GoogleCloudApigeeV1CustomReportMetricArgs();
        }

        public Builder(GoogleCloudApigeeV1CustomReportMetricArgs defaults) {
            $ = new GoogleCloudApigeeV1CustomReportMetricArgs(Objects.requireNonNull(defaults));
        }

        public Builder function(@Nullable Output<String> function) {
            $.function = function;
            return this;
        }

        public Builder function(String function) {
            return function(Output.of(function));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GoogleCloudApigeeV1CustomReportMetricArgs build() {
            return $;
        }
    }

}
