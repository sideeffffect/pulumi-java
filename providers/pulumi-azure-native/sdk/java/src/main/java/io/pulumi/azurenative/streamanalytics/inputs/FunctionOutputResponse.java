// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the output of a function.
 * 
 */
public final class FunctionOutputResponse extends io.pulumi.resources.InvokeArgs {

    public static final FunctionOutputResponse Empty = new FunctionOutputResponse();

    /**
     * The (Azure Stream Analytics supported) data type of the function output. A list of valid Azure Stream Analytics data types are described at https://msdn.microsoft.com/en-us/library/azure/dn835065.aspx
     * 
     */
    @InputImport(name="dataType")
      private final @Nullable String dataType;

    public Optional<String> getDataType() {
        return this.dataType == null ? Optional.empty() : Optional.ofNullable(this.dataType);
    }

    public FunctionOutputResponse(@Nullable String dataType) {
        this.dataType = dataType;
    }

    private FunctionOutputResponse() {
        this.dataType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionOutputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String dataType;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionOutputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataType = defaults.dataType;
        }

        public Builder dataType(@Nullable String dataType) {
            this.dataType = dataType;
            return this;
        }
        public FunctionOutputResponse build() {
            return new FunctionOutputResponse(dataType);
        }
    }
}
