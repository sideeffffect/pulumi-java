// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class LaunchTemplateElasticGpuSpecificationArgs extends com.pulumi.resources.ResourceArgs {

    public static final LaunchTemplateElasticGpuSpecificationArgs Empty = new LaunchTemplateElasticGpuSpecificationArgs();

    /**
     * The [Elastic GPU Type](https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/elastic-gpus.html#elastic-gpus-basics)
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private LaunchTemplateElasticGpuSpecificationArgs() {}

    private LaunchTemplateElasticGpuSpecificationArgs(LaunchTemplateElasticGpuSpecificationArgs $) {
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LaunchTemplateElasticGpuSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LaunchTemplateElasticGpuSpecificationArgs $;

        public Builder() {
            $ = new LaunchTemplateElasticGpuSpecificationArgs();
        }

        public Builder(LaunchTemplateElasticGpuSpecificationArgs defaults) {
            $ = new LaunchTemplateElasticGpuSpecificationArgs(Objects.requireNonNull(defaults));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public LaunchTemplateElasticGpuSpecificationArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
