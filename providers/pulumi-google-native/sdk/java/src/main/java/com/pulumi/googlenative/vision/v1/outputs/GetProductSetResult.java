// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vision.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.vision.v1.outputs.StatusResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetProductSetResult {
    /**
     * @return The user-provided name for this ProductSet. Must not be empty. Must be at most 4096 characters long.
     * 
     */
    private final String displayName;
    /**
     * @return If there was an error with indexing the product set, the field is populated. This field is ignored when creating a ProductSet.
     * 
     */
    private final StatusResponse indexError;
    /**
     * @return The time at which this ProductSet was last indexed. Query results will reflect all updates before this time. If this ProductSet has never been indexed, this timestamp is the default value &#34;1970-01-01T00:00:00Z&#34;. This field is ignored when creating a ProductSet.
     * 
     */
    private final String indexTime;
    /**
     * @return The resource name of the ProductSet. Format is: `projects/PROJECT_ID/locations/LOC_ID/productSets/PRODUCT_SET_ID`. This field is ignored when creating a ProductSet.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private GetProductSetResult(
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("indexError") StatusResponse indexError,
        @CustomType.Parameter("indexTime") String indexTime,
        @CustomType.Parameter("name") String name) {
        this.displayName = displayName;
        this.indexError = indexError;
        this.indexTime = indexTime;
        this.name = name;
    }

    /**
     * @return The user-provided name for this ProductSet. Must not be empty. Must be at most 4096 characters long.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return If there was an error with indexing the product set, the field is populated. This field is ignored when creating a ProductSet.
     * 
     */
    public StatusResponse indexError() {
        return this.indexError;
    }
    /**
     * @return The time at which this ProductSet was last indexed. Query results will reflect all updates before this time. If this ProductSet has never been indexed, this timestamp is the default value &#34;1970-01-01T00:00:00Z&#34;. This field is ignored when creating a ProductSet.
     * 
     */
    public String indexTime() {
        return this.indexTime;
    }
    /**
     * @return The resource name of the ProductSet. Format is: `projects/PROJECT_ID/locations/LOC_ID/productSets/PRODUCT_SET_ID`. This field is ignored when creating a ProductSet.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProductSetResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;
        private StatusResponse indexError;
        private String indexTime;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProductSetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.indexError = defaults.indexError;
    	      this.indexTime = defaults.indexTime;
    	      this.name = defaults.name;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder indexError(StatusResponse indexError) {
            this.indexError = Objects.requireNonNull(indexError);
            return this;
        }
        public Builder indexTime(String indexTime) {
            this.indexTime = Objects.requireNonNull(indexTime);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public GetProductSetResult build() {
            return new GetProductSetResult(displayName, indexError, indexTime, name);
        }
    }
}
