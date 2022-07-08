// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin.v1beta4.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class InsightsConfigResponse {
    /**
     * @return Whether Query Insights feature is enabled.
     * 
     */
    private final Boolean queryInsightsEnabled;
    /**
     * @return Number of query execution plans captured by Insights per minute for all queries combined. Default is 5.
     * 
     */
    private final Integer queryPlansPerMinute;
    /**
     * @return Maximum query length stored in bytes. Default value: 1024 bytes. Range: 256-4500 bytes. Query length more than this field value will be truncated to this value. When unset, query length will be the default value. Changing query length will restart the database.
     * 
     */
    private final Integer queryStringLength;
    /**
     * @return Whether Query Insights will record application tags from query when enabled.
     * 
     */
    private final Boolean recordApplicationTags;
    /**
     * @return Whether Query Insights will record client address when enabled.
     * 
     */
    private final Boolean recordClientAddress;

    @CustomType.Constructor
    private InsightsConfigResponse(
        @CustomType.Parameter("queryInsightsEnabled") Boolean queryInsightsEnabled,
        @CustomType.Parameter("queryPlansPerMinute") Integer queryPlansPerMinute,
        @CustomType.Parameter("queryStringLength") Integer queryStringLength,
        @CustomType.Parameter("recordApplicationTags") Boolean recordApplicationTags,
        @CustomType.Parameter("recordClientAddress") Boolean recordClientAddress) {
        this.queryInsightsEnabled = queryInsightsEnabled;
        this.queryPlansPerMinute = queryPlansPerMinute;
        this.queryStringLength = queryStringLength;
        this.recordApplicationTags = recordApplicationTags;
        this.recordClientAddress = recordClientAddress;
    }

    /**
     * @return Whether Query Insights feature is enabled.
     * 
     */
    public Boolean queryInsightsEnabled() {
        return this.queryInsightsEnabled;
    }
    /**
     * @return Number of query execution plans captured by Insights per minute for all queries combined. Default is 5.
     * 
     */
    public Integer queryPlansPerMinute() {
        return this.queryPlansPerMinute;
    }
    /**
     * @return Maximum query length stored in bytes. Default value: 1024 bytes. Range: 256-4500 bytes. Query length more than this field value will be truncated to this value. When unset, query length will be the default value. Changing query length will restart the database.
     * 
     */
    public Integer queryStringLength() {
        return this.queryStringLength;
    }
    /**
     * @return Whether Query Insights will record application tags from query when enabled.
     * 
     */
    public Boolean recordApplicationTags() {
        return this.recordApplicationTags;
    }
    /**
     * @return Whether Query Insights will record client address when enabled.
     * 
     */
    public Boolean recordClientAddress() {
        return this.recordClientAddress;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InsightsConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean queryInsightsEnabled;
        private Integer queryPlansPerMinute;
        private Integer queryStringLength;
        private Boolean recordApplicationTags;
        private Boolean recordClientAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(InsightsConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queryInsightsEnabled = defaults.queryInsightsEnabled;
    	      this.queryPlansPerMinute = defaults.queryPlansPerMinute;
    	      this.queryStringLength = defaults.queryStringLength;
    	      this.recordApplicationTags = defaults.recordApplicationTags;
    	      this.recordClientAddress = defaults.recordClientAddress;
        }

        public Builder queryInsightsEnabled(Boolean queryInsightsEnabled) {
            this.queryInsightsEnabled = Objects.requireNonNull(queryInsightsEnabled);
            return this;
        }
        public Builder queryPlansPerMinute(Integer queryPlansPerMinute) {
            this.queryPlansPerMinute = Objects.requireNonNull(queryPlansPerMinute);
            return this;
        }
        public Builder queryStringLength(Integer queryStringLength) {
            this.queryStringLength = Objects.requireNonNull(queryStringLength);
            return this;
        }
        public Builder recordApplicationTags(Boolean recordApplicationTags) {
            this.recordApplicationTags = Objects.requireNonNull(recordApplicationTags);
            return this;
        }
        public Builder recordClientAddress(Boolean recordClientAddress) {
            this.recordClientAddress = Objects.requireNonNull(recordClientAddress);
            return this;
        }        public InsightsConfigResponse build() {
            return new InsightsConfigResponse(queryInsightsEnabled, queryPlansPerMinute, queryStringLength, recordApplicationTags, recordClientAddress);
        }
    }
}
