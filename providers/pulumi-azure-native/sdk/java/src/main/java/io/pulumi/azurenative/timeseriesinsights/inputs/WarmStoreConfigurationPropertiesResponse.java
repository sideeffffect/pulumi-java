// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.timeseriesinsights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The warm store configuration provides the details to create a warm store cache that will retain a copy of the environment's data available for faster query.
 * 
 */
public final class WarmStoreConfigurationPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final WarmStoreConfigurationPropertiesResponse Empty = new WarmStoreConfigurationPropertiesResponse();

    /**
     * ISO8601 timespan specifying the number of days the environment's events will be available for query from the warm store.
     * 
     */
    @InputImport(name="dataRetention", required=true)
      private final String dataRetention;

    public String getDataRetention() {
        return this.dataRetention;
    }

    public WarmStoreConfigurationPropertiesResponse(String dataRetention) {
        this.dataRetention = Objects.requireNonNull(dataRetention, "expected parameter 'dataRetention' to be non-null");
    }

    private WarmStoreConfigurationPropertiesResponse() {
        this.dataRetention = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WarmStoreConfigurationPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataRetention;

        public Builder() {
    	      // Empty
        }

        public Builder(WarmStoreConfigurationPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataRetention = defaults.dataRetention;
        }

        public Builder dataRetention(String dataRetention) {
            this.dataRetention = Objects.requireNonNull(dataRetention);
            return this;
        }
        public WarmStoreConfigurationPropertiesResponse build() {
            return new WarmStoreConfigurationPropertiesResponse(dataRetention);
        }
    }
}
