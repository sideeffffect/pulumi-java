// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotanalytics.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDatasetArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDatasetArgs Empty = new GetDatasetArgs();

    @Import(name="datasetName", required=true)
      private final String datasetName;

    public String datasetName() {
        return this.datasetName;
    }

    public GetDatasetArgs(String datasetName) {
        this.datasetName = Objects.requireNonNull(datasetName, "expected parameter 'datasetName' to be non-null");
    }

    private GetDatasetArgs() {
        this.datasetName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatasetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String datasetName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDatasetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetName = defaults.datasetName;
        }

        public Builder datasetName(String datasetName) {
            this.datasetName = Objects.requireNonNull(datasetName);
            return this;
        }        public GetDatasetArgs build() {
            return new GetDatasetArgs(datasetName);
        }
    }
}
