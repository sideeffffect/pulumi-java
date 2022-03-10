// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ExampleRequestResponse {
    /**
     * Sample input data for the web service's global parameters
     * 
     */
    private final @Nullable Map<String,Object> globalParameters;
    /**
     * Sample input data for the web service's input(s) given as an input name to sample input values matrix map.
     * 
     */
    private final @Nullable Map<String,List<List<Object>>> inputs;

    @OutputCustomType.Constructor
    private ExampleRequestResponse(
        @OutputCustomType.Parameter("globalParameters") @Nullable Map<String,Object> globalParameters,
        @OutputCustomType.Parameter("inputs") @Nullable Map<String,List<List<Object>>> inputs) {
        this.globalParameters = globalParameters;
        this.inputs = inputs;
    }

    /**
     * Sample input data for the web service's global parameters
     * 
    */
    public Map<String,Object> getGlobalParameters() {
        return this.globalParameters == null ? Map.of() : this.globalParameters;
    }
    /**
     * Sample input data for the web service's input(s) given as an input name to sample input values matrix map.
     * 
    */
    public Map<String,List<List<Object>>> getInputs() {
        return this.inputs == null ? Map.of() : this.inputs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExampleRequestResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,Object> globalParameters;
        private @Nullable Map<String,List<List<Object>>> inputs;

        public Builder() {
    	      // Empty
        }

        public Builder(ExampleRequestResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.globalParameters = defaults.globalParameters;
    	      this.inputs = defaults.inputs;
        }

        public Builder globalParameters(@Nullable Map<String,Object> globalParameters) {
            this.globalParameters = globalParameters;
            return this;
        }

        public Builder inputs(@Nullable Map<String,List<List<Object>>> inputs) {
            this.inputs = inputs;
            return this;
        }
        public ExampleRequestResponse build() {
            return new ExampleRequestResponse(globalParameters, inputs);
        }
    }
}
