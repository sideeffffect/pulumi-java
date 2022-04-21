// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.streamanalytics.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes one input parameter of a function.
 * 
 */
public final class FunctionInputArgs extends com.pulumi.resources.ResourceArgs {

    public static final FunctionInputArgs Empty = new FunctionInputArgs();

    /**
     * The (Azure Stream Analytics supported) data type of the function input parameter. A list of valid Azure Stream Analytics data types are described at https://msdn.microsoft.com/en-us/library/azure/dn835065.aspx
     * 
     */
    @Import(name="dataType")
    private @Nullable Output<String> dataType;

    public Optional<Output<String>> dataType() {
        return Optional.ofNullable(this.dataType);
    }

    /**
     * A flag indicating if the parameter is a configuration parameter. True if this input parameter is expected to be a constant. Default is false.
     * 
     */
    @Import(name="isConfigurationParameter")
    private @Nullable Output<Boolean> isConfigurationParameter;

    public Optional<Output<Boolean>> isConfigurationParameter() {
        return Optional.ofNullable(this.isConfigurationParameter);
    }

    private FunctionInputArgs() {}

    private FunctionInputArgs(FunctionInputArgs $) {
        this.dataType = $.dataType;
        this.isConfigurationParameter = $.isConfigurationParameter;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FunctionInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FunctionInputArgs $;

        public Builder() {
            $ = new FunctionInputArgs();
        }

        public Builder(FunctionInputArgs defaults) {
            $ = new FunctionInputArgs(Objects.requireNonNull(defaults));
        }

        public Builder dataType(@Nullable Output<String> dataType) {
            $.dataType = dataType;
            return this;
        }

        public Builder dataType(String dataType) {
            return dataType(Output.of(dataType));
        }

        public Builder isConfigurationParameter(@Nullable Output<Boolean> isConfigurationParameter) {
            $.isConfigurationParameter = isConfigurationParameter;
            return this;
        }

        public Builder isConfigurationParameter(Boolean isConfigurationParameter) {
            return isConfigurationParameter(Output.of(isConfigurationParameter));
        }

        public FunctionInputArgs build() {
            return $;
        }
    }

}
