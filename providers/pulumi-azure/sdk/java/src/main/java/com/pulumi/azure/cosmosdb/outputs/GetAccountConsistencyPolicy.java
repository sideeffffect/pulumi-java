// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cosmosdb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAccountConsistencyPolicy {
    /**
     * @return The Consistency Level used by this CosmosDB Account.
     * 
     */
    private final String consistencyLevel;
    /**
     * @return The amount of staleness (in seconds) tolerated when the consistency level is Bounded Staleness.
     * 
     */
    private final Integer maxIntervalInSeconds;
    /**
     * @return The number of stale requests tolerated when the consistency level is Bounded Staleness.
     * 
     */
    private final Integer maxStalenessPrefix;

    @CustomType.Constructor
    private GetAccountConsistencyPolicy(
        @CustomType.Parameter("consistencyLevel") String consistencyLevel,
        @CustomType.Parameter("maxIntervalInSeconds") Integer maxIntervalInSeconds,
        @CustomType.Parameter("maxStalenessPrefix") Integer maxStalenessPrefix) {
        this.consistencyLevel = consistencyLevel;
        this.maxIntervalInSeconds = maxIntervalInSeconds;
        this.maxStalenessPrefix = maxStalenessPrefix;
    }

    /**
     * @return The Consistency Level used by this CosmosDB Account.
     * 
     */
    public String consistencyLevel() {
        return this.consistencyLevel;
    }
    /**
     * @return The amount of staleness (in seconds) tolerated when the consistency level is Bounded Staleness.
     * 
     */
    public Integer maxIntervalInSeconds() {
        return this.maxIntervalInSeconds;
    }
    /**
     * @return The number of stale requests tolerated when the consistency level is Bounded Staleness.
     * 
     */
    public Integer maxStalenessPrefix() {
        return this.maxStalenessPrefix;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountConsistencyPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String consistencyLevel;
        private Integer maxIntervalInSeconds;
        private Integer maxStalenessPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccountConsistencyPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consistencyLevel = defaults.consistencyLevel;
    	      this.maxIntervalInSeconds = defaults.maxIntervalInSeconds;
    	      this.maxStalenessPrefix = defaults.maxStalenessPrefix;
        }

        public Builder consistencyLevel(String consistencyLevel) {
            this.consistencyLevel = Objects.requireNonNull(consistencyLevel);
            return this;
        }
        public Builder maxIntervalInSeconds(Integer maxIntervalInSeconds) {
            this.maxIntervalInSeconds = Objects.requireNonNull(maxIntervalInSeconds);
            return this;
        }
        public Builder maxStalenessPrefix(Integer maxStalenessPrefix) {
            this.maxStalenessPrefix = Objects.requireNonNull(maxStalenessPrefix);
            return this;
        }        public GetAccountConsistencyPolicy build() {
            return new GetAccountConsistencyPolicy(consistencyLevel, maxIntervalInSeconds, maxStalenessPrefix);
        }
    }
}
