// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.resourcegroups.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GroupConfigurationParameterArgs extends io.pulumi.resources.ResourceArgs {

    public static final GroupConfigurationParameterArgs Empty = new GroupConfigurationParameterArgs();

    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="values")
      private final @Nullable Input<List<String>> values;

    public Input<List<String>> getValues() {
        return this.values == null ? Input.empty() : this.values;
    }

    public GroupConfigurationParameterArgs(
        @Nullable Input<String> name,
        @Nullable Input<List<String>> values) {
        this.name = name;
        this.values = values;
    }

    private GroupConfigurationParameterArgs() {
        this.name = Input.empty();
        this.values = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupConfigurationParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<List<String>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupConfigurationParameterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.values = defaults.values;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder values(@Nullable Input<List<String>> values) {
            this.values = values;
            return this;
        }

        public Builder values(@Nullable List<String> values) {
            this.values = Input.ofNullable(values);
            return this;
        }
        public GroupConfigurationParameterArgs build() {
            return new GroupConfigurationParameterArgs(name, values);
        }
    }
}
