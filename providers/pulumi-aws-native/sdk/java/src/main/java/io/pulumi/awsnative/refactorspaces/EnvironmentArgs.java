// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.refactorspaces;

import io.pulumi.awsnative.refactorspaces.enums.EnvironmentNetworkFabricType;
import io.pulumi.awsnative.refactorspaces.inputs.EnvironmentTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnvironmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentArgs Empty = new EnvironmentArgs();

    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="networkFabricType")
      private final @Nullable Input<EnvironmentNetworkFabricType> networkFabricType;

    public Input<EnvironmentNetworkFabricType> getNetworkFabricType() {
        return this.networkFabricType == null ? Input.empty() : this.networkFabricType;
    }

    /**
     * Metadata that you can assign to help organize the frameworks that you create. Each tag is a key-value pair.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<List<EnvironmentTagArgs>> tags;

    public Input<List<EnvironmentTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public EnvironmentArgs(
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        @Nullable Input<EnvironmentNetworkFabricType> networkFabricType,
        @Nullable Input<List<EnvironmentTagArgs>> tags) {
        this.description = description;
        this.name = name;
        this.networkFabricType = networkFabricType;
        this.tags = tags;
    }

    private EnvironmentArgs() {
        this.description = Input.empty();
        this.name = Input.empty();
        this.networkFabricType = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private @Nullable Input<EnvironmentNetworkFabricType> networkFabricType;
        private @Nullable Input<List<EnvironmentTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.networkFabricType = defaults.networkFabricType;
    	      this.tags = defaults.tags;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder networkFabricType(@Nullable Input<EnvironmentNetworkFabricType> networkFabricType) {
            this.networkFabricType = networkFabricType;
            return this;
        }

        public Builder networkFabricType(@Nullable EnvironmentNetworkFabricType networkFabricType) {
            this.networkFabricType = Input.ofNullable(networkFabricType);
            return this;
        }

        public Builder tags(@Nullable Input<List<EnvironmentTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<EnvironmentTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public EnvironmentArgs build() {
            return new EnvironmentArgs(description, name, networkFabricType, tags);
        }
    }
}
