// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.awsnative.databrew.inputs.DatasetParameter;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * A key-value pair to associate dataset parameter name with its definition.
 * 
 */
public final class DatasetPathParameter extends io.pulumi.resources.InvokeArgs {

    public static final DatasetPathParameter Empty = new DatasetPathParameter();

    @InputImport(name="datasetParameter", required=true)
      private final DatasetParameter datasetParameter;

    public DatasetParameter getDatasetParameter() {
        return this.datasetParameter;
    }

    @InputImport(name="pathParameterName", required=true)
      private final String pathParameterName;

    public String getPathParameterName() {
        return this.pathParameterName;
    }

    public DatasetPathParameter(
        DatasetParameter datasetParameter,
        String pathParameterName) {
        this.datasetParameter = Objects.requireNonNull(datasetParameter, "expected parameter 'datasetParameter' to be non-null");
        this.pathParameterName = Objects.requireNonNull(pathParameterName, "expected parameter 'pathParameterName' to be non-null");
    }

    private DatasetPathParameter() {
        this.datasetParameter = null;
        this.pathParameterName = null;
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

        public Builder datasetParameter(DatasetParameter datasetParameter) {
            this.datasetParameter = Objects.requireNonNull(datasetParameter);
            return this;
        }

        public Builder pathParameterName(String pathParameterName) {
            this.pathParameterName = Objects.requireNonNull(pathParameterName);
            return this;
        }
        public DatasetPathParameter build() {
            return new DatasetPathParameter(datasetParameter, pathParameterName);
        }
    }
}
