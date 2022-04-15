// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.quicksight.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DataSourceParametersAwsIotAnalytics {
    /**
     * The name of the data set to which to connect.
     * 
     */
    private final String dataSetName;

    @CustomType.Constructor
    private DataSourceParametersAwsIotAnalytics(@CustomType.Parameter("dataSetName") String dataSetName) {
        this.dataSetName = dataSetName;
    }

    /**
     * The name of the data set to which to connect.
     * 
    */
    public String dataSetName() {
        return this.dataSetName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceParametersAwsIotAnalytics defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataSetName;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceParametersAwsIotAnalytics defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataSetName = defaults.dataSetName;
        }

        public Builder dataSetName(String dataSetName) {
            this.dataSetName = Objects.requireNonNull(dataSetName);
            return this;
        }        public DataSourceParametersAwsIotAnalytics build() {
            return new DataSourceParametersAwsIotAnalytics(dataSetName);
        }
    }
}
