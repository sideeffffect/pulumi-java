// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssm.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class PatchBaselineGlobalFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final PatchBaselineGlobalFilterArgs Empty = new PatchBaselineGlobalFilterArgs();

    @InputImport(name="key", required=true)
      private final Input<String> key;

    public Input<String> getKey() {
        return this.key;
    }

    @InputImport(name="values", required=true)
      private final Input<List<String>> values;

    public Input<List<String>> getValues() {
        return this.values;
    }

    public PatchBaselineGlobalFilterArgs(
        Input<String> key,
        Input<List<String>> values) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.values = Objects.requireNonNull(values, "expected parameter 'values' to be non-null");
    }

    private PatchBaselineGlobalFilterArgs() {
        this.key = Input.empty();
        this.values = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchBaselineGlobalFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> key;
        private Input<List<String>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchBaselineGlobalFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.values = defaults.values;
        }

        public Builder key(Input<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder key(String key) {
            this.key = Input.of(Objects.requireNonNull(key));
            return this;
        }

        public Builder values(Input<List<String>> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }

        public Builder values(List<String> values) {
            this.values = Input.of(Objects.requireNonNull(values));
            return this;
        }
        public PatchBaselineGlobalFilterArgs build() {
            return new PatchBaselineGlobalFilterArgs(key, values);
        }
    }
}
