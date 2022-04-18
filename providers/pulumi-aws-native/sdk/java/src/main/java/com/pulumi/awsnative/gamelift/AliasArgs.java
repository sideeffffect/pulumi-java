// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.gamelift;

import com.pulumi.awsnative.gamelift.inputs.AliasRoutingStrategyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AliasArgs extends com.pulumi.resources.ResourceArgs {

    public static final AliasArgs Empty = new AliasArgs();

    /**
     * A human-readable description of the alias.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * A descriptive label that is associated with an alias. Alias names do not need to be unique.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * A routing configuration that specifies where traffic is directed for this alias, such as to a fleet or to a message.
     * 
     */
    @Import(name="routingStrategy", required=true)
      private final Output<AliasRoutingStrategyArgs> routingStrategy;

    public Output<AliasRoutingStrategyArgs> routingStrategy() {
        return this.routingStrategy;
    }

    public AliasArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> name,
        Output<AliasRoutingStrategyArgs> routingStrategy) {
        this.description = description;
        this.name = name;
        this.routingStrategy = Objects.requireNonNull(routingStrategy, "expected parameter 'routingStrategy' to be non-null");
    }

    private AliasArgs() {
        this.description = Codegen.empty();
        this.name = Codegen.empty();
        this.routingStrategy = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AliasArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;
        private Output<AliasRoutingStrategyArgs> routingStrategy;

        public Builder() {
    	      // Empty
        }

        public Builder(AliasArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.routingStrategy = defaults.routingStrategy;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder routingStrategy(Output<AliasRoutingStrategyArgs> routingStrategy) {
            this.routingStrategy = Objects.requireNonNull(routingStrategy);
            return this;
        }
        public Builder routingStrategy(AliasRoutingStrategyArgs routingStrategy) {
            this.routingStrategy = Output.of(Objects.requireNonNull(routingStrategy));
            return this;
        }        public AliasArgs build() {
            return new AliasArgs(description, name, routingStrategy);
        }
    }
}
