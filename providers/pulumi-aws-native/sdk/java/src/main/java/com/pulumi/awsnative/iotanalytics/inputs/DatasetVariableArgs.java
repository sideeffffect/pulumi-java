// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotanalytics.inputs;

import com.pulumi.awsnative.iotanalytics.inputs.DatasetContentVersionValueArgs;
import com.pulumi.awsnative.iotanalytics.inputs.DatasetOutputFileUriValueArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatasetVariableArgs extends ResourceArgs {

    public static final DatasetVariableArgs Empty = new DatasetVariableArgs();

    @Import(name="datasetContentVersionValue")
    private @Nullable Output<DatasetContentVersionValueArgs> datasetContentVersionValue;

    public Optional<Output<DatasetContentVersionValueArgs>> datasetContentVersionValue() {
        return Optional.ofNullable(this.datasetContentVersionValue);
    }

    @Import(name="doubleValue")
    private @Nullable Output<Double> doubleValue;

    public Optional<Output<Double>> doubleValue() {
        return Optional.ofNullable(this.doubleValue);
    }

    @Import(name="outputFileUriValue")
    private @Nullable Output<DatasetOutputFileUriValueArgs> outputFileUriValue;

    public Optional<Output<DatasetOutputFileUriValueArgs>> outputFileUriValue() {
        return Optional.ofNullable(this.outputFileUriValue);
    }

    @Import(name="stringValue")
    private @Nullable Output<String> stringValue;

    public Optional<Output<String>> stringValue() {
        return Optional.ofNullable(this.stringValue);
    }

    @Import(name="variableName", required=true)
    private Output<String> variableName;

    public Output<String> variableName() {
        return this.variableName;
    }

    private DatasetVariableArgs() {}

    private DatasetVariableArgs(DatasetVariableArgs $) {
        this.datasetContentVersionValue = $.datasetContentVersionValue;
        this.doubleValue = $.doubleValue;
        this.outputFileUriValue = $.outputFileUriValue;
        this.stringValue = $.stringValue;
        this.variableName = $.variableName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatasetVariableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatasetVariableArgs $;

        public Builder() {
            $ = new DatasetVariableArgs();
        }

        public Builder(DatasetVariableArgs defaults) {
            $ = new DatasetVariableArgs(Objects.requireNonNull(defaults));
        }

        public Builder datasetContentVersionValue(@Nullable Output<DatasetContentVersionValueArgs> datasetContentVersionValue) {
            $.datasetContentVersionValue = datasetContentVersionValue;
            return this;
        }

        public Builder datasetContentVersionValue(DatasetContentVersionValueArgs datasetContentVersionValue) {
            return datasetContentVersionValue(Output.of(datasetContentVersionValue));
        }

        public Builder doubleValue(@Nullable Output<Double> doubleValue) {
            $.doubleValue = doubleValue;
            return this;
        }

        public Builder doubleValue(Double doubleValue) {
            return doubleValue(Output.of(doubleValue));
        }

        public Builder outputFileUriValue(@Nullable Output<DatasetOutputFileUriValueArgs> outputFileUriValue) {
            $.outputFileUriValue = outputFileUriValue;
            return this;
        }

        public Builder outputFileUriValue(DatasetOutputFileUriValueArgs outputFileUriValue) {
            return outputFileUriValue(Output.of(outputFileUriValue));
        }

        public Builder stringValue(@Nullable Output<String> stringValue) {
            $.stringValue = stringValue;
            return this;
        }

        public Builder stringValue(String stringValue) {
            return stringValue(Output.of(stringValue));
        }

        public Builder variableName(Output<String> variableName) {
            $.variableName = variableName;
            return this;
        }

        public Builder variableName(String variableName) {
            return variableName(Output.of(variableName));
        }

        public DatasetVariableArgs build() {
            $.variableName = Objects.requireNonNull($.variableName, "expected parameter 'variableName' to be non-null");
            return $;
        }
    }

}
