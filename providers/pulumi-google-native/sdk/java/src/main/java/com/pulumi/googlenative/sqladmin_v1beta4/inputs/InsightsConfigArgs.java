// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin_v1beta4.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Insights configuration. This specifies when Cloud SQL Insights feature is enabled and optional configuration.
 * 
 */
public final class InsightsConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final InsightsConfigArgs Empty = new InsightsConfigArgs();

    /**
     * Whether Query Insights feature is enabled.
     * 
     */
    @Import(name="queryInsightsEnabled")
    private @Nullable Output<Boolean> queryInsightsEnabled;

    public Optional<Output<Boolean>> queryInsightsEnabled() {
        return Optional.ofNullable(this.queryInsightsEnabled);
    }

    /**
     * Number of query execution plans captured by Insights per minute for all queries combined. Default is 5.
     * 
     */
    @Import(name="queryPlansPerMinute")
    private @Nullable Output<Integer> queryPlansPerMinute;

    public Optional<Output<Integer>> queryPlansPerMinute() {
        return Optional.ofNullable(this.queryPlansPerMinute);
    }

    /**
     * Maximum query length stored in bytes. Default value: 1024 bytes. Range: 256-4500 bytes. Query length more than this field value will be truncated to this value. When unset, query length will be the default value. Changing query length will restart the database.
     * 
     */
    @Import(name="queryStringLength")
    private @Nullable Output<Integer> queryStringLength;

    public Optional<Output<Integer>> queryStringLength() {
        return Optional.ofNullable(this.queryStringLength);
    }

    /**
     * Whether Query Insights will record application tags from query when enabled.
     * 
     */
    @Import(name="recordApplicationTags")
    private @Nullable Output<Boolean> recordApplicationTags;

    public Optional<Output<Boolean>> recordApplicationTags() {
        return Optional.ofNullable(this.recordApplicationTags);
    }

    /**
     * Whether Query Insights will record client address when enabled.
     * 
     */
    @Import(name="recordClientAddress")
    private @Nullable Output<Boolean> recordClientAddress;

    public Optional<Output<Boolean>> recordClientAddress() {
        return Optional.ofNullable(this.recordClientAddress);
    }

    private InsightsConfigArgs() {}

    private InsightsConfigArgs(InsightsConfigArgs $) {
        this.queryInsightsEnabled = $.queryInsightsEnabled;
        this.queryPlansPerMinute = $.queryPlansPerMinute;
        this.queryStringLength = $.queryStringLength;
        this.recordApplicationTags = $.recordApplicationTags;
        this.recordClientAddress = $.recordClientAddress;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InsightsConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InsightsConfigArgs $;

        public Builder() {
            $ = new InsightsConfigArgs();
        }

        public Builder(InsightsConfigArgs defaults) {
            $ = new InsightsConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder queryInsightsEnabled(@Nullable Output<Boolean> queryInsightsEnabled) {
            $.queryInsightsEnabled = queryInsightsEnabled;
            return this;
        }

        public Builder queryInsightsEnabled(Boolean queryInsightsEnabled) {
            return queryInsightsEnabled(Output.of(queryInsightsEnabled));
        }

        public Builder queryPlansPerMinute(@Nullable Output<Integer> queryPlansPerMinute) {
            $.queryPlansPerMinute = queryPlansPerMinute;
            return this;
        }

        public Builder queryPlansPerMinute(Integer queryPlansPerMinute) {
            return queryPlansPerMinute(Output.of(queryPlansPerMinute));
        }

        public Builder queryStringLength(@Nullable Output<Integer> queryStringLength) {
            $.queryStringLength = queryStringLength;
            return this;
        }

        public Builder queryStringLength(Integer queryStringLength) {
            return queryStringLength(Output.of(queryStringLength));
        }

        public Builder recordApplicationTags(@Nullable Output<Boolean> recordApplicationTags) {
            $.recordApplicationTags = recordApplicationTags;
            return this;
        }

        public Builder recordApplicationTags(Boolean recordApplicationTags) {
            return recordApplicationTags(Output.of(recordApplicationTags));
        }

        public Builder recordClientAddress(@Nullable Output<Boolean> recordClientAddress) {
            $.recordClientAddress = recordClientAddress;
            return this;
        }

        public Builder recordClientAddress(Boolean recordClientAddress) {
            return recordClientAddress(Output.of(recordClientAddress));
        }

        public InsightsConfigArgs build() {
            return $;
        }
    }

}
