// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.inputs;

import io.pulumi.azurenative.streamanalytics.inputs.AzureMachineLearningWebServiceInputColumnResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The inputs for the Azure Machine Learning web service endpoint.
 * 
 */
public final class AzureMachineLearningWebServiceInputsResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzureMachineLearningWebServiceInputsResponse Empty = new AzureMachineLearningWebServiceInputsResponse();

    /**
     * A list of input columns for the Azure Machine Learning web service endpoint.
     * 
     */
    @InputImport(name="columnNames")
      private final @Nullable List<AzureMachineLearningWebServiceInputColumnResponse> columnNames;

    public List<AzureMachineLearningWebServiceInputColumnResponse> getColumnNames() {
        return this.columnNames == null ? List.of() : this.columnNames;
    }

    /**
     * The name of the input. This is the name provided while authoring the endpoint.
     * 
     */
    @InputImport(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    public AzureMachineLearningWebServiceInputsResponse(
        @Nullable List<AzureMachineLearningWebServiceInputColumnResponse> columnNames,
        @Nullable String name) {
        this.columnNames = columnNames;
        this.name = name;
    }

    private AzureMachineLearningWebServiceInputsResponse() {
        this.columnNames = List.of();
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureMachineLearningWebServiceInputsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<AzureMachineLearningWebServiceInputColumnResponse> columnNames;
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureMachineLearningWebServiceInputsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columnNames = defaults.columnNames;
    	      this.name = defaults.name;
        }

        public Builder columnNames(@Nullable List<AzureMachineLearningWebServiceInputColumnResponse> columnNames) {
            this.columnNames = columnNames;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public AzureMachineLearningWebServiceInputsResponse build() {
            return new AzureMachineLearningWebServiceInputsResponse(columnNames, name);
        }
    }
}
