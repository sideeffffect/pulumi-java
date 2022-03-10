// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.backup.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class FrameworkControlInputParameterArgs extends io.pulumi.resources.ResourceArgs {

    public static final FrameworkControlInputParameterArgs Empty = new FrameworkControlInputParameterArgs();

    @InputImport(name="parameterName", required=true)
      private final Input<String> parameterName;

    public Input<String> getParameterName() {
        return this.parameterName;
    }

    @InputImport(name="parameterValue", required=true)
      private final Input<String> parameterValue;

    public Input<String> getParameterValue() {
        return this.parameterValue;
    }

    public FrameworkControlInputParameterArgs(
        Input<String> parameterName,
        Input<String> parameterValue) {
        this.parameterName = Objects.requireNonNull(parameterName, "expected parameter 'parameterName' to be non-null");
        this.parameterValue = Objects.requireNonNull(parameterValue, "expected parameter 'parameterValue' to be non-null");
    }

    private FrameworkControlInputParameterArgs() {
        this.parameterName = Input.empty();
        this.parameterValue = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FrameworkControlInputParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> parameterName;
        private Input<String> parameterValue;

        public Builder() {
    	      // Empty
        }

        public Builder(FrameworkControlInputParameterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameterName = defaults.parameterName;
    	      this.parameterValue = defaults.parameterValue;
        }

        public Builder parameterName(Input<String> parameterName) {
            this.parameterName = Objects.requireNonNull(parameterName);
            return this;
        }

        public Builder parameterName(String parameterName) {
            this.parameterName = Input.of(Objects.requireNonNull(parameterName));
            return this;
        }

        public Builder parameterValue(Input<String> parameterValue) {
            this.parameterValue = Objects.requireNonNull(parameterValue);
            return this;
        }

        public Builder parameterValue(String parameterValue) {
            this.parameterValue = Input.of(Objects.requireNonNull(parameterValue));
            return this;
        }
        public FrameworkControlInputParameterArgs build() {
            return new FrameworkControlInputParameterArgs(parameterName, parameterValue);
        }
    }
}
