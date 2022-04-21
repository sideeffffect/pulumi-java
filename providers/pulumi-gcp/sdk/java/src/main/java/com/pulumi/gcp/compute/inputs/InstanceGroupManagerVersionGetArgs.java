// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.InstanceGroupManagerVersionTargetSizeGetArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceGroupManagerVersionGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceGroupManagerVersionGetArgs Empty = new InstanceGroupManagerVersionGetArgs();

    /**
     * - The full URL to an instance template from which all new instances of this version will be created.
     * 
     */
    @Import(name="instanceTemplate", required=true)
    private Output<String> instanceTemplate;

    public Output<String> instanceTemplate() {
        return this.instanceTemplate;
    }

    /**
     * - Version name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * - The number of instances calculated as a fixed number or a percentage depending on the settings. Structure is documented below.
     * 
     */
    @Import(name="targetSize")
    private @Nullable Output<InstanceGroupManagerVersionTargetSizeGetArgs> targetSize;

    public Optional<Output<InstanceGroupManagerVersionTargetSizeGetArgs>> targetSize() {
        return Optional.ofNullable(this.targetSize);
    }

    private InstanceGroupManagerVersionGetArgs() {}

    private InstanceGroupManagerVersionGetArgs(InstanceGroupManagerVersionGetArgs $) {
        this.instanceTemplate = $.instanceTemplate;
        this.name = $.name;
        this.targetSize = $.targetSize;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceGroupManagerVersionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceGroupManagerVersionGetArgs $;

        public Builder() {
            $ = new InstanceGroupManagerVersionGetArgs();
        }

        public Builder(InstanceGroupManagerVersionGetArgs defaults) {
            $ = new InstanceGroupManagerVersionGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder instanceTemplate(Output<String> instanceTemplate) {
            $.instanceTemplate = instanceTemplate;
            return this;
        }

        public Builder instanceTemplate(String instanceTemplate) {
            return instanceTemplate(Output.of(instanceTemplate));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder targetSize(@Nullable Output<InstanceGroupManagerVersionTargetSizeGetArgs> targetSize) {
            $.targetSize = targetSize;
            return this;
        }

        public Builder targetSize(InstanceGroupManagerVersionTargetSizeGetArgs targetSize) {
            return targetSize(Output.of(targetSize));
        }

        public InstanceGroupManagerVersionGetArgs build() {
            $.instanceTemplate = Objects.requireNonNull($.instanceTemplate, "expected parameter 'instanceTemplate' to be non-null");
            return $;
        }
    }

}
