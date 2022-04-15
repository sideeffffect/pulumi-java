// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudtrail.inputs;

import io.pulumi.aws.cloudtrail.inputs.TrailAdvancedEventSelectorFieldSelectorGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TrailAdvancedEventSelectorGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TrailAdvancedEventSelectorGetArgs Empty = new TrailAdvancedEventSelectorGetArgs();

    /**
     * Specifies the selector statements in an advanced event selector. Fields documented below.
     * 
     */
    @Import(name="fieldSelectors", required=true)
      private final Output<List<TrailAdvancedEventSelectorFieldSelectorGetArgs>> fieldSelectors;

    public Output<List<TrailAdvancedEventSelectorFieldSelectorGetArgs>> fieldSelectors() {
        return this.fieldSelectors;
    }

    /**
     * Specifies the name of the advanced event selector.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    public TrailAdvancedEventSelectorGetArgs(
        Output<List<TrailAdvancedEventSelectorFieldSelectorGetArgs>> fieldSelectors,
        @Nullable Output<String> name) {
        this.fieldSelectors = Objects.requireNonNull(fieldSelectors, "expected parameter 'fieldSelectors' to be non-null");
        this.name = name;
    }

    private TrailAdvancedEventSelectorGetArgs() {
        this.fieldSelectors = Codegen.empty();
        this.name = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrailAdvancedEventSelectorGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<TrailAdvancedEventSelectorFieldSelectorGetArgs>> fieldSelectors;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(TrailAdvancedEventSelectorGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldSelectors = defaults.fieldSelectors;
    	      this.name = defaults.name;
        }

        public Builder fieldSelectors(Output<List<TrailAdvancedEventSelectorFieldSelectorGetArgs>> fieldSelectors) {
            this.fieldSelectors = Objects.requireNonNull(fieldSelectors);
            return this;
        }
        public Builder fieldSelectors(List<TrailAdvancedEventSelectorFieldSelectorGetArgs> fieldSelectors) {
            this.fieldSelectors = Output.of(Objects.requireNonNull(fieldSelectors));
            return this;
        }
        public Builder fieldSelectors(TrailAdvancedEventSelectorFieldSelectorGetArgs... fieldSelectors) {
            return fieldSelectors(List.of(fieldSelectors));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }        public TrailAdvancedEventSelectorGetArgs build() {
            return new TrailAdvancedEventSelectorGetArgs(fieldSelectors, name);
        }
    }
}
