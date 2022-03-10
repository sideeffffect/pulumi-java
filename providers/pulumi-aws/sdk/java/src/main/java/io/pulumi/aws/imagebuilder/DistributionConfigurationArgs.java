// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder;

import io.pulumi.aws.imagebuilder.inputs.DistributionConfigurationDistributionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DistributionConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionConfigurationArgs Empty = new DistributionConfigurationArgs();

    /**
     * Description of the container distribution configuration.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * One or more configuration blocks with distribution settings. Detailed below.
     * 
     */
    @InputImport(name="distributions", required=true)
      private final Input<List<DistributionConfigurationDistributionArgs>> distributions;

    public Input<List<DistributionConfigurationDistributionArgs>> getDistributions() {
        return this.distributions;
    }

    /**
     * Name to apply to the distributed AMI.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Key-value map of resource tags for the distribution configuration. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public DistributionConfigurationArgs(
        @Nullable Input<String> description,
        Input<List<DistributionConfigurationDistributionArgs>> distributions,
        @Nullable Input<String> name,
        @Nullable Input<Map<String,String>> tags) {
        this.description = description;
        this.distributions = Objects.requireNonNull(distributions, "expected parameter 'distributions' to be non-null");
        this.name = name;
        this.tags = tags;
    }

    private DistributionConfigurationArgs() {
        this.description = Input.empty();
        this.distributions = Input.empty();
        this.name = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private Input<List<DistributionConfigurationDistributionArgs>> distributions;
        private @Nullable Input<String> name;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.distributions = defaults.distributions;
    	      this.name = defaults.name;
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

        public Builder distributions(Input<List<DistributionConfigurationDistributionArgs>> distributions) {
            this.distributions = Objects.requireNonNull(distributions);
            return this;
        }

        public Builder distributions(List<DistributionConfigurationDistributionArgs> distributions) {
            this.distributions = Input.of(Objects.requireNonNull(distributions));
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

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public DistributionConfigurationArgs build() {
            return new DistributionConfigurationArgs(description, distributions, name, tags);
        }
    }
}
