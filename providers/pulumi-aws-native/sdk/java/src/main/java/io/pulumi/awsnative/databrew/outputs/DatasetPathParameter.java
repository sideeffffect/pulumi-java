// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.outputs;

import io.pulumi.awsnative.databrew.outputs.DatasetParameter;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DatasetPathParameter {
    private final DatasetParameter datasetParameter;
    private final String pathParameterName;

    @OutputCustomType.Constructor({"datasetParameter","pathParameterName"})
    private DatasetPathParameter(
        DatasetParameter datasetParameter,
        String pathParameterName) {
        this.datasetParameter = datasetParameter;
        this.pathParameterName = pathParameterName;
    }

    public DatasetParameter getDatasetParameter() {
        return this.datasetParameter;
    }
    public String getPathParameterName() {
        return this.pathParameterName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetPathParameter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatasetParameter datasetParameter;
        private String pathParameterName;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetPathParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetParameter = defaults.datasetParameter;
    	      this.pathParameterName = defaults.pathParameterName;
        }

        public Builder setDatasetParameter(DatasetParameter datasetParameter) {
            this.datasetParameter = Objects.requireNonNull(datasetParameter);
            return this;
        }

        public Builder setPathParameterName(String pathParameterName) {
            this.pathParameterName = Objects.requireNonNull(pathParameterName);
            return this;
        }
        public DatasetPathParameter build() {
            return new DatasetPathParameter(datasetParameter, pathParameterName);
        }
    }
}
