// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class LaunchTemplateElasticGpuSpecificationArgs extends io.pulumi.resources.ResourceArgs {

    public static final LaunchTemplateElasticGpuSpecificationArgs Empty = new LaunchTemplateElasticGpuSpecificationArgs();

    /**
     * The [Elastic GPU Type](https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/elastic-gpus.html#elastic-gpus-basics)
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public LaunchTemplateElasticGpuSpecificationArgs(Input<String> type) {
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private LaunchTemplateElasticGpuSpecificationArgs() {
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchTemplateElasticGpuSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(LaunchTemplateElasticGpuSpecificationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder type(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public LaunchTemplateElasticGpuSpecificationArgs build() {
            return new LaunchTemplateElasticGpuSpecificationArgs(type);
        }
    }
}
