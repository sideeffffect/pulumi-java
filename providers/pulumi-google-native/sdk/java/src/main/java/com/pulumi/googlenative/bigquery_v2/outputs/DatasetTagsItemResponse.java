// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DatasetTagsItemResponse {
    /**
     * [Required] The namespaced friendly name of the tag key, e.g. "12345/environment" where 12345 is org id.
     * 
     */
    private final String tagKey;
    /**
     * [Required] Friendly short name of the tag value, e.g. "production".
     * 
     */
    private final String tagValue;

    @CustomType.Constructor
    private DatasetTagsItemResponse(
        @CustomType.Parameter("tagKey") String tagKey,
        @CustomType.Parameter("tagValue") String tagValue) {
        this.tagKey = tagKey;
        this.tagValue = tagValue;
    }

    /**
     * [Required] The namespaced friendly name of the tag key, e.g. "12345/environment" where 12345 is org id.
     * 
    */
    public String tagKey() {
        return this.tagKey;
    }
    /**
     * [Required] Friendly short name of the tag value, e.g. "production".
     * 
    */
    public String tagValue() {
        return this.tagValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetTagsItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String tagKey;
        private String tagValue;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetTagsItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tagKey = defaults.tagKey;
    	      this.tagValue = defaults.tagValue;
        }

        public Builder tagKey(String tagKey) {
            this.tagKey = Objects.requireNonNull(tagKey);
            return this;
        }
        public Builder tagValue(String tagValue) {
            this.tagValue = Objects.requireNonNull(tagValue);
            return this;
        }        public DatasetTagsItemResponse build() {
            return new DatasetTagsItemResponse(tagKey, tagValue);
        }
    }
}
